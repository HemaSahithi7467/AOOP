package com.gaming;

public class Level2 implements ItemsFactory{

	@Override
	public Weapon newWeapon() {
		// TODO Auto-generated method stub
		return new HighWeapon();
	}

	@Override
	public Powerup newPower() {
		// TODO Auto-generated method stub
		return new Speed();
	}

}
