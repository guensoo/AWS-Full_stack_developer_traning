package ex01_inheritance;


class A{
    public A(){
    	System.out.println("A");
    	}
    public A(int x){
    	System.out.println("A: " + x);
    	}
}

class B extends A{
    public B(){
    	super(100);
    	}
    public B(int x){
    	// super(); 생략되어있음.
    	// TODO : 오버로딩, Super(), 생성자 다시 공부 필요 
    	System.out.println("B: "+x);
    	}
}

public class Example{
    public static void main(String[] args){
        B b = new B(11);
    } // B : 11
}