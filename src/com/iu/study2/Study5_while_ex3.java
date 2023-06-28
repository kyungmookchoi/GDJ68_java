package com.iu.study2;

import java.util.Random;

public class Study5_while_ex3 {

	public static void main(String[] args) {	
		//1.평타 2.스킬 3.hp회복 4.도망
		//평타 : 0~10미만의 공격이 monster에게 적용 
		//스킬 : 0~30미만의 공격이 monster에게 적용(최대 3번까지만 가능)
		//회복 : 회복량 0~40까지. (hp가 회복된 후 40이 넘어갈수없게함)
		//도망 : 50%확률로 성공,실패로 나뉨.
		//1턴당 평타,스킬,회복,도망 중 하나만 가능
		//유저 hp가 0이 되거나 monsterHp가 0이되면 종료.
		//hp가 0이되거나 monsterHp가 0이되거나 유저가 도망에 성공할 때 까지 계속 진행
		
		//monster
		//1 : 유저를 공격 0~40의 공격을 유저에게 적용
//		Random random = new Random();
//		
//		int hp=40;
//		int monsterHp=60;
//		int monsterPower=40;
		  int userHP = 40; // 유저의 체력
	        int monsterHP = 60; // 몬스터의 체력
	        int monsterAttack = 40; // 몬스터의 공격력
	        
	        Random random = new Random();
	        
	        while (userHP > 0 && monsterHP > 0) {
	            int action = random.nextInt(4); // 0부터 3까지의 랜덤한 액션 선택
	            
	            switch (action) {
	                case 0: // 평타
	                    int attack = random.nextInt(10); // 0부터 9까지의 랜덤한 공격력
	                    monsterHP -= attack;
	                    System.out.println("유저가 평타로 몬스터를 공격했습니다. 몬스터의 체력: " + monsterHP);
	                    break;
	                    
	                case 1: // 스킬
	                    int skillAttack = random.nextInt(30); // 0부터 29까지의 랜덤한 공격력
	                    monsterHP -= skillAttack;
	                    System.out.println("유저가 스킬로 몬스터를 공격했습니다. 몬스터의 체력: " + monsterHP);
	                    break;
	                    
	                case 2: // 회복
	                    int recovery = random.nextInt(41); // 0부터 40까지의 랜덤한 회복량
	                    userHP += recovery;
	                    if (userHP > 40) {
	                        userHP = 40;
	                    }
	                    System.out.println("유저가 회복했습니다. 유저의 체력: " + userHP);
	                    break;
	                    
	                case 3: // 도망
	                    int escapeChance = random.nextInt(2); // 0 또는 1 (50%의 확률)
	                    if (escapeChance == 0) {
	                        System.out.println("유저가 도망에 성공했습니다.");
	                        return; // 전투 종료
	                    } else {
	                        System.out.println("유저가 도망에 실패했습니다.");
	                    }
	                    break;
	            }
	            
	            // 몬스터의 공격
	            int monsterAttackDamage = random.nextInt(monsterAttack + 1); // 0부터 monsterAttack까지의 랜덤한 공격력
	            userHP -= monsterAttackDamage;
	            System.out.println("몬스터가 유저를 공격했습니다. 유저의 체력: " + userHP);
	        }
	        
	        // 전투 종료 후 결과 출력
	        if (userHP <= 0) {
	            System.out.println("유저가 전투에서 패배했습니다.");
	        } else {
	            System.out.println("몬스터를 처치하였습니다. 유저의 승리");
	        }
	}
}

		
	


