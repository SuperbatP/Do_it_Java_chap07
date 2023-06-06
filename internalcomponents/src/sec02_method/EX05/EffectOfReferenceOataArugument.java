package sec02_method.EX05;

import java.util.Arrays;

public class EffectOfReferenceOataArugument {
public static void main(String[] args) {
	int[] array = new int[] {1,2,3};
	
	modifyData(array);
	printArray(array);
}
public static void modifyData(int[] a) {//array와a는 동일한 heap 객체를 가르킴-참조자료형
	a[0]=4;////기본자료형과 참조자료형의 지정 값이 다른 차이
	a[1]=5;
	a[2]=6;
}
public static void printArray(int[] a) {
	System.out.println(Arrays.toString(a));
}


}
