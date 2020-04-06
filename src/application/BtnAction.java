package application;

import java.util.Date;
import java.util.Timer;

import Liners.Liner;
import javafx.application.Platform;
import java.text.SimpleDateFormat;


import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class BtnAction {
	private boolean stop = false;
	static String timerBuffer;
	static int oldTime;
	public void handleSpellBtnAction(Event event, Liner liner , String spellpos , Label label,Label label_1) {
		int index;
		int conTime;
		int psec;
		String conBuffer;
		
		if(spellpos.equals("D")) {
			index=0;
		}else {
			index=1;
		}
		psec = liner.getSpellList().get(index).getSecond();
		secToHHMMSS(((int) System.currentTimeMillis() / 1000) - oldTime + psec);
		conTime = ((int) System.currentTimeMillis() / 1000) - oldTime + psec;
		conBuffer = timerBuffer;
		label_1.setText(conBuffer);
		
		Thread thread = new Thread() {
            @Override
            public void run() {
                while (!stop) {
                	secToHHMMSS(conTime - (((int) System.currentTimeMillis() / 1000) - oldTime));
                	String subtime = timerBuffer;
                	Platform.runLater(() -> {
                		label.setText(subtime);
                    });
                	if(subtime.equals("00 : 00")) {
            			break;
            		}
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
	}
	
	public void gameStartAction(Event event , Label lblTime) {
			oldTime = (int) System.currentTimeMillis() / 1000;
			
			Thread thread = new Thread() {
	            @Override
	            public void run() {
	            	
	                while (!stop) {
	                	secToHHMMSS(((int) System.currentTimeMillis() / 1000) - oldTime );
	                	String gametime = timerBuffer;
	                	Platform.runLater(() -> {
	                        lblTime.setText(gametime);
	                    });
	                    try { Thread.sleep(100); } catch (InterruptedException e) {}
	                }
	            }
	        };
	        thread.setDaemon(true);
	        thread.start();
	}
	public static void secToHHMMSS(int secs ) {
        int hour, min, sec;
        sec  = secs % 60;
        min  = secs / 60 % 60;
        hour = secs / 3600;
        timerBuffer = String.format("%02d : %02d", min, sec);
    }
}
