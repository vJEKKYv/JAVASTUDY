package week_05;

import java.util.*;
public class ObjectManager {
	protected int index;
	Object objectList[];
	Scanner input;
	int money[];
	public ObjectManager(int max) {
		index = 0;
		objectList = new Object[max];
		input = new Scanner(System.in);
		money = new int[7];
	}
	public void init() {
		System.out.println("모든 주화 20개씩 투입되어있음. ");;
		for(int i = 0; i < 7; i++) {
			money[i] = 20;
		}
		objectList[index++] = new Object(index, "생수", 1000, 15);
		objectList[index++] = new Object(index, "레몬워터", 1800, 20);
		objectList[index++] = new Object(index, "콜라", 1500, 40);
		objectList[index++] = new Object(index, "사이다", 1500, 4);
		objectList[index++] = new Object(index, "밀키스", 1500, 3);
		objectList[index++] = new Object(index, "레쓰비", 900, 0);
	}
	public void addObject() {
		int id = index+1, price, number;
		String name;
		System.out.println("ID: "+id);
		System.out.print("제품명: ");
		name = input.next();
		while(nameCheck(name)>-1) {
			System.out.println(name+"(은)는 중복된 제품명입니다. 다른 제품명을 입력해주세요");
			System.out.print("제품명: ");
			name = input.next();
		}
		System.out.print("가격: ");
		price = input.nextInt();
		System.out.print("수량: ");
		number = input.nextInt();
		objectList[index++] = new Object(id, name, price, number);
	}
	public void changeObject() {
		int id, price, number, select;
		String name;
		showAll();
		System.out.print("바꿀 제품 ID: ");
		id = input.nextInt();
		while(id>index||id<1) {
			System.out.println("잘못된 ID 입니다. 다른 ID를 입력해주세요. ");
			System.out.print("바꿀 제품 ID: ");
			id = input.nextInt();
		}
		System.out.println("1. 제품명 변경, 2. 가격 변경, 3. 수량 변경, 0. 모두 변경");
		System.out.print("선택 >> ");
		select = input.nextInt();
		switch(select) {
		case 0:
		case 1:
			System.out.print("새로운 제품명: ");
			name = input.next();
			objectList[id-1].changeName(name);
			if(select != 0) { break;}
		case 2:
			System.out.print("변경된 가격: ");
			price = input.nextInt();
			objectList[id-1].changePrice(price);
			if(select != 0) { break;}
		case 3:
			System.out.print("변경된 수량: ");
			number = input.nextInt();
			objectList[id-1].changeNumber(number);
			break;
		default:
			System.out.println("잘못된 숫자입니다. 변경을 취소합니다. ");
		}
		System.out.println("변경되었습니다. ");
	}
	public int nameCheck(String name) { // 이름으로 중복 체크 겸 목록에서 제품 찾기
		for (int i = 0; i < index; i++) {
			if(objectList[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public void buyObject() {
		int id, money = 0, price, change = 0, number;
		showAll();
		do {
			System.out.print("구매할 제품의 번호 >> ");
			id = input.nextInt();
			number = objectList[id-1].getNumber();
			if(id<0||id>index) {
				System.out.println("잘못된 번호입니다. ");
			}
			if (number == 0) {
				System.out.println("해당 제품은 품절되었습니다. ");
			}
		} while(number==0&&(id<0||id>index));
		price = objectList[id-1].getPrice();
		do {
			System.out.print("투입 금액 입력: ");
			money += input.nextInt();
			price = objectList[id-1].getPrice();
		}while(money < price);
		money-=price;
		System.out.println(objectList[id-1].getName()+"이(가) 나왔습니다. ");
		if(money > 0) {
			change = moneyChange(money);
		}
		else {System.out.println("반환할 금액이 없습니다. ");}
		if (change>0) {
			System.out.println("남은 잔돈: "+change);
		}
		objectList[id-1].changeNumber(number - 1);
		System.out.println("물건 구매를 종료합니다. ");
	}
	public int moneyChange(int change) {
		int[]changeList = {0,0,0,0,0,0,0}; 
		while(money[0] > 0 && change / 10000 > 0) {
			change-= 10000;
			money[0]-=1;
			changeList[0]+=1;
		}
		while(money[1] > 0 && change / 5000 > 0) {
			change-= 5000;
			money[1]-=1;
			changeList[1]+=1;
		}
		while(money[2] > 0 && change / 1000 > 0) {
			change-= 1000;
			money[2]-=1;
			changeList[2]+=1;
		}
		while(money[3] > 0 && change / 500 > 0) {
			change-= 500;
			money[3]-=1;
			changeList[3]+=1;
		}
		while(money[4] > 0 && change / 100 > 0) {
			change-= 100;
			money[4]-=1;
			changeList[4]+=1;
		}
		while(money[5] > 0 && change / 50 > 0) {
			change-= 50;
			money[5]-=1;
			changeList[5]+=1;
		}
		while(money[6] > 0 && change / 10 > 0) {
			change-= 10;
			money[6]-=1;
			changeList[6]+=1;
		}
		System.out.println("1만원권 "+changeList[0]+"장 반환");
		System.out.println("5천원권 "+changeList[1]+"장 반환");
		System.out.println("1천원권 "+changeList[2]+"장 반환");
		System.out.println("500원권 "+changeList[3]+"개 반환");
		System.out.println("100원권 "+changeList[4]+"개 반환");
		System.out.println("50원권 "+changeList[5]+"개 반환");
		System.out.println("10원권 "+changeList[6]+"개 반환");
		if(change>0) {
			System.out.println("거스름돈이 부족합니다. 관리자에게 문의하세요. 전화번호. 010-6640-1971");
		}
		return change;
	}
	public void showAll() {
		System.out.println("-------------------------------------");
		System.out.println("ID\t제품명\t가격\t수량");
		System.out.println("-------------------------------------");
		for(int i = 0; i < index; i++) {
			objectList[i].showData();
		}
		System.out.println("-------------------------------------");
	}
	public void showSoldOut() {
		System.out.println("-------------------------------------");
		System.out.println("ID\t제품명\t가격\t수량");
		System.out.println("-------------------------------------");
		for(int i = 0; i < index; i++) {
			if (objectList[i].getNumber() == 0) {
				objectList[i].showData();
			}
		}
		
		System.out.println("-------------------------------------");
	}
	public void showOne() {
		System.out.print("제품 이름: ");
		String name = input.next();
		int id = nameCheck(name)+1;
		if (id<0) {
			System.out.println("없는 제품입니다. 제품 검색을 종료합니다. ");
			return;
		}
		System.out.println("-------------------------------------");
		System.out.println("ID\t제품명\t가격\t수량");
		System.out.println("-------------------------------------");
		objectList[id-1].showData();
		System.out.println("-------------------------------------");
	}
	
}
