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
				.println("��Һã��ҽ�" + name + "����" + age + "����" + "ס��" + address);

	}

	public static void main(String[] args) {
		person01 person = new person01("����",20,"����");
		person.introduce();

	}
}
