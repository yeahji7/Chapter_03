package chap03.ex03.multiArr;

public class TwoD {

	public static void main(String[] args) {
		// arr 아파트 2층 3호짜리
		
		int[][]arr = {
				{0,1,2}, //지하 0층~2층
				{10,11,12} //0~2호 까지 10,11,12 입력
		};
		
		// royal 아파트 만들기(4층 4호)
		String[][] royal =new String[4][4];
		royal[0][0]="0층0호";
		//for문으로 4개층 4개호를 모두 채우시오.
		for(int i =0;i<royal.length;i++) { //층을 뽑아온다
			for (int j = 0; j < royal[i].length; j++) { //호를 뽑아온다
				//royal.length 로얄의 크기 =4개 층 존재함
				//royal[i].length =4개 호 존재함.
				
				royal[i][j]=i+"층"+j+"호";
				System.out.print("["+i+"/"+j+"]");
			}
			System.out.println();
		}
		
			}

	}



