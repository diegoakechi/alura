import java.util.HashMap;
import java.util.Map;

public class Fatorial {

	int fat = 0;

	static Map<Integer, Integer> fatBuffer = new HashMap<>();

	public Integer fatorial(int n) {

		if (n <= 1) {
			return 1;
		}

		if (fatBuffer.get(n) != null) {
			return fatBuffer.get(n);
		}

		fat = fatorial(n - 1) * n;

		fatBuffer.put(n, fat);

		return fat;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 5; i++) {
			System.out.println(new Fatorial().fatorial(i));
		}
	}

}
