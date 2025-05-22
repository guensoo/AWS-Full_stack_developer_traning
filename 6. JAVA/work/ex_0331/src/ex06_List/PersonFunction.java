package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonFunction {

	public void personFunc() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> info = new ArrayList<>();
		
		boolean turn = true;
		while(turn) {
			
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("4. 종료");
			int x = sc.nextInt();
			switch(x) {
			case 1:
				System.out.println("===정보 추가===");
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화 : ");
				String phone = sc.next();
				info.add(new Person(name, age, phone));
				System.out.println("등록이 완료되었습니다.");
				break;
			case 2:
				if(info.isEmpty()) {
					System.out.println("삭제할 정보가 없습니다.");
				} else {
					System.out.println("===정보 삭제===");
					System.out.print("삭제할 이름을 입력하세요 : ");
					for(int i = 0; i < info.size(); i++) {
						String deleteName = sc.next();
						if(info.get(i).getName().equals(deleteName)) {
							System.out.printf("'%s' 삭제 완료", info.get(i).getName());
							info.remove(i);
							break;
						} else {
							System.out.println("없는 이름입니다.");
						}
					}
				}
			case 3:
				if(info.isEmpty()) {
					System.out.println("입력된 정보가 없습니다.");
				} else {
					System.out.println("===전체 정보===");
					for(Person i : info) {
						
						System.out.printf("이름 : %s\n나이 : %d\n전화 : %s\n", i.getName(), i.getAge(), i.getPhone());
						System.out.println("-----------------------------------");
					}
				}
				break;
			case 4:
				System.out.println("시스템을 종료합니다.");
				turn = false;
				break;
			}
			
		}
	}
}
