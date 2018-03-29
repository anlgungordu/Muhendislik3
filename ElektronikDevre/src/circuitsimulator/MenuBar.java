package circuitsimulator;
import javax.swing.*;
import java.awt.event.*;

public class MenuBar extends JMenuBar {

    public MenuBar() {
        JMenu file = new JMenu("Dosya");
        file.setMnemonic(KeyEvent.VK_F);
        JMenuItem _new = new JMenuItem("Yeni");
        _new.setMnemonic(KeyEvent.VK_N);
               _new.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Component.drawable.clear();
                Wire.allTheWires.clear();
                Node.allTheNodes.clear();
                Window.ref.changeTitle("Mühendislik Projesi");
            }
        });
        JMenuItem open = new JMenuItem("Aç");
        open.setMnemonic(KeyEvent.VK_O);
        open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new FileChooserDialog(FileChooserDialog.SaveORLoad.Load);
            }
        });
        JMenuItem save = new JMenuItem("Kaydet");
        save.setMnemonic(KeyEvent.VK_S);
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new FileChooserDialog(FileChooserDialog.SaveORLoad.Save);
            }
        });
        JMenuItem saveAs = new JMenuItem("Farklı Kaydet  ");
        saveAs.setMnemonic(KeyEvent.VK_A);
        saveAs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new FileChooserDialog(FileChooserDialog.SaveORLoad.Save);
            }
        });
        JMenuItem exit = new JMenuItem("Çıkış", Images.close);
        exit.setMnemonic(KeyEvent.VK_X);
        exit.setToolTipText("Projeyi Sonlandır");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        file.add(_new);
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.add(saveAs);
        file.addSeparator();
        file.add(exit);

        JMenu view = new JMenu("Görüntüle");
//        JMenuItem grid = new JMenuItem("Grid");
        JCheckBoxMenuItem grid = new JCheckBoxMenuItem("Sistem");
        grid.setState(true);
        grid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                CircuitSimulator.win.sheet.toggleGrid();
                CircuitSimulator.win.sheet.repaint();
            }
        });

        view.add(grid);

        JMenu help = new JMenu("Yardım");
        help.setMnemonic(KeyEvent.VK_H);
        JMenuItem about = new JMenuItem("Hakkında");
        JMenuItem helpItem = new JMenuItem("Yardım");
        help.add(helpItem);
        help.addSeparator();
        help.add(about);
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Hakkında");
                JOptionPane.showMessageDialog(null, "Anıl Güngördü",
                        "iSee Circuits", JOptionPane.PLAIN_MESSAGE);
            }
        });


        this.add(file);
        this.add(view);
        this.add(help);

    }
}
