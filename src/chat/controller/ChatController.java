package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatbotViewer;
import chat.view.ChatFrame;

public class ChatController
{
	private Chatbot stupidBot;
	private ChatbotViewer display;
	private ChatFrame appFrame;
	
	public ChatController()
	{
		stupidBot = new Chatbot("Automated intelligence conversation machine");
		appFrame = new ChatFrame(this);
	}
	
	
	public void start()
	{
		/**String response = display.collectResponse("What do you want to talk about?");
		
		while(stupidBot.lengthChecker(response))
		{
			display.displayMessage(useChatbotCheckers(response));
			response = display.collectResponse("You want to talk about " + response +"? You start. ");
			
			
		}
		*/
	}
	
	public String useChatbotCheckers(String input)

	{
		String checkedInput = "";
		
		if(stupidBot.memeChecker(input))
		{
			checkedInput += "\nYou like memes!? Tell me more.\n";
			
		if(stupidBot.politicalTopicChecker(input))	
		{
			checkedInput += "\nPolitics are fun to talk about!\n";
		}
		
		if(stupidBot.keyboardMashChecker(input))
		{
			checkedInput += "\nStop hitting your keyboard, it did nothing to you\n";
		}
		
		if(stupidBot.inputHTMLChecker(input))
		{
			checkedInput += "\nThis is a ChatBot, not a web viewer. Go back to Google\n";
		}
		
		if(stupidBot.twitterChecker(input))
		{
			checkedInput += "\nYou're on the wrong app my friend. This isnt social media.\n";
		}
		
		if(stupidBot.quitChecker(input))
		{
			checkedInput += "\nYou're leaving me now? When I need you the most?\n";
		}
		
		}
		if(stupidBot.contentChecker(input))
		{
			checkedInput += "\nYou have found my secret topic!\n";
		}
		
		if(checkedInput.length() == 0)
		{
			checkedInput = "I have no idea what " + input + " is.";
		}
		return checkedInput;
	}

	public ChatFrame getBaseFrame()
	{
		return appFrame;
	}
	
	public Chatbot getChatbot()
	{
		return stupidBot;
	}
	
	public String communicateWithChatbot(String userText)
	{
		String botText = "";
		
		return botText;
	}
}
