import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;


public class GUI {

	private JFrame frame;
	private JTextField txtDisplayScenario;
	private JTextField txtPilot;
	private JTextField txtCopilot;
	private JTextField pilotAltitude;
	private JTextField pilotSpeed;
	private JTextField pilotTime;
	private JTextField copilotAltitude;
	private JTextField copilotSpeed;
	private JTextField copilotTime;
	private JTextField txtAltitudePilot;
	private JTextField txtSpeedPilot;
	private JTextField txtTimePilot;
	private JTextField txtAltitudeCopilot;
	private JTextField txtTimeCopilot;
	private JTextField txtSpeedCopilot;
	private JTextField txtAlarmsAndWarnings;
	private JTextField txtGearNotDown;
	private JTextField txtAirBreakWarning;
	private JTextField txtGearAirSpeed;
	private JTextField txtGearOverrideWarning;
	private JTextField txtGearUpCommand;
	private JTextField txtSpeaker;
	private JTextField txtAircraftLandingSimulation;
	private JTextField pilotGearStatus;
	private JTextField copilotGearStatus;

	/**
	 * Launch the application.
	 */
	public void main(int speed, int gearDown, int altitude, int time, Boolean gearNotDownAlarm, 
				Boolean gearAirSpeedAlarm, Boolean airBreakWarning, Boolean gearOverrideWarning, 
				Boolean gearUpCommand, int scenarioNumber) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.pilotSpeed.setText(Integer.toString(speed));
					window.pilotAltitude.setText(Integer.toString(altitude));
					window.pilotTime.setText(Integer.toString(time));
					window.copilotSpeed.setText(Integer.toString(speed));
					window.copilotAltitude.setText(Integer.toString(altitude));
					window.copilotTime.setText(Integer.toString(time));
					window.txtDisplayScenario.setText("Display Scenario " + scenarioNumber);
					
					if(gearNotDownAlarm == false && gearAirSpeedAlarm == true && airBreakWarning == true 
							&&	gearOverrideWarning == true && gearUpCommand == true) { //1
						
						window.txtGearAirSpeed.setForeground(Color.WHITE);
						window.txtGearAirSpeed.setBackground(Color.RED);
						
						window.txtAirBreakWarning.setForeground(Color.BLACK);
						window.txtAirBreakWarning.setBackground(Color.YELLOW);
						
						window.txtGearOverrideWarning.setForeground(Color.BLACK);
						window.txtGearOverrideWarning.setBackground(Color.YELLOW);
						
						window.txtGearUpCommand.setForeground(Color.WHITE);
						window.txtGearUpCommand.setBackground(Color.RED);
						
						window.txtSpeaker.setForeground(Color.WHITE);
						window.txtSpeaker.setBackground(Color.RED);
						
						window.pilotGearStatus.setText("Gear Down");
						window.copilotGearStatus.setText("Gear Down");
					}
					
					else if(gearNotDownAlarm == true && gearAirSpeedAlarm == false && airBreakWarning == true 
							&&	gearOverrideWarning == false && gearUpCommand == false){ //2
						
						window.txtGearNotDown.setForeground(Color.WHITE);
						window.txtGearNotDown.setBackground(Color.RED);
						
						window.txtAirBreakWarning.setForeground(Color.BLACK);
						window.txtAirBreakWarning.setBackground(Color.YELLOW);
						
						window.txtSpeaker.setForeground(Color.WHITE);
						window.txtSpeaker.setBackground(Color.RED);
						
						window.pilotGearStatus.setText("Gear Up");
						window.copilotGearStatus.setText("Gear Up");
												
					}
						
					
					else if(gearNotDownAlarm == false && gearAirSpeedAlarm == true && airBreakWarning == false 
							&&	gearOverrideWarning == true && gearUpCommand == true) {//3
						
						window.txtGearAirSpeed.setForeground(Color.WHITE);
						window.txtGearAirSpeed.setBackground(Color.RED);
						
						window.txtSpeaker.setForeground(Color.WHITE);
						window.txtSpeaker.setBackground(Color.RED);
										
						window.txtGearOverrideWarning.setForeground(Color.BLACK);
						window.txtGearOverrideWarning.setBackground(Color.YELLOW);
						
						window.txtGearUpCommand.setForeground(Color.WHITE);
						window.txtGearUpCommand.setBackground(Color.RED);
						
						window.pilotGearStatus.setText("Gear Down");
						window.copilotGearStatus.setText("Gear Down");
						
					}
					
