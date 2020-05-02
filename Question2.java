import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 {
	static final int SIZE = 26;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String testcase = br.readLine();
		String[] t = testcase.split(" ");
		int T = Integer.parseInt(t[0]);

		for (int l = 0; l < T; l++) {

			String n_and_q = br.readLine();
			String input_query[] = n_and_q.split(" ");
			int N = Integer.parseInt(input_query[0]);
			int Q = Integer.parseInt(input_query[1]);

			String str = br.readLine();

			for (int k = 0; k < Q; k++) {

				String quering = br.readLine();
				String quering_input[] = quering.split(" ");
				int C = Integer.parseInt(quering_input[0]);

				int n = str.length();

				int[] freq = new int[SIZE];

				for (int i = 0; i < n; i++)
					freq[str.charAt(i) - 'a']++;

				for (int u = 0; u < freq.length; u++) {
					freq[u] = freq[u] - C;
				}

				long sum = 0;
				for (int x = 0; x < freq.length; x++) {
					if (freq[x] > 0) {
						sum += freq[x];
					}
				}

				System.out.println(sum);
			} // Query wala bracket.
		} // TestCase wala bracket
	}// main method bracket

}
