package qi.shaui;

public class day0201 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[20][5];
		for (int i = 0; i <= 19; i++) {
			for (int j = 0; j <= 4; j++) {
				a[i][j] = new java.util.Random().nextInt(100);

			}

		}// 随机生成100个成绩
		System.out.print("学号" + "\t" + "core C++" + "\t" + "coreJava"+"\t"+"Servlet"
				+ "\t" + "JSP" + "\t" + "EJB");
		System.out.println();
		for (int i = 0; i <= 19; i++) {
			System.out.print((i+1)+ "\t");
			for (int j = 0; j <= 4; j++) {
				System.out.print(a[i][j] + "\t");

			}
			System.out.println();
		}// 显示成绩
		int[] b = new int[20];

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 5; j++) {
				b[i] = b[i] + a[i][j];
			}
			System.out.println((i + 1) + "号学生的总分为" + b[i]);
		}// 学生总分
		double[] average = new double[5];
		int sum[] = new int[5];
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 20; i++) {

				sum[j] = sum[j] + a[i][j];
			}
			average[j] = 0.05 * sum[j];

		}// 课程平均成绩
		System.out.println("core C++课程的平均成绩位" + average[0]);
		System.out.println("coreJava课程的平均成绩位" + average[1]);
		System.out.println("Servlet课程的平均成绩位" + average[2]);
		System.out.println("JSP课程的平均成绩位" + average[3]);
		System.out.println("EJB课程的平均成绩位" + average[4]);
	}
}
