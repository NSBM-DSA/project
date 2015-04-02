
public class HouseFile {
<<<<<<< HEAD
	
	public class HouseFile {

=======
>>>>>>> 645dcab137bdcc68eac0317ac4849b126818edb0
	private int lotNumber, housePrice, houseSquareFeet, houseBedrooms;
	private String ownerFirstName, ownerLastName;
	private ListHouse house;
	private final SortedList houseList = new SortedList();
<<<<<<< HEAD

=======
	
>>>>>>> 645dcab137bdcc68eac0317ac4849b126818edb0
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
<<<<<<< HEAD

	public HouseFile() {

	}

	public void addHouse() {
		house.setHouseLotNumber(lotNumber);
		house.setOwnerFirstName(ownerFirstName);
		house.setOwnerLastName(ownerLastName);
		house.setPrice(housePrice);
		house.setHouseSquareFeet(houseSquareFeet);
		house.setBedrooms(houseBedrooms);
	}
}
=======
	
	public HouseFile() {

	}
>>>>>>> 645dcab137bdcc68eac0317ac4849b126818edb0
}	
