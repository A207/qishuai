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
		System.out.println("��绰......");

	}

	void sendMsg() {
		System.out.println("������......");
	}

	public static void main(String[] args) {
		phone phone = new phone();
		phone.name = "ppp";
		phone.brand = "���׻�";
		phone.price = 99;
		System.out.println(phone.brand);
		phone.call();

	}

}
