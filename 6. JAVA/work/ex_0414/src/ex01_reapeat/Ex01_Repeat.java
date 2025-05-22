package ex01_reapeat;

public class Ex01_Repeat {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		str2 = "def";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}
