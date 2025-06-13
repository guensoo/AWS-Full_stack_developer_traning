package ex04_Interface;

public class Kitchen implements Menu1, Menu2{

	@Override
	public String JJamBBong() {
		return "면+해물+육수";
	}
	
	@Override
	public String jajang() {
		return "면+춘장+완두콩";
	}
}
