
public class HouseFile {
	private int lotNumber, housePrice, houseSquareFeet, houseBedrooms;
	private String ownerFirstName, ownerLastName;
	private ListHouse house;
	private final SortedList houseList = new SortedList();
	
	public HouseFile(int lot, String first, String last, int price, int feet,
			int bed) {
		this.lotNumber = lot;
		this.ownerFirstName = first;
		this.ownerLastName = last;
		this.housePrice = price;
		this.houseSquareFeet = price;
		this.houseBedrooms = bed;
		house = new ListHouse();
	}
	
	public HouseFile() {

	}
}	
