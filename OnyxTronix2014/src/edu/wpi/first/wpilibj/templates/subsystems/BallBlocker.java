/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.MoveBallBlockerByAxis;

/**
 *
 * @author nimrod
 */
public class BallBlocker extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Talon motor = RobotMap.ballBlockerMotor;
    public double sensitivity = 0.3;
    public void initDefaultCommand() {
        setDefaultCommand(new MoveBallBlockerByAxis());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    double speed;
    public void setMotorByAxis(Joystick stick) {
        speed = stick.getRawAxis(3);
        if(Math.abs(speed) > sensitivity) {
            motor.set(speed);
        } else {
            motor.set(speed);
        }
    }
}
