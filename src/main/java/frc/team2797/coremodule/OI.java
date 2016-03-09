package frc.team2797.coremodule;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team2797.coremodule.commands.AutoCrossDefense;
import frc.team2797.coremodule.commands.AutoReachDefense;
import frc.team2797.coremodule.commands.Intake;
import frc.team2797.coremodule.commands.Lower;
import frc.team2797.coremodule.commands.Raise;
import frc.team2797.coremodule.commands.Shoot;
import frc.team2797.coremodule.commands.SpinUp;
import frc.team2797.coremodule.commands.TeleopDrive;

public class OI {

	// Declarations

	// Controllers
	Joystick xb1;
	Joystick xb2;

	// Axis on xb1
	public double leftY;
	public double leftX;

	public double rightY;
	public double rightX;

	public double lTrig;
	public double rTrig;

	// Axis on xb2
	public double leftY2;
	public double leftX2;

	public double rightY2;
	public double rightX2;

	public double lTrig2;
	public double rTrig2;

	// Buttons on xb1
	public JoystickButton lb;
	public JoystickButton rb;

	public JoystickButton a;
	public JoystickButton b;
	public JoystickButton y;
	public JoystickButton x;

	public JoystickButton start;
	public JoystickButton select;

	// Buttons on xb2
	public JoystickButton lb2;
	public JoystickButton rb2;

	public JoystickButton a2;
	public JoystickButton b2;
	public JoystickButton y2;
	public JoystickButton x2;

	public JoystickButton start2;
	public JoystickButton select2;

	public OI() {

		// Constructors
		leftY = xb1.getRawAxis(1);
		leftX = xb1.getRawAxis(0);

		rightY = xb1.getRawAxis(5);
		rightX = xb1.getRawAxis(4);

		lTrig = xb1.getRawAxis(2);
		rTrig = xb1.getRawAxis(3);

		leftY2 = xb2.getRawAxis(1);
		leftX2 = xb2.getRawAxis(0);

		rightY2 = xb2.getRawAxis(5);
		rightX2 = xb2.getRawAxis(4);

		lTrig2 = xb2.getRawAxis(2);
		rTrig2 = xb2.getRawAxis(3);

		// SmartDashboard Buttons
		SmartDashboard.putData("AutoReachDefense", new AutoReachDefense());
		SmartDashboard.putData("AutoCrossDefense", new AutoCrossDefense());
		SmartDashboard.putData("Teleop Drive", new TeleopDrive());
		SmartDashboard.putData("Intake", new Intake());
		SmartDashboard.putData("SpinUp", new SpinUp());
		SmartDashboard.putData("Shoot", new Shoot());
		SmartDashboard.putData("Raise", new Raise());
		SmartDashboard.putData("Lower", new Lower());

	}

	// Functions

}
