
public class Customer extends Room {
	String Name;
	int Duration;
	
	public Customer(String Name, int Duration,int RoomNo, int price, boolean haveAC, String occupancy)
	{
		super();
		this.Name=Name;
		this.Duration=Duration;
		
	}

	public String getName() {
		return Name;
	}


	public int getDuration() {
		return Duration;
	}


}
