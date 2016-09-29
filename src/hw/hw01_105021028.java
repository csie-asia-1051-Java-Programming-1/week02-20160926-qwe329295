package hw;
import java.util.Scanner;
public class hw01_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入N有多少錢");
		int N = scn.nextInt();
		System.out.println("輸入a1,a2,a3有幾顆");
		int a1 = scn.nextInt();
		int a2 = scn.nextInt();
		int a3 = scn.nextInt();
		int n = 0 ;
		if( a1*15+a2*20+a3*30 <= N ){
			n = N-(a1*15+a2*20+a3*30);
			System.out.println("五十元"+n/50+"個");
			System.out.println("五元"+ n % 50 / 5 +"個" );
			System.out.println("一元"+ n % 50 % 5 / 1+"個");
		}else{
			System.out.println("0");
		}
		
		
		

	}

}
