package ashuai;

import java.util.Scanner;

public class Exe05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("| 1. 增加1个学生 | ");
		System.out.println("| 2. 显示所有学生 | ");
		System.out.println("| 3. 退出程序 |  ");
		System.out.println("| 请输入选择（1-3）：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num){
		case 1:System.out.println("| 1. 增加1个学生 | ");break;
		case 2:System.out.println("| 2. 显示所有学生 | ");break;
		case 3:System.out.println("| 3. 退出程序 |  ");break;
		default:System.out.println("输入错误");
		}
	}

}
