package exam;

import java.util.Scanner;

public class CoffeMachine extends CoffeManager{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		CoffeManager manager = new CoffeManager();
		int select = 0, menu =0, cash=0, money=0; //동작 선택 ,메뉴 선택, 잔돈,투입금액
		int result500 = 0, result100 = 0, result50=0, result10=0; // 남은 동전의 수 
		
		while(true) {
			System.out.print("어떤걸 하시겠습니까? 1.메뉴선택 2.종료 :");
			select = input.nextInt();
			if(select == 1) {
				System.out.print("어떤 음료를 주문하시겠습니까? 1.커피(200원) ");
				menu = input.nextInt();
				if(menu == 1) { //1.커피 선택시 
					System.out.print("금액을 넣어주세요: ");
					money = input.nextInt();
					if(money < manager.getCoffe()) {
						System.out.printf("%d의 금액을 더 넣어주세요:",cash = manager.getCoffe() - money);
						money += input.nextInt();
						
						if(money == manager.getCoffe()) {
							System.out.println("음료를 받으세요.");
							continue;
						}
					} else if (money >= manager.getCoffe()) {
						System.out.print("음료를 받으세요.");
						money -= manager.getCoffe();
						if(money >= 500) {
							result500 = money / 500;
							money %= 500;
							if(money >= 100) {
								result100 = money / 100;
								money %= 100;
								if(money >= 50) {
									result50 = money /50;
									money %= 50;
								}
								if(money >= 10) {
									result10 = money / 10;
									money %= 10;
								}
							}	
						}
						System.out.println();
						System.out.printf("500원:%d, 100원:%d 50원:%d 10원:%d",result500,result100,result50,result10);
						System.out.println();
					} if(money <= 100) {
						result50 = money /50;
						money %= 50;
						if(money <= 10) {
							result10 = money/10;
							money %= 10;
						}
						System.out.printf("50원:%d 10원:%d",result50,result10);
						break;
					}
				}
				
			}
			else if (money < 100 || select == 2) {
				System.out.print("시스템을 종료합니다.");
				break;
			}
		}
		input.close();
	}
}
