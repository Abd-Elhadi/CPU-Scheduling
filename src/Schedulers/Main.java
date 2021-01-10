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


		// Read Processes
		for(int i = 0 ; i < numberOfProcesses; ++i) {
			input = new Scanner(System.in);
			Process p = new Process();
			System.out.print( (i+1) + "th Process name: ");
			p.setName(input.nextLine());

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
		if(option == 1) {
			ShortestJobFirst SJF = new ShortestJobFirst(Processes);

		}
		else if(option == 2) {

		}
		else if(option == 3) {
			PriorityScheduling pps = new PriorityScheduling(Processes, 2);
			pps.start();

		}
		else if(option == 4)  {

		}
		else if (option == 5) {
			System.exit(0);
		}
		else {
			System.out.println("Invalid option!");
		}
	}
}