					else if(gearNotDownAlarm == true && gearAirSpeedAlarm == false && airBreakWarning == false 
							&&	gearOverrideWarning == false && gearUpCommand == false){ //4
						
						window.txtGearNotDown.setForeground(Color.WHITE);
						window.txtGearNotDown.setBackground(Color.RED);
						
						window.txtSpeaker.setForeground(Color.WHITE);
						window.txtSpeaker.setBackground(Color.RED);
						
						window.pilotGearStatus.setText("Gear Up");
						window.copilotGearStatus.setText("Gear Up");
									
					}
									
					else if(gearNotDownAlarm == false && gearAirSpeedAlarm == true && airBreakWarning == true 
							&&	gearOverrideWarning == false && gearUpCommand == false){ //6
						
						window.txtGearAirSpeed.setForeground(Color.WHITE);
						window.txtGearAirSpeed.setBackground(Color.RED);
						
						window.txtAirBreakWarning.setForeground(Color.BLACK);
						window.txtAirBreakWarning.setBackground(Color.YELLOW);
						
						window.txtSpeaker.setForeground(Color.WHITE);
						window.txtSpeaker.setBackground(Color.RED);
						
						window.pilotGearStatus.setText("Gear Down");
						window.copilotGearStatus.setText("Gear Down");
						
					}
				
					
					else if(gearNotDownAlarm == false && gearAirSpeedAlarm == true && airBreakWarning == false 
							&&	gearOverrideWarning == false && gearUpCommand == false){ //7
					
						window.txtGearAirSpeed.setForeground(Color.WHITE);
						window.txtGearAirSpeed.setBackground(Color.RED);
						
						window.txtSpeaker.setForeground(Color.WHITE);
						window.txtSpeaker.setBackground(Color.RED);
						
						window.pilotGearStatus.setText("Gear Down");
						window.copilotGearStatus.setText("Gear Down");
												
					}
					
					else if(gearNotDownAlarm == false && gearAirSpeedAlarm == false && airBreakWarning == true 
							&&	gearOverrideWarning == false && gearUpCommand == false){ //8
					
						window.txtAirBreakWarning.setForeground(Color.BLACK);
						window.txtAirBreakWarning.setBackground(Color.YELLOW);
						
						window.pilotGearStatus.setText("Gear Down");
						window.copilotGearStatus.setText("Gear Down");
						
					}

					else{
						
						window.pilotGearStatus.setText("Gear Up");
						window.copilotGearStatus.setText("Gear Up");
						
					}
										
					window.frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 634, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplayScenario = new JTextField();
		txtDisplayScenario.setBounds(0, 0, 618, 79);
		txtDisplayScenario.setHorizontalAlignment(SwingConstants.CENTER);
		txtDisplayScenario.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		
		txtDisplayScenario.setForeground(Color.WHITE);
		txtDisplayScenario.setBackground(Color.BLACK);
		frame.getContentPane().add(txtDisplayScenario);
		txtDisplayScenario.setColumns(10);
		
		txtPilot = new JTextField();
		txtPilot.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		txtPilot.setText("Pilot");
		txtPilot.setHorizontalAlignment(SwingConstants.CENTER);
		txtPilot.setBounds(93, 108, 86, 20);
		frame.getContentPane().add(txtPilot);
		txtPilot.setColumns(10);
		
		txtCopilot = new JTextField();
		txtCopilot.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		txtCopilot.setHorizontalAlignment(SwingConstants.CENTER);
		txtCopilot.setText("Co-Pilot");
		txtCopilot.setBounds(433, 109, 86, 20);
		frame.getContentPane().add(txtCopilot);
		txtCopilot.setColumns(10);
		
