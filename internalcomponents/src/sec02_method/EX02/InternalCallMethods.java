package sec02_method.EX02;

public class InternalCallMethods {//내부에 메서드 호출
	public static void main(String[] args) {
	//같은 클래스 안에 있는 내부 메서드 출력 
		print();//객체 설정 안하고 메서드를 직접 출력
		int a = twice(3);
		System.out.println(a);//3+2
		double b=sum(a,5.8);//6+5.8
		System.out.println(b);
		
}
public static void print() {//main에서도 다른 매서드를 호출하려면 public static를 써야함
	System.out.println("안녕");}

public static int twice(int k) {
	return k*2;}

public static double sum(int m,double n) {
	return m+n;}

}
//외부 클래스와 내부 클래스의 호출 차이점 기억할 것.