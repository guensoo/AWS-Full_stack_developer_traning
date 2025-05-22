package ex06_List;

import java.util.Set;

public class MenuItem {
	
	// MenuItem클래스에 메뉴이름과 가격을 담는다.
	// CafeApp(Main)클래스에서 메뉴를 담는 ArrayList
	// 장바구니 ArrayList를 만들고 다음과 같이 작동하도록 만드세요
	private String a = "아메리카노";
	private String l = "라떼";
	private String c = "카푸치노";
	private int americano = 3000;
	private int latte = 3500;
	private int capuchino = 4000;
	private String name;
	private int price;
	
	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
	    return name;
	}

	public int getPrice() {
	    return price;
	}

	public void setA(String a) {
		this.a = a;
	}
	
	public void setAmericano(int americano) {
		this.americano = americano;
	}
	
	public void setC(String c) {
		this.c = c;
	}
	
	public void setCapuchino(int capuchino) {
		this.capuchino = capuchino;
	}
	
	public void setL(String l) {
		this.l = l;
	}
	
	public void setLatte(int latte) {
		this.latte = latte;
	}
	
	public String getA() {
		return a;
	}
	
	public int getAmericano() {
		return americano;
	}
	
	public String getC() {
		return c;
	}
	
	public int getCapuchino() {
		return capuchino;
	}
	
	public String getL() {
		return l;
	}
	
	public int getLatte() {
		return latte;
	}

}
