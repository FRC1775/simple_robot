package org.usfirst.frc1775.TigerBytes.commands;

import java.text.DecimalFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.usfirst.frc1775.TigerBytes.Robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class GyroLogger extends Command {
	private ADXRS450_Gyro gyro;
	private DecimalFormat formatter;
	private static final Logger log4j = LogManager.getLogger(Robot.class.getName());
	
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
		log4j.info(formatter.format(angle));
		Timer.delay(.5);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
};
