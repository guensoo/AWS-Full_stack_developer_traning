package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

//카페 주문 프로그램
	// 1. 메뉴보기
	// 2. 주문하기
	// 3. 결제하기
	// 4. 취소하기(선택한 항목 하나를 취소)
	// 5. 프로그램 종료

public class CafeApp {
	public static void main(String[] args) {
		ArrayList cart = new ArrayList<>(); // 장바구니
		Scanner sc = new Scanner(System.in); // 입력
		
		ArrayList<MenuItem> menuList = new ArrayList<>();
		ArrayList<MenuItem> orderList = new ArrayList<>();
		
		menuList.add(new MenuItem("아메리카노", 3000));
		menuList.add(new MenuItem("라떼", 3500));
		menuList.add(new MenuItem("카푸치노", 4000));
		
		boolean running = true;
		while(running) {
			System.out.println("===카페 주문 시스템===");
			System.out.println("1. 메뉴 보기");
			System.out.println("2. 메뉴 추가");
			System.out.println("3. 결제 하기");
			System.out.println("4. 종료 하기");
			System.out.println("5. 취소 하기");
			System.out.print("번호 선택 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				// menuList에 들어있는 내용을 꺼내서 보여주기
				System.out.println("[메뉴판]");
				int count = 1;
				for(MenuItem mi : menuList) {
					System.out.printf("%d. %s -%d원\n",count++, mi.getName(),mi.getPrice());
				}
				break;
			case 2:
				// 메뉴 추가기능
				// 메뉴번호를 입력받아서 해당 번호에 해당하는 객체를
				// orderList에 추가하면 된다.
				// 메뉴번호를 입력
				int menuNum = sc.nextInt();
				// 메뉴번호가 1보다 크거나 같거나, 메뉴리스트 사이즈보다는 작거나 같을 때
				if(menuNum >= 1 && menuNum <= menuList.size()) {
					// menuList에서 우리가 선택한 번호-1 한 인덱스에서 값을 가져온다.
					MenuItem selected = menuList.get(menuNum-1);
					// orderList에 저장
					orderList.add(selected);
					System.out.println("'"+selected.getName()+"'가 주문에 추가되었습니다.");
				}else {
					System.out.println("잘못된 메뉴 번호입니다.");
				}
				break;
				 // 번호를 잘못 입력하면 "잘못된 메뉴 번호입니다."
			case 3:
				// 결제하기
				//orderList가 비어있으면 결제할 주문이 없습니다. 출력하기
				if(orderList.isEmpty()) {
					System.out.println("결제할 주문이 없습니다.");
				} else {
					System.out.println("\n [결제내역]");
					int total = 0;
					for(MenuItem order : orderList) {
						System.out.println("- " + order.getName());
						total += order.getPrice();
					}
					System.out.println("총 금액 : " + total + "원");
					System.out.println("결제가 완료되었습니다. 감사합니다.");
					
					orderList.clear();
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				running = false;
				break;
			case 5:
				// 취소하기
				if(orderList.isEmpty()) {
					System.out.println("취소할 주문이 없습니다.");
				} else {
					System.out.println("[장바구니 목록]");
					for(int i = 0; i < orderList.size(); i++) {
						System.out.printf("%d. %s -%d원\n", i+1, orderList.get(i).getName(), orderList.get(i).getPrice());
					}
					System.out.print("취소할 번호를 입력하세요 : ");
					int cancleIndex = sc.nextInt();
					if(cancleIndex >= 1 && cancleIndex <= orderList.size()) {
						MenuItem removed = orderList.remove(cancleIndex - 1);
						System.out.println("'"+removed.getName()+"' 주문이 취소되었습니다.");
					} else {
						System.out.println("잘못된 번호입니다.");
					}
				}
				break;
		 // 취소할 주문번호를 입력하세요
		 // orderList에서 remove하면 됨
			}
		}
//		boolean run = true;
//		menu:while(run) {
//			MenuItem menu = new MenuItem();
//			System.out.println("카페 주문 프로그램입니다.");
//			System.out.print("1. 메뉴 보기\n2. 주문 추가\n3. 결제 하기\n4. 취소하기\n5. 종료\n");
//			System.out.print("번호 선택 : ");
//			
//			int i = sc.nextInt();
//			switch(i) {
//			case 1:
//				System.out.println(menu.getA() + " : " + menu.getAmericano() + "원");
//				System.out.println(menu.getL() + " : " + menu.getLatte() + "원");
//				System.out.println(menu.getC() + " : " + menu.getCapuchino() + "원");
//				continue menu;
//			case 2:
//				System.out.print("메뉴 번호 입력 : ");
//				i = sc.nextInt();
//				if(i == 1) {
//					cart.add(menu.getA());
//					System.out.println(menu.getA() + "가 주문에 추가되었습니다.");
//					continue menu;
//				} else if(i == 2) {
//					cart.add(menu.getL());
//					System.out.println(menu.getL() + "가 주문에 추가되었습니다.");
//					continue menu;
//				} else if(i == 3) {
//					cart.add(menu.getC());
//					System.out.println(menu.getC() + "가 주문에 추가되었습니다.");
//					continue menu;
//				} else {
//					System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
//					continue menu;
//				}
//				
//			case 3:
//				
//				run = false;
//				continue menu;
//	
//			case 4:
//				System.out.print("취소할 메뉴 번호 입력 : ");
//				i = sc.nextInt();
//				if(i == 1) {
//					cart.remove(menu.getA());
//					System.out.println(menu.getA() + "주문이 취소되었습니다.");
//					continue menu;
//				} else if(i == 2) {
//					cart.remove(menu.getL());
//					System.out.println(menu.getL() + "주문이 취소되었습니다.");
//					continue menu;
//				} else if(i == 3) {
//					cart.remove(menu.getC());
//					System.out.println(menu.getC() + "주문이 취소되었습니다.");
//					continue menu;
//				} else {
//					System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
//					continue menu;
//				}
//			}
//			if(i == 5) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//		}
	}
}
