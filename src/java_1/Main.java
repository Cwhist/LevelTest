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
	 * 6������ ���� generator() �޼���� ��ü�� 100�� �����մϴ�.
	 * Person.setFirstName() �޼��带 ����Ͽ� ������ ��ü���� ù���ڸ� A�� �����մϴ�.
	 * StringBuilder�� ����� Student���� �̸����� 3��° ���ڸ� ������ append�մϴ�.
	 */
	public static void main(String[] args) {
		ArrayList<Student> studentArr = new ArrayList();
		
	      for(int i=0; i<100; i++) {
	         Student student = null;
	         student = student.generator();
	         studentArr.add(student);
	      }
	      
	      for(int i=0; i<100; i++) {
	         studentArr.get(i).setFirstName('A');
	      }
	      
	      StringBuilder thirdCharsBuilder = new StringBuilder();
	      System.out.print("3��° ���ڵ� - ");
	      for(int i=0; i<100; i++) {
	    	  thirdCharsBuilder.append(Character.toString(studentArr.get(i).getName().charAt(2)));
	    	  System.out.print(studentArr.get(i).getName().charAt(2));
	      }
	      System.out.println();
	      
	      String thirdChars = new String(thirdCharsBuilder.toString());
	      System.out.println("������ ���ڿ� - " + thirdChars);
	}

}
