package view;

import modelo.CRUD;
import modelo.Store;
import utilities.ModeloTabla;
import utilities.GestionCeldas;
import utilities.GestionEncabezadoTabla;
import utilities.Utilidades;

import javax.swing.table.JTableHeader;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

//@author Juan David Medellin Calderon
public final class MainView extends javax.swing.JFrame implements MouseListener {

			CRUD modelCrud = new CRUD();
			ModeloTabla model;
			private ImageIcon imagenFerreteria = new ImageIcon(getClass().getResource("/utilities/images/logoFerreteria.png"));

			ArrayList<Store> store;

			int xMouse, yMouse;
			boolean modificationFlag = false;

			public MainView() {
						initComponents();

						setLocationRelativeTo(null);

						buildTableList();
						CostomTable.addMouseListener(this);
						LabelLogoFerreteria.setIcon(new ImageIcon(imagenFerreteria.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH)));
			}

			@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jSeparator6 = new javax.swing.JSeparator();
      jSeparator7 = new javax.swing.JSeparator();
      background = new javax.swing.JPanel();
      dataBase = new javax.swing.JPanel();
      SPTabla = new javax.swing.JScrollPane();
      CostomTable = new javax.swing.JTable();
      dataImput = new javax.swing.JPanel();
      LabelLogoFerreteria = new javax.swing.JLabel();
      LabelTitle = new javax.swing.JLabel();
      LabelId = new javax.swing.JLabel();
      LabelName = new javax.swing.JLabel();
      LabelPurchaseValue = new javax.swing.JLabel();
      LabelSeleValue = new javax.swing.JLabel();
      LabelQuantity = new javax.swing.JLabel();
      LabelCategory = new javax.swing.JLabel();
      TFId = new javax.swing.JTextField();
      jSeparator1 = new javax.swing.JSeparator();
      TFName = new javax.swing.JTextField();
      jSeparator2 = new javax.swing.JSeparator();
      TFPurchaseValue = new javax.swing.JTextField();
      jSeparator3 = new javax.swing.JSeparator();
      TFSeleValue = new javax.swing.JTextField();
      jSeparator4 = new javax.swing.JSeparator();
      TFQuantity = new javax.swing.JTextField();
      jSeparator8 = new javax.swing.JSeparator();
      CBCategory = new javax.swing.JComboBox<>();
      bottonInsert = new javax.swing.JPanel();
      LabelInsert = new javax.swing.JLabel();
      optionsBar = new javax.swing.JPanel();
      Exit = new javax.swing.JPanel();
      LabelExit = new javax.swing.JLabel();
      consultationArea = new javax.swing.JPanel();
      jPanel1 = new javax.swing.JPanel();
      TFIdCheck = new javax.swing.JTextField();
      jSeparator5 = new javax.swing.JSeparator();
      bottonCheck_code = new javax.swing.JPanel();
      LabelCheckCode = new javax.swing.JLabel();
      bottonLista = new javax.swing.JPanel();
      LabelLista = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setLocationByPlatform(true);
      setUndecorated(true);
      setResizable(false);

      background.setBackground(new java.awt.Color(255, 255, 255));
      background.setPreferredSize(new java.awt.Dimension(800, 500));
      background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      dataBase.setBackground(new java.awt.Color(242, 235, 233));

      SPTabla.setBackground(new java.awt.Color(242, 235, 233));
      SPTabla.setBorder(null);

      CostomTable.setBackground(new java.awt.Color(242, 235, 233));
      CostomTable.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
         },
         new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
         }
      ));
      SPTabla.setViewportView(CostomTable);

      javax.swing.GroupLayout dataBaseLayout = new javax.swing.GroupLayout(dataBase);
      dataBase.setLayout(dataBaseLayout);
      dataBaseLayout.setHorizontalGroup(
         dataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(dataBaseLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(SPTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(20, Short.MAX_VALUE))
      );
      dataBaseLayout.setVerticalGroup(
         dataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(dataBaseLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(SPTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      background.add(dataBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 800, 200));

      dataImput.setBackground(new java.awt.Color(242, 235, 233));
      dataImput.setPreferredSize(new java.awt.Dimension(539, 250));

      LabelLogoFerreteria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/images/logoFerreteria.png"))); // NOI18N

      LabelTitle.setBackground(new java.awt.Color(255, 255, 255));
      LabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
      LabelTitle.setForeground(new java.awt.Color(102, 102, 102));
      LabelTitle.setText("Ferreteria");

      LabelId.setBackground(new java.awt.Color(255, 255, 255));
      LabelId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      LabelId.setForeground(new java.awt.Color(102, 102, 102));
      LabelId.setText("Codigo");

      LabelName.setBackground(new java.awt.Color(255, 255, 255));
      LabelName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      LabelName.setForeground(new java.awt.Color(102, 102, 102));
      LabelName.setText("Nombre");

      LabelPurchaseValue.setBackground(new java.awt.Color(255, 255, 255));
      LabelPurchaseValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      LabelPurchaseValue.setForeground(new java.awt.Color(102, 102, 102));
      LabelPurchaseValue.setText("Valor de compra");

      LabelSeleValue.setBackground(new java.awt.Color(255, 255, 255));
      LabelSeleValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      LabelSeleValue.setForeground(new java.awt.Color(102, 102, 102));
      LabelSeleValue.setText("Valor de venta");

      LabelQuantity.setBackground(new java.awt.Color(255, 255, 255));
      LabelQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      LabelQuantity.setForeground(new java.awt.Color(102, 102, 102));
      LabelQuantity.setText("Cantidad");

      LabelCategory.setBackground(new java.awt.Color(255, 255, 255));
      LabelCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      LabelCategory.setForeground(new java.awt.Color(102, 102, 102));
      LabelCategory.setText("Categoria");

      TFId.setBackground(new java.awt.Color(242, 235, 233));
      TFId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      TFId.setForeground(new java.awt.Color(204, 204, 204));
      TFId.setText("Ingrese el codigo");
      TFId.setBorder(null);
      TFId.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            TFIdMousePressed(evt);
         }
      });
      TFId.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            TFIdActionPerformed(evt);
         }
      });

      jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

      TFName.setBackground(new java.awt.Color(242, 235, 233));
      TFName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      TFName.setForeground(new java.awt.Color(204, 204, 204));
      TFName.setText("Ingrese el nombre");
      TFName.setBorder(null);
      TFName.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            TFNameMousePressed(evt);
         }
      });
      TFName.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            TFNameActionPerformed(evt);
         }
      });

      jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

      TFPurchaseValue.setBackground(new java.awt.Color(242, 235, 233));
      TFPurchaseValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      TFPurchaseValue.setForeground(new java.awt.Color(204, 204, 204));
      TFPurchaseValue.setText("Ingrese el valor de compra");
      TFPurchaseValue.setBorder(null);
      TFPurchaseValue.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            TFPurchaseValueMousePressed(evt);
         }
      });
      TFPurchaseValue.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            TFPurchaseValueActionPerformed(evt);
         }
      });

      jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

      TFSeleValue.setBackground(new java.awt.Color(242, 235, 233));
      TFSeleValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      TFSeleValue.setForeground(new java.awt.Color(204, 204, 204));
      TFSeleValue.setText("Ingrese el valor de venta");
      TFSeleValue.setBorder(null);
      TFSeleValue.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            TFSeleValueMousePressed(evt);
         }
      });
      TFSeleValue.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            TFSeleValueActionPerformed(evt);
         }
      });

      jSeparator4.setForeground(new java.awt.Color(102, 102, 102));

      TFQuantity.setBackground(new java.awt.Color(242, 235, 233));
      TFQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      TFQuantity.setForeground(new java.awt.Color(204, 204, 204));
      TFQuantity.setText("Ingrese la cantidad");
      TFQuantity.setBorder(null);
      TFQuantity.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            TFQuantityMousePressed(evt);
         }
      });
      TFQuantity.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            TFQuantityActionPerformed(evt);
         }
      });

      jSeparator8.setForeground(new java.awt.Color(102, 102, 102));

      CBCategory.setBackground(new java.awt.Color(242, 235, 233));
      CBCategory.setForeground(new java.awt.Color(102, 102, 102));
      CBCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tornillo", "Pvc", "Herramienta", "Pisos" }));
      CBCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

      bottonInsert.setBackground(new java.awt.Color(194, 222, 209));
      bottonInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

      LabelInsert.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      LabelInsert.setForeground(new java.awt.Color(102, 102, 102));
      LabelInsert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      LabelInsert.setText("Agregar");
      LabelInsert.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            LabelInsertMouseClicked(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            LabelInsertMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            LabelInsertMouseExited(evt);
         }
      });

      javax.swing.GroupLayout bottonInsertLayout = new javax.swing.GroupLayout(bottonInsert);
      bottonInsert.setLayout(bottonInsertLayout);
      bottonInsertLayout.setHorizontalGroup(
         bottonInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(LabelInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
      );
      bottonInsertLayout.setVerticalGroup(
         bottonInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(LabelInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
      );

      javax.swing.GroupLayout dataImputLayout = new javax.swing.GroupLayout(dataImput);
      dataImput.setLayout(dataImputLayout);
      dataImputLayout.setHorizontalGroup(
         dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(dataImputLayout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(dataImputLayout.createSequentialGroup()
                  .addGroup(dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                     .addComponent(LabelId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(LabelCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(LabelQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(LabelSeleValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(LabelPurchaseValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(LabelName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                  .addGroup(dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addGroup(dataImputLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(jSeparator1)
                           .addComponent(TFName)
                           .addComponent(TFPurchaseValue, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                           .addComponent(TFSeleValue, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                           .addComponent(TFQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                           .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                           .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                           .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                           .addComponent(TFId, javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dataImputLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CBCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
               .addGroup(dataImputLayout.createSequentialGroup()
                  .addComponent(LabelLogoFerreteria, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(15, 15, 15)
                  .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(25, 25, 25)
            .addComponent(bottonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(25, 25, 25))
      );
      dataImputLayout.setVerticalGroup(
         dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataImputLayout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(dataImputLayout.createSequentialGroup()
                  .addComponent(LabelLogoFerreteria, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(10, 10, 10))
               .addGroup(dataImputLayout.createSequentialGroup()
                  .addComponent(LabelTitle)
                  .addGap(18, 18, 18)))
            .addGroup(dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(LabelId)
               .addComponent(TFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(4, 4, 4)
            .addGroup(dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(TFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(LabelName))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(4, 4, 4)
            .addGroup(dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(LabelPurchaseValue)
               .addComponent(TFPurchaseValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(4, 4, 4)
            .addGroup(dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(LabelSeleValue)
               .addComponent(TFSeleValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(4, 4, 4)
            .addGroup(dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(LabelQuantity)
               .addComponent(TFQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(4, 4, 4)
            .addGroup(dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(dataImputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(LabelCategory)
                  .addComponent(CBCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(bottonInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );

      background.add(dataImput, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 530, 500));

      optionsBar.setBackground(new java.awt.Color(242, 235, 233));
      optionsBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
         public void mouseDragged(java.awt.event.MouseEvent evt) {
            optionsBarMouseDragged(evt);
         }
      });
      optionsBar.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            optionsBarMousePressed(evt);
         }
      });

      Exit.setBackground(new java.awt.Color(242, 235, 233));
      Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

      LabelExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      LabelExit.setForeground(new java.awt.Color(102, 102, 102));
      LabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      LabelExit.setText("X");
      LabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      LabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            LabelExitMouseClicked(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            LabelExitMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            LabelExitMouseExited(evt);
         }
      });

      javax.swing.GroupLayout ExitLayout = new javax.swing.GroupLayout(Exit);
      Exit.setLayout(ExitLayout);
      ExitLayout.setHorizontalGroup(
         ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(ExitLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(LabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      ExitLayout.setVerticalGroup(
         ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(LabelExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      javax.swing.GroupLayout optionsBarLayout = new javax.swing.GroupLayout(optionsBar);
      optionsBar.setLayout(optionsBarLayout);
      optionsBarLayout.setHorizontalGroup(
         optionsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsBarLayout.createSequentialGroup()
            .addContainerGap(780, Short.MAX_VALUE)
            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      );
      optionsBarLayout.setVerticalGroup(
         optionsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(optionsBarLayout.createSequentialGroup()
            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );

      background.add(optionsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

      consultationArea.setBackground(new java.awt.Color(242, 235, 233));
      consultationArea.setPreferredSize(new java.awt.Dimension(270, 505));

      jPanel1.setBackground(new java.awt.Color(54, 48, 98));
      jPanel1.setPreferredSize(new java.awt.Dimension(230, 485));

      TFIdCheck.setBackground(new java.awt.Color(54, 48, 98));
      TFIdCheck.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      TFIdCheck.setForeground(new java.awt.Color(70, 79, 102));
      TFIdCheck.setText("Ingresar el codigo");
      TFIdCheck.setBorder(null);
      TFIdCheck.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            TFIdCheckMousePressed(evt);
         }
      });
      TFIdCheck.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            TFIdCheckActionPerformed(evt);
         }
      });

      jSeparator5.setForeground(new java.awt.Color(242, 235, 233));

      bottonCheck_code.setBackground(new java.awt.Color(194, 222, 209));

      LabelCheckCode.setForeground(new java.awt.Color(102, 102, 102));
      LabelCheckCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      LabelCheckCode.setText("Consultar");
      LabelCheckCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      LabelCheckCode.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            LabelCheckCodeMouseClicked(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            LabelCheckCodeMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            LabelCheckCodeMouseExited(evt);
         }
      });

      javax.swing.GroupLayout bottonCheck_codeLayout = new javax.swing.GroupLayout(bottonCheck_code);
      bottonCheck_code.setLayout(bottonCheck_codeLayout);
      bottonCheck_codeLayout.setHorizontalGroup(
         bottonCheck_codeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(LabelCheckCode, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
      );
      bottonCheck_codeLayout.setVerticalGroup(
         bottonCheck_codeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(LabelCheckCode, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
      );

      bottonLista.setBackground(new java.awt.Color(194, 222, 209));

      LabelLista.setForeground(new java.awt.Color(102, 102, 102));
      LabelLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      LabelLista.setText("Lista");
      LabelLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      LabelLista.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            LabelListaMouseClicked(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            LabelListaMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            LabelListaMouseExited(evt);
         }
      });

      javax.swing.GroupLayout bottonListaLayout = new javax.swing.GroupLayout(bottonLista);
      bottonLista.setLayout(bottonListaLayout);
      bottonListaLayout.setHorizontalGroup(
         bottonListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(LabelLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
      );
      bottonListaLayout.setVerticalGroup(
         bottonListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(LabelLista, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(60, 60, 60)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jSeparator5)
                     .addComponent(TFIdCheck)))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(72, 72, 72)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(bottonLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(bottonCheck_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(60, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(TFIdCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(22, 22, 22)
            .addComponent(bottonCheck_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(121, 121, 121)
            .addComponent(bottonLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(215, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout consultationAreaLayout = new javax.swing.GroupLayout(consultationArea);
      consultationArea.setLayout(consultationAreaLayout);
      consultationAreaLayout.setHorizontalGroup(
         consultationAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(consultationAreaLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(20, Short.MAX_VALUE))
      );
      consultationAreaLayout.setVerticalGroup(
         consultationAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(consultationAreaLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(20, 20, 20))
      );

      background.add(consultationArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 270, 480));

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

			private void buildTableList() {
						store = modelCrud.List();

						ArrayList<String> titleList = new ArrayList<>();

						titleList.add("Codigo");
						titleList.add("Nombre");
						titleList.add("Categorias");
						titleList.add("ValorCompra");
						titleList.add("ValorVenta");
						titleList.add("Cantidad");
						titleList.add(" ");
						titleList.add(" ");

						String[] titles = new String[titleList.size()];
						for (int i = 0; i < titles.length; i++)
						{
									titles[i] = titleList.get(i);
						}

						Object[][] data = getDataArray(titleList);

						buildTable(titles, data);
			}

			private void buildTableSearch(int id) {
						store = modelCrud.search(id);

						ArrayList<String> titleList = new ArrayList<>();

						titleList.add("Codigo");
						titleList.add("Nombre");
						titleList.add("Categorias");
						titleList.add("ValorCompra");
						titleList.add("ValorVenta");
						titleList.add("Cantidad");
						titleList.add(" ");
						titleList.add(" ");

						String[] titles = new String[titleList.size()];
						for (int i = 0; i < titles.length; i++)
						{
									titles[i] = titleList.get(i);
						}

						Object[][] data = getDataArray(titleList);

						buildTable(titles, data);
			}

			private Object[][] getDataArray(ArrayList<String> titleList) {
						String data[][] = new String[store.size()][titleList.size()];

						for (int i = 0; i < data.length; i++)
						{
									data[i][Utilidades.ID] = store.get(i).getId() + "";
									data[i][Utilidades.NAME] = store.get(i).getName() + "";
									data[i][Utilidades.CATEGORY] = store.get(i).getCategory() + "";
									data[i][Utilidades.PURCHASEVALUE] = store.get(i).getPurchaseValue() + "";
									data[i][Utilidades.SELEVALUE] = store.get(i).getSeleValue() + "";
									data[i][Utilidades.QUANTITY] = store.get(i).getQuantity() + "";
									data[i][Utilidades.MODIFY] = "MODIFY";
									data[i][Utilidades.REMOVER] = "REMOVER";
						}

						return data;
			}

			private void buildTable(String[] titulos, Object[][] data) {
						model = new ModeloTabla(data, titulos);
						//se asigna el modelo a la tabla
						CostomTable.setModel(model);

						//se asigna el tipo de dato que tendrán las celdas de cada columna definida respectivamente para validar su personalización
						CostomTable.getColumnModel().getColumn(Utilidades.NAME).setCellRenderer(new GestionCeldas("texto"));
						CostomTable.getColumnModel().getColumn(Utilidades.CATEGORY).setCellRenderer(new GestionCeldas("texto"));
						CostomTable.getColumnModel().getColumn(Utilidades.ID).setCellRenderer(new GestionCeldas("numerico"));
						CostomTable.getColumnModel().getColumn(Utilidades.PURCHASEVALUE).setCellRenderer(new GestionCeldas("numerico"));
						CostomTable.getColumnModel().getColumn(Utilidades.SELEVALUE).setCellRenderer(new GestionCeldas("numerico"));
						CostomTable.getColumnModel().getColumn(Utilidades.QUANTITY).setCellRenderer(new GestionCeldas("numerico"));
						CostomTable.getColumnModel().getColumn(Utilidades.MODIFY).setCellRenderer(new GestionCeldas("icono"));
						CostomTable.getColumnModel().getColumn(Utilidades.REMOVER).setCellRenderer(new GestionCeldas("icono"));

						CostomTable.getTableHeader().setReorderingAllowed(false);
						CostomTable.setRowHeight(25);//tamaño de las celdas
						CostomTable.setGridColor(new java.awt.Color(0, 0, 0));
						//Se define el tamaño de largo para cada columna y su contenido
						CostomTable.getColumnModel().getColumn(Utilidades.ID).setPreferredWidth(80);
						CostomTable.getColumnModel().getColumn(Utilidades.NAME).setPreferredWidth(500);
						CostomTable.getColumnModel().getColumn(Utilidades.CATEGORY).setPreferredWidth(200);
						CostomTable.getColumnModel().getColumn(Utilidades.PURCHASEVALUE).setPreferredWidth(150);
						CostomTable.getColumnModel().getColumn(Utilidades.SELEVALUE).setPreferredWidth(150);
						CostomTable.getColumnModel().getColumn(Utilidades.QUANTITY).setPreferredWidth(80);
						CostomTable.getColumnModel().getColumn(Utilidades.MODIFY).setPreferredWidth(30);
						CostomTable.getColumnModel().getColumn(Utilidades.REMOVER).setPreferredWidth(30);

						//personaliza el encabezado
						JTableHeader jtableHeader = CostomTable.getTableHeader();
						jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
						CostomTable.setTableHeader(jtableHeader);

						//se asigna la tabla al scrollPane
						SPTabla.setViewportView(CostomTable);
			}

			private void CheckModifierMouseSelection(int row) {
						ArrayList<Store> storeDB = new ArrayList<>();
						Store storeInternal = new Store();

						storeInternal.setId(Integer.parseInt(CostomTable.getValueAt(row, Utilidades.ID).toString()));

						storeDB = modelCrud.search(storeInternal.getId());

						TFId.setText(Integer.toString(storeDB.get(0).getId()));
						TFId.setForeground(new Color(102, 102, 102));
						TFName.setText(storeDB.get(0).getName());
						TFName.setForeground(new Color(102, 102, 102));
						CBCategory.setSelectedItem(storeDB.get(0).getCategory());
						TFPurchaseValue.setText(Double.toString(storeDB.get(0).getPurchaseValue()));
						TFPurchaseValue.setForeground(new Color(102, 102, 102));
						TFSeleValue.setText(Double.toString(storeDB.get(0).getSeleValue()));
						TFSeleValue.setForeground(new Color(102, 102, 102));
						TFQuantity.setText(Integer.toString(storeDB.get(0).getQuantity()));
						TFQuantity.setForeground(new Color(102, 102, 102));

						modificationFlag = true;
			}

			private void CheckDeleterMouseSelection(int row) throws ClassNotFoundException {
						Store storeInternal = new Store();

						storeInternal.setId(Integer.parseInt(CostomTable.getValueAt(row, Utilidades.ID).toString()));
						storeInternal.setName(CostomTable.getValueAt(row, Utilidades.NAME).toString());
						storeInternal.setCategory(CostomTable.getValueAt(row, Utilidades.CATEGORY).toString());
						storeInternal.setPurchaseValue(Double.parseDouble(CostomTable.getValueAt(row, Utilidades.PURCHASEVALUE).toString()));
						storeInternal.setSeleValue(Double.parseDouble(CostomTable.getValueAt(row, Utilidades.SELEVALUE).toString()));
						storeInternal.setQuantity(Integer.parseInt(CostomTable.getValueAt(row, Utilidades.QUANTITY).toString()));

						int value = JOptionPane.showConfirmDialog(null, "Se eliminara el objeto: " + storeInternal.getId() + "  " + storeInternal.getName(), "Selecciona una opcion...", JOptionPane.YES_NO_OPTION, 2);

						if (value == 0)
						{
									modelCrud.delete(storeInternal);
									store.clear();
									buildTableList();
						}
			}

			@Override
			public void mouseClicked(MouseEvent e) {
						int row = CostomTable.rowAtPoint(e.getPoint());
						int column = CostomTable.columnAtPoint(e.getPoint());

						if (column == Utilidades.MODIFY)
						{
									CheckModifierMouseSelection(row);
//									JOptionPane.showConfirmDialog(null, "Evento Modificar");
						} else if (column == Utilidades.REMOVER)
						{
									try
									{
												CheckDeleterMouseSelection(row);
//									JOptionPane.showConfirmDialog(null, "Evento Eliminar");
									} catch (ClassNotFoundException ex)
									{
												JOptionPane.showMessageDialog(null, "Error: no se pudo eliminar", "Error", 0);
									}
						}
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

   private void TFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNameActionPerformed
						// TODO add your handling code here:
   }//GEN-LAST:event_TFNameActionPerformed

   private void TFPurchaseValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPurchaseValueActionPerformed
						// TODO add your handling code here:
   }//GEN-LAST:event_TFPurchaseValueActionPerformed

   private void TFSeleValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSeleValueActionPerformed
						// TODO add your handling code here:
   }//GEN-LAST:event_TFSeleValueActionPerformed

   private void TFQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFQuantityActionPerformed
						// TODO add your handling code here:
   }//GEN-LAST:event_TFQuantityActionPerformed

   private void optionsBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsBarMousePressed
						xMouse = evt.getX();
						yMouse = evt.getY();
   }//GEN-LAST:event_optionsBarMousePressed

   private void optionsBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsBarMouseDragged
						int x = evt.getXOnScreen();
						int y = evt.getYOnScreen();

						this.setLocation(x - xMouse, y - yMouse);
   }//GEN-LAST:event_optionsBarMouseDragged

   private void LabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitMouseClicked
						System.exit(0);
   }//GEN-LAST:event_LabelExitMouseClicked

   private void LabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitMouseEntered
						Exit.setBackground(Color.red);
						LabelExit.setForeground(Color.white);
   }//GEN-LAST:event_LabelExitMouseEntered

   private void LabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitMouseExited
						Exit.setBackground(new Color(242, 235, 233));
						LabelExit.setForeground(new Color(102, 102, 102));
   }//GEN-LAST:event_LabelExitMouseExited

   private void TFNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFNameMousePressed
						if (TFId.getText().isEmpty())
						{
									TFId.setText("Ingrese el codigo");
									TFId.setForeground(new Color(204, 204, 204));
						}
						if (TFName.getText().equals("Ingrese el nombre"))
						{
									TFName.setText("");
									TFName.setForeground(new Color(102, 102, 102));
						}
						if (TFPurchaseValue.getText().isEmpty())
						{
									TFPurchaseValue.setText("Ingrese el valor de compra");
									TFPurchaseValue.setForeground(new Color(204, 204, 204));
						}
						if (TFSeleValue.getText().isEmpty())
						{
									TFSeleValue.setText("Ingrese el valor de venta");
									TFSeleValue.setForeground(new Color(204, 204, 204));
						}
						if (TFQuantity.getText().isEmpty())
						{
									TFQuantity.setText("Ingrese la cantidad");
									TFQuantity.setForeground(new Color(204, 204, 204));
						}
						if (TFIdCheck.getText().isEmpty())
						{
									TFIdCheck.setText("Ingresar el codigo");
									TFIdCheck.setForeground(new Color(70, 79, 102));
						}
   }//GEN-LAST:event_TFNameMousePressed

   private void TFPurchaseValueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFPurchaseValueMousePressed
						if (TFId.getText().isEmpty())
						{
									TFId.setText("Ingrese el codigo");
									TFId.setForeground(new Color(204, 204, 204));
						}
						if (TFName.getText().isEmpty())
						{
									TFName.setText("Ingrese el nombre");
									TFName.setForeground(new Color(204, 204, 204));
						}
						if (TFPurchaseValue.getText().equals("Ingrese el valor de compra"))
						{
									TFPurchaseValue.setText("");
									TFPurchaseValue.setForeground(new Color(102, 102, 102));
						}
						if (TFSeleValue.getText().isEmpty())
						{
									TFSeleValue.setText("Ingrese el valor de venta");
									TFSeleValue.setForeground(new Color(204, 204, 204));
						}
						if (TFQuantity.getText().isEmpty())
						{
									TFQuantity.setText("Ingrese la cantidad");
									TFQuantity.setForeground(new Color(204, 204, 204));
						}
						if (TFIdCheck.getText().isEmpty())
						{
									TFIdCheck.setText("Ingresar el codigo");
									TFIdCheck.setForeground(new Color(70, 79, 102));
						}
   }//GEN-LAST:event_TFPurchaseValueMousePressed

   private void TFSeleValueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFSeleValueMousePressed
						if (TFId.getText().isEmpty())
						{
									TFId.setText("Ingrese el codigo");
									TFId.setForeground(new Color(204, 204, 204));
						}
						if (TFName.getText().isEmpty())
						{
									TFName.setText("Ingrese el nombre");
									TFName.setForeground(new Color(204, 204, 204));
						}
						if (TFPurchaseValue.getText().isEmpty())
						{
									TFPurchaseValue.setText("Ingrese el valor de compra");
									TFPurchaseValue.setForeground(new Color(204, 204, 204));
						}
						if (TFSeleValue.getText().equals("Ingrese el valor de venta"))
						{
									TFSeleValue.setText("");
									TFSeleValue.setForeground(new Color(102, 102, 102));
						}
						if (TFQuantity.getText().isEmpty())
						{
									TFQuantity.setText("Ingrese la cantidad");
									TFQuantity.setForeground(new Color(204, 204, 204));
						}
						if (TFIdCheck.getText().isEmpty())
						{
									TFIdCheck.setText("Ingresar el codigo");
									TFIdCheck.setForeground(new Color(70, 79, 102));
						}
   }//GEN-LAST:event_TFSeleValueMousePressed

   private void TFQuantityMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFQuantityMousePressed
						if (TFId.getText().isEmpty())
						{
									TFId.setText("Ingrese el codigo");
									TFId.setForeground(new Color(204, 204, 204));
						}
						if (TFName.getText().isEmpty())
						{
									TFName.setText("Ingrese el nombre");
									TFName.setForeground(new Color(204, 204, 204));
						}
						if (TFPurchaseValue.getText().isEmpty())
						{
									TFPurchaseValue.setText("Ingrese el valor de compra");
									TFPurchaseValue.setForeground(new Color(204, 204, 204));
						}
						if (TFSeleValue.getText().isEmpty())
						{
									TFSeleValue.setText("Ingrese el valor de venta");
									TFSeleValue.setForeground(new Color(204, 204, 204));
						}
						if (TFQuantity.getText().equals("Ingrese la cantidad"))
						{
									TFQuantity.setText("");
									TFQuantity.setForeground(new Color(102, 102, 102));
						}
						if (TFIdCheck.getText().isEmpty())
						{
									TFIdCheck.setText("Ingresar el codigo");
									TFIdCheck.setForeground(new Color(70, 79, 102));
						}
   }//GEN-LAST:event_TFQuantityMousePressed

   private void TFIdCheckMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFIdCheckMousePressed
						if (TFId.getText().isEmpty())
						{
									TFId.setText("Ingrese el codigo");
									TFId.setForeground(new Color(204, 204, 204));
						}
						if (TFName.getText().isEmpty())
						{
									TFName.setText("Ingrese el nombre");
									TFName.setForeground(new Color(204, 204, 204));
						}
						if (TFPurchaseValue.getText().isEmpty())
						{
									TFPurchaseValue.setText("Ingrese el valor de compra");
									TFPurchaseValue.setForeground(new Color(204, 204, 204));
						}
						if (TFSeleValue.getText().isEmpty())
						{
									TFSeleValue.setText("Ingrese el valor de venta");
									TFSeleValue.setForeground(new Color(204, 204, 204));
						}
						if (TFQuantity.getText().isEmpty())
						{
									TFQuantity.setText("Ingrese la cantidad");
									TFQuantity.setForeground(new Color(204, 204, 204));
						}
						if (TFIdCheck.getText().equals("Ingresar el codigo"))
						{
									TFIdCheck.setText("");
									TFIdCheck.setForeground(new Color(242, 235, 233));
						}
   }//GEN-LAST:event_TFIdCheckMousePressed

   private void LabelInsertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelInsertMouseEntered
						bottonInsert.setBackground(new Color(205, 240, 234));
   }//GEN-LAST:event_LabelInsertMouseEntered

   private void LabelInsertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelInsertMouseExited
						bottonInsert.setBackground(new Color(194, 222, 209));
   }//GEN-LAST:event_LabelInsertMouseExited

   private void LabelCheckCodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCheckCodeMouseEntered
						bottonCheck_code.setBackground(new Color(205, 240, 234));
   }//GEN-LAST:event_LabelCheckCodeMouseEntered

   private void LabelCheckCodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCheckCodeMouseExited
						bottonCheck_code.setBackground(new Color(194, 222, 209));
   }//GEN-LAST:event_LabelCheckCodeMouseExited

   private void LabelListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelListaMouseEntered
						bottonLista.setBackground(new Color(205, 240, 234));
   }//GEN-LAST:event_LabelListaMouseEntered

   private void LabelListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelListaMouseExited
						bottonLista.setBackground(new Color(194, 222, 209));
   }//GEN-LAST:event_LabelListaMouseExited

   private void TFIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFIdMousePressed
						if (TFId.getText().equals("Ingrese el codigo"))
						{
									TFId.setText("");
									TFId.setForeground(new Color(102, 102, 102));
						}
						if (TFName.getText().isEmpty())
						{
									TFName.setText("Ingrese el nombre");
									TFName.setForeground(new Color(204, 204, 204));
						}
						if (TFPurchaseValue.getText().isEmpty())
						{
									TFPurchaseValue.setText("Ingrese el valor de compra");
									TFPurchaseValue.setForeground(new Color(204, 204, 204));
						}
						if (TFSeleValue.getText().isEmpty())
						{
									TFSeleValue.setText("Ingrese el valor de venta");
									TFSeleValue.setForeground(new Color(204, 204, 204));
						}
						if (TFQuantity.getText().isEmpty())
						{
									TFQuantity.setText("Ingrese la cantidad");
									TFQuantity.setForeground(new Color(204, 204, 204));
						}
						if (TFIdCheck.getText().isEmpty())
						{
									TFIdCheck.setText("Ingresar el codigo");
									TFIdCheck.setForeground(new Color(70, 79, 102));
						}
   }//GEN-LAST:event_TFIdMousePressed

   private void TFIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFIdActionPerformed

   }//GEN-LAST:event_TFIdActionPerformed
//			Agregar
   private void LabelInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelInsertMouseClicked
						bottonInsert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
						List error = new ArrayList();
						Store storeInternal = new Store();

						try
						{
									storeInternal.setId(Integer.parseInt(TFId.getText()));
						} catch (Exception e)
						{
									error.add("Error: Porfavor ingresar un numero en el codigo");
						}
						try
						{
									storeInternal.setName(TFName.getText());
						} catch (Exception e)
						{
									error.add("\nError: Porfavor ingresar una cadena en el nombre");
						}
						try
						{
									storeInternal.setPurchaseValue(Double.parseDouble(TFPurchaseValue.getText()));
						} catch (Exception e)
						{
									error.add("\nError: Porfavor ingresar un numero desimal en valor de compra");
						}
						try
						{
									storeInternal.setSeleValue(Double.parseDouble(TFSeleValue.getText()));
						} catch (Exception e)
						{
									error.add("\nError: Porfavor ingresar un numero desimal en valor de venta");
						}
						try
						{
									storeInternal.setQuantity(Integer.parseInt(TFQuantity.getText()));
						} catch (Exception e)
						{
									error.add("\nError: Porfavor ingresar un numero en la cantidad");
						}

						storeInternal.setCategory(CBCategory.getSelectedItem().toString());

						if (!error.isEmpty())
						{
									JOptionPane.showMessageDialog(null, error, "Informacion", 2);
						} else
						{
									if (modificationFlag)
									{
												try
												{
															modelCrud.update(storeInternal);

															modificationFlag = false;

															TFId.setText("Ingrese el codigo");
															TFName.setText("Ingrese el nombre");
															TFPurchaseValue.setText("Ingrese el valor de compra");
															TFSeleValue.setText("Ingrese el valor de venta");
															TFQuantity.setText("Ingrese la cantidad");
															TFIdCheck.setText("Ingresar el codigo");
												} catch (ClassNotFoundException ex)
												{
															JOptionPane.showMessageDialog(null, "No se encontro registro", "Error", 0);
												}
									} else
									{
												try
												{
															modelCrud.Insert(storeInternal);
												} catch (ClassNotFoundException ex)
												{
															JOptionPane.showMessageDialog(null, "no se encontro registro", "Error", 0);
												}
									}
						}
						bottonInsert.setBorder(null);
   }//GEN-LAST:event_LabelInsertMouseClicked
//			Lista
   private void LabelListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelListaMouseClicked
						bottonLista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
						store.clear();
						buildTableList();
						bottonLista.setBorder(null);
   }//GEN-LAST:event_LabelListaMouseClicked
//			buscar
   private void LabelCheckCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCheckCodeMouseClicked
						bottonCheck_code.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
						Store storeInternal = new Store();
						List error = new ArrayList();

						store.clear();

						try
						{
									storeInternal.setId(Integer.parseInt(TFIdCheck.getText()));
						} catch (Exception e)
						{
									System.out.println("entro antes");
									error.add("Error: Porfavor ingresar un numero en el codigo");
						}
						if (!error.isEmpty())
						{
									System.out.println("entro error 1");
									JOptionPane.showMessageDialog(null, error, "Informacion", 2);
						} else
						{
									try
									{
												storeInternal.setId(Integer.parseInt(TFIdCheck.getText()));
												buildTableSearch(storeInternal.getId());
												
												TFIdCheck.setText("Ingresar el codigo");
												TFIdCheck.setForeground(new Color(70, 79, 102));
									} catch (Exception e)
									{
												System.out.println("entro error 2");
												JOptionPane.showMessageDialog(null, "Error: Porfavor ingresar un numero en el buscador de codigo", "Error", 1);
									}
						}
						bottonCheck_code.setBorder(null);
   }//GEN-LAST:event_LabelCheckCodeMouseClicked

   private void TFIdCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFIdCheckActionPerformed
						// TODO add your handling code here:
   }//GEN-LAST:event_TFIdCheckActionPerformed

			public static void main(String args[]) {
						try
						{
									for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
									{
												if ("Nimbus".equals(info.getName()))
												{
															javax.swing.UIManager.setLookAndFeel(info.getClassName());
															break;
												}
									}
						} catch (ClassNotFoundException ex)
						{
									java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (InstantiationException ex)
						{
									java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (IllegalAccessException ex)
						{
									java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						} catch (javax.swing.UnsupportedLookAndFeelException ex)
						{
									java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
						}

						java.awt.EventQueue.invokeLater(new Runnable() {
									public void run() {
												new MainView().setVisible(true);
									}
						});
			}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JComboBox<String> CBCategory;
   private javax.swing.JTable CostomTable;
   private javax.swing.JPanel Exit;
   private javax.swing.JLabel LabelCategory;
   private javax.swing.JLabel LabelCheckCode;
   private javax.swing.JLabel LabelExit;
   private javax.swing.JLabel LabelId;
   private javax.swing.JLabel LabelInsert;
   private javax.swing.JLabel LabelLista;
   private javax.swing.JLabel LabelLogoFerreteria;
   private javax.swing.JLabel LabelName;
   private javax.swing.JLabel LabelPurchaseValue;
   private javax.swing.JLabel LabelQuantity;
   private javax.swing.JLabel LabelSeleValue;
   private javax.swing.JLabel LabelTitle;
   private javax.swing.JScrollPane SPTabla;
   private javax.swing.JTextField TFId;
   private javax.swing.JTextField TFIdCheck;
   private javax.swing.JTextField TFName;
   private javax.swing.JTextField TFPurchaseValue;
   private javax.swing.JTextField TFQuantity;
   private javax.swing.JTextField TFSeleValue;
   private javax.swing.JPanel background;
   private javax.swing.JPanel bottonCheck_code;
   private javax.swing.JPanel bottonInsert;
   private javax.swing.JPanel bottonLista;
   private javax.swing.JPanel consultationArea;
   private javax.swing.JPanel dataBase;
   private javax.swing.JPanel dataImput;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JSeparator jSeparator2;
   private javax.swing.JSeparator jSeparator3;
   private javax.swing.JSeparator jSeparator4;
   private javax.swing.JSeparator jSeparator5;
   private javax.swing.JSeparator jSeparator6;
   private javax.swing.JSeparator jSeparator7;
   private javax.swing.JSeparator jSeparator8;
   private javax.swing.JPanel optionsBar;
   // End of variables declaration//GEN-END:variables
}
