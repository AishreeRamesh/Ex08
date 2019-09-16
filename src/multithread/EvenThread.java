/***
* EXPERIMENT-08
*developed by Nithishkumar
*Saveetha Engineering College
*jpnithishkumar@gmail.com
*/
package multithread;

public class EvenThread extends Thread {
		
	public void run()
	{
		
		try
		{
			System.out.println("First thread started...");
			while(true)
			{
				synchronized(MainThread.RandomValue)
				{
					if(MainThread.RandomValue%2==0&&MainThread.RandomValue!=-1)
					{
						System.out.println("Value is Even Number");
						System.out.println("Answer="+(MainThread.RandomValue*MainThread.RandomValue));
						MainThread.RandomValue=-1;
					}
				}
			
				Thread.sleep(2000);
			}
		}catch(InterruptedException ex)
		{
			System.out.println("Error:"+ex);
		}
		
	}
}
