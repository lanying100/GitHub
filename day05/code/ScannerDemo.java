/**
 * �����û������������������
 * ���⣺��λ�ȡ�û��������������
 * ��������˼�룺�����������飬��������������
 * Scanner ɨ���ǣ���ȡ�������������
 */
import java.util.Scanner;// ����������ϵͳScanner���Ķ�����
public class ScannerDemo{
	
	public static void main(String[] args){
		/*
			�� ���޵����½�һ��ɨ���Ƕ���
			�� ɨ����ɨ����Ǽ��� System.in
			�� Ϊ�˱��ڶ��ʹ�ã��������hp
			�� ���������������ƣ�ɨ���ǵ�����
		*/
		Scanner hp = new Scanner(System.in);	
		System.out.println("�������һ������");
		int a = hp.nextInt();// ���ռ������������
		
		System.out.println("������ڶ�������");
		int b = hp.nextInt();// ���ռ������������
		
		int result = a + b;// ���
		
		System.out.println("�������ĺ�Ϊ��"+result);
		
		
	}
}