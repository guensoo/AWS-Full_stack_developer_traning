package ex02_lamda;

public class Ex02_Function {
	public static void main(String[] args) {
		FunctionExam fe = new FunctionExam();
		
		Iminus im = fe.makeFunction(); // (x,y) -> x - y;
		int res = im.sub(3, 1);
		System.out.println(res);
	}
}
