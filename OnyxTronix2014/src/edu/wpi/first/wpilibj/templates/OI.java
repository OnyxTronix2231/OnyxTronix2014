
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.StartComp;
import edu.wpi.first.wpilibj.templates.commands.StopComp;
import edu.wpi.first.wpilibj.templates.commands.Lock;
import edu.wpi.first.wpilibj.templates.commands.MoveDown;
import edu.wpi.first.wpilibj.templates.commands.MoveUp;
import edu.wpi.first.wpilibj.templates.commands.Reload;
import edu.wpi.first.wpilibj.templates.commands.Unload;
import edu.wpi.first.wpilibj.templates.commands.Unlock;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    public Joystick buttonStick;
    public Joystick driveStick;
    public JoystickButton realod;
    public JoystickButton unload;
    public JoystickButton startComp;
    public JoystickButton stopComp;
    public JoystickButton lock;
    public JoystickButton unlock;
    public JoystickButton moveUp;
    public JoystickButton moveDown;
    public OI() {
        buttonStick = new Joystick(1);
        driveStick = new Joystick(2);
        realod = new JoystickButton(buttonStick, 1);
        realod.whenPressed(new Reload());
        unload = new JoystickButton(buttonStick, 4);
        unload.whileHeld(new Unload());
        lock = new JoystickButton(buttonStick, 5);
        lock.whenPressed(new Lock());
        unlock = new JoystickButton(buttonStick, 6);
        unlock.whenPressed(new Unlock());
        moveUp = new JoystickButton(buttonStick, 2);
        moveUp.whenPressed(new MoveUp());
        moveDown = new JoystickButton(buttonStick, 3);
        moveDown.whenPressed(new MoveDown());
        startComp = new JoystickButton(buttonStick, 8);
        startComp.whenPressed(new StartComp());
        stopComp = new JoystickButton(buttonStick, 7);
        stopComp.whenPressed(new StopComp());
    }
     public Joystick getDriveStick() {
        return driveStick;
     }
}

