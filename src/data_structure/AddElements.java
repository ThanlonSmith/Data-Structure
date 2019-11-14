package data_structure;

public class AddElements {
	private int[] data;
	private int size;

	public AddElements(int capacity) {
		/**
		 * 有参构造函数，传入数组的容量是capacity来构造Array
		 */
		this.data = new int[capacity];
		this.size = 0;
	}

	public AddElements() {
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

//	public void addLast(int e) {
//		/**
//		 * 在所有数组元素后面添加元素
//		 */
//		if (size == data.length)
//			throw new IllegalArgumentException("AddLast failed, Array is full.");
//		data[size++] = e;
//	}
	public void addLast(int e) {
		/**
		 * 在所有数组元素后面添加元素(复用add方法)
		 */
		add(size, e);
	}

	public void addFirst(int e) {
		/**
		 * 在数组前面添加元素(复用add方法)
		 */
		add(0, e);
	}

	public void add(int index, int e) {
		/**
		 * 在指定位置插入元素
		 */
		if (size == data.length)
			throw new IllegalArgumentException("Add failed, Array is full.");
		if (index < 0 || index > size) {
			throw new IllegalArgumentException("Add failed, index < 0 || index > size.");
		}
		for (int i = size - 1; i >= index; i--) {
			data[i + 1] = data[i];
			data[index] = e;
			size++;
		}
	}

}