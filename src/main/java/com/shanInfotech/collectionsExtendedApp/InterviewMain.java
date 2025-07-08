package com.shanInfotech.collectionsExtendedApp;

public class InterviewMain {
	public static void main(String[] args) {
		InterviewScheduler scheduler = new InterviewScheduler();
		
		scheduler.scheduleInterview(new Interview(1, "Anita",82, "10.00 AM"));
		scheduler.scheduleInterview(new Interview(2, "Yashu",68, "10.30 AM"));
		scheduler.scheduleInterview(new Interview(3, "Subbu",75, "11.00 AM"));
		
		scheduler.walkInCandidate(new Interview(4, "Deep",91, "NOW"));
		
		System.out.println("\nFULL SCHEDULE");
		scheduler.displaySchedule();
		
		System.out.println("\nWALK-IN");
		scheduler.displayWalkIns();
		
		System.out.println("\nTOP PERFORMERD (Score > 70)");
		scheduler.displayTopScorers(70);
	}

}
