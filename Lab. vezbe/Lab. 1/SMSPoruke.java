package korespondencija;
import java.io.*;

public class SMSPoruke implements IPoruka, Comperable<IPoruka>{

	private String textPoruke;
	private String brojTelefona;
	
	
	public SMSPoruke(String _textPoruke, String _brojTelefona) 
	{
		this.textPoruke = _textPoruke;
		this.brojTelefona = _brojTelefona;
	}
	
	public int validiraj() {
		
		if(brojTelefona.length() < 9)
		{
			return -1;
		}
		else
		{
			return textPoruke.length();
		}
		
	}
	
	public void ispisi()
	{
		System.out.println(textPoruke);
	}
	
	public void arhiviraj()
	{
		FileWriter f;
		
		try 
		{
			f = new FileWriter(textPoruke);
			BufferedWriter b = new BufferedWriter(f);
			
			b.write(brojTelefona);

			b.close();
		}
		catch(IOException izuzetak)
		{
			System.out.println("Doslo je do izuzetka:" + izuzetak);
		}
		
		public int compareTo(IPoruka o) {
			if(this.textPoruke.length() < o.validiraj())
				return -1;
			else if (this.textPoruke.length() == o.validiraj())
				return 0;
			return 1;
		}
		
		}
	}
}
