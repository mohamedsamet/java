package lesson1;

public class ArrayLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1,3,2,5};
		System.out.println(myArray[1]);
		for (int index = 0; index < myArray.length; index++) {
			System.out.println(myArray[index]);
		}
		for (int element : myArray) {
			System.out.println(element);
		}
	}

}
