package sec02.example;

public class Example5 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83,92,96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int arr_length = 0;
		
		for (int i=0; i<array.length; i++) {
			for(int k=0; k<array[i].length; k++) {
				sum = sum + array[i][k];
				arr_length++;
			}
		}
		
		avg = (double) sum / arr_length;
		
		
		System.out.println("sum: " + sum);			// 881
		System.out.println("avg: " + avg);			// 88.1
	}

}
