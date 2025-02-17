package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ReflectanceSensor;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class FollowLine extends Command{
    private final ReflectanceSensor m_reflSensor;


    public FollowLine(ReflectanceSensor reflSensor){
        m_reflSensor = reflSensor;
        addRequirements(m_reflSensor);
    }


    @Override
    public void end(boolean interrupted) {
        // TODO Auto-generated method stub
        super.end(interrupted);
    }


    @Override
    public void execute() {
        // TODO Auto-generated method stub
        double[] v = m_reflSensor.getValue();
        SmartDashboard.putString("Reflect Data", v[0] + "," + v[1]);
    }


    @Override
    public void initialize() {
        // TODO Auto-generated method stub
        super.initialize();
    }


    @Override
    public boolean isFinished() {
        // TODO Auto-generated method stub
        return false;
    }

    
}
