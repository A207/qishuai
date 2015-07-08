package qi.shuai.day03;

class person {
	String name;
	int age;
	String address;
	person(){
		System.out.println("person被调用");
	};

	void introduce() {
		System.out
				.println("大家好，我叫" + name + "今年" + age + "岁了" + "住在" + address);

	}

	public static void main(String[] args) {
		person person = new person();
		person.name = "张三";
		person.age = 20;
		person.address = "北京";
		person.introduce();

	}
}
