package com.gaming;

public class TheGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game gameState = Game.getInstance();
        gameState.setDifficulty("Hard");

        EnemyFactory enemyFactory;
        ItemsFactory itemFactory;

        if (gameState.getDifficulty().equals("Easy")) {
            enemyFactory = new EasyFactory();
            itemFactory = new Level1();
        } else {
            enemyFactory = new HardFactory();
            itemFactory = new Level2();
        }

        Enemy enemy = enemyFactory.createEnemy();
        Weapon weapon = itemFactory.newWeapon();
        Powerup powerUp = itemFactory.newPower();

        enemy.attack();
        weapon.use();
        powerUp.activate();

        gameState.nextLevel();
        System.out.println("Level: " + gameState.getLevel());
    }

}


