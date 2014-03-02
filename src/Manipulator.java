/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author jeffw
 */
public class Manipulator extends Thread {

    private boolean running;
    private Joystick stick;

    public Manipulator(Joystick stick_arg)
    {
        stick = stick_arg;
        running = false;
    }

    public void run()
    {
        while (running)
        {
            try {
                wait(500);
            } catch (InterruptedException ie) {
            }
        }
    }

    public void shutdown()
    {
        running = false;

        boolean joined = false;
        while (!joined)
        {
            try {
                join();
                joined = true;
            } catch (InterruptedException ie) {
            }
        }
    }
}
