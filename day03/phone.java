package qi.shuai.day03;

import java.security.PublicKey;

import org.omg.CORBA.PUBLIC_MEMBER;

class phone {

	/**
	 * @param args
	 */

	// TODO Auto-generated method stub
	String name;
	String brand;
	int price;

	void call() {
		System.out.println("打电话......");

	}

	void sendMsg() {
		System.out.println("发短信......");
	}

	public static void main(String[] args) {
		phone phone = new phone();
		phone.name = "ppp";
		phone.brand = "爆米花";
		phone.price = 99;
		System.out.println(phone.brand);
		phone.call();

	}

}
