package com.shanInfotech.collectionsExtendedApp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class AppTest {
	InterviewScheduler scheduler = new InterviewScheduler();
	
    
    @Test
    void testSchedulerCoreFlow() {
    	scheduler.scheduleInterview(new Interview(1, "Anita",82, "10.00 AM"));
		scheduler.scheduleInterview(new Interview(2, "Yashu",68, "10.30 AM"));
		scheduler.scheduleInterview(new Interview(3, "Subbu",75, "11.00 AM"));
		scheduler.walkInCandidate(new Interview(4, "Deepa",91, "NOW"));
		
		assertEquals("Anita", scheduler.scheduleQueue.peek().getCandidateName());
		assertEquals("Deepa", scheduler.walkInDeque.peekFirst().getCandidateName());
		assertEquals("Deepa", scheduler.topPerformersQueue.peek().getCandidateName());
    }
    
   @Test//
    void testTopScorersAbove70() {//
    	//List<String> expectedNames = Arrays.asList("Anita", "Deepa", "Subbu");
    	
    	//List<String> topScorers = scheduler.topPerformersQueue.stream()
    	//		.filter(i -> i.getScore() > 70)
    		//	.map(Interview::getCandidateName)
    			//.sorted()
    			//.toList();
    	
    //	assertEquals(expectedNames, topScorers);
    	
    
    	
   }//
}
