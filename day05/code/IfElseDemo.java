/**
 * ������֧
 */
import java.util.Scanner;
public class IfElseDemo{
	
	public static void main(String[] args){
		
		System.out.println("���������Ĵ��");
		Scanner hp = new Scanner(System.in);
		
		double money = hp.nextDouble();
		
		if(money>10000000){
			System.out.println("�������Ϻ�����");
		}else if(money>5000000){
			System.out.println("������ɽ������");
		}else if(money>100000){
			System.out.println("�������Ϻ��ⷿ��");
		}else if(money>50000){
			System.out.println("������ɽ���ⷿ��");
		}else{
			System.out.println("�ⷿ��");
		}
		
		// if - else 
		// if - else if - else ������else����ʡ��
		// if ... if ... if ... ����if�������ж�
	}
}