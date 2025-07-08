package com.shanInfotech.collectionsExtendedApp;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class InterviewScheduler {
	Queue<Interview> scheduleQueue= new LinkedList<>();
	Deque<Interview> walkInDeque = new ArrayDeque<>();
	PriorityQueue<Interview> topPerformersQueue = new PriorityQueue<>(
			(a,b) -> Integer.compare(b.getScore(),  a.getScore())
			);
			
	public void scheduleInterview(Interview i) {
		scheduleQueue.offer(i);
		topPerformersQueue.offer(i);
	}
	
	public void walkInCandidate(Interview i) {
		walkInDeque.addFirst(i);
		topPerformersQueue.offer(i);
	}
	
	public void displaySchedule() {
		System.out.println("Scheduled Interview (FIFO):");
		scheduleQueue.forEach(System.out::println);
		
	}
	public void displayWalkIns() {
		System.out.println("Walk-in Candidates (Deque):");
		walkInDeque.forEach(System.out::println);
		
	}
	public void displayTopScorers(int thershold) {
		System.out.println("Shortlisted Candidates (score >"+ thershold+"):");
		topPerformersQueue.stream()
		.filter(i -> i.getScore() > thershold)
		.sorted(Comparator.comparing(Interview::getCandidateName))
		.forEach(System.out::println);
		
	}

}
