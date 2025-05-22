package exam1;

import java.util.Set;

public class Pen {
	private int amount; // 펜의 양
    private String color; // 펜의 색
	
	public int getAmount() {
		return amount;
		}
	
	// 남은 량
    public void setAmount(int amount) {
    	this.amount = amount;
    	}
    
    public class Pen{ // 최상위
        private int amount; //남은 량

        public int getAmount(){return amount;}
        public void setAmount(int amount){this.amount = amount;}

        
    }
    
    class SharpPencil extends Pen{ // 자식1
        private int width; //펜의 굵기
        
        public int getWidth() {
			return width;
		}
        public void setWidth(int width) {
			this.width = width;
		}

    }

    class Ballpen extends Pen{ // 자식2 부모
        private String color; //볼펜의 색
    	public String getColor(){return color;}
        public void setColor(String color){this.color = color;}
    }

    class FountainPen extends Ballpen{ // 2차상속
        public void refill(int n){setAmount(n);}

    }
    
}
