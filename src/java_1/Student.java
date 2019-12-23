package java_1;

/**
 * Person Ŭ������ ��ӹ޴� Student Ŭ�����Դϴ�.
 * Author : Cwhist
 * Created : 2019-12-22
 */
public class Student extends Person implements PartTimeJob {
	private int ID;

	/**
	 * Student�� ������ �޼����Դϴ�. ID(�й�)�� 19�� �����ϴ� 7�ڸ� ������ �ʱ�ȭ ��ŵ�ϴ�.
	 */
	public Student(String name, String gender) {
		super(name, gender);
		this.ID = super.getID() + 1900000;
	}
	
	/**
	 * Person�� getID �޼��带 �������̵��� �޼����Դϴ�. �й��� ���Ͻ����ݴϴ�.
	 * @return ID in Student
	 */
	public int getID() {
		return this.ID;
	}
	
	/**
	 * �߻� Ŭ���� Person�� �߻�޼��� work()�� �������̵� �� �޼����Դϴ�.
	 */
	@Override
	public void work() {
		System.out.println("working...");
	}

	/**
	 * �߻� Ŭ���� Person�� �߻�޼��� eat()�� �������̵� �� �޼����Դϴ�.
	 */
	@Override
	public void eat() {
		System.out.println("eating...");
	}
	
	/**
	 * �������̽� PartTimeJob�� �޼��带 �������̵� �� �޼����Դϴ�.
	 */
	@Override
	public void workPartTime() {
		System.out.println("working...(partTime)");
	}
	
	/**
	 * Student�� ������ ���� �޼����Դϴ�.
	 * ������ ������ Student�� ������Ű�� ���Ͻ����ݴϴ�.
	 * @return Student instance
	 */
	public static Student generator() {
		String gender;
		if((int)(Math.random()*2) == 0)
			gender = "����";
		else
			gender = "����";
		
		Student data = new Student(" ", gender);
		data.setName( "Student-" + Integer.toHexString(data.hashCode()).toUpperCase());
		
		return data;
	}

}
