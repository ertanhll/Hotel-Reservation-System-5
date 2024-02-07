
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Single singleRoom = new Single();
		Double doubleRoom = new Double();
		Club clubRoom = new Club();
		Family familyRoom = new Family();
		FamilyView familyViewRoom = new FamilyView();
		Suite suiteRoom = new Suite();

		Room[] rooms = new Room[] { singleRoom, doubleRoom, clubRoom, familyRoom, familyViewRoom, suiteRoom };

		Reservation[] reservations = new Reservation[3];

		int option;

		while (true) {
			int order = 0;
			for (MenuOptions select : MenuOptions.values()) {
				System.out.println((++order) + ". " + select.getSelection());
			}

			option = input.nextInt();
			input.nextLine();
			int selectedIndex = option - 1;
			if (selectedIndex < 0 || selectedIndex >= MenuOptions.values().length) {
				System.out.println("Invalid input");
				System.out.println("\n");
				continue;
			}
			System.out.println("\n");

			MenuOptions menuOptions = MenuOptions.values()[selectedIndex];

			switch (menuOptions) {
			case A:
				System.out.print("Hotel Name: ");
				String hotelName = input.nextLine();

				String reservationMonth = null;
				boolean isValidMonth = false;

				while (!isValidMonth) {
					System.out.print("Reservation Month: ");
					reservationMonth = input.nextLine();

					for (Month month : Month.values()) {
						if (month.getSelection().equals(reservationMonth)) {
							isValidMonth = true;
							break;
						}
					}
					if (!isValidMonth) {
						System.out.println("Invalid input");
					}
				}
				int reservationStart = 0;
				while (reservationStart <= 0 || reservationStart > 30) {
					System.out.print("Reservation Start (1-30): ");
					reservationStart = input.nextInt();
					if (reservationStart <= 0 || reservationStart > 30) {
						System.out.println("Invalid start day. Please enter a day between 1-30.");
					}
				}
				int reservationEnd = 0;
				while (reservationEnd <= 0 || reservationEnd > 30 || reservationEnd < reservationStart) {
					System.out.print("Reservation End (" + reservationStart + "-30): ");
					reservationEnd = input.nextInt();
					if (reservationEnd <= 0 || reservationEnd > 30) {
						System.out.println("Invalid end day. Please enter a day between " + reservationStart + "-30.");
					} else if (reservationEnd < reservationStart) {
						System.out.println("Invalid end day. End day must be greater than or equal to the start day.");
					}
				}
				reservations[Reservation.getTotalNumOfReservations()] = new Reservation(singleRoom, hotelName,
						reservationMonth, reservationStart, reservationEnd);

				System.out.println("\n\nReservation created! \n\n");
				break;

			case B:
				System.out.println("ROOM INFOS:\n\n");
				for (Room room : rooms) {
					System.out.println(room.toString());
				}
				System.out.println("\n");
				System.out.print("Hotel Name: ");

				hotelName = input.nextLine();

				boolean validRoomType = false;
				String roomTypeOption = null;
				String[] roomTypes = { "Single", "Double", "Club", "Family", "Family with View", "Suite" };

				while (!validRoomType) {
					System.out.print("Room Type: ");
					roomTypeOption = input.nextLine();

					for (String roomType : roomTypes) {
						if (roomTypeOption.equalsIgnoreCase(roomType)) {
							validRoomType = true;
							break;
						}
					}
					if (!validRoomType) {
						System.out.println("Invalid Input");
					}
				}
				isValidMonth = false;
				reservationMonth = null;

				while (!isValidMonth) {
					System.out.print("Reservation Month: ");
					reservationMonth = input.nextLine();

					for (Month month : Month.values()) {
						if (month.getSelection().equals(reservationMonth)) {
							isValidMonth = true;
							break;
						}
					}
					if (!isValidMonth) {
						System.out.println("Invalid input");
					}
				}
				reservationStart = 0;
				while (reservationStart <= 0 || reservationStart > 30) {
					System.out.print("Reservation Start (1-30): ");
					reservationStart = input.nextInt();
					if (reservationStart <= 0 || reservationStart > 30) {
						System.out.println("Invalid start day. Please enter a day between 1-30.");
					}
				}
				reservationEnd = 0;
				while (reservationEnd <= 0 || reservationEnd > 30 || reservationEnd < reservationStart) {
					System.out.print("Reservation End (" + reservationStart + "-30): ");
					reservationEnd = input.nextInt();
					if (reservationEnd <= 0 || reservationEnd > 30) {
						System.out.println("Invalid end day. Please enter a day between " + reservationStart + "-30.");
					} else if (reservationEnd < reservationStart) {
						System.out.println("Invalid end day. End day must be greater than or equal to the start day.");
					}
				}
				if (roomTypeOption.equalsIgnoreCase("Single"))
					reservations[Reservation.getTotalNumOfReservations()] = new Reservation(singleRoom, hotelName,
							reservationMonth, reservationStart, reservationEnd);

				else if (roomTypeOption.equalsIgnoreCase("Double"))
					reservations[Reservation.getTotalNumOfReservations()] = new Reservation(doubleRoom, hotelName,
							reservationMonth, reservationStart, reservationEnd);

				else if (roomTypeOption.equalsIgnoreCase("Club"))
					reservations[Reservation.getTotalNumOfReservations()] = new Reservation(clubRoom, hotelName,
							reservationMonth, reservationStart, reservationEnd);

				else if (roomTypeOption.equalsIgnoreCase("Family"))
					reservations[Reservation.getTotalNumOfReservations()] = new Reservation(familyRoom, hotelName,
							reservationMonth, reservationStart, reservationEnd);

				else if (roomTypeOption.equalsIgnoreCase("Family With View"))
					reservations[Reservation.getTotalNumOfReservations()] = new Reservation(familyViewRoom, hotelName,
							reservationMonth, reservationStart, reservationEnd);

				else if (roomTypeOption.equalsIgnoreCase("Suite"))
					reservations[Reservation.getTotalNumOfReservations()] = new Reservation(suiteRoom, hotelName,
							reservationMonth, reservationStart, reservationEnd);

				System.out.println("\nReservation created!\n");
				break;

			case C:
				for (int i = 0; i < Reservation.getTotalNumOfReservations(); i++) {

					System.out.println("Reservation for a " + reservations[i].getRoom().getType() + " room in "
							+ reservations[i].getHotelName() + " starts on " + reservations[i].getReservationMonth()
							+ " " + reservations[i].getReservationStart() + " and ends on "
							+ reservations[i].getReservationEnd() + ".");
					System.out.println("Reservation has a total cost of $" + reservations[i].calculateTotalPrice());
					System.out.println("\n");
				}
				break;

			case D:
				System.out.println(Reservation.getTotalNumOfReservations()
						+ (Reservation.getTotalNumOfReservations() < 2 ? " reservation " : " reservations ")
						+ "created so far.");

				System.out.println("\n");
				break;

			case E:
				int numOfReservations = Reservation.getTotalNumOfReservations();
				if (numOfReservations == 0) {
					System.out.println("There are no reservations yet. Please try again later.\n");
					break;
				}
				List<Reservation> reservationsList = new ArrayList<>(Arrays.asList(reservations));
				System.out.print("Type a city name for a reservation search: ");
				String city = input.nextLine();

				boolean foundReservation = false;
				System.out.println("Reservations for " + city + ":");
				ListIterator<Reservation> iterator = reservationsList.listIterator();
				do {
					Reservation reservation = iterator.next();
					if (reservation.getHotelName().contains(city)) {
							System.out.println(reservation.getHotelName());
							foundReservation = true;						
					}
				} while (iterator.hasNext());

				if (!foundReservation) {
					System.out.println("No reservations found for the specified city.\n");
				}
				System.out.println("\n");
				break;

			case F:

				System.out.print("Type a city name to remove reservations: ");
				String cityToRemove = input.nextLine();

				List<Reservation> searchList = new ArrayList<>(Arrays.asList(reservations));
				ListIterator<Reservation> iter = searchList.listIterator();

				while (iter.hasNext()) {
					Reservation reservation = iter.next();
					if (reservation.getHotelName().contains(cityToRemove)) {
						System.out.println("Reservation for " + reservation.getHotelName() + " removed.");
						iter.remove();
						Reservation.setTotalNumOfReservations(Reservation.getTotalNumOfReservations() - 1);
					}
				}
				reservations = null;
				reservations = searchList.toArray(new Reservation[3]);
				System.out.println();
				break;

			case G:
				System.out.println("Goodbye");
				input.close();
				return;

			default:
				System.out.println("Invalid input");
				System.out.println("\n");
				break;
			}
		}
	}
}
