package ex01_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam2 {
	public static void main(String[] args) {
		Student student = new Student();
		List<String> scores = Arrays.asList(
			    "Alice:Math:85", "Alice:English:78",
			    "Bob:Math:90", "Bob:English:92", "Bob:Science:88",
			    "Charlie:Math:70", "Charlie:English:60"
			);
		Map<String, List<String>> subjectScore = new HashMap<>();

		for(String part : scores) {
			String[] value = part.split(":");
			String name = value[0];
			student.setName(name);
		}
		
		for(String part : scores) {
			String[] value = part.split(":");
			String subject = value[1];
			String score = value[2];
			List<String> sub = Arrays.asList(subject, score);
			subjectScore.put(name, sub);
		}
	}
}
