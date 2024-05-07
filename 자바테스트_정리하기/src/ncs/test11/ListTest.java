package ncs.test11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListTest {

	public static void display(List<Integer> list) {
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random rd = new Random();

		for (int i = 0; i < 10; i++) {
			list.add(rd.nextInt(100) + 1);
		}

		System.out.print("정렬 전 : ");
		display(list);
		
		Collections.sort(list, new Decending());
		
		System.out.print("정렬 후 : ");
		display(list);
	}
}
