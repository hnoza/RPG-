package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		// 人間パーティ
		List<Human> humanList = new ArrayList<>();
		humanList.add(new Brave());
		humanList.add(new Fighter());
		humanList.add(new Wizard());
		
		// モンスターパーティ
		List<Monster> monsterList = new ArrayList<>();
		monsterList.add(new Dragon());
		monsterList.add(new Oak());
		monsterList.add(new Slime());
		
		while (humanList.size() != 0 && monsterList.size() !=0) {
			
			// =======================
			// 人間パーティ
			// =======================
			System.out.println("人間のターン！");
			
			// 攻撃者を決定
			int atakkerNo = Rand.get(humanList.size());
			Human attackerHuman = humanList.get(atakkerNo);
			
			// ターゲットを決定
			int targetNo = Rand.get(monsterList.size());
			Monster targetMonster = monsterList.get(targetNo);
			
			// attack実行
			attackerHuman.attack(targetMonster);
			
			// attackを呼んだあと、キャラが倒れていたらListから削除
			if(targetMonster.hp <= 0) {
				monsterList.remove(targetNo);
				System.out.println(targetMonster.name + "は倒れた。");
				
				// 続行するか判定
				if (monsterList.size() == 0) {
					break;
				}
				
			} else {
				// HP置き換え
				monsterList.set(targetNo, targetMonster);
			}
			
			// =======================
			// モンスターパーティ
			// =======================
			System.out.println("モンスターのターン！");
			
			// 攻撃者を決定
			atakkerNo = Rand.get(monsterList.size());
			Monster attackerMonster = monsterList.get(atakkerNo);
			
			// ターゲットを決定
			targetNo = Rand.get(humanList.size());
			Human targetHuman = humanList.get(targetNo);
			
			// attack実行
			attackerMonster.attack(targetHuman);
			
			// attackを呼んだあと、キャラが倒れていたらListから削除
			if(targetHuman.hp <= 0) {
				humanList.remove(targetNo);
				System.out.println(targetHuman.name + "は倒れた。");
				
				// 続行するか判定
				if (humanList.size() == 0) {
					break;
				}
				
			} else {
				// HP置き換え
				humanList.set(targetNo, targetHuman);
			}
						
		}
		
		if (humanList.size() != 0) {
			System.out.println("勇者達は勝利した！");
		} else {
			System.out.println("モンスター達は勝利した！");
		}

	}
}
