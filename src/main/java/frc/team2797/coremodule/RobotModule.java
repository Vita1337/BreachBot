package frc.team2797.coremodule;

import edu.wpi.first.wpilibj.command.Command;
import frc.team2797.coremodule.commands.AutoReachDefense;
import frc.team2797.coremodule.subsystems.Drivetrain;
import frc.team2797.coremodule.subsystems.PnArm;
import frc.team2797.coremodule.subsystems.Shooter;
import jaci.openrio.toast.lib.log.Logger;
import jaci.openrio.toast.lib.module.IterativeModule;

public class RobotModule extends IterativeModule {

	public static Logger logger;

	Command autonomousCommand;

	public static OI oi;
	public static Drivetrain drivetrain;
	public static PnArm pnArm;
	public static Shooter shooter;

	@Override
	public String getModuleName() {
		return "CoreModule";
	}

	@Override
	public String getModuleVersion() {
		return "0.0.1";
	}

	@Override
	public void robotInit() {
		RobotMap.init();

		drivetrain = new Drivetrain();
		pnArm = new PnArm();
		shooter = new Shooter();

		oi = new OI();

		autonomousCommand = new AutoReachDefense();

		logger = new Logger("CoreModule", Logger.ATTR_DEFAULT);
		logger.info("Hello World!");
		// TODO: Module Init
	}
}
