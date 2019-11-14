package data_structure;

public class Array {
	private int[] data;
	private int size;

	public Array(int capacity) {
		/**
		 * 有参构造函数，传入数组的容量是capacity来构造Array
		 */
		this.data = new int[capacity];
		this.size = 0;
	}

	public Array() {
		/**
		 * 无参构造函数，默认数组的容量是capacity=10
		 */
		this(10);
	}

	public int getSize() {
		/**
		 * 获取元素个数
		 */
		return size;
	}

	public int getCapacity() {
		/**
		 * 获取数组容量
		 */
		return data.length;
	}

	public boolean isEmpty() {
		/**
		 * 数组是否为空
		 */
		return size == 0;
	}
}
