package sec05_thismethod.EX02;
//this(생성자 매개변수) 활용
class A{
	int m1,m2,m3,m4;
	A(){//필드 초기화
		m1=1;
		m2=2;
		m3=3;
		m4=4;
	}//A 생성자 end
	A(int a){
		m1=a;
		m2=2;
		m3=3;
		m4=4;
			}//A(int a) 생성자 end
	
	A(int a, int b){
		m1=a;
		m2=b;
		m3=3;
		m4=4;
			}//A(int a,int b) 생성자 end
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4);
		System.out.println();}//void print end
	
}//class A end

class B{
	int m1,m2,m3,m4;
	B(){//필드 초기화
		m1=1;
		m2=2;
		m3=3;
		m4=4;}//B 생성자 end
	B(int a){
	this();
		m1=a;}//B(int a) 생성자 end
	
	B(int a, int b){
		this(a);
		m2=b;}//B(int a,int b) 생성자 end
	
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.println(m4);}//void print end
	
	
}//class B end

public class ThisMethod_2 {
public static void main(String[] args) {
	A a1=new A();
	A a2=new A(10);
	A a3=new A(10,20);
	a1.print();
	a2.print();
	a3.print();
	System.out.println();
	
	B b1=new B();
	B b2=new B(10);
	B b3=new B(10,20);
	b1.print();
	b2.print();
	b3.print();
	System.out.println();

}
}
