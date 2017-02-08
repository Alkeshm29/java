import java.util.Scanner;

public class StopWatch {
		long StartTime = 0,StopTime = 0, Elapsed = 0;
		public void start()
		{
			StartTime = System.currentTimeMillis();
		}
		public void stop()
		{
			StopTime = System.currentTimeMillis();
		}
		public long getElapsedTime()
		{
			Elapsed = (StopTime - StartTime);
			return Elapsed;
		}

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int startChoice,stopChoice;
			StopWatch w = new StopWatch();
			System.out.println("1.Start\n2.Stop");
			startChoice = sc.nextInt();
			w.start();
			System.out.println("Enter 2 for Stop the clock: ");
			stopChoice = sc.nextInt();
			w.stop();
			System.out.println("Elapsed Time-: "+w.getElapsedTime()+" mili Seconds");
		
		}
	}
	

