package java_1;
/**
 * Person Ŭ���� �Դϴ�.
 * Author : Cwhist 
 * Created : 2019-12-22
 */
public class Person {
	private int ID;
	private String name;
	private String gender;

	/**
	 * Person Ŭ������ ������ �޼����Դϴ�. id, �̸�, ������ �Է¹޾� Ŭ������ �����մϴ�.
	 */
	public Person(int ID, String name, String gender) {
		this.ID = ID;
		this.name = name;
		this.gender = gender;
	}

	/**
	 * Person Ŭ������ ������ �޼����Դϴ�. �̸�, ������ �Է¹ް� id�� -1�� �ʱ�ȭ�ϸ� Ŭ������ �����մϴ�.
	 */
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
		this.ID = -1;
	}

	/**
	 * ID�� getter �޼����Դϴ�. Person�� id���� �����մϴ�.
	 * @return id in Person
	 */
	public int getID() {
		return ID;
	}

	/**
	 * �̸��� getter �޼����Դϴ�. Person�� name���� �����մϴ�.
	 * @return name in Person
	 */
	public String getName() {
		return name;
	}

	/**
	 * ������ getter �޼����Դϴ�. Person�� gender���� �����մϴ�.
	 * @return gender in Person
	 */
	public String getGender() {
		return gender;
	}
	
}
