import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question1 {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String testcase = br.readLine();
		String[] t = testcase.split(" ");
		int T = Integer.parseInt(t[0]);

		for (int k = 0; k < T; k++) {

			String input = br.readLine();
			String[] n = input.split(" ");
			int N = Integer.parseInt(n[0]);

			int arr[] = new int[N];

			String input_in_array = br.readLine();
			String numbers[] = input_in_array.split(" ");

			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(numbers[j]);
			}

			int distance[] = new int[N - 1];

			for (int i = 0; i < N - 1; i++) {
				distance[i] = arr[i + 1] - arr[i];
			}
			int initial_index = 0, final_index = 0;
			int finalised_array[] = new int[N - 1];
			int count = 0;
			
			for (int z = 0; z < distance.length; z++) {

				initial_index = final_index;

				if (distance[z] > 2) {
					count++;
					final_index = z;
					int max_value = final_index - initial_index + 1 ;
					finalised_array[z] = max_value;
				}

			}

			Arrays.sort(finalised_array);
			
			if(count>0 && finalised_array[finalised_array.length-1]!=0) {
				System.out.println(2+" "+finalised_array[finalised_array.length-1]);
			}
			else if(count ==0 && finalised_array[finalised_array.length-1]==0) {
				System.out.println((N)+" "+(N));
			}
			else if(count>0 && finalised_array[finalised_array.length-1]==0) {
				System.out.println(1+" "+1);
			}
		}

	}
}
