package Schedulers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static public void main (String[] arg) {
		int numberOfProcesses;
<<<<<<< HEAD
		int RRQuantum;
=======
		int RRQuantum=0;
>>>>>>> 46c25b5905050e3c366cc639c18258f68dfa9ab9

		ArrayList<Process> Processes = new ArrayList<Process>();

		Scanner input = new Scanner(System.in);

<<<<<<< HEAD
		System.out.print("Enter the number of processes: ");
		numberOfProcesses = input.nextInt();

		System.out.print("Enter Round Robin Time Quantum: ");
		RRQuantum = input.nextInt();

=======

		System.out.println("Select the Scheduler you want to use:"
				+ "\n[1] Preemptive Shortest- Job First (SJF)"
				+ "\n[2] Round Robin (RR)"
				+ "\n[3] Preemptive Priority Scheduling."
				+ "\n[4] Multi Level Scheduling.");
		int option = input.nextInt();
		System.out.print("Enter the number of processes: ");
		numberOfProcesses = input.nextInt();

>>>>>>> 46c25b5905050e3c366cc639c18258f68dfa9ab9

		// Read Processes
		for(int i = 0 ; i < numberOfProcesses; ++i) {
			input = new Scanner(System.in);
			Process p = new Process();
			System.out.print( (i+1) + "th Process name: ");
			p.setName(input.nextLine());

<<<<<<< HEAD
			System.out.print( (i+1) + "th Process arraival time: ");
			p.setArrivalTime(input.nextInt()) ;

			System.out.print( (i+1) + "th Process burst time: ");
			p.setBurstTime(input.nextInt());

			System.out.print( (i+1) + "th Process queue number: ");
			p.setPriority(input.nextInt());

			Processes.add(p);	
		}

		System.out.println("Select the Scheduler you want to use:"
				+ "\n[1] Preemptive Shortest- Job First (SJF)"
				+ "\n[2] Round Robin (RR)"
				+ "\n[3] Preemptive Priority Scheduling."
				+ "\n[4] Multi Level Scheduling.");
		int option = input.nextInt();
=======
			System.out.print( (i+1) + "th Process arrival time: ");
			p.setArrivalTime(input.nextInt()) ;

			System.out.print( (i+1) + "th Process burst time: ");
			int burstT=input.nextInt();
			p.setBurstTime(burstT);
			p.setFixedBurstTime(burstT);

			//get queue number for multi level
			if(option==4) {
				System.out.print((i + 1) + "th Process queue number: ");
				p.setPriority(input.nextInt());
			}

			Processes.add(p);
		}

		//get rr time
		if(option==4 || option==2){
			System.out.print("Enter Round Robin Time Quantum: ");
			RRQuantum = input.nextInt();
		}

>>>>>>> 46c25b5905050e3c366cc639c18258f68dfa9ab9
		if(option == 1) {
			ShortestJobFirst SJF = new ShortestJobFirst(Processes);

		}
		else if(option == 2) {

<<<<<<< HEAD
=======
			RoundRobin.FindAvg(Processes,RRQuantum);

>>>>>>> 46c25b5905050e3c366cc639c18258f68dfa9ab9
		}
		else if(option == 3) {
			PriorityScheduling pps = new PriorityScheduling(Processes, 2);
			pps.start();
<<<<<<< HEAD
			//PreemptivePriority PPS = new PreemptivePriority(Processes);
=======
>>>>>>> 46c25b5905050e3c366cc639c18258f68dfa9ab9

		}
		else if(option == 4)  {

<<<<<<< HEAD
=======
			MultiLevelScheduling MLS = new MultiLevelScheduling(Processes, RRQuantum);
>>>>>>> 46c25b5905050e3c366cc639c18258f68dfa9ab9
		}
		else if (option == 5) {
			System.exit(0);
		}
		else {
			System.out.println("Invalid option!");
		}
	}
}
