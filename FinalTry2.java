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

			StringBuilder x = new StringBuilder(); // X ko R k equal banaya .
			StringBuilder y = new StringBuilder(); // Y ko R k equal banaya .
			StringBuilder L = new StringBuilder(); // L ko R length equal banaya .
			StringBuilder R = new StringBuilder(temp_number_R);

			for (long v = 0; v < (temp_number_R.length() - temp_number_L.length()); v++) {
				L.append(0);
			}

			for (long u = 0; u < (temp_number_R.length() - temp_number_X.length()); u++) {
				x.append(0);
			}
			for (long w = 0; w < (temp_number_R.length() - temp_number_Y.length()); w++) {
				y.append(0);
			}

			L.append(temp_number_L);
			x.append(temp_number_X);
			y.append(temp_number_Y);

			String X = new String(x.substring(x.length() - R.length()));
			String Y = new String(y.substring(y.length() - R.length()));

			System.out.println(L);

			System.out.println(X);
			System.out.println(Y);
			System.out.println(R);

			boolean option_flag = false;
			int option_index = -1;

			StringBuilder Z = new StringBuilder();

			for (int index = 0; index < R.length(); index++) {

				if (L.charAt(index) == '0' && R.charAt(index) == '0') {
					if (option_flag == false) {
						Z.append(0);
						option_flag = false;
						// option_index = ;
					} else {
						if (X.charAt(index) == '1' && Y.charAt(index) == '1') {
							Z.append(1);
							option_flag = false;
							Z.replace(index - 1, index - 1, "0");
							// option_index = ;
						}
					}

				} else if (L.charAt(index) == '1' && R.charAt(index) == '0') {
					if (option_flag == false) {
						Z.append(0);
						option_flag = false;
						// option_index = ;
					} else {
						if (X.charAt(index) == '1' && Y.charAt(index) == '1') {
							Z.append(1);
							option_flag = false;
							Z.replace(index - 1, index - 1, "0");
							// option_index = ;
						}
					}

				} else if (L.charAt(index) == '0' && R.charAt(index) == '1') {
					if (option_flag == false) {
						if (X.charAt(index) == '0' && Y.charAt(index) == '0') {
							Z.append(0);
							option_flag = true;
							// option_index = ;
						}
						else if (X.charAt(index) == '0' && Y.charAt(index) == '1') {
							Z.append(1);
							option_flag = true;
							// option_index = ;
						}
						else if (X.charAt(index) == '1' && Y.charAt(index) == '0') {
							Z.append(1);
							option_flag = true;
							// option_index = ;

						}
						else if(X.charAt(index) == '1' && Y.charAt(index) == '1') {
							Z.append(1);
							option_flag = false;
							// option_index = ;

						}

					} else {
						if (X.charAt(index) == '0' && Y.charAt(index) == '0') {
							Z.append(0);
							option_flag = true;
							// option_index = ;

						}
						else if (X.charAt(index) == '0' && Y.charAt(index) == '1') {
							Z.append(1);
							option_flag = true;
							// option_index = ;
						}
						else if (X.charAt(index) == '1' && Y.charAt(index) == '0') {
							Z.append(1);
							option_flag = true;
							// option_index = ;
						}
						else if (X.charAt(index) == '1' && Y.charAt(index) == '1') {
							Z.append(1);
							option_flag = false;
							// option_index = ;
						}

					}

				} else if (L.charAt(index) == '1' && R.charAt(index) == '1') {
					if (option_flag == false) {
						if (X.charAt(index) == '0' && Y.charAt(index) == '0') {
							Z.append(0);
							option_flag = true;
							// option_index = ;
						}
						else if (X.charAt(index) == '0' && Y.charAt(index) == '1') {
							Z.append(1);
							option_flag = true;
							// option_index = ;
						}
						else if (X.charAt(index) == '1' && Y.charAt(index) == '0') {
							Z.append(1);
							option_flag = true;
							// option_index = ;
						}
						else if (X.charAt(index) == '1' && Y.charAt(index) == '1') {
							Z.append(1);
							option_flag = false;
							// option_index = ;
						}

					} else {
						if (X.charAt(index) == '0' && Y.charAt(index) == '0') {
							Z.append(0);
							option_flag = true;
							// option_index = ;
						}
						else if (X.charAt(index) == '0' && Y.charAt(index) == '1') {
							Z.append(1);
							option_flag = true;
							// option_index = ;
						}
						else if (X.charAt(index) == '1' && Y.charAt(index) == '0') {
							Z.append(1);
							option_flag = true;
							// option_index = ;
						}
						else if (X.charAt(index) == '1' && Y.charAt(index) == '1') {
							Z.append(1);
							option_flag = false;
							// option_index = ;
						}

					}

				}
			}

//			Z.substring(0, R.length());
			
			long final_result = Long.parseLong(Z.substring(0, R.length()), 2);

			System.out.println(final_result);
			//System.out.println(Z);
		}
	}
}
