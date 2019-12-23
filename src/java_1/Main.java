package java_1;

import java.util.ArrayList;

/**
 * TEST�� Main Ŭ�����Դϴ�.
 * Author : Cwhist
 * Created : 2019-12-23
 */
public class Main {

	/**
	 * test�� main �޼����Դϴ�.
	 * Generic�� ����Ͽ� ������ �������� �迭 NewArrayList�� ���� ������ �����͸� 100���� �ֽ��ϴ�.
	 * ������ ��ü�� ������ ���� �Լ��� �� ����ϴ��� �׽�Ʈ�մϴ�.
	 */
	public static void main(String[] args) {
		NewArrayList<Student> stuArr = new NewArrayList();
		
		for(int i=0; i<100; i++) {
			Student data = null;
			data = data.generator();
			stuArr.add(data);
		}
		
		for(int i=0; i<100; i++) {
			System.out.println(i + " - " + stuArr.get(i).getName());
		}
		
		NewArrayList<Integer> intArr = new NewArrayList();
		
		for(int i=0; i<100; i++) {
			intArr.add(i);
		}
		
		for(int i=0; i<100; i++) {
			System.out.println(i + " - " + intArr.get(i));
		}
		
		NewArrayList<Person> perArr = new NewArrayList();
		
		for(int i=0; i<100; i++) {
			PartTimer data = null;
			data = data.generator();
			perArr.add(data);
		}
		
		for(int i=0; i<100; i++) {
			System.out.print(i + " - ");
			perArr.get(i).work();
		}
		
	}

}
