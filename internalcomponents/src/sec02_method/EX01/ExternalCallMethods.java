package sec02_method.EX01;
//클래스의 외부에서 매서드 호출

//클래스 정의
class A{
	//1. 리턴타입 :void +매개변수 없음
	void print() {
		System.out.println("안녕");
	}
	
	//2. 리턴타입 : int +매개변수 없음 void 외에는 다 return 써야함.
	int data() {
		return 3;
		}
		
	//3. 리턴타입 : double +매개변수 2개
	double sum(int a, double b) {
		return a+b;
			}	
	//4. 리턴타입 :void +내부에 리턴 포함(함수를 종료한다는 의미ㅣ
	void printMonth(int m) {
		if(m<0||m>12) {
			System.out.println("잘못된 입력");
			return;//단독 return만 사용해서 종결로 만듦
				}
			System.out.println(m+"월입니다");}
		}
	//메소드 정의만 한 것.	

public class ExternalCallMethods {
public static void main(String[] args) {
	//객체 생성
	A a = new A();
	//메소드 호출(멤버 활용)
	a.print(); 
	int k = a.data();//3을 저장할 값 k 저장
	System.out.println(k);
	double result = a.sum(3, 5.2);
	System.out.println(result);
	a.printMonth(5);
	a.printMonth(15);
	
	
}
}
