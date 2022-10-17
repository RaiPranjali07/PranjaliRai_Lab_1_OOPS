import java.util.*;
public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String RoomType;
   
   Scanner input=new Scanner(System.in);
   System.out.println("Please enter the requirement");
   RoomType=input.nextLine();
   
   RoomImpl roomimpl=new RoomImpl(4);
   System.out.println(roomimpl.checkAvailability(RoomType));
   Room room1=new Room();
   System.out.println(room1.getRoomNo());
	}

}
