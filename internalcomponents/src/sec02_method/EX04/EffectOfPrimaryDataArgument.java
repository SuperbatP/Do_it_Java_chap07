package sec02_method.EX04;

public class EffectOfPrimaryDataArgument {
public static void main(String[] args) {
	int a=3;//지역변수-stack
	int result1 = twice(3);
	System.out.println(result1);
	
	int result2=twice(a);//메인 매서드 안에 int a
	System.out.println(result2);
	System.out.println(a);//stack 값은 3 twice(a)와 twice(3)은 다른 것!
	//기본자료형과 참조자료형의 지정 값이 다른 차이
}
public static int twice(int a) {
	a=a*2;//지역변수-stack
	return a;//지역변수-stack
}

}
