package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex02_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入(x,y)");
		double x = scn.nextDouble();
		double y = scn.nextDouble();
		
		double d =Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));
		
		if (d<=100){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
			

	}

}
