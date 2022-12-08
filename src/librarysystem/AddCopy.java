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


public class AddCopy extends JFrame implements LibWindow {
	public static final AddCopy INSTANCE = new AddCopy();
    ControllerInterface ci = new SystemController();
	private boolean isInitialized = false;
	public JPanel getMainPanel() {
		return mainPanel;
	}
	private JPanel mainPanel;
	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel lowerPanel;
	private JTextField tfIsbn;
	private JButton btnAddCopy;
	
	private AddCopy() {}
	
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
		JLabel AddBookLabel = new JLabel("Add Copy");
		Util.adjustLabelFont(AddBookLabel, Util.DARK_BLUE, true);
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(AddBookLabel);
	}
	
	public void defineMiddlePanel() {
		middlePanel = new JPanel();
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 25, 25);
		middlePanel.setLayout(fl);
		
		tfIsbn = new JTextField(10);
		btnAddCopy = new JButton("Add Copy");
		
		middlePanel.add(tfIsbn);
		middlePanel.add(btnAddCopy);
		addCopyButtonListener(btnAddCopy);
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
	
	private void addCopyButtonListener(JButton btn) {
		btn.addActionListener(evt -> {
			
			String isbn = tfIsbn.getText();
			Book book = ci.addBookCopyByIsbn(isbn);
			
			System.out.println(ci.allBookIds());
			if (book == null) {
				JOptionPane.showMessageDialog(this, "Book not found.");
				return;
			}
			
			JOptionPane.showMessageDialog(this, "Book Copied successfully. " + book.getNumCopies());
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


