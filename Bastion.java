package bastion;

import robocode.*;
import java.awt.Color; 
import java.util.Random; //random
import java.awt.geom.Point2D; //cordenada

/**
 * Bastion - a robot by (Nicole & Fofolete)
 */
public class Bastion extends AdvancedRobot {
	double enemyEnergy = 100;
	double enemyDistance;
	double enemyVelocidade;
	double enemyAngulo;
	double enemyAngAbs;
	double enemyX, enemyY;
	
	public void run() {

		setColors(Color.magenta, Color.cyan, Color.white, Color.red, Color.magenta);
		// body,gun,radar

		// Robot main loop
		while (true) {
			/* teste de movimentação zigzag
			ahead(100);
			turnRight(120);
			turnGunRight(180);
			back(100);
			turnLeft(120);
			turnGunLeft(180);
			*/

		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// tomada de decisão de tiro
		fire(3);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// teste de recuo
		back(10);
	}

	public void onHitRobot(HitRobotEvent e) {
		if (e.isMyFault())
			;
		{
			turnRight(e.getBearing()); // retornar o ângulo do bastion em relação ao inimigo
			fire(5);
		}
	}

	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// teste de nível de burrice
		turnLeft(90);
	}

}
