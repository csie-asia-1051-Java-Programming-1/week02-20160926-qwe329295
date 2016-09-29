package hw;
import java.util.Scanner;
public class hw03_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入西元年");
		int n = scn.nextInt();
		if((n%400) == 0){
			System.out.println("閏年");
		}else{
			if( (n%100) == 0 ){
			System.out.println("不是閏年");
		}else{
			if( (n%4) == 0 ){
			System.out.println("閏年");
			}
			
		}
		}
		

	}

}
