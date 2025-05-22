package ex01_innerClass;

import java.util.List;

public class FileMain {
	public static void main(String[] args) {
		List<String> content = List.of(
				"첫 번째 줄",
				"두 번째 줄",
				"세 번째 줄"
				);
		
		FileProcessor processor = new FileProcessor();
		processor.processFile(content);
	}
}
