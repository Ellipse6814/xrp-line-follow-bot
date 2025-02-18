package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ReflectanceSensor extends SubsystemBase{
    
    public final AnalogInput leftSensor;
    public final AnalogInput rightSensor;

    public ReflectanceSensor(int leftPort, int rightPort){
        this.leftSensor = new AnalogInput(0);
        this.rightSensor = new AnalogInput(1);

        SmartDashboard.putData("Left Reflect Sensor", leftSensor);
        SmartDashboard.putData("Right Reflect Sensor", rightSensor);

        leftSensor.setAverageBits(2);
        rightSensor.setAverageBits(2);
    }
}
