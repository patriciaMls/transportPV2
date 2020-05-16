package com.mls.person;

import com.mls.transport.Transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/16 23:49
 * @version: 1.0
 * @modified By:
 */
public class Person {
    private int p_Age;
    private String p_Sex;
    private String id;
    private String p_Name;

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }

    public void driveMethod(Transport transport){
        transport.drivingMethod();
    }
}
