package korespondencija;
import java.util.*;
import java.io.*;

public class Chat implements IPoruka, Comparable<IPoruka> {

	private String textPoruke;
	private String usernamePrimaoca;
	
	
	public Chat(String _textPoruke, String _usernamePrimaoca)
	{
		this.textPoruke = _textPoruke;
		this.usernamePrimaoca = _usernamePrimaoca;
	}
	
	public int validiraj()
	{
		if(textPoruke.length() == 0)
			return -1;
		return textPoruke.length();
	}
	
	public void ispisi()
	{
		System.out.println(textPoruke + ".txt");
	}
	
	public void arhiviraj()
	{
		try 
		{	
			FileWriter fir = new FileWriter(usernamePrimaoca);
			BufferedWriter bir = new BufferedWriter(fir);
			bir.write(textPoruke);
			bir.close();
			
		}
		catch(IOException e)
		{
			System.out.println("Doslo je do izuzetka: " + e);
		}
	}
		
		public int compareTo(IPoruka o)
		{
			if(this.textPoruke.length() < o.validiraj())
				return -1;
			else if(this.textPoruke.length() == o.validiraj())
				return 0;
			return 1;
		}
	}
}
