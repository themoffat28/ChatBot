package chat.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileController
{
	public static void saveFile(ChatController baseController, String fileName, String contents)
	{
		try
		{
			File saveFile;
			if(fileName.length() > 5)
			{
				saveFile = new File(fileName + ".txt");
			}
			else
			{
				saveFile = new File("SavedChatText.txt");
			}
			FileWriter saveFileWriter = new FileWriter(saveFile);
			saveFileWriter.write(contents);
			saveFileWriter.close();
			JOptionPane.showMessageDialog(baseController.getBaseFrame(), "Chat saved successfully as " + saveFile +" !" );
		}
		catch(IOException error)
		{
			baseController.handleErrors(error);
		}
	}
	
//	public static String readFile(ChatController baseController, String fileName)
//	{
//		
//	}
}
