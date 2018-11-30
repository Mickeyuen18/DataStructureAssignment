/**
 * Title:        SimBusStop.java
 * Description:  A simple Bus Stop simulation using Queue
 * Company:      ICT HKIVE(TY)
 * @author       Patrick Tong
 */

import miscLib.*;

public class SimBusStop {

	public static void main(String[] args) {
//    ListQueue t = new ListQueue();
		ArrayQueue t = new ArrayQueue(50);
		int code, time, count;
		Integer item;
		int people = 0;
		int wait = 0; //waiting time
		int bus = 0;
		int seats = 0; //average empty seat
		int servedppl =0; //served people
		double waitt = 0; //total waiting time

		do {
			code = SimpleInput.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");
		}
		while (code < -1 || code > 1);
		int lastTime = 0;
		while (code!=-1) {
			do {
				time = SimpleInput.getInteger("Arrival time (>="+Integer.toString(lastTime)+"): ");
			} while (lastTime > time);
			lastTime = time;
			do {
				count = SimpleInput.getInteger("Arrival count (> 0): ");
			} while (count <= 0);
			if (code==0) { //Bus +1
				people += count;
				while (count-- > 0) {
					t.enqueue(new Integer(time));
					servedppl++; //served people +1
				}
			}
			else if (code==1) { //People +1
				bus++;
				seats += count;
				while ( (count-- > 0) && !t.empty ()){
					item = (Integer) t.dequeue ();
					wait += time - item.intValue();
				}
			}
			do {
				code = SimpleInput.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");
			} while (code < -1 || code > 1);
		}

		if (code == -1){
			while (!t.empty()) { //ensure if queue is empty at the end
				int pplNoBusTime = (int) t.dequeue();
				waitt += lastTime - pplNoBusTime; }
		}

		if (people!=0) {
			System.out.println(people + " people waited for " +
					wait + " minutes, average waiting time = " +
					(float) wait / people + " minutes.");
			System.out.println(bus + " passed the bus stop.");
			System.out.println("Average " + servedppl / bus + " people got on a bus.");
			System.out.println("Average " + (seats - servedppl) / bus + " of vacant seats for a bus leaving the bus stop.");
			System.out.println( people - servedppl + " people still waiting at the bus stop and their average waititng is " + waitt / (people - servedppl));
		}
	} // main

} // class SimBusStop