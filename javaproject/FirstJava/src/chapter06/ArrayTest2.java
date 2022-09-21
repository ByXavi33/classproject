package chapter06;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 배열 인스턴스 생성과 초기화
		int[] arr1 = { 100, 80, 20, 40, 30 }; // new int[5];
		System.out.println("arr1 요소의 개수 :" + arr1.length);
		
		System.out.println("배열 arr1의 요소 출력");
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]);
		}

		
		System.out.println();
		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("arr2 요소의 개수 :" + arr2.length);
		
		System.out.println("배열 arr2의 요소 출력");
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("______________");
		//6 5 4 3 2 1
		for(int i=arr2.length-1; i>=0; i--) {
			System.out.println(arr2[i]);
		}
	}
}
