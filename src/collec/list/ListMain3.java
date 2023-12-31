package collec.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class List3{
	//생성자에서 li에 3.14를 담고 싶어 한다. 적절한 제네릭 타입을 적으시오.
	List<Double> li = new ArrayList<>(); //실수형(float 32, double 64 - 더 많은 값 담음) -> 래퍼 클래스 Double
	List<Boolean> isOk = null; //논리형(boolean)의 래퍼클래스 Boolean
	List3(){
		li.add(3.14);
		//insert here - 아래 코드에서 NullPointerException의 원인이 발견되었다
		//이 문제를 해결하는 코드를 작성하시오.
		isOk = new ArrayList<>(); //싱글스레드 안전
		isOk = new Vector<>();    //멀티스레드 안전
		isOk.add(true);
		/*
		try {
			isOk = new ArrayList<>();
			isOk.add(true);
		} catch (Exception e) {
			e.getStackTrace();
		}
		*/
	}
}/////////// end of List1
public class ListMain3 {
	public static void main(String[] args) {
		List3 l1 = new List3();
		System.out.println(l1.li);//3.14가 출력된다
		System.out.println(l1.isOk);//true가 출력된다
		System.out.println("List1에 선언된 자료구조 초기화해보기");
	}///////////////// end of main
}/////////////////// end of ListMain1