public class ParkingSystem {

	private static ParkingSystem instance = null;
	private String campusName;
	private Supervisor supervisor;
	private ParkingZone[] zones;
	private PermitHolder[] permitHolders;
	private int zoneCount = 0;
	private int permitCount = 0;



	private ParkingSystem(String campusName, Supervisor supervisor) {

		this.campusName = campusName;
		this.supervisor = supervisor;
		zones = new ParkingZone[2];
		permitHolders = new PermitHolder[10];
	}


	public static ParkingSystem getInstance(String name, Supervisor supervisor) {

		if (instance == null) {

			instance = new ParkingSystem(name, supervisor);
		} 


		else {
			System.out.println("Warning: ParkingSystem instance already exists. Returning existing instance.");
		}

       	 return instance;

	}



	public void addZone(ParkingZone zone) {

		if (zoneCount < zones.length) {

			zones[zoneCount++] = zone;
		}
	}



	public void addPermitHolder(PermitHolder holder) {

		if (permitCount < permitHolders.length) {

			permitHolders[permitCount++] = holder;
		}
	}


	public PermitHolder searchPermitHolder(int id) {

		for (int i = 0; i < permitCount; i++) {

			if (permitHolders[i].getPermitId() == id) {

				return permitHolders[i];
			}

		}

		return null;
	}


	@Override
	public String toString() {

		return "Campus: " + campusName + "\n"
			+ supervisor.toString() + "\n"
			+ "Zones:\n"
			+ zones[0].toString() + "\n"
			+ zones[1].toString() + "\n"
			+ "Permit Holders: " + permitHolders[0] + ", " + permitHolders[1];
	}
}