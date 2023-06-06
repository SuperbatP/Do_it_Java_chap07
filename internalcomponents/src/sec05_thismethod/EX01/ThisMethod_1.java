package sec05_thismethod.EX01;

//this()-this메서드 문법적 특징과 의미 : 자신의 속한 클래스의 다른 생성자 호출
class A{
	A(){
		System.out.println("첫 번째 생성자");}//A 생성자 end
	A(int a){
	this();//this->A ,A() 생성자의 첫 줄에만 올 수 있음 먼저 A생성자가 호출 된 후 두번째 생성자 호출
		System.out.println("두 번째 생성자");}//A(int a) 생성자 end
}//class A end

//void abc() {this();}//불가능 매서드 안에는 올 수 없음

public class ThisMethod_1 {
public static void main(String[] args) {
	A a1=new A();// 첫 번째 생성자
	System.out.println();
	A a2=new A(3);
}
}
