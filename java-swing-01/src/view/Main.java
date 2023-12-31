package view;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.raven.menu.EventMenu;
import com.raven.menu.MainForm;
import com.raven.menu.MenuItem;
import java.awt.Component;
import java.awt.EventQueue;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        menu.addEventMenuSelected(new EventMenu() {
            @Override
            public void mainMenuSelected(MainForm mainForm, int index, MenuItem menuItem) {
            }

            @Override
            public void subMenuSelected(MainForm mainForm, int index, int subMenuIndex, Component menuItem) {
//                mainForm.displayForm(new Form1("Form " + index + "-" + subMenuIndex));
                if (index == 0 && subMenuIndex == 0) {
                    mainForm.displayForm(new ViewSize());
                }
                if (index == 0 && subMenuIndex == 1) {
                    mainForm.displayForm(new ViewSX());
                }
            }
        });
        menu.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subMenu = new com.raven.menu.SubMenuPanel();
        menu = new com.raven.menu.Menu();
        lbLogo = new javax.swing.JLabel();
        mainMenuItem1 = new com.raven.menu.MenuItem();
        mainMenuItem3 = new com.raven.menu.MenuItem();
        mainMenuItem2 = new com.raven.menu.MenuItem();
        mainMenuItem4 = new com.raven.menu.MenuItem();
        mainMenuItem5 = new com.raven.menu.MenuItem();
        mainForm = new com.raven.menu.MainForm();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        chDarkMode = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(80, 1, 1, 1));

        menu.setMainForm(mainForm);
        menu.setSubMenuPanel(subMenu);

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/logo.png"))); // NOI18N
        lbLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbLogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu.add(lbLogo);

        mainMenuItem1.setBackground(new java.awt.Color(255, 45, 185));
        mainMenuItem1.setForeground(new java.awt.Color(75, 0, 243));
        mainMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu1.png"))); // NOI18N
        mainMenuItem1.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/raven/icon/s1_1.png", "com/raven/icon/s1_2.png", "com/raven/icon/s1_3.png", "com/raven/icon/s1_4.png", "com/raven/icon/s1_5.png", "com/raven/icon/s1_6.png", "com/raven/icon/s1_7.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem1.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Quan ly Size", "Quan ly nha san xuat", "Cards", "Tabs", "Accordions", "Modals", "Lists & Media Object" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(mainMenuItem1);

        mainMenuItem3.setBackground(new java.awt.Color(0, 217, 64));
        mainMenuItem3.setForeground(new java.awt.Color(74, 74, 74));
        mainMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu2.png"))); // NOI18N
        mainMenuItem3.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/raven/icon/s2_1.png", "com/raven/icon/s2_2.png", "com/raven/icon/s2_3.png", "com/raven/icon/s2_4.png", "com/raven/icon/s2_5.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem3.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Grid", "Progress Bars", "Notifications & Alerts", "Pagination", "Carousel" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(mainMenuItem3);

        mainMenuItem2.setBackground(new java.awt.Color(255, 0, 0));
        mainMenuItem2.setForeground(new java.awt.Color(241, 255, 0));
        mainMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu3.png"))); // NOI18N
        mainMenuItem2.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/raven/icon/s3_1.png", "com/raven/icon/s3_2.png", "com/raven/icon/s3_3.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem2.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Charts", "Morris", "Flot" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(mainMenuItem2);

        mainMenuItem4.setBackground(new java.awt.Color(8, 191, 196));
        mainMenuItem4.setForeground(new java.awt.Color(3, 66, 178));
        mainMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu4.png"))); // NOI18N
        mainMenuItem4.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/raven/icon/s4_1.png", "com/raven/icon/s4_2.png", "com/raven/icon/s4_3.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenuItem4.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Maps", "Google Maps", "Vector Maps" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(mainMenuItem4);

        mainMenuItem5.setBackground(new java.awt.Color(0, 225, 100));
        mainMenuItem5.setForeground(new java.awt.Color(178, 17, 225));
        mainMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu5.png"))); // NOI18N
        mainMenuItem5.setText("mainMenuItem5");
        menu.add(mainMenuItem5);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Options");

        chDarkMode.setText("Dark Mode");
        chDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chDarkModeActionPerformed(evt);
            }
        });
        jMenu3.add(chDarkMode);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(subMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                    .addComponent(subMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chDarkModeActionPerformed
        if (chDarkMode.isSelected()) {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatDarculaLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        } else {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatIntelliJLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        }
    }//GEN-LAST:event_chDarkModeActionPerformed

    public static void main(String args[]) {
        FlatLaf.registerCustomDefaultsSource("com.raven.style");
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem chDarkMode;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbLogo;
    private com.raven.menu.MainForm mainForm;
    private com.raven.menu.MenuItem mainMenuItem1;
    private com.raven.menu.MenuItem mainMenuItem2;
    private com.raven.menu.MenuItem mainMenuItem3;
    private com.raven.menu.MenuItem mainMenuItem4;
    private com.raven.menu.MenuItem mainMenuItem5;
    private com.raven.menu.Menu menu;
    private com.raven.menu.SubMenuPanel subMenu;
    // End of variables declaration//GEN-END:variables
}