		pilotAltitude = new JTextField();
		pilotAltitude.setHorizontalAlignment(SwingConstants.CENTER);
		pilotAltitude.setBounds(28, 156, 51, 20);
		frame.getContentPane().add(pilotAltitude);
		pilotAltitude.setColumns(10);
		
		pilotSpeed = new JTextField();
		pilotSpeed.setHorizontalAlignment(SwingConstants.CENTER);
		pilotSpeed.setColumns(10);
		pilotSpeed.setBounds(116, 156, 51, 20);
		frame.getContentPane().add(pilotSpeed);
		
		pilotTime = new JTextField();
		pilotTime.setHorizontalAlignment(SwingConstants.CENTER);
		pilotTime.setColumns(10);
		pilotTime.setBounds(197, 156, 51, 20);
		frame.getContentPane().add(pilotTime);
		
		copilotAltitude = new JTextField();
		copilotAltitude.setHorizontalAlignment(SwingConstants.CENTER);
		copilotAltitude.setColumns(10);
		copilotAltitude.setBounds(535, 156, 51, 20);
		frame.getContentPane().add(copilotAltitude);
		
		copilotSpeed = new JTextField();
		copilotSpeed.setHorizontalAlignment(SwingConstants.CENTER);
		copilotSpeed.setColumns(10);
		copilotSpeed.setBounds(446, 156, 51, 20);
		frame.getContentPane().add(copilotSpeed);
		
		copilotTime = new JTextField();
		copilotTime.setHorizontalAlignment(SwingConstants.CENTER);
		copilotTime.setColumns(10);
		copilotTime.setBounds(353, 156, 51, 20);
		frame.getContentPane().add(copilotTime);
		
		txtAltitudePilot = new JTextField();
		txtAltitudePilot.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtAltitudePilot.setHorizontalAlignment(SwingConstants.CENTER);
		txtAltitudePilot.setText("Altitude");
		txtAltitudePilot.setBounds(10, 200, 71, 20);
		frame.getContentPane().add(txtAltitudePilot);
		txtAltitudePilot.setColumns(10);
		
		txtSpeedPilot = new JTextField();
		txtSpeedPilot.setText("Speed");
		txtSpeedPilot.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpeedPilot.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtSpeedPilot.setColumns(10);
		txtSpeedPilot.setBounds(108, 200, 71, 20);
		frame.getContentPane().add(txtSpeedPilot);
		
		txtTimePilot = new JTextField();
		txtTimePilot.setText("Time");
		txtTimePilot.setHorizontalAlignment(SwingConstants.CENTER);
		txtTimePilot.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtTimePilot.setColumns(10);
		txtTimePilot.setBounds(193, 200, 71, 20);
		frame.getContentPane().add(txtTimePilot);
		
		txtAltitudeCopilot = new JTextField();
		txtAltitudeCopilot.setText("Altitude");
		txtAltitudeCopilot.setHorizontalAlignment(SwingConstants.CENTER);
		txtAltitudeCopilot.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtAltitudeCopilot.setColumns(10);
		txtAltitudeCopilot.setBounds(535, 200, 71, 20);
		frame.getContentPane().add(txtAltitudeCopilot);
		
		txtTimeCopilot = new JTextField();
		txtTimeCopilot.setText("Time");
		txtTimeCopilot.setHorizontalAlignment(SwingConstants.CENTER);
		txtTimeCopilot.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtTimeCopilot.setColumns(10);
		txtTimeCopilot.setBounds(338, 200, 71, 20);
		frame.getContentPane().add(txtTimeCopilot);
		
		txtSpeedCopilot = new JTextField();
		txtSpeedCopilot.setText("Speed");
		txtSpeedCopilot.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpeedCopilot.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtSpeedCopilot.setColumns(10);
		txtSpeedCopilot.setBounds(437, 200, 71, 20);
		frame.getContentPane().add(txtSpeedCopilot);
		
