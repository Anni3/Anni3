import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class BusinessSearch {
	
	
	public static void main (String [] args){
	
		ArrayList <BusinessRecord> Biz = new ArrayList<BusinessRecord>();
		
		/*load file*/
		if(args.length != 2) throw new IllegalArgumentException("Must enter text file name");
		try{
			Scanner fileInput = new Scanner (new FileReader(args[0]));
		
		/*read through file*/
		int numOfBiz = fileInput.nextInt();
		/*Business [] Biz = new Business[numOfBiz-1];*/
		
		//load businesses from the file into ArrayList
		
		int x=0;
		while(x < numOfBiz)
		{
			String line = fileInput.nextLine();
			String [] ar = line.split(",");
			
			BusinessRecord tempBiz = new BusinessRecord(); 
			tempBiz.BizName = ar[0];
			tempBiz.BizNumber = ar[1];
			Biz.add(tempBiz);
		}
		/*Sort*/
		
		
	} 
	catch (FileNotFoundException e){
		System.out.println("FILE NOT FOUND");
	}
	catch (IOException e){
		System.out.println("CANNOT READ FROM FILE");
	}
		
}
}
