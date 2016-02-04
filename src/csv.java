import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class csv {

	
	public int[][] valueMatrix() {
		
		int[][] array = new int[37][9];
		Scanner in = null;
		try {
			//File file = new File("D:\\eclipse\\workspace\\Part3_Testing\\src\\testValues");
			File file = new File("testValues");
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		while (in.hasNextInt()){
					for (int i=0;i<37;i++){
		                
						for (int j=0;j<9;j++)
		                    array[i][j]= in.nextInt();
		    			
					}
				}
		in.close();
		return array;
		
	}

}
