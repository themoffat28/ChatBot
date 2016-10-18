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
		String response = "words";
		
		while(stupidBot.lengthChecker(response))
		{
			response = display.collectResponse("Shall we ask some questions?");
		}
		
	}

}
