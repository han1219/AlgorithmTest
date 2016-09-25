package com.demo;

import java.util.EventListener;
import java.util.EventObject;

public class ObserverDemo {
	 class DoorEvent extends EventObject {

	    private static final long serialVersionUID = 6496098798146410884L;

	    private String doorState = "";// ��ʾ�ŵ�״̬���С������͡��ء�����

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
		            System.out.println("��2�򿪣�ͬʱ�����ȵĵ�");
		        } else {
		            System.out.println("��2�رգ�ͬʱ�ر����ȵĵ�");
		        }
		}
		 
	 }
	 class DoorListener1 implements DoorListener {
		 
		    public void doorEvent(DoorEvent event) {
		        // TODO Auto-generated method stub
		        if (event.getDoorState() != null && event.getDoorState().equals("open")) {
		            System.out.println("��1��");
		        } else {
		            System.out.println("��1�ر�");
		        }
		    }

		}
}
