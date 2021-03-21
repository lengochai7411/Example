package com.company.qlks.view;

import com.company.qlks.bean.DanhMucBean;
import com.company.qlks.controller.ChuyenManHinhController;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PHONG VU
 */
public class MainJFrame extends javax.swing.JFrame {


    public MainJFrame() {
        initComponents();
        setTitle("QUẢN LÝ KHÁCH SẠN");
  
        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
        controller.setView(jpnHome, jlbHome);
  
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("Home",jpnHome,jlbHome));
        listItem.add(new DanhMucBean("Room",jpnRoomManager,jlbRoomManager));
        listItem.add(new DanhMucBean("Employee",jpnEmployeeManager,jlbEmployeeManager));
        listItem.add(new DanhMucBean("Statistical",jpnStatistical,jlbStatistical));
        listItem.add(new DanhMucBean("Account",jpnAccount,jlbAccount));
        controller.setEvent(listItem);
        this.setLocationRelativeTo(null);
    }
     public void setLocationRelativeTo(Component c)
    {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        Dimension windowSize = getSize();
        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;
        setLocation(dx, dy);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnQLKS = new javax.swing.JPanel();
        jlbQLKS = new javax.swing.JLabel();
        jpnHome = new javax.swing.JPanel();
        jlbHome = new javax.swing.JLabel();
        jpnRoomManager = new javax.swing.JPanel();
        jlbRoomManager = new javax.swing.JLabel();
        jpnEmployeeManager = new javax.swing.JPanel();
        jlbEmployeeManager = new javax.swing.JLabel();
        jpnStatistical = new javax.swing.JPanel();
        jlbStatistical = new javax.swing.JLabel();
        jpnAccount = new javax.swing.JPanel();
        jlbAccount = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpnRoot.setName(""); // NOI18N

        jpnMenu.setBackground(new java.awt.Color(82, 83, 81));

        jpnQLKS.setBackground(new java.awt.Color(232, 64, 60));

        jlbQLKS.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbQLKS.setForeground(new java.awt.Color(255, 255, 255));
        jlbQLKS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLKS.setIcon(new javax.swing.ImageIcon("D:\\program files\\QuanLyKhachSan\\2x\\icon_Hotel.png")); // NOI18N
        jlbQLKS.setText("QUẢN LÝ KHÁCH SẠN");

        javax.swing.GroupLayout jpnQLKSLayout = new javax.swing.GroupLayout(jpnQLKS);
        jpnQLKS.setLayout(jpnQLKSLayout);
        jpnQLKSLayout.setHorizontalGroup(
            jpnQLKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQLKSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbQLKS, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jpnQLKSLayout.setVerticalGroup(
            jpnQLKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLKSLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbQLKS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpnHome.setBackground(new java.awt.Color(76, 175, 80));

        jlbHome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbHome.setForeground(new java.awt.Color(255, 255, 255));
        jlbHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHome.setIcon(new javax.swing.ImageIcon("D:\\program files\\QuanLyKhachSan\\2x\\icon_Home.png")); // NOI18N
        jlbHome.setText("MÀN HÌNH CHÍNH");

        javax.swing.GroupLayout jpnHomeLayout = new javax.swing.GroupLayout(jpnHome);
        jpnHome.setLayout(jpnHomeLayout);
        jpnHomeLayout.setHorizontalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHomeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbHome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jpnHomeLayout.setVerticalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHomeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpnRoomManager.setBackground(new java.awt.Color(76, 175, 80));

        jlbRoomManager.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbRoomManager.setForeground(new java.awt.Color(255, 255, 255));
        jlbRoomManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbRoomManager.setIcon(new javax.swing.ImageIcon("D:\\program files\\QuanLyKhachSan\\2x\\icon_Room.png")); // NOI18N
        jlbRoomManager.setText("QUẢN LÝ PHÒNG");

        javax.swing.GroupLayout jpnRoomManagerLayout = new javax.swing.GroupLayout(jpnRoomManager);
        jpnRoomManager.setLayout(jpnRoomManagerLayout);
        jpnRoomManagerLayout.setHorizontalGroup(
            jpnRoomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRoomManagerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbRoomManager, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jpnRoomManagerLayout.setVerticalGroup(
            jpnRoomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRoomManagerLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jlbRoomManager, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jpnEmployeeManager.setBackground(new java.awt.Color(76, 175, 80));

        jlbEmployeeManager.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbEmployeeManager.setForeground(new java.awt.Color(255, 255, 255));
        jlbEmployeeManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbEmployeeManager.setIcon(new javax.swing.ImageIcon("D:\\program files\\QuanLyKhachSan\\2x\\icon_Employee.png")); // NOI18N
        jlbEmployeeManager.setText("QUẢN LÝ NHÂN VIÊN");
        jlbEmployeeManager.setToolTipText("");

        javax.swing.GroupLayout jpnEmployeeManagerLayout = new javax.swing.GroupLayout(jpnEmployeeManager);
        jpnEmployeeManager.setLayout(jpnEmployeeManagerLayout);
        jpnEmployeeManagerLayout.setHorizontalGroup(
            jpnEmployeeManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnEmployeeManagerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbEmployeeManager, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnEmployeeManagerLayout.setVerticalGroup(
            jpnEmployeeManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnEmployeeManagerLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jlbEmployeeManager, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jpnStatistical.setBackground(new java.awt.Color(76, 175, 80));

        jlbStatistical.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbStatistical.setForeground(new java.awt.Color(255, 255, 255));
        jlbStatistical.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbStatistical.setIcon(new javax.swing.ImageIcon("D:\\program files\\QuanLyKhachSan\\2x\\icon_Statistical.png")); // NOI18N
        jlbStatistical.setText("THỐNG KÊ");

        javax.swing.GroupLayout jpnStatisticalLayout = new javax.swing.GroupLayout(jpnStatistical);
        jpnStatistical.setLayout(jpnStatisticalLayout);
        jpnStatisticalLayout.setHorizontalGroup(
            jpnStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStatisticalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbStatistical, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jpnStatisticalLayout.setVerticalGroup(
            jpnStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStatisticalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbStatistical, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpnAccount.setBackground(new java.awt.Color(76, 175, 80));

        jlbAccount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbAccount.setForeground(new java.awt.Color(255, 255, 255));
        jlbAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbAccount.setIcon(new javax.swing.ImageIcon("D:\\program files\\QuanLyKhachSan\\2x\\icon_Account.png")); // NOI18N
        jlbAccount.setText("TÀI KHOẢN");
        jlbAccount.setToolTipText("");

        javax.swing.GroupLayout jpnAccountLayout = new javax.swing.GroupLayout(jpnAccount);
        jpnAccount.setLayout(jpnAccountLayout);
        jpnAccountLayout.setHorizontalGroup(
            jpnAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnAccountLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jlbAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jpnAccountLayout.setVerticalGroup(
            jpnAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAccountLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnStatistical, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnEmployeeManager, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnRoomManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addComponent(jpnQLKS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jpnQLKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpnRoomManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpnEmployeeManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpnStatistical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jpnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 687, Short.MAX_VALUE)
        );

        jpnRoot.getAccessibleContext().setAccessibleName("");
        jpnRoot.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbAccount;
    private javax.swing.JLabel jlbEmployeeManager;
    private javax.swing.JLabel jlbHome;
    private javax.swing.JLabel jlbQLKS;
    private javax.swing.JLabel jlbRoomManager;
    private javax.swing.JLabel jlbStatistical;
    private javax.swing.JPanel jpnAccount;
    private javax.swing.JPanel jpnEmployeeManager;
    private javax.swing.JPanel jpnHome;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnQLKS;
    private javax.swing.JPanel jpnRoomManager;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnStatistical;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
