package chat.view;

import javax.swing.*;
import java.awt.Color;
import chat.controller.ChatController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class ChatPanel (inherits JPanel)
 * @author bmof0507
 *
 */
public class ChatPanel extends JPanel
{
	/**
	 * ChatPanel data members.
	 */
	private ChatController baseController;
	private SpringLayout baseLayout;
	private JTextArea chatDisplay;
	private JTextField chatField;
	private JButton chatButton;
	
	/**
	 * Method ChatPanel sets up display.
	 * @param baseController
	 */
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
	
	/**
	 * Method setupChatDisplay sets up the chat display.
	 */
	private void setupChatDisplay()
	{
		chatDisplay.setEditable(false);
		chatDisplay.setEnabled(false);
		chatDisplay.setWrapStyleWord(true);
		chatDisplay.setLineWrap(true);
	}
	
	/**
	 * Method setupPanel sets up the panel.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.RED);
		this.add(chatButton);
		this.add(chatDisplay);
		this.add(chatField);
	}
	
	/**
	 * Method setupLayout holds useless information consisting of positioning information.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, chatDisplay, 78, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatDisplay, -73, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatButton, 21, SpringLayout.SOUTH, chatField);
		baseLayout.putConstraint(SpringLayout.EAST, chatButton, -131, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatField, 23, SpringLayout.SOUTH, chatDisplay);
		baseLayout.putConstraint(SpringLayout.EAST, chatField, -62, SpringLayout.EAST, this);
	}
	
	/**
	 * Method setupListeners watches for ActionEvents and ActionListeners.
	 */
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String personWords = chatField.getText();
				String chatbotResponse = baseController.useChatbotCheckers(personWords);
				
				chatDisplay.setText("You said: " + personWords + "\n"+ "Chatbot says: " + chatbotResponse);
				chatField.setText("");
			}
		});
	}
}
