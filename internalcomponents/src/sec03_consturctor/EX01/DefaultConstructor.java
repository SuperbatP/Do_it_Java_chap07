package sec03_consturctor.EX01;

//컴파일러가 자동 추가해주는 생성자(기본생성자)
class A{
	int m;
	void work() {System.out.println(m);}//0
} //A end 생성자를 추가하지 않아도 기본 생성자를 자동 넣어줌.
class B{
	int m;
	void work() {System.out.println(m);}//0
	B() {//기본생성자
}}//B end
class C{
	int m;
	void work() {System.out.println(m);}
	C(int a){//생성자의 기본 기능: 객체 생성+필드초기화
		m=a;}
	}//C end


public class DefaultConstructor {
public static void main(String[] args) {
	//클래스의 객체 생성
	A a= new A();
	B b = new B();
	//C c = new C(); 이미 C는 기본생성자가 아님. 오류 발생
	C c=new C(3);
	
	a.work();
	b.work();
	c.work();
}
}
