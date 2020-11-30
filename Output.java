package chap03.ex02.value;

public class Output {

	public static void main(String[] args) {
	// output
		int[] scores = new int[10];
		for (int i = 0; i < scores.length; i++) {
			scores[i]= (i+1)*10;
			//0~9번 까지; 10부터 100의 값이 들어갔다.
		}
		System.out.println(scores[5]);
		System.out.println(scores[9]);
		System.out.println("---------------------------");
		
		//0부터 9까지 호출
		for(int i=0; i < 10;i++) { 
			System.out.print(scores[i]+" ");
		}
	}

}
