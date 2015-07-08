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
		System.out.println("坦克开炮......");
	}

	public void move() {
		System.out.println("坦克陆上移动......");
	}
}

class Flighter extends Weapon {

	public void attack() {
		System.out.println("飞机轰炸扫射......");
	}

	public void move() {
		System.out.println("飞机空中移动......");
	}

}

class WarShip extends Weapon {

	public void attack() {
		System.out.println("军舰开炮......");
	}

	public void move() {
		System.out.println("军舰海上移动......");
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
			System.out.println("军队武器数量已达上限!");
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