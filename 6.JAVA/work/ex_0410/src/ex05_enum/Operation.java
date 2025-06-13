package ex05_enum;

public enum Operation {
	PLUS{
		@Override
		int apply(int x, int y) {
			return x + y;
		}
	},
	MINUS{
		@Override
		int apply(int x, int y) {
			return x - y;
		}
	},
	MULTI{
		@Override
		int apply(int x, int y) {
			return x * y;
		}
	}, 
	DIV{
		@Override
		int apply(int x, int y) {
			return x / y;
		}
	};
	 
	abstract int apply(int x, int y);
}
