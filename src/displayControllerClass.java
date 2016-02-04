
public class displayControllerClass {

	
	@SuppressWarnings("unused")
	public String controllerCheck(int speed, int gearDown, int altitude, int time){ 
		Boolean gearNotDownAlarm = false;
		Boolean gearAirSpeedAlarm = false;
		Boolean airBreakWarning = false;
		Boolean gearOverrideWarning  = false;
		Boolean gearUpCommand = false;
		String alarmOutput ;
		
		if(speed > 400 && gearDown == 1 && time < 60){ // scenario 1
			gearNotDownAlarm = false;
			gearAirSpeedAlarm = true;
			airBreakWarning = true;
			gearOverrideWarning  = true;
			gearUpCommand = true;
			alarmOutput = "ftttt" ;		
		}
		
		else if(speed >= 250 && gearDown == 0 && time < 60){ // scenario 2
			gearNotDownAlarm = true;
			gearAirSpeedAlarm = false;
			airBreakWarning = true;
			gearOverrideWarning  = false;
			gearUpCommand = false;
			alarmOutput = "tftff" ;		
		}
		
		else if(speed > 400 && gearDown == 1 && time >= 60){ // scenario 3
			gearNotDownAlarm = false;
			gearAirSpeedAlarm = true;
			airBreakWarning = false;
			gearOverrideWarning  = true;
			gearUpCommand = true;
			alarmOutput = "ftftt" ;		
		}
		
		else if((gearDown == 0 && (time >= 60) && time <=120) || 
					(speed < 250 && gearDown == 0 && altitude < 1000) ||
					(speed < 250 && gearDown == 0 && altitude >= 1000 && time < 60) ||
					(speed >= 250 && gearDown == 0 && altitude < 1000 && time > 120 )){ // scenario 4
			
			gearNotDownAlarm = true;
			gearAirSpeedAlarm = false;
			airBreakWarning = false;
			gearOverrideWarning  = false;
			gearUpCommand = false;
			alarmOutput = "tffff" ;		
		}
		
		else if((speed >= 301 && speed <= 400)&& gearDown == 1 && time < 60){ // scenario 6
			gearNotDownAlarm = false;
			gearAirSpeedAlarm = true;
			airBreakWarning = true;
			gearOverrideWarning  = false;
			gearUpCommand = false;
			alarmOutput = "fttff" ;		
		}
		
		else if((speed >= 301 && speed <= 400)&& gearDown == 1 && time >= 60){ // scenario 7
			gearNotDownAlarm = false;
			gearAirSpeedAlarm = true;
			airBreakWarning = false;
			gearOverrideWarning  = false;
			gearUpCommand = false;
			alarmOutput = "ftfff" ;		
		}
		
		else if((speed >= 250 && speed <= 300)&& gearDown == 1 && time < 60){ // scenario 8
			gearNotDownAlarm = false;
			gearAirSpeedAlarm = false;
			airBreakWarning = true;
			gearOverrideWarning  = false;
			gearUpCommand = false;
			alarmOutput = "fftff" ;		
		}
		
		else
			alarmOutput = "fffff" ;
				
		return alarmOutput;
	}
	

	
}
