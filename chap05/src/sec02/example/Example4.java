package sec02.example;

public class Example4 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		// for(int i=0; i<4; i++)
		for (int i=0; i<array.length-1; i++) {
			//array[0] > array[1]
			//array[1] > array[2];
			//array[2] > array[3];
			//array[3] > array[4];
			if(array[i] > array[i+1]) {
				max = array[i];
			} else {
				max = array[i+1];
			}
		}
		
		
		
		System.out.println("max: " + max); 			// max: 8
	}

}
