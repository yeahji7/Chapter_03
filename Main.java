package chap03.ex04.arrFor;

public class Main {

	public static void main(String[] args) {
		
		//배열 출력하기
		int[] scores= {95,75,84,35,88};
		
		//기본적인 for문
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		System.out.println("---------------------");
		
		//향상된 for문 (위와 같은 결과지만 코딩이 줄게됨)
		for (int i : scores) {
			System.out.println(i);
		}
		
		//score의 합계와 평균을 구해보자
		int sum=0;
		double avg =0.0;
		
		for (int score :scores) {
			sum+=score; //계속값을 더해줘서 넣으라는 말.
		
		}
		avg = (double)sum/scores.length; //최종 sum을 구하고 나눠주면 되니까 for문 바깥으로 빼줌
		//int -> double 로 casting  
		//int 정수형 값으로 선언되어 소수점까지 출력하기 위해 double형으로 변환해줌.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              로 변수선언을 했기때문에 소수점으로 출력하기 위해 double로 형변환(casting).
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);

		
		
		
		
		
	}

}
