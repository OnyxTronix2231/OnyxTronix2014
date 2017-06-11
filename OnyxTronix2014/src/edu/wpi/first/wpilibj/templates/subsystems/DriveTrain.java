/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.DriveByJoystick;

/**
 *
 * @author nimrod
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private final Talon left1 = RobotMap.driveMotorLeft1;
    private final Talon left2 = RobotMap.driveMotorRight2;
    private final Talon right1 = RobotMap.driveMotorLeft2;
    private final RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;

    public void initDefaultCommand() {
        setDefaultCommand(new DriveByJoystick());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void arcadeDrive(Joystick stick){
    	robotDrive.arcadeDrive(stick.getRawAxis(2), stick.getRawAxis(4));
    }
    
    public void driveOneMeter(){
        robotDrive.arcadeDrive(0.5, 0);
    }
    
    public void stopMotors() {
        robotDrive.stopMotor();
    }
}
 