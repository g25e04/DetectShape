package summer012;
//�d�Цw U10716012

import java.util.Scanner;

public class summer012 {

	public summer012() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J�@�ӼƦr�����:");
		int number = sc.nextInt();
		Detect De = new Detect(number);
		
		System.out.print(De.check());
		
		while(number<1) {
			number = sc.nextInt();
			De.setNumber(number);
			System.out.print(De.check());
		}
		Answer An =new Answer();
		System.out.println("\n�п�J���");
		for(int i = number;i>=1;i--) {
			An.set(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			
		}
		
		for(int i = 0;i<number;i++) {
			An.setTime(i*4);
		System.out.println(An.toString());
		}
	}

}
