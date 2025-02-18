package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class FollowLine extends Command{
    private final Drivetrain drivetrain;
    private final Supplier<Double> leftVoltageSupplier;
    private final Supplier<Double> rightVoltageSupplier;


    public FollowLine(Drivetrain drivetrain, Supplier<Double> leftVoltageSupplier, Supplier<Double> rightVoltageSupplier){
       this.drivetrain = drivetrain;
       this.leftVoltageSupplier = leftVoltageSupplier;
       this.rightVoltageSupplier = rightVoltageSupplier;
       addRequirements(drivetrain);
    }


    @Override
    public void end(boolean interrupted) {
        // TODO Auto-generated method stub
        super.end(interrupted);
        drivetrain.arcadeDrive(0, 0);
    }


    @Override
    public void execute() {
        // TODO Auto-generated method stub
       drivetrain.arcadeDrive(1.0, 0);
    }


    @Override
    public void initialize() {
        // TODO Auto-generated method stub
        super.initialize();
    }


    @Override
    public boolean isFinished() {
        // TODO Auto-generated method stub
        return LeftIsOverLine();
    }

    private boolean LeftIsOverLine(){
        return 4.0 > leftVoltageSupplier.get();
    }

    private boolean RightIsOverLine(){
        return 4.0 > rightVoltageSupplier.get();
    }

    
}
