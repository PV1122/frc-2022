// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.slingshot;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Latch extends SubsystemBase {
  private static final class Config {
    public static final int kPWMPort = 0;
  }

  private Servo m_servo = new Servo(Config.kPWMPort);

  /** Creates a new Latch. */
  public Latch() {
  }

  public void openLatch() {
    m_servo.set(0.0);
  }

  public void closeLatch() {
    m_servo.set(1.0);
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Latch/servoValue", m_servo.getPosition());
  }
}
