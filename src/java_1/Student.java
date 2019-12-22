package java_1;

/**
 * Person Ŭ������ ��ӹ޴� Student Ŭ�����Դϴ�.
 * Author : Cwhist
 * Created : 2019-12-22
 */
public class Student extends Person {
	private int ID;

	/**
	 * Person�� �����ڸ� �������̵��� Student�� ������ �޼����Դϴ�.
	 * ID(�й�)�� 19�� �����ϴ� 7�ڸ� ������ �ʱ�ȭ ��ŵ�ϴ�.
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
	 * Person�� �߻�޼��� work()�� �������̵��� �޼����Դϴ�.
	 */
	@Override
	public void work() {
		
	}

	/**
	 * Person�� �߻�޼��� eat()�� �������̵��� �޼����Դϴ�.
	 */
	@Override
	public void eat() {
		
	}

}
