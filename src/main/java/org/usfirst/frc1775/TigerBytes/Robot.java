package org.usfirst.frc1775.TigerBytes;

import java.text.DecimalFormat;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

//import org.apache.logging.log4j.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
//	private static final Logger log4j = LogManager.getLogger(Robot.class.getName());
	public static Command cmd;

	/**
	 * This function is run when the robot is first started up and should be used
	 * for any initialization code.
	 */
	public void robotInit() {
		cmd = new Command() {
			private ADXRS450_Gyro gyro;
			private DecimalFormat formatter;
			
			@Override
			protected void initialize() {
		        formatter = new DecimalFormat("#0.00");
				gyro = new ADXRS450_Gyro();
				gyro.reset();
			}

			@Override
			protected void execute() {
		        double angle = 0;
		    	angle = gyro.getAngle();
//		    	log4j.info(...);
	    		System.out.println(formatter.format(angle));
				Timer.delay(.5);
			}

			@Override
			protected boolean isFinished() {
				return false;
			}
		};
	};
	
	@Override
	public void teleopInit() { 
		cmd.start(); 
	}

	@Override
	public void teleopPeriodic() {
//		log4j.info(("This is an info message.");
		Scheduler.getInstance().enable();
		Scheduler.getInstance().run();
	}
}
