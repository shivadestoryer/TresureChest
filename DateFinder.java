package mypog;
import java.util.Scanner;

public class DateFinder {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		int date=sc.nextInt();
		int year=sc.nextInt();
		int sum;
		int century;
		int yr;
		int day;
		System.out.println("enter date is  "+month+"/"+date+"/"+year);
		if(month<=12)
		{
			
		if(month==1)
		{
			sum=date+1;
			System.out.println(sum);
			century=year/100;
			if(century==20)
			{
				sum=sum+6;
				System.out.println(sum);
				yr=year-2000;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
			else if(century==19)
			{
				sum=sum+0;
				System.out.println(sum);
				yr=year-1900;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
			
		}
		 if(month==2)
		{
			sum=date+4;
			System.out.println(sum);
			century=year/100;
			if(century==20)
			{
				sum=sum+6;
				System.out.println(sum);
				yr=year-2000;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
				
			}
			else if(century==19)
			{
				sum=sum+0;
				System.out.println(sum);
				yr=year-1900;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
		}
		 if(month==3)
		{
			sum=date+4;
			System.out.println(sum);
			century=year/100;
			if(century==20)
			{
				sum=sum+6;
				System.out.println(sum);
				yr=year-2000;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
			else if(century==19)
			{
				sum=sum+0;
				System.out.println(sum);
				yr=year-1900;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
		}
		 if(month==4)
		{
			sum=date+0;
			System.out.println(sum);
			century=year/100;
			if(century==20)
			{
				sum=sum+6;
				System.out.println(sum);
				yr=year-2000;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
			else if(century==19)
			{
				sum=sum+0;
				System.out.println(sum);
				yr=year-1900;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
		}
		 if(month==5)
		{
			sum=date+2;
			System.out.println(sum);
			century=year/100;
			if(century==20)
			{
				sum=sum+6;
				System.out.println(sum);
				yr=year-2000;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
			else if(century==19)
			{
				sum=sum+0;
				System.out.println(sum);
				yr=year-1900;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
		}
		 if(month==6)
		{
			sum=date+5;
			System.out.println(sum);
			century=year/100;
			if(century==20)
			{
				sum=sum+6;
				System.out.println(sum);
				yr=year-2000;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
			else if(century==19)
			{
				sum=sum+0;
				System.out.println(sum);
				yr=year-1900;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
		}
		 if(month==7)
		{
			sum=date+0;
			System.out.println(sum);
			century=year/100;
			if(century==20)
			{
				sum=sum+6;
				System.out.println(sum);
				yr=year-2000;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
			else if(century==19)
			{
				sum=sum+0;
				System.out.println(sum);
				yr=year-1900;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
		}
		 if(month==8)
		{
			sum=date+3;
			System.out.println(sum);
			century=year/100;
			if(century==20)
			{
				sum=sum+6;
				System.out.println(sum);
				yr=year-2000;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
			else if(century==19)
			{
				sum=sum+0;
				System.out.println(sum);
				yr=year-1900;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
		}
		 if(month==9)
		{
			sum=date+6;
			System.out.println(sum);
			century=year/100;
			if(century==20)
			{
				sum=sum+6;
				System.out.println(sum);
				yr=year-2000;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
			else if(century==19)
			{
				sum=sum+0;
				System.out.println(sum);
				yr=year-1900;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
		}
		 if(month==10)
		{
			sum=date+1;
			System.out.println(sum);
			century=year/100;
			if(century==20)
			{
				sum=sum+6;
				System.out.println(sum);
				yr=year-2000;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
			else if(century==19)
			{
				sum=sum+0;
				System.out.println(sum);
				yr=year-1900;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
		}
		 if(month==11)
		{
			sum=date+4;
			System.out.println(sum);
			century=year/100;
			if(century==20)
			{
				sum=sum+6;
				System.out.println(sum);
				yr=year-2000;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
			else if(century==19)
			{
				sum=sum+0;
				System.out.println(sum);
				yr=year-1900;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
		}
		 if(month==12)
		{
			sum=date+4;
			System.out.println(sum);
			century=year/100;
			if(century==20)
			{
				sum=sum+6;
				System.out.println(sum);
				yr=year-2000;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
			else if(century==19)
			{
				sum=sum+0;
				System.out.println(sum);
				yr=year-1900;
				sum=sum+yr;
				System.out.println(sum);
				yr=yr/4;
				sum=sum+yr;
				System.out.println(sum);
				day=sum%7;
				System.out.println(day);
				if(day==0)
				{
					System.out.println("Its Saturday");
				}
				if(day==1)
				{
					System.out.println("Its Sunday");
				}
				if(day==2)
				{
					System.out.println("Its Monday");
				}
				if(day==3)
				{
					System.out.println("Its Tuesday");
				}
				if(day==4)
				{
					System.out.println("Its Wednesday");
				}
				if(day==5)
				{
					System.out.println("Its Thursday");
				}
				if(day==6)
				{
					System.out.println("Its Friday");
				}
				
			}
		}
		
		
		
		
		
		
		
		sc.close();
	}
	

	}
}
