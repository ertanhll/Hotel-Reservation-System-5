Below, you can find the description of your fifth assignment, which also
includes its output in the Application Walkthrough section.
In this assignment, you are expected to improve your existing Hotel
Reservation System by incorporating List type data structures from the
package Collections. Furthermore, you are required to make use of the remove()
method to delete items from a list or in this case a fixed sized array.
1. Create new Reservation
2. Create new Reservation with Room Type
3. Display all Reservations
4. Display the total number of reservations
5. List the reservations for a specific city
6. Remove reservations in a specific city
7. Exit
As part of this assignment, you need to add two new menu items to your
existing reservation system. Namely; item 5 “List the reservation for a specific
city” and item 6 “Remove reservations in a specific city”. However, in order for
this new approach to work are asked to input all hotel names with its location
city – e.g. “Hilton Istanbul”, “DoubleTree By Hilton Istanbul”, “Ramada Bursa”
etc. Also, you should set the size of your Reservation array to 3 and always fill
all of them with data – the size of the array should be 3 and you should always
enter at least 3 reservations.
Accordingly, when the user selects the 1st option, s/he should be prompted to
enter the relevant information (values corresponding to instance variables) for a
new Room. The default room type will be a Single.
When the user selects the 2nd option, the system will expect the user to input
the generic information about the reservation and lastly the type of the room.
The roomType provided by the user then should be compared using equals()
method and a relevant type of subclass instance should be created. Then, the
created object, which will be a subclass of Room, should be added to the 
Reservation object via its constructor. Then fully constructed Reservation
objects should be stored in an array for later use.
When the user selects the 3rd option, the information about all reservations
should be printed with the help of the existing displayInfo() method.
When the user selects the 4th option, the total number of reservations should
be printed by calling the static class variable totalNumOfReservations.
When the user selects the 5th option, the system should ask the user to input
the name of the city that the user would like to list the reservations of. Next,
even though it is possible to parse the Reservation array using do/while loop,
the application should convert the Reservation array into a List and traverse in
it using List Iterator’s hasNext() method. If the Iterator’s pointer indicates to a
reservation hotel which has the city name provided initially, it should print
those hotel names on the screen.
When the user selects the 6th option, the application initially should request
the user to input a city name. As soon as the city name is provided, it should
convert the existing Reservation array into a List and parse the hotel names to
check whether any of the reservations are made for that specific city. If any
found, it should remove that reservation from the list using List’s remove()
method. Then the existing Reservation array should be set to null and the
resulting List should then be inserted to the Reservation array.
When the user selects the 7th option, the application should be terminated.
Application Walkthrough
1. Create new Reservation
2. Create new Reservation with Room Type
3. Display all Reservations
4. Display the total number of reservations
5. List the reservations for a specific city
6. Remove reservations in a specific city
7. Exit
1
Hotel Name: Hilton Istanbul
Reservation Month: April
Reservation Start: 20
Reservation End: 27
Reservation created!
1. Create new Reservation
2. Create new Reservation with Room Type
3. Display all Reservations
4. Display the total number of reservations
5. List the reservations for a specific city
6. Remove reservations in a specific city
7. Exit
2
ROOM INFOS:
Room Type: Single, Daily Cost: 100, Room Size: 15, Has Bath: false
Room Type: Double, Daily Cost: 180, Room Size: 30, Has Bath: false
Room Type: Club, Daily Cost: 250, Room Size: 45, Has Bath: true
Room Type: Family, Daily Cost: 400, Room Size: 50, Has Bath: false
Room Type: Family With View, Daily Cost: 450, Room Size: 50, Has Bath: true
Room Type: Suite, Daily Cost: 650, Room Size: 80, Has Bath: true
Hotel Name: Ramada Bursa
Room Type: Club
Reservation Month: June
Reservation Start: 15
Reservation End: 18
Reservation created!
1. Create new Reservation
2. Create new Reservation with Room Type
3. Display all Reservations
4. Display the total number of reservations
5. List the reservations for a specific city
6. Remove reservations in a specific city
7. Exit
2
ROOM INFOS:
Room Type: Single, Daily Cost: 100, Room Size: 15, Has Bath: false
Room Type: Double, Daily Cost: 180, Room Size: 30, Has Bath: false
Room Type: Club, Daily Cost: 250, Room Size: 45, Has Bath: true
Room Type: Family, Daily Cost: 400, Room Size: 50, Has Bath: false
Room Type: Family With View, Daily Cost: 450, Room Size: 50, Has Bath: true
Room Type: Suite, Daily Cost: 650, Room Size: 80, Has Bath: true
Hotel Name: Ramada Istanbul
Room Type: Suite
Reservation Month: May
Reservation Start: 10
Reservation End: 16
Reservation created!
1. Create new Reservation
2. Create new Reservation with Room Type
3. Display all Reservations
4. Display the total number of reservations
5. List the reservations for a specific city
6. Remove reservations in a specific city
7. Exit
3
Reservation for a Single room in Hilton Istanbul starts on April 20 and ends
on April 27. Reservation has a total cost of $700.
Reservation for a Club room in Ramada Bursa starts on June 15 and ends on
June 18. Reservation has a total cost of $1500.
Reservation for a Suite room in Ramada Istanbul starts on May 10 and ends on
May 16. Reservation has a total cost of $3900.
1. Create new Reservation
2. Create new Reservation with Room Type
3. Display all Reservations
4. Display the total number of reservations
5. List the reservations for a specific city
6. Remove reservations in a specific city
7. Exit
4
3 reservations created so far.
1. Create new Reservation
2. Create new Reservation with Room Type
3. Display all Reservations
4. Display the total number of reservations
5. List the reservations for a specific city
6. Remove reservations in a specific city
7. Exit
5
Type a city name for a reservation search: Istanbul
Hilton Istanbul
Ramada Istanbul
1. Create new Reservation
2. Create new Reservation with Room Type
3. Display all Reservations
4. Display the total number of reservations
5. List the reservations for a specific city
6. Remove reservations in a specific city
7. Exit
6
Type a city name for a reservation search: Bursa
1. Create new Reservation
2. Create new Reservation with Room Type
3. Display all Reservations
4. Display the total number of reservations
5. List the reservations for a specific city
6. Remove reservations in a specific city
7. Exit
3
Reservation for a Single room in Hilton Istanbul starts on April 20 and ends
on April 27. Reservation has a total cost of $700.
Reservation for a Suite room in Ramada Istanbul starts on May 10 and ends on
May 16. Reservation has a total cost of $3900.
1. Create new Reservation
2. Create new Reservation with Room Type
3. Display all Reservations
4. Display the total number of reservations
5. List the reservations for a specific city
6. Remove reservations in a specific city
7. Exit
7




