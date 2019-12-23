package java_1;

/**
 * Person Ŭ���� �Դϴ�.
 * Author : Cwhist 
 * Created : 2019-12-22
 */
public abstract class Person {
	private static int ID;
	private static int nextID = 0;
	private String name;
	private String gender;

	/**
	 * Person Ŭ������ ������ �޼����Դϴ�. id, �̸�, ������ �Է¹޾� Ŭ������ �����մϴ�.
	 */
	public Person(int ID, String name, String gender) {
		if(ID != this.nextID)
			this.ID = -1;
		else 
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
		this.ID = nextID++;
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
	
	/**
	 * nextID�� getter �޼����Դϴ�. Person�� nextID�� �����մϴ�.
	 * @return nextID in Person
	 */
	public static int getNextID() {
		return nextID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ������ person ��ü�� �������� ��ü���� Ȯ���ϴ� �޼����Դϴ�.
	 * ��ü�� �����̸� true, ������ �ƴϸ� false�� �����մϴ�.
	 * @return true or false
	 */
	public static boolean checkPerson() {
		if(ID > -1 && ID < nextID)
			return true;
		else
			return false;
	}
	
	/**
	 * Person�� �߻� �޼����Դϴ�.
	 */
	public abstract void work();
	public abstract void eat();
	
	/**
	 * Person�� ������ ���� �޼����Դϴ�. 
	 * Person��ü�� ������ �� ���� ��ĳ������ �̿��Ͽ� ��ü�� �����߽��ϴ�.
	 * ������ ��ü�� �������ݴϴ�.
	 * @return PartTimer instance upcating Person
	 */
	public static Person generator() {
		String gender;
		if((int)(Math.random()*2) == 0)
			gender = "����";
		else
			gender = "����";
		
		Person data = new PartTimer(" ", gender);
		data.setName("Person-" + Integer.toHexString(data.hashCode()).toUpperCase());
		
		return data;
	}
	
}
