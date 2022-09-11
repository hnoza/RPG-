package extend.practice;

public class Slime extends Monster{

	public Slime() {
		this.name = "スライム";
		this.hp = 100;
		this.offensive = 10;
	}

	@Override
	void attack(Living target) {
		
		// ダメージ計算（攻撃力×乱数（0～9））
		int damage = this.offensive * Rand.get(10);
		
		System.out.println("スライムが体当たりで攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		
		// HPからダメージ分を引く
		target.hp = target.hp - damage;
	}
}
