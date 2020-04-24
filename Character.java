package abc;

public abstract class Character {

	public int HP;
	public int damage;
	public boolean isAlive = true;
	
	public Character(int initialHp, int initialDamage) {
		this.HP = initialHp;
		this.damage = initialDamage;
	}
	
	public void die() {
		if (this.HP <= 0) {
			this.isAlive = false;
		}
	}
	
	public void updateHP(int newHP) {
		this.HP = newHP;
	}
	
	public void fight(Character opponent) {
		int newHP = opponent.HP - this.damage;
		opponent.updateHP(newHP);
	}
	
}
