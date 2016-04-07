package numbers;

import java.util.ArrayList;


public class PrimeGenerator {

	private int [] numbers;
	
	public PrimeGenerator(int n) {
		numbers = new int[n];
		for (int i = 2; i < Math.sqrt(n); ) {
			int sq = i * i;
			while (sq < n) {
				numbers[sq] = 1;
				sq += i;
			}
			i++;
			while (numbers[i] == 1 && i < Math.sqrt(n))
				i++;
		}
	}
	public ArrayList<Integer> get_list() {
		ArrayList<Integer> prime_list = new ArrayList<Integer>();
		for (int i = 2; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				prime_list.add(i);
			}
		}		
		return prime_list;
	}
}
