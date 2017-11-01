package org.usfirst.frc1775.TigerBytes;

import java.text.DecimalFormat;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

//import org.apache.logging.log4j.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
//	private static final Logger log4j = LogManager.getLogger("TigerBot");

	private ADXRS450_Gyro gyro;
	private DecimalFormat formatter;
	/**
	 * This function is run when the robot is first started up and should be used
	 * for any initialization code.
	 */
	@Override
	public void robotInit() {
			
        formatter = new DecimalFormat("#0.00");
		gyro = new ADXRS450_Gyro();
		gyro.reset();
		
        double angle = 0;
        while (true) {
    		angle = gyro.getAngle();
			System.out.println(formatter.format(angle));
			Timer.delay(.5);
        }
	};
}
