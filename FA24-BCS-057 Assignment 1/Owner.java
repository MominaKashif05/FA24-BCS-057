public class Owner extends Person {


	private static int ownerCounter = 1;
	private int ownerId;


	public Owner(String name) {

		super(name);
		this.ownerId = ownerCounter++;
	}



	public int getOwnerId() {

        return ownerId;

	}


	@Override
	public String toString() {

	return "[Name: " + name + ", Owner ID: " + String.format("%04d", ownerId) + "]";

	}
}