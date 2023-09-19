package p1;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		Student s1 = new Student("A", "D", "111", 3.5);
		Student s2 = new Student("A", "B", "111", 3.5);
		
		
		System.out.println(s1 == s2);
		
		Student[] arr = {s1, s2};
		
		
		System.out.println("Before: " + Arrays.toString(arr));
		Arrays.sort(arr, (st1, st2) -> st1.getID().compareTo(st2.getID()));
		// can change lambda expression to parameters you wish to compare
		System.out.println("After: " + Arrays.toString(arr));
		// sorting based on compare to method?
		// there is a natural order for between data for sorting. ex 1<2 and a<b
		// functional interface means you can use lambda expression
		
		//predicate is to search not to compare
		
		
	}

}
