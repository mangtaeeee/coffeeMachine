package exam;

public class CoffeManager {
	/*
	 * *클래스 2개: 
		메인 실행 클래스(CoffeMachine) 로직처리 클래스(CoffeManager)
		커피는 300원 거스름돈
		500원부터 10원 단위까지 큰 순서부터 반환(반환된 금액과 동전개수 출력)
		고려할 부분
		1.커피 가격보다 잔액이 부족할 경우
		-처음 투입 시(주문 전)는 추가 투입을 기다림
		-한 잔이라도 주문한 경우 100원 이하인 경우는 검사없이 바로 반환
		-100원 초과인 경우는 추가 투입 요구. 거절 시 반환
		2.잔액이 0일 경우
		커피머신 자동종료
	 * */
	private int coffe = 200; // 커피가격
	
	public int getCoffe() {
		return coffe;
	}
	public void setCoffe(int coffe) {
		this.coffe = coffe;
	}
	
	
	
}
