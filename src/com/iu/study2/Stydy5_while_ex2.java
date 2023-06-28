package com.iu.study2;
import java.util.Scanner;
public class Stydy5_while_ex2 {	
	    public static void main(String[] args) {
	    	
	        int level = 1;
	        int exp = 0;
	        int gold = 0;
	        int maxLevel = 15;

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("MMORPG 게임에 오신 것을 환영합니다!");
	        System.out.println("시작 레벨: 1");
	        System.out.println("최대 레벨: 15");
	        System.out.println("GOLD: 0");

	        while (level <= maxLevel) {
	            System.out.println("=================================");
	            System.out.printf("현재 레벨: %d\n", level);
	            System.out.printf("현재 경험치: %d\n", exp);
	            System.out.printf("현재 GOLD: %d\n", gold);

	            int requiredExp = level * 3;
	            System.out.printf("다음 레벨까지 필요한 경험치: %d\n", requiredExp);

	            int monstersToKill = level * 3;
	            System.out.printf("몬스터 %d마리 잡아야 레벨업!\n", monstersToKill);

	            System.out.println("1. 몬스터 사냥하기");
	            System.out.println("2. 게임 종료");
	            System.out.print("선택: ");
	            int choice = scanner.nextInt();

	            if (choice == 1) {
	                System.out.println("몬스터를 사냥했습니다!");
	                exp = exp+3;

	                if (exp >= requiredExp) {
	                    System.out.println("레벨업을 달성하였습니다!");
	                    level++;

	                    if (level == 5) {
	                        int reward = 1000;
	                        System.out.printf("5 레벨 달성! %d GOLD 지급!\n", reward);
	                        gold += reward;
	                    } else if (level == 10) {
	                        int reward = 2000;
	                        System.out.printf("10 레벨 달성! %d GOLD 지급!\n", reward);
	                        gold += reward;
	                    } else if (level == 15) {
	                        int reward = 3000;
	                        System.out.printf("15 레벨 달성! %d GOLD 지급!\n", reward);
	                        gold += reward;
	                    }
	                }

	                monstersToKill--;
	                if (monstersToKill <= 0) {
	                    System.out.println("모든 몬스터를 처치하여 레벨업이 가능합니다!");
	                }
	            } else if (choice == 2) {
	                System.out.println("게임을 종료합니다.");
	                break;
	            } else {
	                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
	            }
	        }

	        scanner.close();
	    }
	}
