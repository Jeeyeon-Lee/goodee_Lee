package com.week3;
class Param{
	int ival;
}
public class TestParam {
	//디폴트 생성자
	TestParam(){  
		System.out.println("TestParam 호출");
		Param p = null;
		effectParam(p);
	} 
	//파라미터 자리 참조형타입 연습, 파라미터 자리를 갖는 건 생성자와 메소드
	void effectParam(Param p) { //p는 널인가?
		p = new Param();
		System.out.println("effectParam" + p);
		p.ival = 100;
		System.out.println("sub ival : " + p.ival);
	}
	public static void main(String[] args) {
		TestParam tp = new TestParam();
		Param p = null;
		p = new Param();   
		p.ival = 500;
		tp.effectParam(p);  //null
		System.out.println("main ival : " + p.ival);
	}
}
