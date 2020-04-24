package abc;

import abc.EnemyBoss;
import abc.Hero;

public class GameController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		EnemyBoss boss1 = new EnemyBoss();
		Hero player = new Hero();
		while (boss1.isAlive) {
			player.fight(boss1);
			boss1.fight(player);
			
			player.die();
			boss1.die();
			
			if ( !player.isAlive ) {
				count++;
				player.updateHP(100);
				player.isAlive = true;
			}
		}
		
		System.out.println("So lan chet: " + count);
		
	}

}
