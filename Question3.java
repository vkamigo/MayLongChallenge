import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question3 {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String testcase = br.readLine();
		String[] t = testcase.split(" ");
		int T = Integer.parseInt(t[0]);

		for (int z = 0; z < T; z++) {

			String XYLR = br.readLine();
			String[] array = XYLR.split(" ");
			int X = Integer.parseInt(array[0]);
			int Y = Integer.parseInt(array[1]);
			int L = Integer.parseInt(array[2]);
			int R = Integer.parseInt(array[3]);

			int result = 0;

			int value = X | Y;

			if (value < L) {
				
			}

				if (value > R) {

				}

			if (value <= R && value >= L) {
				System.out.println(value);
			}

		}

	}
}
