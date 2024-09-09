package com.solid3;

public class Example {
	public static void main(String[] args) {
        Worker robot = new Robot();
        robot.work();
        
        Human human = new Human();
        human.work();
        human.eat();
    }

}
