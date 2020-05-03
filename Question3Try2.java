import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question3Try2 {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String testcase = br.readLine();
		String[] t = testcase.split(" ");
		int T = Integer.parseInt(t[0]);

		for (int z = 0; z < T; z++) {

			String XYLR = br.readLine();
			String[] array = XYLR.split(" ");
			long X = Long.parseLong(array[0]);
			long Y = Long.parseLong(array[1]);
			long L = Long.parseLong(array[2]);
			long R = Long.parseLong(array[3]);
			long final_result = 0;

			long value = X | Y;

			if (value >= L && value <= R) {
				System.out.println(value);
			} else {
				long number_of_bits = (long) (Math.log(R) / Math.log(2) + 1);
				long number_1 = (long) Math.pow(2, number_of_bits - 1) - 1; // number with all 1's
				long number_2 = (long) Math.pow(2, number_of_bits - 1); // number with all 0's except 1st 1.

				long temp_result_1 = (X & number_1) * (Y & number_1);
				long temp_result_2 = (X & number_2) * (Y & number_2);

//				System.out.println(number_of_bits);
//				System.out.println(number_1+" "+number_2);
//				System.out.println(temp_result_1+" "+temp_result_2);
				
				if (temp_result_1 > temp_result_2) {
					final_result = number_1 & value;
				} else if((temp_result_1 < temp_result_2)) {
					final_result = number_2 & value;
				}
				System.out.println(final_result);
			}
			
		}

	}
}
