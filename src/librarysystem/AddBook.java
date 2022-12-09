package librarysystem;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import business.Address;
import business.Author;
import business.Book;
import business.ControllerInterface;
import business.SystemController;


public class AddBook extends JFrame implements LibWindow {
	public static final AddBook INSTANCE = new AddBook();
    ControllerInterface ci = new SystemController();
	private boolean isInitialized = false;
	public JPanel getMainPanel() {
		return mainPanel;
	}
	private JPanel mainPanel;
	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel lowerPanel;
	private TextArea textArea;
	private JTextField tfIsbn, tfTitle, tfAuthor, tfMaxcheckoutLength, tfNumOfCopies;
	private JButton btnAddBook;
	
	private AddBook() {}
	
	public void init() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		defineTopPanel();
		defineMiddlePanel();
		defineLowerPanel();
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);	
		mainPanel.add(lowerPanel, BorderLayout.SOUTH);
		getContentPane().add(mainPanel);
		isInitialized = true;
	}
	
	public void defineTopPanel() {
		topPanel = new JPanel();
		JLabel AddBookLabel = new JLabel("Add Book");
		Util.adjustLabelFont(AddBookLabel, Util.DARK_BLUE, true);
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(AddBookLabel);
	}
	
	public void defineMiddlePanel() {
		middlePanel = new JPanel();
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 25, 25);
		middlePanel.setLayout(fl);
		
		tfIsbn = new JTextField(10);
		tfTitle = new JTextField(10);
		tfAuthor = new JTextField(10); 
		tfMaxcheckoutLength = new JTextField(10);
		tfNumOfCopies = new JTextField(10);
		btnAddBook = new JButton("Add Book");
		
		middlePanel.add(tfIsbn);
		middlePanel.add(tfTitle);
		middlePanel.add(tfAuthor);
		middlePanel.add(tfMaxcheckoutLength);
		middlePanel.add(tfNumOfCopies);
		middlePanel.add(btnAddBook);
		addBookButtonListener(btnAddBook);
	}
	
	public void defineLowerPanel() {
		lowerPanel = new JPanel();
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
		lowerPanel.setLayout(fl);
		JButton backButton = new JButton("<== Back to Main");
		addBackButtonListener(backButton);
		lowerPanel.add(backButton);
	}
	
//	public void setData(String data) {
//		textArea.setText(data);
//	}
	private void addBackButtonListener(JButton butn) {
		butn.addActionListener(evt -> {
		   LibrarySystem.hideAllWindows();
		   LibrarySystem.INSTANCE.setVisible(true);
	    });
	}
	
	private void addBookButtonListener(JButton btn) {
		btn.addActionListener(evt -> {
			
			int numCopies;
			try {
				numCopies = Integer.parseInt(tfMaxcheckoutLength.getText().trim());
			} catch (Exception e) {
				numCopies = 0;
			}
			
			Book book = new Book(
					tfIsbn.getText(), 
					tfTitle.getText(),
					numCopies);
			ci.addBook(book);

			JOptionPane.showMessageDialog(this, "Added successfully" + "\n\n" + ci.allBookIds());
			
			LibrarySystem.hideAllWindows();
			LibrarySystem.INSTANCE.setVisible(true);
		});
	}

	@Override
	public boolean isInitialized() {
		
		return isInitialized;
	}

	@Override
	public void isInitialized(boolean val) {
		isInitialized = val;
		
	}
	
}


