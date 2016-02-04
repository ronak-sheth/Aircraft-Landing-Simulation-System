import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


@SuppressWarnings("unused")
public class displayControllerClassTest {

	@Test
	public void testControllerCheck() throws InterruptedException {
		//fail("Not yet implemented");
		
		String value ;
		displayControllerClass checkTestCases = new displayControllerClass();
		GUI gui = new GUI();
		
		//scenario 1
		value = checkTestCases.controllerCheck(401, 1, 1000, 59);
		assertEquals("ftttt", value);
		gui.main(401, 1, 1000, 59, false, true, true, true, true, 1 );
		Thread.sleep(5000);
		
		//scenario 2
		value = checkTestCases.controllerCheck(401, 0, 1000, 59);
		assertEquals("tftff",value);
		gui.main(401, 0, 1000, 59, true, false, true, false, false, 2 );
		Thread.sleep(5000);
		
		//scenario 3
		value = checkTestCases.controllerCheck(401, 1, 999, 121);
		assertEquals("ftftt",value);
		gui.main(401, 1, 999, 121, false, true, false, true, true, 3 );
		Thread.sleep(5000);
		
		//scenario 4
		value = checkTestCases.controllerCheck(401, 0, 1000, 120);
		assertEquals("tffff",value);
		gui.main(401, 0, 1000, 120, true, false, false, false, false, 4 );
		Thread.sleep(5000);
		
		//scenario 5
		value = checkTestCases.controllerCheck(401, 0, 1000, 121);
		assertEquals("fffff" ,value);
		gui.main(401, 0, 1000, 121, false, false, false, false, false, 5 );
		Thread.sleep(5000);
		
		//scenario 6
		value = checkTestCases.controllerCheck(400, 1, 999, 59);
		assertEquals("fttff",value);
		gui.main(401, 1, 999, 59, false, true, true, false, false, 6 );
		Thread.sleep(5000);
		
		//scenario 7
		value = checkTestCases.controllerCheck(400, 1, 999, 120);
		assertEquals("ftfff",value);
		gui.main(401, 1, 999, 120, false, true, false, false, false, 7 );
		Thread.sleep(5000);
		
		//scenario 8
		value = checkTestCases.controllerCheck(300, 1, 999, 59);
		assertEquals("fftff",value);
		gui.main(300, 1, 999, 59, false, false, true, false, false, 8 );
		Thread.sleep(5000);
	
	}

}
