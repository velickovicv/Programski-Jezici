package korespondencija;
import java.io.*;

public class Mejl implements IPoruka, Comperable<IPoruka>{

	private String adresaPrimaoca;
	private String textPoruke;
	
	
	public Mejl(String _adresaPrimaoca, String _textPoruke)
	{
		this.adresaPrimaoca = _adresaPrimaoca;
		this.textPoruke = _textPoruke;
	}
	
	public int validiraj()
	{
		if(!adresaPrimaoca.contains("@"))
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
			
			try
			{
				FileWriter fr = new FileWriter(adresaPrimaoca.split("@")[0] + ".txt");
				BufferedReader br = new BufferedWriter(fr);
			    br.write(textPoruke);
			    br.close();
				
			}
			catch(IOException izuzetak)
			{
				System.out.println("Doslo je do izuzetka: " + izuzetak);
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
