package com.learning;

public class ProgressTrackingDecorator extends LearningModuleDecorator{

	public ProgressTrackingDecorator(LearningModule module) {
		super(module);
		// TODO Auto-generated constructor stub
	}
	@Override
    public String getDescription() {
        return decoratedModule.getDescription() + ", with Progress Tracking";
    }

}
