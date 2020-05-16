package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:02
 * @version: 1.0
 * @modified By:
 */
public class Submarine extends MaritimeMeansOfTransport {
    public Submarine() {
    }

    public Submarine(String id) {
        super(id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Submarine drivingMethod");
    }
}
