import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalTry2 {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String testcase = br.readLine();
		String[] t = testcase.split(" ");
		int T = Integer.parseInt(t[0]);

		for (int z = 0; z < T; z++) {

			String XYLR = br.readLine();
			String[] array = XYLR.split(" ");
			long number_X = Long.parseLong(array[0]);
			long number_Y = Long.parseLong(array[1]);
			long number_L = Long.parseLong(array[2]);
			long number_R = Long.parseLong(array[3]);

			String temp_number_L = Long.toBinaryString(number_L); // L ki length R kar chuke hai
			String temp_number_R = Long.toBinaryString(number_R); // Length R rahegi
			String temp_number_X = Long.toBinaryString(number_X);
			String temp_number_Y = Long.toBinaryString(number_Y);

			StringBuilder X = new StringBuilder(); // X ko R k equal banaya .
			StringBuilder Y = new StringBuilder(); // Y ko R k equal banaya .
			StringBuilder L = new StringBuilder(); // L ko R length equal banaya .
			StringBuilder R = new StringBuilder(temp_number_R);

			for (long v = 0; v < (temp_number_R.length() - temp_number_L.length()); v++) {
				L.append(0);
			}

			for (long u = 0; u < (temp_number_R.length() - temp_number_X.length()); u++) {
				X.append(0);
			}
			for (long w = 0; w < (temp_number_R.length() - temp_number_Y.length()); w++) {
				Y.append(0);
			}

			L.append(temp_number_L); // Yaha se modified L milega .
			X.append(temp_number_X); // Yaha se modified X milega .
			Y.append(temp_number_Y);

			System.out.println(X);
			System.out.println(Y);
			System.out.println(L);
			System.out.println(R);

		}
	}
}
