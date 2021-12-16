class Car {

	public String brand = "Audi";
	public String model = "A5";
	public int amountOfFuel = 0;
	public int fuelDecrease = -1;
	 
	
	public void brake() {

		System.out.println("Car uses brakes.");
		System.out.println("Changes");
	}

	public void accelerate() {

		System.out.println("Car is accelerating whit " + amountOfFuel + " gallons of fuel.");
		
			if ( amountOfFuel == 0  ) {
				
				System.out.println( "Insufficient fuel, gas refill required. ");
			}

	}

	public void fueldecreasing() {

		fuelDecrease = -1;
		System.out.println("fuel has decreased from " + amountOfFuel + " gallons to " + (amountOfFuel + fuelDecrease) + " gallons." );
		
		if (amountOfFuel == 0 ) {
			System.out.println("please refill the damn vechicle.");
		}

	}

	public void printData() {

		System.out.println("Brand: " + brand + ", Model: " + model + ", Amount of fuel " + amountOfFuel + " gallons");
		System.out.println("");
	}

}


