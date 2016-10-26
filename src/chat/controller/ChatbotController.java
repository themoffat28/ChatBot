package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatbotViewer;

public class ChatbotController
{
	private Chatbot stupidBot;
	private ChatbotViewer display;
	
	public ChatbotController()
	{
		stupidBot = new Chatbot("Automated intelligence conversation machine");
		display = new ChatbotViewer();
	}
	
	
	public void start()
	{
		String response = display.collectResponse("What do you want to talk about?");
		
		while(stupidBot.lengthChecker(response))
		{
			display.displayMessage(useChatbotCheckers(response));
			response = display.collectResponse("You want to talk about " + response +"? You start. ");
			
			
		}
		
	}
	
	private String useChatbotCheckers(String input)
	{
		String checkedInput = "";
		
		if(stupidBot.memeChecker (input))
		{
			checkedInput += "\nYou like memes!?\n";
		}
		if(stupidBot.contentChecker(input))
		{
			checkedInput += "\nYou have found my secret topic!\n";
		}
		
		if(checkedInput.length() == 0)
		{
			checkedInput = "I have no idea what" + input + " is.";
		}
		return checkedInput;
	}

}
