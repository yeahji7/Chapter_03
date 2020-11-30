package chap03.ex01.arrDefine;

public class Ex01 {

	public static void main(String[] args) {
		//대괄호 위치는 타입이나 이름 어디에 붙여도 된다.
		//1.  선언과 동시에 값을 넣는 방법
		int[] score= {70,80,90};
		
		//2. 변수를 만든 후 new 연산자로 값을 추가하는 방법
		int[] scores;
		scores=new int []{70,80,90};
		
		//3. 선언만 하는 방법. 제일많이사용함.
		int[] arr=new int[3]; //0~3까지의 방이 생김.
		

	}

}
