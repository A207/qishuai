package qi.shuai.day03;

class person01 {
	String name;
	int age;
	String address;
    person01(){};
    person01(String n, int a, String addr) {
		name = n;
		age = a;
		address = addr;
	}

	void introduce() {
		System.out
				.println("大家好，我叫" + name + "今年" + age + "岁了" + "住在" + address);

	}

	public static void main(String[] args) {
		person01 person = new person01("张三",20,"北京");
		person.introduce();

	}
}
