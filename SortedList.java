

import java.util.LinkedList;

public class SortedList {

	private static LinkedList<ListHouse> houseList = new LinkedList<ListHouse>();
	private static LinkedList<ListHouse> sortedHouseList=new LinkedList<ListHouse>();

	public LinkedList<ListHouse> getHouseList() {
		return houseList;
	}

	public void addHouseToHouseList(ListHouse house) {
		if (SortedList.houseList == null) {
			houseList = new LinkedList<ListHouse>();
		} else {
			SortedList.houseList.add(house);
		}

	}

	

	public void setHouseList(LinkedList<ListHouse> house) {
		SortedList.houseList = house;
	}
	public LinkedList<ListHouse> getSortedHouseList() {
		return sortedHouseList;
	}

	public void setSortedHouseList(LinkedList<ListHouse> sortedHouseList) {
		SortedList.sortedHouseList = sortedHouseList;
	}

}
