package com.shanInfotech.collectionsExtendedApp;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Qpque {
	
		
		static void queMethod() {
			Queue<String> eventQue=new LinkedList<String>();
			eventQue.add("Sagar");
			eventQue.add("Shree");
			eventQue.add("Yashas");
			eventQue.add("Yogi");
			eventQue.add("Karthi");
			eventQue.add("Nithi");
			System.out.println("Queue: "+eventQue);
			System.out.println("Removed from 1st Uses FIFO : "+eventQue.remove());
			System.out.println("Offering New Value in the que: "+eventQue.offer("Shama"));
			System.out.println(eventQue);
			System.out.println("Gets the peek element : "+eventQue.peek());
			System.out.println("Retrive and remove the element :"+eventQue.poll());
			System.out.println(""+eventQue.element());
			System.out.println(eventQue);
			
		
		}
		
		static void arrayDequeMethod() {
			ArrayDeque<String> eventQue=new ArrayDeque<String>();
			eventQue.add("Sagar");
			eventQue.add("Shree");
			eventQue.add("Yashas");
			eventQue.add("Yogi");
			eventQue.add("Karthi");
			eventQue.add("Nithi");
			System.out.println("ArrayDequeue: "+eventQue);
			System.out.println("Removed from 1st Uses LIFO using RemoveLast : "+eventQue.removeLast());
			System.out.println("Offering New Value in the que 1st : "+eventQue.offerFirst("Shama"));
			System.out.println(eventQue);
			System.out.println("Gets the peek element from last: "+eventQue.peek());
			System.out.println("Retrive and remove the element :"+eventQue.poll());
			System.out.println(""+eventQue.element());
			System.out.println(eventQue);
			
		
		}
		static void priorityQueMethod() {
			PriorityQueue<String> eventQue=new PriorityQueue<String>();
			System.out.println();
			eventQue.add("Sagar");
			eventQue.add("Shree");
			eventQue.add("Yashas");
			eventQue.add("Yogi");
			eventQue.add("Karthi");
			eventQue.add("Nithi");
			System.out.println("PriorityQueue: "+eventQue);
			System.out.println("Removed from 1st Uses FIFO : "+eventQue.remove());
			System.out.println("Offering New Value in the que: "+eventQue.offer("Shama"));
			System.out.println(eventQue);
			System.out.println("Gets the peek element : "+eventQue.peek());
			System.out.println("Retrive and remove the element :"+eventQue.poll());
			System.out.println(""+eventQue.element());
			System.out.println(eventQue);
			
		
		}

		public static void main(String[] args) {
			//queMethod();
		//	arrayDequeMethod();
			priorityQueMethod();
	}
	}


