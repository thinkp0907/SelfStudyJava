package sec02.exam04;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {		// 로컬 변수로 사용할때는 내부에서 변수 값이 변할 수 없음.
		final int var1 = 0;					
		int var2 = 0;						// int로만 적어도 final int
		
		field = 10;
		
//		arg1 = 20;
//		arg2 = 20;
		
//		var1 = 30;
//		var2 = 30;
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
