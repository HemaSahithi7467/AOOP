package com.learning;

public class RemindersDecorator extends LearningModuleDecorator{

	public RemindersDecorator(LearningModule module) {
		super(module);
		// TODO Auto-generated constructor stub
	}
	@Override
    public String getDescription() {
        return decoratedModule.getDescription() + ", with Reminders";
    }

}
