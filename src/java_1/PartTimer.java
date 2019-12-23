package java_1;

/**
 * Person�� ��ӹް� PartTimeJob�� implements�ϴ� PartTimer Ŭ�����Դϴ�.
 * Author : Cwhist
 * Created : 2019-12-22
 */
public class PartTimer extends Person implements PartTimeJob {

	/**
	 * PartTimer�� ������ �޼����Դϴ�.
	 */
	public PartTimer(int ID, String name, String gender) {
		super(ID, name, gender);
	}
	
	public PartTimer(String name, String gender) {
		super(name, gender);
	}

	/**
	 * Person�� work() �޼��带 �������̵� �� �޼����Դϴ�.
	 */
	@Override
	public void work() {
		workPartTime();
	}

	/**
	 * Person�� eat() �޼��带 �������̵� �� �޼����Դϴ�.
	 */
	@Override
	public void eat() {
		System.out.println("eating...");
	}

	/**
	 * PartTimeJob�� workPartTime() �޼��带 �������̵� �� �޼����Դϴ�.
	 */
	@Override
	public void workPartTime() {
		System.out.println("working...(partTime)");
	}
	
	/**
	 * PartTimer�� ������ ���� �޼����Դϴ�.
	 * ���۷��� ���� PartTimer�� �޾� ������ ������ ��ü�� ���������ݴϴ�.
 	 */
	public static void generator(PartTimer data) {
		String gender;
		if((int)(Math.random()*2) == 0)
			gender = "����";
		else
			gender = "����";
		
		data = new PartTimer(" ", gender);
		data.setName( "PartTimer-" + Integer.toHexString(data.hashCode()).toUpperCase());
		System.out.println(data.getName() + ", " + data.getGender() + ", " + data.getID());
	}
}
