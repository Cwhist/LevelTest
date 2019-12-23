package java_1;

/**
 * �������� �迭 NewArrayList�Դϴ�.
 * �迭�� �ʱ� ũ�� maxSize�� 5���� �����մϴ�.
 * �迭�� ���� �� �� �� ������ �迭�� 2�� Ȯ������ִ� expend() �޼��带 �����մϴ�.
 * get()�޼��带 ���� �����ϴ� ���� T Ÿ������ �����մϴ�.
 * Author : Cwhist
 * Created : 2019-12-23
 */
public class NewArrayList<T> {
	private int size;
	private int maxSize;
	private Object[] data;
	
	public NewArrayList() {
		maxSize = 5;
		data = new Object[maxSize];
		size = 0;
	}
	
	public void add(T data) {
		if(size >= maxSize)
			expend();
		this.data[size] = data;
		size++;
	}
	
	public T get(int index) {
		return (T)data[index];
	}
	
	public void remove(int index) {
		for(int i=index; i<size; i++) {
			data[i] = data[i+1];
		}
		data[size-1] = null;
		size--;
	}
	
	public int size() {
		return size;
	}
	
	public void expend() {
		Object[] temp = new Object[maxSize*2];
		for(int i=0; i<maxSize; i++) {
			temp[i] = data[i];
		}
		data = temp;
		maxSize *= 2;
	}
	
	public Object[] getData() {
		return data;
	}
	

}
