// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class ExampleSubsystem extends SubsystemBase {
  public CANSparkMax intake;


  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {
    CANSparkMax intake = new CANSparkMax(24, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    int i = 0;
    while (i<1000){
      intake.set(1.0);
      i++;
    }

  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
