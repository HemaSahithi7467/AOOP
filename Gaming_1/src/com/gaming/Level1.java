package com.gaming;

public class Level1 implements ItemsFactory{

	@Override
	public Weapon newWeapon() {
		// TODO Auto-generated method stub
		return new BasicWeapon();
	}

	@Override
	public Powerup newPower() {
		// TODO Auto-generated method stub
		return new Health();
	}
	

}
