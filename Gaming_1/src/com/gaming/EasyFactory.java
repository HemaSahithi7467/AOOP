package com.gaming;

public class EasyFactory extends EnemyFactory{

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new EasyEnemy();
	}

}
