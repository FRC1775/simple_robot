package org.usfirst.frc1775.TigerBytes;

import java.text.DecimalFormat;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.apache.logging.log4j.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	private static final Logger log4j = LogManager.getLogger(Robot.class.getName());
	public static OI oi;
	public static Subsystem sensors;

	/**
	 * This function is run when the robot is first started up and should be used
	 * for any initialization code.
	 */
	public void robotInit() {
		RobotMap.init();
		sensors = new Subsystem() {
			private final ADXRS450_Gyro gyro = RobotMap.sensorsGyro;

			public void log() {
		        double angle = 0;
		        DecimalFormat f = new DecimalFormat("#0.00");

		        while (true) {
			    		angle = gyro.getAngle();
			    			log4j.info(f.format(angle));
						Timer.delay(.5);
		        }
			}

			@Override
			protected void initDefaultCommand() {
				gyro.reset();
			}
		};

		oi = new OI();
	};

	@Override
	public void teleopPeriodic() {
		log4j.info("This is an info message.");
	}
}
