package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ReflectanceSensor extends SubsystemBase{
    
    private final AnalogInput leftSensor;
    private final AnalogInput rightSensor;

    public ReflectanceSensor(int leftPort, int rightPort){
        this.leftSensor = new AnalogInput(0);
        this.rightSensor = new AnalogInput(1);

        leftSensor.setAverageBits(2);
        rightSensor.setAverageBits(2);
    }

    public double[] getValue(){
        double[] result = new double[2];
        
        result[0] = leftSensor.getAverageVoltage();
        result[1] = rightSensor.getAverageVoltage();

        return result;
    }

    public  void updateDashboard() {
        double[] v = this.getValue(); 
        SmartDashboard.putString("Sensor:",  v[0] + ", " + v[1]);
    }

}
