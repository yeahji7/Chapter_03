package chap03.ex02.value;

public class Input {

	public static void main(String[] args) {
		//값 넣기 input
		
		int[] scores = new int[10]; //
		System.out.println(scores.length); //배열 크기 확인

		//0번 방에 100넣기
		scores[0]=100;

		scores[1]=50;//1번방에 50
		scores[2]=70;//2번방에 70
		
		//3번방부터 9번방까지 100을 넣기
		scores[3]=100;
		scores[4]=100;
		scores[5]=100;
		scores[6]=100;
		scores[7]=100;
		scores[8]=100;
		scores[9]=100;
		
		//반복문 사용하기
		for (int i = 3; i < scores.length; i++) {
			//scores의 length는 10이므로 3부터 9까지 출력
			scores [i]=100;
		}
			
		}
	

}
