package chat.view;

import javax.swing.*;
import java.awt.Color;
import chat.controller.ChatController;

public class ChatPanel extends JPanel
{
	private ChatController baseController;
	private SpringLayout baseLayout;
	private JTextArea chatDisplay;
	private JTextField chatField;
	private JButton chatButton;
	
	public ChatPanel(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		chatDisplay = new JTextArea(5,25);
		chatField = new JTextField(25);
		chatButton = new JButton("Chat with the bot fam");
		
		
		setupChatDisplay();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupChatDisplay()
	{
		chatDisplay.setEditable(false);
		chatDisplay.setEnabled(false);
		chatDisplay.setWrapStyleWord(true);
		chatDisplay.setLineWrap(true);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.RED);
		this.add(chatButton);
		this.add(chatDisplay);
		this.add(chatField);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, chatDisplay, -73, SpringLayout.EAST, this);
		
		baseLayout.putConstraint(SpringLayout.NORTH, chatField, 23, SpringLayout.SOUTH, chatDisplay);
		baseLayout.putConstraint(SpringLayout.EAST, chatField, -62, SpringLayout.EAST, this);
		
		baseLayout.putConstraint(SpringLayout.NORTH, chatDisplay, 39, SpringLayout.SOUTH, chatButton);
		baseLayout.putConstraint(SpringLayout.NORTH, chatButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatButton, -133, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
