
import java.util.LinkedList;

import javax.swing.JOptionPane;

 
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
	
		public void deleteHouse(int lot) {
		boolean FLAG_IS_HOUSE_DELETED = false;

		LinkedList<ListHouse> houses = houseList.getHouseList();
		for (int i = 0; i < houses.size(); i++) {
			System.out.println("INSIDE FOR");
			if (lot == houses.get(i).getHouseLotNumber()) {
				System.out.println("Found House");
				houses.remove(i);
				JOptionPane.showMessageDialog(null, "House found and deleted from the House List.",
						"Info ", JOptionPane.INFORMATION_MESSAGE);
				FLAG_IS_HOUSE_DELETED = true;
				break;
			}

		}

		if (FLAG_IS_HOUSE_DELETED == false) {
			JOptionPane.showMessageDialog(null, "no house found.", "Info ",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
