package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:02
 * @version: 1.0
 * @modified By:
 */
public class Hovercraft extends MaritimeMeansOfTransport {
    public Hovercraft() {
    }

    public Hovercraft(String id) {
        super(id);
    }

    @Override
    public void drivingMethod() {
        System.out.println("Hovercraft drivingMethod");
    }
}
