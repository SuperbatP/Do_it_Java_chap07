package sec02_method.EX03;

import java.util.Arrays;

public class ArrayArgumentMethod {
public static void main(String[] args) {
	//배열을 매개변수로 가지는 매서드 호출
	printArray(new int[] {1,2,3});
}

public static void printArray(int[] a) {
//int[] a;
//a=new int[] {1,2,3};
	
	System.out.println(Arrays.toString(a));
}
}
