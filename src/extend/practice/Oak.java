package extend.practice;

public class Oak extends Monster{

	public Oak() {
		this.name = "オーク";
		this.hp = 300;
		this.offensive = 20;
	}

	
	@Override
	void attack(Living target) {
		
		// ダメージ計算（攻撃力×乱数（0～9））
		int damage = this.offensive * Rand.get(10);
		
		System.out.println("オークが槍で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		
		// HPからダメージ分を引く
		target.hp = target.hp - damage;
	}
	
}
