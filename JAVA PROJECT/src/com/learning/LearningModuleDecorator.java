package com.learning;

public abstract class LearningModuleDecorator implements LearningModule{
	protected LearningModule decoratedModule;

    public LearningModuleDecorator(LearningModule module) {
        this.decoratedModule = module;
    }

    @Override
    public String getDescription() {
        return decoratedModule.getDescription();
    }

}
