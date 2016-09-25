package com.demo;

import java.util.EventListener;
import java.util.EventObject;

public class ObserverDemo {
	 class DoorEvent extends EventObject {

	    private static final long serialVersionUID = 6496098798146410884L;

	    private String doorState = "";// 表示门的状态，有“开”和“关”两种

	    public DoorEvent(Object source, String doorState) {
	        super(source);
	        this.doorState = doorState;
	    }

	    public void setDoorState(String doorState) {
	        this.doorState = doorState;
	    }

	    public String getDoorState() {
	        return this.doorState;
	    }

	}
	 class DoorListener2 implements DoorListener{

		public void doorEvent(DoorEvent event) {
			// TODO Auto-generated method stub
			  if (event.getDoorState() != null && event.getDoorState().equals("open")) {
		            System.out.println("门2打开，同时打开走廊的灯");
		        } else {
		            System.out.println("门2关闭，同时关闭走廊的灯");
		        }
		}
		 
	 }
	 class DoorListener1 implements DoorListener {
		 
		    public void doorEvent(DoorEvent event) {
		        // TODO Auto-generated method stub
		        if (event.getDoorState() != null && event.getDoorState().equals("open")) {
		            System.out.println("门1打开");
		        } else {
		            System.out.println("门1关闭");
		        }
		    }

		}
}
