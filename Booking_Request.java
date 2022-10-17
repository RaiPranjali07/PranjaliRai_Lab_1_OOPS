
public class Booking_Request {
 Room rooms[];
 int InDate;
 int OutDate;
 
 Booking_Request(int InDate, int OutDate )
 {
	 this.InDate=InDate;
	 this.OutDate=OutDate;
 }
 
public int getInDate() {
	return InDate;
}


public int getOutDate() {
	return OutDate;
}

 
 
}
