public class ParkingZone {

	private static int zoneCounter = 1;
	private String zoneId;
	private Vehicle[] vehicles;



	public ParkingZone() {

		this.zoneId = "A" + zoneCounter++;
		vehicles = new Vehicle[5];
	}


	public String getZoneId() {

		return zoneId;
	}


    public boolean addVehicle(Vehicle v) {


		for (int i = 0; i < vehicles.length; i++) {

			if (vehicles[i] != null && vehicles[i].getLicensePlate().equals(v.getLicensePlate())) {

			System.out.println("Error: duplicate license plate '" + v.getLicensePlate() + "' is not allowed.");

			return false;

			}
		}


		for (int i = 0; i < vehicles.length; i++) {

			if (vehicles[i] == null) {

				vehicles[i] = v;

				return true;
			}

		}

        	return false;
	}


	@Override
	public String toString() {

		return "Zone ID: " + zoneId + ", Vehicles: ["

			+ vehicles[0] + ", "
			+ vehicles[1] + ", "
			+ vehicles[2] + ", "
			+ vehicles[3] + ", "
			+ vehicles[4] + "]";
	}
}
