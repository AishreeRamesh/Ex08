//**developed by HARIHARAN**//
package multithread;

public class FirstThread extends Thread {
		
	public void run()
	{
		
		try
		{
			System.out.println("First thread started...");
			while(true)
			{
				synchronized(MainThread.RandomValue)
				{
					if(MainThread.RandomValue%2==0&&MainThread.RandomValue!=-2)
					{
						System.out.println("THE VALUE IS EVEN");
						System.out.println("Answer="+(MainThread.RandomValue*MainThread.RandomValue));
						MainThread.RandomValue=-2;
					}
				}
			
				Thread.sleep(500);
			}
		}catch(InterruptedException ex)
		{
			System.out.println("Error:"+ex);
		}
		
	}
}
