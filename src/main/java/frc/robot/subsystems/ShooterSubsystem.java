/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {
  private VictorSP motor1, motor2, motor3;

  /**
   * Creates a new ShooterSubsytem.
   */
  public ShooterSubsystem() {
    motor1 = new VictorSP(Constants.SHOOTER_MOTOR_1);
    motor2 = new VictorSP(Constants.SHOOTER_MOTOR_2);
    motor3 = new VictorSP(Constants.SHOOTER_MOTOR_3);

  }
  public void setSpeed(double shooterSpeed) {
    motor1.set(shooterSpeed);
    motor2.set(shooterSpeed);
    motor3.set(shooterSpeed);

  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
