package exam;

import java.util.Scanner;

public class CoffeMachine extends CoffeManager{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		CoffeManager manager = new CoffeManager();
		int select = 0, menu =0, cash=0, money=0; //���� ���� ,�޴� ����, �ܵ�,���Աݾ�
		int result500 = 0, result100 = 0, result50=0, result10=0; // ���� ������ �� 
		
		while(true) {
			System.out.print("��� �Ͻðڽ��ϱ�? 1.�޴����� 2.���� :");
			select = input.nextInt();
			if(select == 1) {
				System.out.print("� ���Ḧ �ֹ��Ͻðڽ��ϱ�? 1.Ŀ��(200��) ");
				menu = input.nextInt();
				if(menu == 1) { //1.Ŀ�� ���ý� 
					System.out.print("�ݾ��� �־��ּ���: ");
					money = input.nextInt();
					if(money < manager.getCoffe()) {
						System.out.printf("%d�� �ݾ��� �� �־��ּ���:",cash = manager.getCoffe() - money);
						money += input.nextInt();
						
						if(money == manager.getCoffe()) {
							System.out.println("���Ḧ ��������.");
							continue;
						}
					} else if (money >= manager.getCoffe()) {
						System.out.print("���Ḧ ��������.");
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
						System.out.printf("500��:%d, 100��:%d 50��:%d 10��:%d",result500,result100,result50,result10);
						System.out.println();
					} if(money <= 100) {
						result50 = money /50;
						money %= 50;
						if(money <= 10) {
							result10 = money/10;
							money %= 10;
						}
						System.out.printf("50��:%d 10��:%d",result50,result10);
						break;
					}
				}
				
			}
			else if (money < 100 || select == 2) {
				System.out.print("�ý����� �����մϴ�.");
				break;
			}
		}
		input.close();
	}
}
