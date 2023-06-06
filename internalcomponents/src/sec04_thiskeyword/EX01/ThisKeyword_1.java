package sec04_thiskeyword.EX01;
//클래스 내부에서 필드, 메서드에 앞에 자동으로 붙는 this 키워드

class A{
	int m;
	int n;
	void init(int a, int b) {
		int c;//지역변수
		c=3;
		m=a;
	n=b;}//void init end
	void work() {
		init(2,3);//this가 자동으로 붙어서 가능해짐.
	}//void work end
}//A end

public class ThisKeyword_1 {
public static void main(String[] args) {
	A a=new A();
	a.work();
	System.out.println(a.m);
	System.out.println(a.n);
	
}
}
