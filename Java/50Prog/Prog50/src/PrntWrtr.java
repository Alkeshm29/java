import java.io.PrintWriter;

public class PrntWrtr {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Method 1");

		PrintWriter writer = new PrintWriter(System.out);
        writer.println("Method 2");
        //writer.flush();
        writer.close();
	}

}
