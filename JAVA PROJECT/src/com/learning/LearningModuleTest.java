package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LearningModuleTest {
	 @Test
	    public void testBasicLearningModule() {
	        LearningModule module = new BasicLearningModule();
	        assertEquals("Basic Learning Module", module.getDescription());
	    }

	    @Test
	    public void testProgressTrackingDecorator() {
	        LearningModule module = new ProgressTrackingDecorator(new BasicLearningModule());
	        assertEquals("Basic Learning Module, with Progress Tracking", module.getDescription());
	    }

	    @Test
	    public void testPersonalizedRecommendationDecorator() {
	        LearningModule module = new PersonalisedRecommendationDecorator(new BasicLearningModule());
	        assertEquals("Basic Learning Module, with Personalized Recommendations", module.getDescription());
	    }

	    @Test
	    public void testRemindersDecorator() {
	        LearningModule module = new RemindersDecorator(new BasicLearningModule());
	        assertEquals("Basic Learning Module, with Reminders", module.getDescription());
	    }

	    @Test
	    public void testAllDecorators() {
	        LearningModule module = new ProgressTrackingDecorator(
	                new PersonalisedRecommendationDecorator(
	                        new RemindersDecorator(new BasicLearningModule())
	                        
	                )
	        );
	        assertEquals("Basic Learning Module, with Reminders, with Personalized Recommendations, with Progress Tracking", module.getDescription());
	    }

}
