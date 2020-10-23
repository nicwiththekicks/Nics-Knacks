/**
 *Author: Nicolas Dmitriev
 *Date: Oct 23, 2020
 *Description: This program rolls 2 dice and reads off the results.
 */

import java.lang.Math;

public class Model {

private int Die = 1 + (int) (Math.random()* 6) ;

public int getRoll() {
return Die;
}

public void rollDie1() {
System.out.println("Die 1 has rolled a " + Die);
 }

public void rollDie2() {
System.out.println("Die 2 has rolled a " + Die);
 }





}