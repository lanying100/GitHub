/**
 * 条件分支
 */
import java.util.Scanner;
public class IfElseDemo{
	
	public static void main(String[] args){
		
		System.out.println("请输入您的存款");
		Scanner hp = new Scanner(System.in);
		
		double money = hp.nextDouble();
		
		if(money>10000000){
			System.out.println("可以在上海买房子");
		}else if(money>5000000){
			System.out.println("可以在山东买房子");
		}else if(money>100000){
			System.out.println("可以在上海租房子");
		}else if(money>50000){
			System.out.println("可以在山东租房子");
		}else{
			System.out.println("租房子");
		}
		
		// if - else 
		// if - else if - else 最后这个else可以省略
		// if ... if ... if ... 各个if语句独立判断
	}
}