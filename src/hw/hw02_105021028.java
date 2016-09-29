package hw;
import java.util.Scanner;
public class hw02_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("性別 男性=1 女性=2,身高 ");
		int n = scn.nextInt();
		int t = scn.nextInt();
		double w = 0;
		if( n == 1){
			w = (t-80)*0.7;
		}else{
		if( n == 2 ){
			w=(t-70)*0.6;
		}
		}System.out.println("標準體重"+w);
		
	}

}
