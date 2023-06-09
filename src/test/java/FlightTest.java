import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class FlightTest {

    Flight flight;
    ArrayList<Passenger> passengers;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;

    @Before
    public void before() {

        Pilot pilot = new Pilot("Carly Rae Jepsen", "Co-Pilot", "BL485698");
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(pilot);

        ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(CabinCrewMember.TRENTREZNOR);
        cabinCrewMembers.add(CabinCrewMember.DAVIDBOWIE);
        cabinCrewMembers.add(CabinCrewMember.JOESTRUMMER);
        cabinCrewMembers.add(CabinCrewMember.ANNIELENNOX);

        passenger1 = new Passenger("Simon Gallup", 2);
        passenger2 = new Passenger("Roger O'Donnell", 1);
        passenger3 = new Passenger("Perry Bamonte", 1);
        passenger4 = new Passenger("Reeves Gabrielle", 1);
        passenger5 = new Passenger("Lol Tolhurst", 1);


        passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);

        flight = new Flight(pilots, cabinCrewMembers,passengers, Plane.SAM26000, "JAV001", "LAX", "GLA", "14:00" );
    }


    @Test
    public void canGetAvailableSeats() {
        assertEquals(45, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassengerWhenNotFull() {
        flight.setPlane(Plane.SML10000);
        flight.bookPassenger(new Passenger("Reeves Gabrielle", 1));
        assertEquals(flight.getPassengers().size(), flight.getPlane().getCapacity());
    }

    @Test
    public void canBookPassengerWhenFull() {
        flight.setPlane(Plane.SML10000);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger5);
        assertEquals(flight.getPassengers().size(), flight.getPlane().getCapacity());
    }

    @Test
    public void canFlyPlane() {
        assertEquals(flight.fly(), "Woo Carly Rae Jepsen is flying JAV001 from GLA to LAX");
    }

    @Test
    public void canMakeAnnouncement() {
        assertEquals(flight.getCabinCrewMembers().get(2).makeAnnouncement("we will be arriving at " + flight.getDestination() + " soon"), "This is your Flight Attendant speaking with the following announcement: we will be arriving at LAX soon");
    }
}
