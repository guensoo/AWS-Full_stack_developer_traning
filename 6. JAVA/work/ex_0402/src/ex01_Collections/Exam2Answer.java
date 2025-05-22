package ex01_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam2Answer {
	public static void main(String[] args) {
		List<String> scores = Arrays.asList(
			    "Alice:Math:85", "Alice:English:78",
			    "Bob:Math:90", "Bob:English:92", "Bob:Science:88",
			    "Charlie:Math:70", "Charlie:English:60"
			);
		
		Map<String, StudentAnswer> studentMap = new HashMap<>();
		
		for(String record : scores) {
			String[] parts = record.split(":");
			String name = parts[0];
			int score = Integer.parseInt(parts[2]);
			// 값이 없을 때만 넣는다.(이미 키가 있으면 무시)
			studentMap.putIfAbsent(name, new StudentAnswer(name));
			// name을 통해서 얻어온 Student객체를 통해 addScore메서드를 호출하고
			// 점수를 전달
			studentMap.get(name).addScore(score);
		}
		
		StudentAnswer topStudent = null;
		double highAvg = 0;
		
		for(StudentAnswer student : studentMap.values()) {
			double avg = student.getAverage();
			if(avg > highAvg) {
				highAvg = avg;
				topStudent = student;
			}
		}
		
		if(topStudent != null) {
			System.out.println(topStudent.getName()+" => "+highAvg);
		}
	}
}
