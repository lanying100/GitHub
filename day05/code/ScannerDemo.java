/**
 * 需求：用户输入两个整数，求和
 * 问题：如何获取用户键盘输入的数据
 * 面向对象的思想：不会做的事情，交给会做的人做
 * Scanner 扫描仪：获取键盘输入的数据
 */
import java.util.Scanner;// 导包，告诉系统Scanner是哪儿来的
public class ScannerDemo{
	
	public static void main(String[] args){
		/*
			① 从无到有新建一个扫描仪对象
			② 扫描仪扫描的是键盘 System.in
			③ 为了便于多次使用，起个名字hp
			④ 给名字做类型限制，扫描仪的名字
		*/
		Scanner hp = new Scanner(System.in);	
		System.out.println("请输入第一个整数");
		int a = hp.nextInt();// 接收键盘输入的整数
		
		System.out.println("请输入第二个整数");
		int b = hp.nextInt();// 接收键盘输入的整数
		
		int result = a + b;// 求和
		
		System.out.println("两个数的和为："+result);
		
		
	}
}