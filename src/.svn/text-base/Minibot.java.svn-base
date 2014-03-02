/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author jeffw
 */
public class Minibot extends Thread {

    private boolean running;
    private Joystick stick;
    private long start_time;

    private boolean isMinibotPhase()
    {
        long elapsed_time = System.currentTimeMillis() - start_time;
        long remaining_time = 120000 - elapsed_time;
        return (remaining_time <= 10000);
    }

    public Minibot(Joystick stick_arg, long starttime_arg)
    {
        start_time = starttime_arg;
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
