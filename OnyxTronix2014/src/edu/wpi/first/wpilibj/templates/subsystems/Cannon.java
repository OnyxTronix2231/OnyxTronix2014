/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author nimrod
 */
public class Cannon extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private final DoubleSolenoid piston = RobotMap.cannonPiston;
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void moveUp() {
        piston.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void moveDown() {
        piston.set(DoubleSolenoid.Value.kForward);
    }
}
