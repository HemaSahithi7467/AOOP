package com.learning;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningModule module = new BasicLearningModule();
        System.out.println(module.getDescription());

        LearningModule progressModule = new ProgressTrackingDecorator(new BasicLearningModule());
        System.out.println(progressModule.getDescription());

        LearningModule recommendationModule = new PersonalisedRecommendationDecorator(new BasicLearningModule());
        System.out.println(recommendationModule.getDescription());

        LearningModule remindersModule = new RemindersDecorator(new BasicLearningModule());
        System.out.println(remindersModule.getDescription());

        LearningModule allFeaturesModule = new ProgressTrackingDecorator(
                new PersonalisedRecommendationDecorator(
                        new RemindersDecorator(new BasicLearningModule())
                )
        );
        System.out.println(allFeaturesModule.getDescription());
    }

}



