package test;

import java.util.Random;
import java.util.Scanner;

public class Test {
	
	public void test() {
		
		
		System.out.println("ϵͳ�Ѿ�������һ��1-100������������²¿�");
		Random random = new Random();
		int i=random.nextInt(100)+1;
		
		System.out.println("��������Ҫ�µ�ֵ��");
		Scanner in = new Scanner(System.in);
		int input=in.nextInt();
		
		while(true) {
			if(i==input) {
				System.out.println("��ϲ��Ŷ���;���������ֵΪ��"+i);
				break;
			}else if(i>input){
				System.out.println("�������ֵ��С�ˣ����ٲ�һ��");
				
				input=in.nextInt();
			}else if(i<input) {
				System.out.println("�������ֵ�����ˣ����ٲ�һ��");
				
				input=in.nextInt();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.test();
		System.out.prinln("hahha");
!!!!!!!!!!!
	}

}
