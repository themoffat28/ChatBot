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
		
		if(!stupidBot.lengthChecker(checkedInput))
		{
			checkedInput = "I have no idea what " + input + " is.";
		}
		
		int canBeRandom = (int) (Math.random() * 7);
		if(canBeRandom % 7 == 0)
		{
			checkedInput += randomTopicGenerator();
		}
		
		return checkedInput;
	}
	
	private String randomTopicGenerator()
	{
		String randomTopic = "";
		int random = (int) (Math.random() * 7);
		
		switch(random)
		{
		case 0:
			randomTopic = "Have you heard Tory Lanez version of Controller (by Drake)? 🙏🙌😩";
			break;
		case 1:
			randomTopic = "I'm in the mood for some Mexican food.";
			break;
		case 2:
			randomTopic = "I can't wait to become a real person like you.";
			break;
		case 3:
			randomTopic = "Can you guess my secret topic? Hint** It was a historical point.";
			break;	
		case 4:
			randomTopic = "Fam.. don't look behind you.";
			break;	
		case 5:
			randomTopic = "What do you think about Harambe?";
			break;
		case 6:
			randomTopic = "Trump or nah?";
			break;	
		default:
			randomTopic = "If you're seeing this, something went terribly wrong... 😬 ";
			break;
		}
		
		return randomTopic;
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
