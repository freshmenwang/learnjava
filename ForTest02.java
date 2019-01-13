public class ForTest02{
	public static void main(String[] args){
		int number = 0;
		for(int i = 2 ; i < 100 ;i++){
			int status = 0;
			for(int j = 2 ; j*j<=i ; j++ ){
				if(i % j == 0 ){
					status = 1;
				}
			}
			if(status == 0 ){
				if(number < 8){
					number++;
					System.out.print(i+"  ");
				}else{
					number = 1;
					System.out.println();
					System.out.print(i+"  ");
				}
			}
		}
	}
}