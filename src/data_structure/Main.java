package data_structure;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[10];// 数组中只能放置同一种类型的元素，声明数组就要开辟空间，在开辟空间的时候就要声明要放多少个元素
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		// 还可以这样声明数组
		int[] scores = new int[] { 89, 99, 100 };
		scores[0] = 90;
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		// 数组具有可迭代的能力，所以支持foreach这种语法。关于可迭代能力，与设计模式有关，和数据结构的底层原理没有关系，虽然数据结构可以实现。
		for (int score : scores) {
			System.out.println(score);
		}
	}
}
