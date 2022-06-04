package codificacao_topico_40_listas;

import java.util.List;

public class list_V10 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4);
		int total1 = 0;

		for (Integer x : numbers) {
		    if (x % 2 == 0)
		    total1 += x * x;
		}
		
		System.out.println(total1);
		
		int total2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x * x)
                .sum();
		
		System.out.println(total2);
	}
	
	/*numbers                         // Input `List<Integer>` > [1, 2, 3, 4] <br>
    	.stream()                   // Converts input into `Stream<Integer>` <br>
    	.filter(x -> x % 2 == 0)    // Filter even numbers and return `Stream<Integer>` > [2, 4] <br>
    	.mapToInt(x -> x * x)       // Square the number, converts `Integer` to an `int`, and returns `IntStream` > [4, 16] <br>
    	.sum()                      // Returns the sum as `int` > 20
	 */
}
