public class PermitHolder extends Person {


	private static int idCounter = 1000;
	private int permitId;


	public PermitHolder(String name) {

		super(name);
		this.permitId = idCounter++;
	}


	public int getPermitId() {

		return permitId;
	}


	@Override
	public boolean equals(Object obj) {
        
		if (this == obj) return true;

		if (obj instanceof PermitHolder) {

			PermitHolder other = (PermitHolder) obj;

			return this.permitId == other.permitId;
		}

		return false;
	}


	@Override
	public String toString() {

		return "[Name: " + name + ", Permit ID: " + permitId + "]";
	}
}