package assign_w3_d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnCollectionsList {

	public static void main(String[] args) {
		Integer[] num = { 1, 2, 3, 1, 4, 5, 1, 6, 7 };
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();

		list.addAll(Arrays.asList(num));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list);

			if (list.get(i) == 1) {
				count++;
			}

			System.out.println(count);

		}

	}
}
