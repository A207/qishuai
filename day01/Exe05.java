package ashuai;

import java.util.Scanner;

public class Exe05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("| 1. ����1��ѧ�� | ");
		System.out.println("| 2. ��ʾ����ѧ�� | ");
		System.out.println("| 3. �˳����� |  ");
		System.out.println("| ������ѡ��1-3����");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num){
		case 1:System.out.println("| 1. ����1��ѧ�� | ");break;
		case 2:System.out.println("| 2. ��ʾ����ѧ�� | ");break;
		case 3:System.out.println("| 3. �˳����� |  ");break;
		default:System.out.println("�������");
		}
	}

}
