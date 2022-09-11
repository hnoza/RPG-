package extend.practice;

public abstract class Human extends Living {

	public Human(String name, int hp, int offensive) {
		super(name, hp, offensive);
	}
	
	@Override
	void attack(Living target) {
		
		// ダメージ計算（攻撃力×乱数（0～9））
		int damage = this.offensive * Rand.get(10);
		
		System.out.println(this.name + "が体当たりで攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		
		// HPからダメージ分を引く
		target.hp = target.hp - damage;
	}
}
