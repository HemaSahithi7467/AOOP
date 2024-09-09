package com.learning;

public class PersonalisedRecommendationDecorator extends LearningModuleDecorator{

	public PersonalisedRecommendationDecorator(LearningModule module) {
		super(module);
		// TODO Auto-generated constructor stub
	}
	@Override
    public String getDescription() {
        return decoratedModule.getDescription() + ", with Personalized Recommendations";
    }

}
