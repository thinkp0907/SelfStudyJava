package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); 	// true 	int 타입이 자동으로 double 타입으로 변환됨
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);	// false	0.1f는 0.1의 근사값(0.1000000149011612)로 표현되면 이는 0.1보다 큰 값
		System.out.println((float) v4 == v5);	//true
	}

}
