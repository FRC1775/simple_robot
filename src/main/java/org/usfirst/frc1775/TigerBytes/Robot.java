package org.usfirst.frc1775.TigerBytes;


import org.usfirst.frc1775.TigerBytes.commands.GyroLogger;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	public static Command cmd;

	public void robotInit() {
		cmd = new GyroLogger();
	};
	
	@Override
	public void teleopInit() { 
		cmd.start(); 
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().enable();
		Scheduler.getInstance().run();
	}
}
