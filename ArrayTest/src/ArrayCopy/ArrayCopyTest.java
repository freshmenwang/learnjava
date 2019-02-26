package ArrayCopy;

public class ArrayCopyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {2, 3, 4, 5};
		int[] a2 = {12 , 13 , 15 , 15 , 12 ,18 , 19};
		int[] a3 = {2, 3, 4, 5};
		int[] a4 = {12 , 13 , 15 , 15 , 12 ,18 , 19};
		customArraycopy(a3, 1, a4, 2, 3);
		System.arraycopy(a1, 1, a2, 2, 3);
		for(int i =0 ; i < a2.length ; i++){
			System.out.println(a2[i]+"----"+a4[i]);
		}
	}
	public static void customArraycopy(int[] src, int srcPos, int[] dest, int destPos, int length){
		for(int i = 0; i < length; i++){
			dest[destPos + i] = src[srcPos + i];
		}
	}

}
