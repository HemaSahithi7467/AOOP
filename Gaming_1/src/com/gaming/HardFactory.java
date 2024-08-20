package com.gaming;

public class HardFactory extends EnemyFactory{

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new HardEnemy();
	}

}
