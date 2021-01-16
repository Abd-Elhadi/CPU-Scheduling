package Schedulers;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static public void main (String[] arg) {
		int numberOfProcesses;
		int RRQuantum;

		ArrayList<Process> Processes = new ArrayList<Process>();

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of processes: ");
		numberOfProcesses = input.nextInt();

		System.out.print("Enter Round Robin Time Quantum: ");
		RRQuantum = input.nextInt();


		System.out.print("Select the Scheduler you want to use:"
				+ "\n[1] Preemptive Shortest- Job First (SJF)"
				+ "\n[2] Round Robin (RR)"
				+ "\n[3] Preemptive Priority Scheduling."
				+ "\n[4] Multi Level Scheduling."
				+ "\nYour choice: ");
		int option = input.nextInt();
//		System.out.print("Enter the number of processes: ");
//		numberOfProcesses = input.nextInt();


		// Read Processes
		for(int i = 0 ; i < numberOfProcesses; ++i) {
			input = new Scanner(System.in);
			Process p = new Process();
			System.out.print("Process " + (i+1) + " name: ");
			p.setName(input.nextLine());

			System.out.print("Process " + (i+1) + " arraival time: ");
			p.setArrivalTime(input.nextInt()) ;

			System.out.print("Process " + (i+1) + " burst time: ");
			p.setBurstTime(input.nextInt());

			System.out.print("Process " + (i+1) + " queue number: ");
			p.setPriority(input.nextInt());
			System.out.println("============================");
			System.out.println();

			Processes.add(p);	
		}

		//get rr time
		if(option == 4 || option == 2){
			System.out.print("Enter Round Robin Time Quantum: ");
			RRQuantum = input.nextInt();
		}

		if(option == 1) {
//			Processes.add(new Process("P1", 0, 7, 1));
//			Processes.add(new Process("P2", 2, 4, 1));
//			Processes.add(new Process("P3", 4, 1, 1));
//			Processes.add(new Process("P4", 5, 4, 1));
			ShortestJobFirst SJF = new ShortestJobFirst(Processes);

		}
		else if(option == 2) {

			RoundRobin.FindAvg(Processes,RRQuantum);

		}
		else if(option == 3) {
//			Processes.add(new Process("P1", 1, 10, 3));
//			Processes.add(new Process("P2", 1, 1, 1));
//			Processes.add(new Process("P3", 1, 2, 4));
//			Processes.add(new Process("P4", 1, 1, 5));
//			Processes.add(new Process("P4", 1, 5, 2));
			PriorityScheduling pps = new PriorityScheduling(Processes);
			pps.Schedule();

		}
		else if(option == 4)  { 
//			Processes.add(new Process("P1", 0, 4, 1));
//			Processes.add(new Process("P2", 0, 3, 1));
//			Processes.add(new Process("P3", 0, 8, 2));
//			Processes.add(new Process("P4", 10, 5, 1));
			MultiLevelScheduling MLS = new MultiLevelScheduling(Processes, RRQuantum);
		}
		else if (option == 5) {
			System.exit(0);
		}
		else {
			System.out.println("Invalid option!");
		}
	}
}
