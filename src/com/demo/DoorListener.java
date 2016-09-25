package com.demo;

import java.util.EventListener;

import com.demo.ObserverDemo.DoorEvent;

public  interface DoorListener extends EventListener {
    public void doorEvent(DoorEvent event);
 
}
