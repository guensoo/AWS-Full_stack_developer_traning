package ex05_enum;

public enum Status {
	SUCCESS(true), FAIL(false);
	
	boolean status;
	
	Status(boolean status){
		this.status = status;
	}
}
