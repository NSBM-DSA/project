import java.util.LinkedList;

public class SortedList {
	private static LinkedList<ListHouse> sortedHouseList=new LinkedList<ListHouse>();

	public LinkedList<ListHouse> getSortedHouseList() {
		return sortedHouseList; 
	}

	public void setSortedHouseList(LinkedList<ListHouse> sortedHouseList) {
		SortedList.sortedHouseList = sortedHouseList;
	}
}
