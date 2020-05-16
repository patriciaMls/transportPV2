package com.mls;

import com.mls.person.Person;
import com.mls.transport.HotAirBalloon;
import com.mls.transport.Ship;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/16 23:51
 * @version: 1.0
 * @modified By:
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();

        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        Ship ship = new Ship();

        person1.driveMethod(hotAirBalloon);
        person1.driveMethod(ship);
    }
}
