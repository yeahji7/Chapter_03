package chap03.ex04.arrFor;

public class Main {

	public static void main(String[] args) {
		
		//�迭 ����ϱ�
		int[] scores= {95,75,84,35,88};
		
		//�⺻���� for��
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		System.out.println("---------------------");
		
		//���� for�� (���� ���� ������� �ڵ��� �ٰԵ�)
		for (int i : scores) {
			System.out.println(i);
		}
		
		//score�� �հ�� ����� ���غ���
		int sum=0;
		double avg =0.0;
		
		for (int score :scores) {
			sum+=score; //��Ӱ��� �����༭ ������� ��.
		
		}
		avg = (double)sum/scores.length; //���� sum�� ���ϰ� �����ָ� �Ǵϱ� for�� �ٱ����� ����
		//int -> double �� casting  
		//int ������ ������ ����Ǿ� �Ҽ������� ����ϱ� ���� double������ ��ȯ����.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              �� ���������� �߱⶧���� �Ҽ������� ����ϱ� ���� double�� ����ȯ(casting).
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);

		
		
		
		
		
	}

}
