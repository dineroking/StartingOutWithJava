package chapter8;

public class RoomDemo {

	public static void main(String[] args) {

		RoomDimension room1 = new RoomDimension();
		RoomDimension room2 = new RoomDimension( 2.5, 3.1 );
		RoomDimension room3 = new RoomDimension( 3, 1.5 );
		
		RoomCarpet carpet1 = new RoomCarpet();
		RoomCarpet carpet2 = new RoomCarpet( room2, 2.0 );
		
		System.out.println("RoomDimension room1: \n" + room1);
		System.out.println("RoomDimension room2: \n" + room2);
		System.out.println("RoomDimension carpet1: \n" + carpet1);
		System.out.println("RoomDimension carpet2: \n" + carpet2);
		
		carpet1.setSize(room3);
		
		System.out.println("RoomDimension carpet1: \n" + carpet1);
		
		carpet1.setCarpetCost( 2.0 );
		
		System.out.println("RoomDimension carpet1: \n" + carpet1);
	}

}
