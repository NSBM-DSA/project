

import javax.swing.*;
import java.util.LinkedList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RealEstate {
	static HouseFile houseFile = new HouseFile();
	static final SortedList houseList = new SortedList();
	static JButton resetButton, nextButton, addButton, deleteButton,clearButton, findButton;
	static JTextField lotNumberText, firstNameText, lastNameText, priceText,feetText, bedRoomsText;

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("DSA Assignment");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(10, 2));

		JLabel topLabel = new JLabel("Next House Displayed");
		JLabel blank = new JLabel("");
		JLabel lotNumberLable = new JLabel("Lot Number");
		JLabel firstNameLable = new JLabel("First Name");
		JLabel lastNameLable = new JLabel("Last Name");
		JLabel priceLable = new JLabel("Price");
		JLabel squaredFeetLable = new JLabel("Squared Feet");
		JLabel bedroomsLable = new JLabel("Number od Bedrooms");

		resetButton = new JButton("Reset");
		nextButton = new JButton("Next");
		addButton = new JButton("Add");
		deleteButton = new JButton("Delete");
		clearButton = new JButton("Clear");
		findButton = new JButton("Find");

		lotNumberText = new JTextField();
		firstNameText = new JTextField();
		lastNameText = new JTextField();
		priceText = new JTextField();
		feetText = new JTextField();
		bedRoomsText = new JTextField();

		frame.add(topLabel);
		frame.add(blank);
		frame.add(lotNumberLable);
		frame.add(lotNumberText);
		frame.add(firstNameLable);
		frame.add(firstNameText);
		frame.add(lastNameLable);
		frame.add(lastNameText);
		frame.add(priceLable);
		frame.add(priceText);
		frame.add(squaredFeetLable);
		frame.add(feetText);
		frame.add(bedroomsLable);
		frame.add(bedRoomsText);
		frame.add(resetButton);
		frame.add(nextButton);
		frame.add(addButton);
		frame.add(deleteButton);
		frame.add(clearButton);
		frame.add(findButton);

		frame.pack();
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				RealEstate realEstate=new RealEstate();
				realEstate.addHouse();
				
			}
			
		});

	findButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RealEstate realEstate=new RealEstate();
				realEstate.findHouse();
			}
		});	
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RealEstate realEstate=new RealEstate();
				realEstate.clear();
			}
		});
		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RealEstate realEstate=new RealEstate();
				realEstate.deleteHouse();
			}
		});

		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RealEstate realEstate=new RealEstate();
				realEstate.nextHouse();
			}
		});
		
		resetButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				RealEstate realEstate=new RealEstate();
				realEstate.resetHouses();
			}
		});

	}

	private boolean checkData() {

		boolean FLAG_TEXTFIELD_STATUS = true;

		if (lotNumberText.getText().length() == 0)
			FLAG_TEXTFIELD_STATUS = false;

		if (firstNameText.getText().length() == 0)
			FLAG_TEXTFIELD_STATUS = false;

		if (lastNameText.getText().length() == 0)
			FLAG_TEXTFIELD_STATUS = false;

		if (priceText.getText().length() == 0)
			FLAG_TEXTFIELD_STATUS = false;

		if (feetText.getText().length() == 0)
			FLAG_TEXTFIELD_STATUS = false;

		if (bedRoomsText.getText().length() == 0)
			FLAG_TEXTFIELD_STATUS = false;

		return FLAG_TEXTFIELD_STATUS;
	}
	private void clearAll() {
		lotNumberText.setText("");
		firstNameText.setText("");
		lastNameText.setText("");
		priceText.setText("");
		feetText.setText("");
		bedRoomsText.setText("");
	}
	
	private void addHouse(){
		RealEstate realEstate = new RealEstate();
				if (realEstate.checkData()) {

					int lot = Integer.parseInt(lotNumberText.getText());
					int price = Integer.parseInt(priceText.getText());
					int feet = Integer.parseInt(feetText.getText());
					int bedrooms = Integer.parseInt(bedRoomsText.getText());

					HouseFile houseFile = new HouseFile(lot, firstNameText
							.getText(), lastNameText.getText(), price, feet,
							bedrooms);

					houseList.addHouseToHouseList(houseFile.addHouse());
					//System.out.println("HOUSE LIST SIZE -"
							+ houseList.getHouseList().size());
					realEstate.clearAll();
				} else {
					JOptionPane.showMessageDialog(null, "Check all data..",
							"Info ", JOptionPane.INFORMATION_MESSAGE);
				}
	}
	
	private void findHouse(){
		if (lotNumberText.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "Enter Lot number..",
							"Info ", JOptionPane.INFORMATION_MESSAGE);
				} else {
					ListHouse house;

					house = houseFile.findHouse(Integer.parseInt(lotNumberText
							.getText()));
					if (houseList.getHouseList() != null) {
						if (house == null) {
							JOptionPane.showMessageDialog(null,
									"No house found..", "Info ",
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							lotNumberText.setText(""
									+ house.getHouseLotNumber());
							firstNameText.setText(house.getOwnerFirstName());
							lastNameText.setText(house.getOwnerLastName());
							priceText.setText("" + house.getPrice());
							feetText.setText("" + house.getHouseSquareFeet());
							bedRoomsText.setText("" + house.getBedrooms());
						}
					}
				}
	}
	
	private void clear(){
				houseList.clearHouseList();
				JOptionPane.showMessageDialog(null, "All Cleared.", "Info ",
						JOptionPane.INFORMATION_MESSAGE);
				RealEstate main = new RealEstate();
				main.clearAll();
	}
	private void deleteHouse(){
		if (houseList.getHouseList() != null) {
					houseFile.deleteHouse(Integer.parseInt(lotNumberText
							.getText()));
					RealEstate main = new RealEstate();
					main.clearAll();
					
				} else {
					JOptionPane.showMessageDialog(null,
							"Unable to process Delete.House List is empty.",
							"Info", JOptionPane.INFORMATION_MESSAGE);
				}
	}
	
	private void nextHouse(){
		int lot = Integer.parseInt(lotNumberText.getText());
				if (houseList.getHouseList() != null) {

					int index = houseFile.showNext(lot);
					if (index == -1) {
						JOptionPane.showMessageDialog(null,
								"Incorrect lot number.", "Error ",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						index++;
						LinkedList<ListHouse> houses = houseList.getHouseList();
						if (index < houses.size()) {
							lotNumberText.setText(""
									+ houses.get(index).getHouseLotNumber());
							firstNameText.setText(houses.get(index)
									.getOwnerFirstName());
							lastNameText.setText(houses.get(index)
									.getOwnerLastName());
							priceText
									.setText("" + houses.get(index).getPrice());
							feetText.setText(""
									+ houses.get(index).getHouseSquareFeet());
							bedRoomsText.setText(""
									+ houses.get(index).getBedrooms());
						} else {
							JOptionPane.showMessageDialog(null, "End.", "Info",
									JOptionPane.INFORMATION_MESSAGE);
						}
					}

				}
				else {
					JOptionPane.showMessageDialog(null,
							"Unable to process Next.House List is empty.",
							"Info", JOptionPane.INFORMATION_MESSAGE);
				}
	}
	
	private void resetHouses(){
		if (houseList.getHouseList() != null) {
					houseFile.sortHouseList();
					RealEstate main = new RealEstate();
					main.clearAll();
				} else {
					JOptionPane.showMessageDialog(null,
							"Unable to process Reset.House List is empty.",
							"Info", JOptionPane.INFORMATION_MESSAGE);
				}
	}

}
