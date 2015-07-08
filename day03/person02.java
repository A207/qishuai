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
				.println("大家好，我叫" + name + "今年" + age + "岁了" + "住在" + address);
		System.out.println("Hi.........");
	}

	void introduce() {
		this.hello();
	}

	public static void main(String[] args) {
		person02 person = new person02();
		person.name = "张三";
		person.age = 20;
		person.address = "北京";
		person.introduce();
	}
}
