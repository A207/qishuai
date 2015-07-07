package qi.shaui;

public class zhishu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 99; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}

			if (flag) {

				System.out.println(i);
			}
		}
	}

}
