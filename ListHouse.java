
public class ListHouse {
	
	private int houseLotNumber;
	private String ownerFirstName;
	private String ownerLastName;
	private int price;
	private int houseSquareFeet;
	private int bedrooms; 
	
	public int getHouseLotNumber() {
		return houseLotNumber;
	}
	public void setHouseLotNumber(int houseLotNumber) {
		this.houseLotNumber = houseLotNumber;
	}
	public String getOwnerFirstName() {
		return ownerFirstName;
	}
	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}
	public String getOwnerLastName() {
		return ownerLastName;
	}
	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public void setHouseSquareFeet(int houseSquareFeet) {
		this.houseSquareFeet = houseSquareFeet;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
}
