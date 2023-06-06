package sec02_method.EX06;

public class MethodOverloading {
	public static void main(String[] args) {
		print();//입력매개 변수가 없으니까, 그 메서드를 찾아서 출력함
		print(3);
		print(5.8);
		print(2,5);
	}
public static void print() {//매개변수 없음
	System.out.println("데이터가 없습니다.");
}
public static void print(int a) {//메서드 이름은 동일하지만 시그니쳐는 다름-특징이 다름/매개변수 정수형a
	System.out.println(a);
}
public static void print(double a) {
	System.out.println(a);
}
//public static void print(double b) {//메서드와 시그니쳐가 같으면 동일한 클래스 안에 존재 할 수 없음
	//System.out.println(b);}
public static void print(int a, int b) {
	System.out.println("a: "+a+" b: "+b);
}
//public static int print(int a, int b) {//메서드와 시그니쳐가 같으면 동일한 클래스 안에 존재 할 수 없음
	//System.out.println("a: "+a+" b: "+b);//void 가 있던 없던 동일한 것으로 파악.
	//return a+b;}


}
