package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021028 蕭佑誠
 */
import java.util.Scanner;
public class ex03_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int h1 = 10;int m1 =23;
		int h2 = 15;int m2 = 20;
	    int h = ((h2*60+m2)-(h1*60+m1))/30;
	    int d =0;
	if(h < 4) {
		d = h*30 ;
	}else{
		if(h<8 && h >= 4){
		d = (h-4)*40+120;
		}else{
			if(h>=8){
		d = (h-8)*60+120+160;		
			}
		}
	}
 System.out.println(d);
	}}
