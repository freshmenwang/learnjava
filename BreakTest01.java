public class BreakTest01{
	public static void main(String[] args){
		for1 : for(int i = 1; i < 10 ; i++){
			for2 :for(int j = 1; j < 3 ; j++){
				if(j == 2){
					break for1;
				}
				System.out.println(j);
			}
		}
		for3 : for(int i = 1; i < 10 ; i++){
			for4 :for(int j = 1; j < 3 ; j++){
				if(j == 2){
					continue for3;
				}
				System.out.println(j);
			}
		}
	}
}