<<<<<<< HEAD
import java.util.LinkedList;

import javax.swing.JOptionPane;

=======
>>>>>>> 80b4c9a4d5278804b98d2759836c46864a595946
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

	public ListHouse addHouse() {
		house.setHouseLotNumber(lotNumber);
		house.setOwnerFirstName(ownerFirstName);
		house.setOwnerLastName(ownerLastName);
		house.setPrice(housePrice);
		house.setHouseSquareFeet(houseSquareFeet);
		house.setBedrooms(houseBedrooms);
		return house;
	}
<<<<<<< HEAD
	
	public ListHouse findHouse(int lot) {
		System.out.println("INSIDE FINDHOUSE()");
		ListHouse house = null;

		LinkedList<ListHouse> houses = houseList.getHouseList();
		if (houses == null) {

			JOptionPane.showMessageDialog(null, "Unable to process Find.House List is empty.", "Info",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			System.out.println("HOUSELIST SIZE - " + houses.size());

			for (int i = 0; i < houses.size(); i++) {
				System.out.println("INSIDE FOR");
				if (lot == houses.get(i).getHouseLotNumber()) {
					System.out.println("INSIDE IF");
					house = houses.get(i);
					break;
				}
			} 
		}
		return house;   
	}

=======
>>>>>>> 80b4c9a4d5278804b98d2759836c46864a595946
}