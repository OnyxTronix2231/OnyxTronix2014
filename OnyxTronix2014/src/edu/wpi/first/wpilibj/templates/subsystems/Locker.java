/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.LockWhenReady;

/**
 *
 * @author nimrod
 */
public class Locker extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private final DoubleSolenoid piston = RobotMap.lockerPiston;
    private final DigitalInput isReloaderReady = RobotMap.LockerIsReloadReady;
    public void initDefaultCommand() {
        setDefaultCommand(new LockWhenReady());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void lock() {
        piston.set(DoubleSolenoid.Value.kForward);
    }
    
    public void unlock() {
        piston.set(DoubleSolenoid.Value.kReverse);
    }
    
    public boolean isReloaderReady() {
        return !isReloaderReady.get();
    }
}
