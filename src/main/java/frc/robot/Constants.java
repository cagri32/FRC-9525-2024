// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    // Port numbers for driver and operator gamepads. These correspond with the numbers on the USB
    // tab of the DriverStation
    public static final int kDriverControllerPort = 0;
    public static final int kOperatorControllerPort = 0;
  }

  public static class DrivetrainConstants {
    // PWM ports/CAN IDs for motor controllers
    public static final int kLeftRearID = 1;
    public static final int kLeftFrontID = 2;
    public static final int kRightRearID = 4;
    public static final int kRightFrontID = 3;

    // Current limit for drivetrain motors
    public static final int kCurrentLimit = 60;
  }

  public static class LauncherConstants {
    // PWM ports/CAN IDs for motor controllers
    public static final int kFeederID = 6;
    public static final int kLauncherID = 7;

    // Current limit for launcher and feed wheels
    public static final int kLauncherCurrentLimit = 80;
    public static final int kFeedCurrentLimit = 80;

    // Speeds for wheels when intaking and launching. Intake speeds are negative to run the wheels
    // in reverse
    // Launcher Top 7 is the top motor. 
    // Launches with Negative values
    public static final double kLauncherIntakeSpeed = -1;
    public static final double kLauncherLaunchSpeed = 1;

    // Feeder Bottom 6 is the bottom motor. 
    // Launches with Positive values
    public static final double kFeederIntakeSpeed = 1;
    public static final double kFeederLaunchSpeed = -1;

    public static final double kLauncherDelay = .5;
    public static final double kLauncherRunDuration = 1;

    // Slower speeds for launch
    public static final double kLauncherSlowLaunchSpeed = 0.28;
    public static final double kFeederSlowLaunchSpeed = -0.5;

  }

  public static class AutoConstants{
    public static final double kAutoDrivePower = -0.5;
    public static final double kAutoTimeout = 1;
    public static final double kAutoDriveSpeed = -0.5;

  }
}
