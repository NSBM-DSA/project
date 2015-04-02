public class RealEstate {
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
		
		addButton.addActionListener(new ActionListener() {});
		findButton.addActionListener(new ActionListener() {});
		clearButton.addActionListener(new ActionListener() {});
		deleteButton.addActionListener(new ActionListener() {};
		nextButton.addActionListener(new ActionListener() {});
		resetButton.addActionListener(new ActionListener() {});

	}
}
