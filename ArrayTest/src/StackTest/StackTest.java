package StackTest;

public class StackTest {

	/**
	 * @param args
	 */
	private int length;
	private int[] array;
	private int cord;
	public StackTest(int length){
		this.length = length;
		array = new int[length];
	}
	public void put(int num){
		if(cord == length){
			System.out.println("stack was full");
			return;
		}
		this.array[cord++] = num;
	}
	public void out(){
		if(cord == 0){
			System.out.println("stack was null");
			return;
		}
		this.array[--cord] = 0;
	}
	public void show(){
		for(int i = 0;i < length;i++){
			System.out.println(array[i]);
		}
	}

}
