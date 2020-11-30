package chap03.ex03.multiArr;

public class ThreeD {

	public static void main(String[] args) {
		// royal 아파트는 4층 4호에 방이3개 입니다.
		/*아래의 설정과 같음
		 * String[][][]royal= {
				{{},{},{},{}},
				{{},{},{},{}},
				{{},{},{},{}},
				{{},{},{},{}},
		};
		*/
		String[][][]royal=new String[4][4][3];
		//층수
		 System.out.println(royal.length);
		//1층의 호수
		 System.out.println(royal[1].length);
		//2층3호의 방 갯수
		 System.out.println(royal[2][3].length);	
		 
		 System.out.println();

		 //2층3호 2번방은 "철수 방"으로 설정
		 //0층 0호 0번방은 "영희 방" 으로 설정
		 royal[2][3][2]="철수 방";
		 royal[0][0][0]="영희 방";
		 //royal 아파트 모든 방을 찾아본다. (특정한 층 -> 호 -> 방 순서로 시작)
		 for (int i = 0; i < royal.length; i++) { //층
			for (int j = 0; j < royal[i].length; j++) { //i층의 호
				for (int r = 0; r < royal[i][j].length; r++) { //i층j호의 방
					//System.out.print(" "+royal[i][j][r]+" ");
					if(royal[i][j][r]==null) { //null은 진공상태의 빈 상자와 같다
						royal[i][j][r]="공실"; //null값 채워주기
					}
				}
			}
			 System.out.println();
		}
		//위에서 적용한 내용을 3중 for문을 이용해서 꺼내보자.
		 for(int i = 0; i < royal.length; i++) {//층
			 System.out.print("{");
			 for(int j = 0; j < royal[i].length; j++) { //i층의 호
				 System.out.print("{");
				 for (int r = 0; r < royal[i][j].length; r++) { //i층의 j호의 방
					 System.out.print("["+royal[i][j][r]+"]"); 
					 }		 
				 System.out.print("}");
		 }
			 System.out.print("}");
			 System.out.println();
		 
	}

}
}