class Emi
{
	public static void main(String[] args)
	{
		long principal=100000l;
		float roi=22.0f;
		roi=roi/(12*100);
		int time=2;
		int numberofmonths=time*12;
		double emi;
		emi=(principal*roi*Math.pow(1+roi,numberofmonths))/(Math.pow(1+roi,time)-1);
		System.out.println("The EMI is:"+emi);
		
		//Implicit type casting
		int time1=1;
		time=time1;
		System.out.println("After implicit of time in int:"+time1);
		
		//Explicit type casting
		short principal1=(short)principal;
		System.out.println("After explicit of principal in long:"+principal1);
	}
}