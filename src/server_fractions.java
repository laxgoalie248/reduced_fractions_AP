public class server_fractions {
	
	private int num, den;
	private int smaller, larger;
	private int gcfNum;
	
	public server_fractions()
	{
		num = 0;
		den = 0;
		smaller = 0;
		larger = 0;
	}
	
	public void setNum(int numerator1, int numerator2)
	{
		num = numerator1 * numerator2;
	}
	
	public void setDen(int denominator1, int denominator2)
	{
		den = denominator1 * denominator2;
	}
	
	public void setLandS()
	{
		if (num > den)
		{
			larger = num;
			smaller = den;
		}
		else if (den > num)
		{
			larger = den;
			smaller = num;
		}
		else if (num == den)
		{
			num = 1;
			den = 1;
		}
	}
	
	public void GCF()
	{
		boolean gcf;
		gcf = false;
		
		while (gcf == false && smaller > 1)
		{
			if (larger % smaller == 0 || (larger / smaller == (larger % smaller)))
			{
				gcfNum = larger / smaller;
				gcf = true;
			}
			else
				smaller--;
		}
	}
	
	public void reduce()
	{
		if (gcfNum > 0)
		{
			num = num / gcfNum;
			den = den / gcfNum;
		}
		
	}
	
	public int getNum()
	{
		return num;
	}
	
	public int getDen()
	{
		return den;
	}
	
	public void reset()
	{
		num = 0;
		den = 0;
		smaller = 0;
		larger = 0;
	}

}
