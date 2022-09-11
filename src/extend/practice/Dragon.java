package extend.practice;

public class Dragon extends Monster{

	public Dragon() {
		this.name = "ドラゴン";
		this.hp = 500;
		this.offensive = 30;
	}

	@Override
	void attack(Living target) {
		
		// ダメージ計算（攻撃力×乱数（0～9））
		int damage = this.offensive * Rand.get(10);
		
		System.out.println("ドラゴンが炎で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		
		// HPからダメージ分を引く
		target.hp = target.hp - damage;
	}
}