		txtAlarmsAndWarnings = new JTextField();
		txtAlarmsAndWarnings.setHorizontalAlignment(SwingConstants.CENTER);
		txtAlarmsAndWarnings.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		txtAlarmsAndWarnings.setText("Alarms and Warnings");
		txtAlarmsAndWarnings.setBounds(197, 250, 213, 38);
		frame.getContentPane().add(txtAlarmsAndWarnings);
		txtAlarmsAndWarnings.setColumns(10);
		
		txtGearNotDown = new JTextField();
		txtGearNotDown.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		txtGearNotDown.setText("Gear Not Down Alarm");
		txtGearNotDown.setHorizontalAlignment(SwingConstants.CENTER);
		txtGearNotDown.setBounds(20, 299, 101, 20);
		frame.getContentPane().add(txtGearNotDown);
		txtGearNotDown.setColumns(10);
		
		txtAirBreakWarning = new JTextField();
		txtAirBreakWarning.setText("Air Break Warning");
		txtAirBreakWarning.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		txtAirBreakWarning.setHorizontalAlignment(SwingConstants.CENTER);
		txtAirBreakWarning.setColumns(10);
		txtAirBreakWarning.setBounds(243, 299, 107, 20);
		frame.getContentPane().add(txtAirBreakWarning);
		
		txtGearAirSpeed = new JTextField();
		txtGearAirSpeed.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		txtGearAirSpeed.setText("Gear Air Speed Alarm\r\n");
		txtGearAirSpeed.setHorizontalAlignment(SwingConstants.CENTER);
		txtGearAirSpeed.setColumns(10);
		txtGearAirSpeed.setBounds(131, 299, 101, 20);
		frame.getContentPane().add(txtGearAirSpeed);
		
		txtGearOverrideWarning = new JTextField();
		txtGearOverrideWarning.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		txtGearOverrideWarning.setText("Gear Override Warning");
		txtGearOverrideWarning.setHorizontalAlignment(SwingConstants.CENTER);
		txtGearOverrideWarning.setColumns(10);
		txtGearOverrideWarning.setBounds(373, 299, 107, 20);
		frame.getContentPane().add(txtGearOverrideWarning);
		
		txtGearUpCommand = new JTextField();
		txtGearUpCommand.setText("Gear Up Command");
		txtGearUpCommand.setHorizontalAlignment(SwingConstants.CENTER);
		txtGearUpCommand.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		txtGearUpCommand.setColumns(10);
		txtGearUpCommand.setBounds(490, 299, 104, 20);
		frame.getContentPane().add(txtGearUpCommand);
		
		txtSpeaker = new JTextField();
		txtSpeaker.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpeaker.setText("Speaker");
		txtSpeaker.setBounds(230, 90, 137, 49);
		frame.getContentPane().add(txtSpeaker);
		txtSpeaker.setColumns(10);
		
		txtAircraftLandingSimulation = new JTextField();
		txtAircraftLandingSimulation.setText("Aircraft Landing Simulation System");
		txtAircraftLandingSimulation.setHorizontalAlignment(SwingConstants.CENTER);
		txtAircraftLandingSimulation.setForeground(Color.WHITE);
		txtAircraftLandingSimulation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		txtAircraftLandingSimulation.setColumns(10);
		txtAircraftLandingSimulation.setBackground(Color.BLACK);
		txtAircraftLandingSimulation.setBounds(0, 330, 618, 78);
		frame.getContentPane().add(txtAircraftLandingSimulation);
		
		pilotGearStatus = new JTextField();
		pilotGearStatus.setHorizontalAlignment(SwingConstants.CENTER);
		pilotGearStatus.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pilotGearStatus.setBounds(35, 259, 86, 20);
		frame.getContentPane().add(pilotGearStatus);
		pilotGearStatus.setColumns(10);
		
		copilotGearStatus = new JTextField();
		copilotGearStatus.setHorizontalAlignment(SwingConstants.CENTER);
		copilotGearStatus.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		copilotGearStatus.setColumns(10);
		copilotGearStatus.setBounds(490, 259, 86, 20);
		frame.getContentPane().add(copilotGearStatus);
	}
}
