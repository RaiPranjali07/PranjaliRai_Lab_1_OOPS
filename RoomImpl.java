import java.util.Scanner;
import java.util.ArrayList;
public class RoomImpl {
Scanner sc=new Scanner(System.in);
int numberofrooms;
int size;
//Room[] rooms;
Room[] rooms;

public RoomImpl(int numberofrooms)
{
	size=0;
	this.numberofrooms=numberofrooms;
	Room[] rooms=new Room[numberofrooms];
}

void addRoom()
{
	Room room=new Room();
    room.setRoomNo(101);
    room.setRoomType("Single Occupany, AC");
    room.setPrice(3000);
    this.rooms[size++]=room;
    room.setRoomNo(102);
    room.setRoomType("Single Occupany, Non AC");
    room.setPrice(2000);
    this.rooms[size++]=room;
    room.setRoomNo(201);
    room.setRoomType("Double Occupany, AC");
    room.setPrice(4000);
    this.rooms[size++]=room;
    room.setRoomNo(202);
    room.setRoomType("Double Occupany, Non AC");
    room.setPrice(3000);
    this.rooms[size++]=room;
 //   System.out.println(rooms[]);
}

public String checkAvailability( String RoomType)

{
	for(Room room1: rooms)
	{
		if(room1.getRoomType(). equalsIgnoreCase (RoomType))
		{
			return "Room is available";
		}
	}
	return "Room is not available";
	
}

}
