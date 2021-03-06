package HotelText;

public class Hotel {
	private Room[][] rooms;
	public Hotel(){
		rooms = new Room[5][10];
		for(int i = 0;i < rooms.length;i++){
			for(int j = 0;j < rooms[i].length;j++){
				rooms[i][j] = new Room();
				if(i < 2){
					rooms[i][j].type = "标准间";
				}else if(i < 4){
					rooms[i][j].type = "双人间";
				}else{
					rooms[i][j].type = "豪华间";
				}
				rooms[i][j].num = (i+1)+"0"+(j+1);
				rooms[i][j].full = true;
			}
		}
	}
	public Hotel(int rows , int cols){
		rooms = new Room[rows][cols];
		for(int i = 0;i < rooms.length;i++){
			for(int j = 0;j < rooms[i].length;j++){
				rooms[i][j] = new Room();
				if(i < 2){
					rooms[i][j].type = "标准间";
				}else if(i < 4){
					rooms[i][j].type = "双人间";
				}else{
					rooms[i][j].type = "豪华间";
				}
				rooms[i][j].num = (i+1)+"0"+(j+1);
				rooms[i][j].full = true;
			}
		}
	}
	public void put(String type){
		for(int i = 0;i < rooms.length;i++){
			for(int j = 0;j < rooms[i].length;j++){
				if(rooms[i][j].type.equals(type) && rooms[i][j].full == true){
					rooms[i][j].full = false;
					System.out.println("您预订的"+type+"成功房号为"+rooms[i][j].num);
					return;
				}
			}
		}
		System.out.println("抱歉，已经没有您要预订的房间");
	}
	public void out(String num){
		for(int i = 0;i < rooms.length;i++){
			for(int j = 0;j < rooms[i].length;j++){
				if(rooms[i][j].num.equals(num) && rooms[i][j].full == true){
					rooms[i][j].full = true;
					System.out.println("房号为"+rooms[i][j].num+"已退房成功");
					return;
				}
			}
		}
	}
	public void show(){
		for(int i = 0;i < rooms.length;i++){
			for(int j = 0;j < rooms[i].length;j++){
				System.out.print(rooms[i][j].num+"---"+rooms[i][j].type+"---"+rooms[i][j].full+"     ");
			}
			System.out.println();
		}
	}
}
