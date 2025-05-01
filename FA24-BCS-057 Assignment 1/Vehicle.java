public class Vehicle {


	private String licensePlate;
	private String type;
	private Owner owner;


	public Vehicle(String licensePlate, String type, Owner owner) {

		this.licensePlate = licensePlate;
		this.type = type;
		this.owner = owner;
	}




	public String getLicensePlate() {

		return licensePlate;
	}


	public String getType() {

		return type;
	}


	public Owner getOwner() {

		return owner;
	}






	public Vehicle shallowCopy() {

        	return new Vehicle(licensePlate, type, owner);

	}



	public Vehicle deepCopy() {

		Owner newOwner = new Owner(owner.getName());

		return new Vehicle(licensePlate, type, newOwner);
	}



	@Override
	public String toString() {

		return "[License Plate: " + licensePlate + ", Type: " + type + ", Owner: " + owner.toString() + "]";
	}
}
