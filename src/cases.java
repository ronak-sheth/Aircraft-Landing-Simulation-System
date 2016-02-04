
public class cases {

	public static void main(String[] args) {
		
		int speed;
		int gearDown;	// 1 = Gear Down yes
		int altitude;
		int time;
		int count = 0;
		int temp;
		
		csv val = new csv();
		
		int[][] valueArray = new int[37][9];
		valueArray = val.valueMatrix();
		
		for (int i=0;i<37;i++){
			
			  speed = valueArray[i][0];
			  gearDown = valueArray[i][1];
			  altitude = valueArray[i][2];
			  time = valueArray[i][3];
			  temp = testCombinations(speed , gearDown, altitude, time,i);
			  
			  if(temp == 1)
				  count++;
		}
		
		System.out.println("Number of test cases passed: " + count);
		System.out.println("Number of test cases failed: " + (37 -count));
		

	}
	
	private static int testCombinations(int speed, int gearDown, int altitude,
			int time, int i) {
		
		if(speed > 400 && gearDown == 1 && time < 60) 	//1 
			return 1;
		
		else if (speed > 400 && gearDown == 0 && time < 60)	//2
			return 1;
	
		else if ((speed >=301  && speed <= 400) && gearDown == 0 && time < 60)	//3
			return 1;
		
		else if ((speed >=250  && speed <= 300) && gearDown == 0 && time < 60)	//4
			return 1;
		
		else if (speed > 400 && gearDown == 1 && time > 120)	//5
			return 1;
		
		else if (speed > 400 && gearDown == 1 && (time >= 60 && time <= 120))	//6
			return 1;
		
		else if (speed > 400 && gearDown == 0 && altitude >= 1000 
				&& (time >= 60 && time <= 120))	//7
			return 1;
		
		else if (speed > 400 && gearDown == 0 && altitude < 1000 && time > 120)	//8
			return 1;
		
		else if ((speed >=301  && speed <= 400) && gearDown == 0 && altitude < 1000 
				&& (time >= 60 && time <= 120))	//9
			return 1;
		
		else if ((speed >=301  && speed <= 400) && gearDown == 0 && altitude < 1000 
				&& time > 120)	//10
			return 1;
		
		else if ((speed >=250  && speed <= 300) && gearDown == 0 && altitude < 1000 
				&& (time >= 60 && time <= 120))	//11
			return 1;
		
		else if ((speed >=250  && speed <= 300) && gearDown == 0 && altitude < 1000 
				&& time > 120)	//12
			return 1;
		
		else if (speed < 250 && gearDown == 0 && altitude < 1000 
				&& time < 60)	//13
			return 1;
		
		else if (speed < 250 && gearDown == 0 && altitude < 1000 
				&& time > 120)	//14
			return 1;
		
		else if ((speed >=301  && speed <= 400) && gearDown == 1 && time < 60)	//15
			return 1;
		
		else if ((speed >=301  && speed <= 400) && gearDown == 1 
				&& (time >= 60 && time <= 120))	//16
			return 1;
		
		else if ((speed >=301  && speed <= 400) && gearDown == 1 
				&& time > 120)	//17
			return 1;
		
		else if ((speed >=250  && speed <= 300) && gearDown == 1 
				&& time < 60)	//18
			return 1;
			
		else if (speed > 400 && gearDown == 0 && altitude >= 1000 
				&& time > 120)	//19
			return 1;
		
		else{
			System.out.println(i);
			return 0;
		}
		

	}

}
