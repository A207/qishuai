package qi.shuai.day03;

public class person02 {

	String name;
	int age;
	String address;

	public person02() {
	}

	public person02(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public person02(String name, int age, String address) {
		this(name, age);
		this.address = address;
	}

	void hello() {
		System.out
				.println("��Һã��ҽ�" + name + "����" + age + "����" + "ס��" + address);
		System.out.println("Hi.........");
	}

	void introduce() {
		this.hello();
	}

	public static void main(String[] args) {
		person02 person = new person02();
		person.name = "����";
		person.age = 20;
		person.address = "����";
		person.introduce();
	}
}
