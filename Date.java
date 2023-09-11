class Date
{
	public static void main(String args[])
	{
		int d=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		int totalDays=0;
		String day="";
		int n=(m-1)/2;
		if(m%2==1)
			totalDays=(n+1)*31+(n-1)*30+d;
		else
			totalDays=(n+1)*31+(n)*30+d;
		if(m==1)
			totalDays=d;
		if(m>2)
		{
			totalDays=totalDays-2;	
		}
		int rem=totalDays%7;
		if(rem==0)
			day=day+"saturday";
		if(rem==1)
			day=day+"sunday";
		if(rem==2)
			day=day+"monday";
		if(rem==3)
			day=day+"tuesday";
		if(rem==4)
			day=day+"wednesday";
		if(rem==5)
			day=day+"thursday";
		if(rem==6)
			day=day+"friday";
		System.out.println("day:"+day);
	}
}