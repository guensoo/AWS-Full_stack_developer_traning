package ex02_db;

import java.util.List;

public class EmpSelect {
	public static void main(String[] args) {

		List<Emp> list = EmpMethod.find("MANAGER");
		List<Person> person = PersonMethod.find();

		for (Emp e : list) {
			System.out.printf("사번 : %d, 이름 : %s, 직종 : %s, 급여 : %d\n", e.getEmpno(), e.getEname(), e.getJob(),
					e.getSalary());
		}
		for (Person p : person) {
			System.out.printf("사번 : %d, 이름 : %s, 나이 : %d\n", p.getIdx(), p.getName(), p.getAge());
		}
		PersonMethod.add(4, "김길동", 50);

	}
}

