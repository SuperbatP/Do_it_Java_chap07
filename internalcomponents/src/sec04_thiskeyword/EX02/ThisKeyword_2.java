package sec04_thiskeyword.EX02;
class A{
	int m;//필드 class A 중괄호 안까지 살아있음
	int n;//필드 class A 중괄호 안까지 살아있음
	void init(int m, int n) {
		m=m; n=n;}// 가까운 변수로 할당. 지역변수 void init 중괄호 안까지 살아있음 폰트색이 다르다.
}//class A end

class B{
	int m;
	int n;
	void init(int m, int n) {
		this.m=m; 
		this.n=n;} //this.를 붙이면 폰트 색깔 바뀜
}//class B end

public class ThisKeyword_2 {
public static void main(String[] args) {
	//필드명과 지역변수 명이 같은 경우(this 키워드를 사용하지 않은 경우)
	A a=new A();
	a.init(2, 3);
	System.out.println(a.m);//0 강제초기화가 되지 않은 필드값. 맨 위에 폰트와 색이 같음
	System.out.println(a.n);//0
	
	B b=new B();
	b.init(2, 3);
	System.out.println(b.m);
	System.out.println(b.n);
}
}
