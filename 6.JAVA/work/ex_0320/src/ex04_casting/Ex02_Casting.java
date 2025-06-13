package ex04_casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		// double(8byte) -> float(4byte)
		// float의 범위 내 일때
		double d1 = 1.1234;
		float f1 = (float)d1;
		System.out.println("[double -> float] d1의 값 : " + d1 + " f1의 값 : " + f1);
		
		// double -> float(float의 최소 범위보다 작을경우(언더플로우))
		// float의 최소값 : 1.4 x 10의 -45승
		double d2 = 1.0e-50; // 1.0 x 10의 -50승
		float f2 = (float)d2;
		System.out.println("[double -> float] d2의 값 : " + d2 + " f2의 값 : " + f2); // 0.0
		
		// double -> float(float의 최대 범위보다 큰 경우(오버플로우))
		double d3 = 1.0e100;
		float f3 = (float)d3;
		System.out.println("[double -> float] d3의 값 : " + d3 + " f3의 값 : " + f3); // Infinity
		
		// double과 float의 정밀도 차이
		double d4 = 9.123456789;
		float f4 = (float)d4;
		System.out.println("[정밀도차이] d4의 값 : " + d4 + " f4의 값 : " + f4); // 9.123457
	}
}
