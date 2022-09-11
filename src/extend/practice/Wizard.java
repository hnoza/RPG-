package extend.practice;

public class Wizard extends Human{

	public Wizard() {
		this.name = "魔法使い";
		this.hp = 200;
		this.offensive = 10;
	}

	@Override
	void attack(Living target) {
		
		// ダメージ計算（攻撃力×乱数（0～9））
		int damage = this.offensive * Rand.get(10);
		
		System.out.println("魔法使いが魔法で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		
		// HPからダメージ分を引く
		target.hp = target.hp - damage;
	}
}
