package qi.shuai.day03;

class person {
	String name;
	int age;
	String address;
	person(){
		System.out.println("person������");
	};

	void introduce() {
		System.out
				.println("��Һã��ҽ�" + name + "����" + age + "����" + "ס��" + address);

	}

	public static void main(String[] args) {
		person person = new person();
		person.name = "����";
		person.age = 20;
		person.address = "����";
		person.introduce();

	}
}
