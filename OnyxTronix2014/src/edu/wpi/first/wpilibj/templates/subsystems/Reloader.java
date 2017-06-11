/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author nimrod
 */
public class Reloader extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private final Talon motor1 = RobotMap.realoderMotor1;
    private final Talon motor2 = RobotMap.realoderMotor2;
    public static final double reloadSpeed = 1;
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setMotors(double speed) {
        motor1.set(speed);
        motor2.set(speed);
    }
}
