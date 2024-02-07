
public enum MenuOptions {
	A("Create new Reservation"),
	B("Create new Reservation with Room Type"), 
	C("Display all Reservations"),
	D("Display the total number of reservations"),
	E("List the reservations for a specific city"),
	F("Remove reservations in a specific city"),
	G("Exit");

	private String selection;

	MenuOptions(String selection) {
		this.selection = selection;

	}

	public String getSelection() {
		return selection;
	}

}