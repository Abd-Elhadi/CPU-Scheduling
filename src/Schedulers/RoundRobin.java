package Schedulers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;







class RoundRobin{

    public static void FingAvg(ArrayList<Process> processes, int quantum){
        int burstTime[];

        Queue<Process>ready = new PriorityQueue<>();
        Process executing;
        int arrival=processes.get(0).getArrivalTime();
        int Time=0;

        Process temp = null;

        for(Process p :processes){
            if(p.getArrivalTime()<arrival){
                arrival=p.getArrivalTime();
                temp=p;
            }
        }
        ready.add(temp);

        while (true) {
            executing = ready.poll();
            for (Process p : processes) {
                if (p.getArrivalTime() < Time){

                }
            }
            //execute
            if (executing.getBurstTime() <= quantum) {
                Time += ready.peek().getBurstTime();
                executing.setBurstTime(0);
            } else {
                Time += quantum;
                executing.setBurstTime(executing.getBurstTime() - quantum);
                if (executing.getBurstTime() != 0) ready.add(executing);
                else {
                    processes.remove(executing);
                }
            }

            if(ready.isEmpty())break;

        }
    }


}
