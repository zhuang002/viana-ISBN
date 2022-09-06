import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int sum=9*1+7*3+8*1+0*3+9*1+2*3+1*1+4*3+1*1+8*3;
		
		/*int a = sc.nextInt();
		sum += a*1;
		int b = sc.nextInt();
		sum += b*3;
		int c = sc.nextInt();
		sum += c*1;*/
		
		//sum += sc.nextInt()*1 + sc.nextInt()*3 + sc.nextInt()*1;
		
		
		
		System.out.println("The 1-3-sum is "+(9*1+7*3+8*1+0*3+9*1+2*3+1*1+4*3+1*1+8*3+sc.nextInt()*1 + sc.nextInt()*3 + sc.nextInt()*1));
		
	}

}
