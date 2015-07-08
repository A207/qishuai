package qi.shuai.day03;


public class Exeday02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army a = new Army(3);

		a.addWeapon(new Tank());

		a.addWeapon(new Flighter());

		a.addWeapon(new WarShip());

		a.attackAll();

		a.moveAll();
	}

}

interface Assaultable {
	abstract public void attack();
}

interface Mobile {
	abstract public void move();
}

abstract class Weapon implements Assaultable, Mobile {
}

class Tank extends Weapon {
	public void attack() {
		System.out.println("̹�˿���......");
	}

	public void move() {
		System.out.println("̹��½���ƶ�......");
	}
}

class Flighter extends Weapon {

	public void attack() {
		System.out.println("�ɻ���ըɨ��......");
	}

	public void move() {
		System.out.println("�ɻ������ƶ�......");
	}

}

class WarShip extends Weapon {

	public void attack() {
		System.out.println("��������......");
	}

	public void move() {
		System.out.println("���������ƶ�......");
	}

}

class Army {
	private Weapon[] w = null;

	private int size = 0;

	private Army() {
	}

	public Army(int num) {

		w = new Weapon[num];
	}

	public void addWeapon(Weapon wa) {
		if (size >= w.length) {
			System.out.println("�������������Ѵ�����!");
			return;
		} else {
			w[size] = wa;
			size++;
		}
	}

	public void attackAll() {
		for (int i = 0; i < w.length; i++) {
			w[i].attack();
		}

	}

	public void moveAll() {
		for (int i = 0; i < w.length; i++) {
			w[i].move();
		}

	}
}