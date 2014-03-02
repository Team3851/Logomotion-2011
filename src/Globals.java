/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author jeffw
 */
public class Globals {
    public class Drive {

        public Jaguar motor_left_front;
        public Jaguar motor_left_rear;
        public Jaguar motor_right_front;
        public Jaguar motor_right_rear;

        public RobotDrive train;

        public Drive()
        {
            motor_left_front = new Jaguar(Constants.Drive.channel_left_front);
            motor_left_rear = new Jaguar(Constants.Drive.channel_left_rear);
            motor_right_front = new Jaguar(Constants.Drive.channel_right_front);
            motor_right_rear = new Jaguar(Constants.Drive.channel_right_rear);

            train = new RobotDrive(motor_left_front, motor_left_rear,
                                    motor_right_front, motor_right_rear);

            train.setInvertedMotor(RobotDrive.MotorType.kFrontLeft,
                    Constants.Drive.inverted_left_front);
            train.setInvertedMotor(RobotDrive.MotorType.kRearLeft,
                    Constants.Drive.inverted_left_rear);
            train.setInvertedMotor(RobotDrive.MotorType.kFrontRight,
                    Constants.Drive.inverted_right_front);
            train.setInvertedMotor(RobotDrive.MotorType.kRearRight,
                    Constants.Drive.inverted_right_rear);
        }
    }

    public class Operator
    {
        public Joystick joystick_left;
        public Joystick joystick_right;

        public Operator()
        {
            joystick_left = new Joystick(Constants.Operator.joystick_left_port);
            joystick_right = new Joystick(Constants.Operator.joystick_right_port);

        }
    }

   public class Minibot_arm_drive
    {
         public Jaguar miniArmJag;

         public Minibot_arm_drive()
        {
            miniArmJag = new Jaguar(Constants.Drive.minibot_arm_jaguar);
        }

    }

    public class Tube_arm_drive
    {
         public Jaguar tubeArmUpdownLeft;
         public Jaguar tubeArmUpdownRight;
         public Jaguar tubeArmPivot;

         public RobotDrive tubeArmDrive;


         public Tube_arm_drive()
         {
            tubeArmUpdownLeft = new Jaguar(Constants.Drive.tube_arm_updown_left_jag);
            tubeArmUpdownRight = new Jaguar(Constants.Drive.tube_arm_updown_right_jag);
            tubeArmPivot = new Jaguar(Constants.Drive.tube_arm_pivot_jag);

            tubeArmDrive = new RobotDrive(tubeArmUpdownLeft, tubeArmUpdownRight);

            tubeArmDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, Constants.Drive.inverted_updown_right);
         }
    }

    /*public class eIO
    {
        public DriverStationEnhancedIO eIO;

        public eIO()
        {
        }

        public void Digitals()
        {
            try {
                eIO.getDigitals();
            } catch (DriverStationEnhancedIO.EnhancedIOException e) {
                System.out.println("ERROR THROWN");
            }
        }

    }*/
    
    Drive drive;
    Operator operator;
    Minibot_arm_drive miniDrive;
    Tube_arm_drive tubeDrive;
    //eIO dIO;


    Globals()
    {
        drive = new Drive();
        operator = new Operator();
        miniDrive = new Minibot_arm_drive();
        tubeDrive = new Tube_arm_drive();
        //dIO = new eIO();

    }
}
