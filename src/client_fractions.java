import TerminalIO.KeyboardReader;
public class client_fractions {
	public static void main(String[] args)
	{
		
		KeyboardReader reader = new KeyboardReader();
		server_fractions server = new server_fractions();
		
		int numerator1, numerator2, denominator1, denominator2;
		int exit = -1;
		int exit1 = -1;
		numerator1 = 1;
		numerator2 = 1;
		denominator1 = 1;
		denominator2 = 1;
		
		while (exit == -1)
		{
			while (exit1 == -1)
			{
				System.out.println("Please input your numerator for the first fraction.");
				numerator1 = reader.readInt();
				
				if (numerator1 != 0)
					exit1 = 0;
				else
					System.out.println("Please reinput your numerator.");
			}
			
			exit1 = -1;
			
			System.out.println("Please input your denominator for the first fraction.");
			denominator1 = reader.readInt();
			
			while (exit1 == -1)
			{
				System.out.println("Please input your numerator for the second fraction.");
				numerator2 = reader.readInt();
				
				if (numerator2 != 0)
					exit1 = 0;
				else 
					System.out.println("Please reinput your numerator.");
			}
			
			System.out.println("Please input your denominator for the second fraction.");
			denominator2 = reader.readInt();
			
			server.setNum(numerator1, numerator2);
			server.setDen(denominator1, denominator2);
			
			server.setLandS();
			
			server.GCF();
			
			server.reduce();
			
			System.out.println("The reduced product of your fraction is " + server.getNum() + "/" + server.getDen());
			
			System.out.println("Would you like to repeat the program? Enter -1 to continue or -2 to exit.");
			exit = reader.readInt();
			
			
			
		}
		
		
	}

}
