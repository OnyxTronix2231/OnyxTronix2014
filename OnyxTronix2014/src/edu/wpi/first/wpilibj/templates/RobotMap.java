package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    public static Talon realoderMotor1;
    public static Talon realoderMotor2;
    public static Talon driveMotorLeft1;
    public static Talon driveMotorRight1;
    public static Talon driveMotorRight2;
    public static Talon driveMotorLeft2;
    public static RobotDrive driveTrainRobotDrive;
    public static DoubleSolenoid lockerPiston;
    public static Relay compressor;
    public static DoubleSolenoid cannonPiston;
    public static Talon ballBlockerMotor;
    public static Relay r;
    public static DigitalInput LockerIsReloadReady;
    public static void init () {
        driveMotorLeft1 = new Talon(1);
        //driveMotorLeft2 = new Talon(2);
        driveMotorRight1 = new Talon(3);
        //driveMotorRight2 = new Talon(4);
        realoderMotor1 = new Talon(5);
        realoderMotor2 = new Talon(2);
        ballBlockerMotor = new Talon(4);
        driveTrainRobotDrive = new RobotDrive(driveMotorLeft1,driveMotorLeft1 ,driveMotorRight1, driveMotorRight1);
        driveTrainRobotDrive.setSafetyEnabled(false);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);
        lockerPiston = new DoubleSolenoid(2, 1);
        cannonPiston = new DoubleSolenoid(3, 4);
        compressor = new Relay(1,1);
        r = new Relay(2);
        LockerIsReloadReady = new DigitalInput(8);
    }

    
    
}
