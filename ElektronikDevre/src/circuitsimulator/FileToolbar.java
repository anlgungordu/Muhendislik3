package circuitsimulator;
import javax.swing.*;
import java.awt.event.*;

public class FileToolbar extends JToolBar {
    public FileToolbar(){
        JButton exitButton = new JButton(Images.close);
         exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });         
         JButton _new = new JButton(Images._new);
         _new.setToolTipText("Yeni dosya");
         JButton open = new JButton(Images.open);
         open.setToolTipText("Proje Aç");
         JButton save = new JButton(Images.save);
         save.setToolTipText("Kaydet");
                  
         this.add(_new);
         this.add(open);
         this.add(save);
         this.add(exitButton);
         
         this.setFloatable(false);
    }
}
