package structural.facade;

public class ServiceSystem {
	private RentalRoom rentalRoom = new RentalRoom();
	private RentalSkiSuit rentalSkiSuit = new RentalSkiSuit();
	private Ticketing ticketing = new Ticketing();

	public int checkout(int days, int height, int footSize) {
		return rentalRoom.rentRoom(days) + rentalSkiSuit.rentSkiSuit(height, footSize) + ticketing.buyTicket(days);
	}
}
