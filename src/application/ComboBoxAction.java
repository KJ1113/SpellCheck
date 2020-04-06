package application;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import Liners.Liner;
import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ComboBoxAction {
	 public void ComboAction(Event event ,String input , Liner liner , String spellpos ,ImageView imgView ) {
		 if(spellpos.equals("D")) {
			 liner.FirstSpell(input);
		 }else {
			 liner.SecondSpell(input);
		 }
		 File file = new File("Spellimg");
		 
		 String path = file.getAbsolutePath();
	     try {
				// 2. ��Ʈ�� �غ�
				FileInputStream fis = new FileInputStream(path+"/"+input+".jpg");
				BufferedInputStream bis = new BufferedInputStream(fis);
				// 3. ���� �о����
				Image img = new Image(bis);
				imgView.setImage(img);
	
				// 4. �ڿ� �ݳ� 
				try {
					bis.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
