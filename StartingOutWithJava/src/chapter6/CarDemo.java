package chapter6;

public class CarDemo {

	public static void main(String[] args) {

		Car bmw = new Car(2017, "BWM");		// holds instance of the Car class
		final int MAX_TIMES = 5;			// number of times to accelerate and brake
		
		System.out.println( "Starting speed: " + bmw.getSpeed() );
		
		// accelerate 5 times
		for( int i = 0; i < MAX_TIMES; i++ ){
			bmw.accelerate();
			System.out.println("Current speed: " + bmw.getSpeed() );
		}
		
		// brake 5 times
		for( int i = 0; i < MAX_TIMES; i++ ){
			bmw.brake();
			System.out.println("Current speed: " + bmw.getSpeed() );
		}
		
	}

}
