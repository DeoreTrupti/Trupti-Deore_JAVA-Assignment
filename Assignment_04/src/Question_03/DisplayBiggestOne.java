package Question_03;

	import java.io.*;
	import java.util.*;

	public class DisplayBiggestOne
	{
		BufferedReader br;
		private ArrayList<Double> doubles=new ArrayList<>();
		
		public DisplayBiggestOne()
		{
		init();	
		}
		
		void init()
		{
			try {
				double doubleValue;
				br= new BufferedReader(new FileReader(new File("/Users/trupti/Documents/java Harman/Assignment_04/src/Question_03/DATA.txt")));
				String str = null;
				while ((str = br.readLine()) != null) {
				doubleValue=Double.parseDouble(str);
				doubles.add(doubleValue);
				}
				
				double biggestOne = 0;
				for(int i=1;i<doubles.size();i++)
				{
					biggestOne=doubles.get(0);
					if(biggestOne<=doubles.get(i))	biggestOne=doubles.get(i);
				}
				System.out.println("Biggest One : "+biggestOne);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			
		}
	}
