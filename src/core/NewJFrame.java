package core;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Ammar Yasser
 */
public class NewJFrame extends javax.swing.JFrame {

    private int xOnScreen, yOnScreen, x, y;
    private static final Color GEN_MOUSE_ENTER_COLOR = new Color(96, 96, 96),
            SUCCESS_COLOR = new Color(50, 200, 50),
            ERROR_COLOR = new Color(200, 50, 50);
    private final JLabel infoLabel, blogLabel;
    private static boolean appeared;

    public NewJFrame() {
        initComponents();

        infoLabel = new JLabel("Developed by: Ammar Yasser AllaiThy");
        infoLabel.setBounds(0, getHeight() / 2 - 20, getWidth(), 30);
        infoLabel.setFont(new Font("calibri", Font.PLAIN, 20));
        infoLabel.setHorizontalAlignment(JLabel.CENTER);
        infoLabel.setVerticalAlignment(JLabel.BOTTOM);

        blogLabel = new JLabel("for more info, visit My Blog");
        blogLabel.setBounds(0, getHeight() / 2 + 20, getWidth(), 30);
        blogLabel.setFont(new Font("calibri", Font.PLAIN, 18));
        blogLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        blogLabel.setForeground(new Color(50, 50, 200));
        blogLabel.setHorizontalAlignment(JLabel.CENTER);
        blogLabel.setVerticalAlignment(JLabel.TOP);
        blogLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    if (Desktop.isDesktopSupported()) {
                        Desktop.getDesktop().browse(new URI("https://ammaryasserallaithy.000webhostapp.com/"));
                        blogLabel.setForeground(new Color(150, 50, 200));
                    } else {
                        JOptionPane.showMessageDialog(NewJFrame.this, "There is problem in your browser", "Can't Open Browser", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (IOException | URISyntaxException ex) {
                    JOptionPane.showMessageDialog(NewJFrame.this, ex.getMessage(), ex.getClass().toString(), JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        appeared = false;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleBar = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        infoIconLabel = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        genBarPanel = new javax.swing.JPanel();
        genBarLabel = new javax.swing.JLabel();
        genQrPanel = new javax.swing.JPanel();
        genQrLabel = new javax.swing.JLabel();
        readBarPanel = new javax.swing.JPanel();
        readBarLabel = new javax.swing.JLabel();
        readQrPanel = new javax.swing.JPanel();
        readQrLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Barcode & Qrcode [Generator and reader]");
        setUndecorated(true);

        titleBar.setBackground(new java.awt.Color(64, 64, 64));
        titleBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Barcode & Qrcode [Generator and reader]");
        titleLabel.setToolTipText("");
        titleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titleLabel.setIconTextGap(5);
        titleLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });

        closeLabel.setForeground(new java.awt.Color(255, 255, 255));
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/icons8_Multiply_30px.png"))); // NOI18N
        closeLabel.setToolTipText("");
        closeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });

        infoIconLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/icons8_Info_25px.png"))); // NOI18N
        infoIconLabel.setToolTipText("");
        infoIconLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoIconLabelMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout titleBarLayout = new org.jdesktop.layout.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(titleBarLayout.createSequentialGroup()
                .add(5, 5, 5)
                .add(titleLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(infoIconLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(closeLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(infoIconLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(titleBarLayout.createSequentialGroup()
                .add(titleBarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(titleLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(closeLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 0, Short.MAX_VALUE))
        );

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setBorder(javax.swing.BorderFactory.createLineBorder(titleBar.getBackground()));

        jSeparator1.setBackground(titleBar.getBackground());
        jSeparator1.setForeground(titleBar.getBackground());
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jScrollPane1.setBorder(null);

        textarea.setColumns(20);
        textarea.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        textarea.setForeground(titleBar.getBackground());
        textarea.setLineWrap(true);
        textarea.setRows(5);
        textarea.setTabSize(4);
        textarea.setWrapStyleWord(true);
        textarea.setBorder(null);
        textarea.setMargin(new java.awt.Insets(25, 25, 25, 25));
        textarea.setSelectionColor(new java.awt.Color(96, 96, 96));
        jScrollPane1.setViewportView(textarea);

        genBarPanel.setBackground(titleBar.getBackground());

        genBarLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        genBarLabel.setForeground(container.getBackground());
        genBarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genBarLabel.setText("Generate Barcode");
        genBarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        genBarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genBarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                genBarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                genBarLabelMouseExited(evt);
            }
        });

        org.jdesktop.layout.GroupLayout genBarPanelLayout = new org.jdesktop.layout.GroupLayout(genBarPanel);
        genBarPanel.setLayout(genBarPanelLayout);
        genBarPanelLayout.setHorizontalGroup(
            genBarPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(genBarLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        genBarPanelLayout.setVerticalGroup(
            genBarPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(genBarLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        genQrPanel.setBackground(titleBar.getBackground());

        genQrLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        genQrLabel.setForeground(container.getBackground());
        genQrLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genQrLabel.setText("Generate Qrcode");
        genQrLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        genQrLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genQrLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                genQrLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                genQrLabelMouseExited(evt);
            }
        });

        org.jdesktop.layout.GroupLayout genQrPanelLayout = new org.jdesktop.layout.GroupLayout(genQrPanel);
        genQrPanel.setLayout(genQrPanelLayout);
        genQrPanelLayout.setHorizontalGroup(
            genQrPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(genQrLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        genQrPanelLayout.setVerticalGroup(
            genQrPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(genQrLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        readBarPanel.setBackground(container.getBackground());

        readBarLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        readBarLabel.setForeground(titleBar.getBackground());
        readBarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readBarLabel.setText("Read Barcode");
        readBarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        readBarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readBarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                readBarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                readBarLabelMouseExited(evt);
            }
        });

        org.jdesktop.layout.GroupLayout readBarPanelLayout = new org.jdesktop.layout.GroupLayout(readBarPanel);
        readBarPanel.setLayout(readBarPanelLayout);
        readBarPanelLayout.setHorizontalGroup(
            readBarPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(readBarLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        readBarPanelLayout.setVerticalGroup(
            readBarPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(readBarLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        readQrPanel.setBackground(container.getBackground());

        readQrLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        readQrLabel.setForeground(titleBar.getBackground());
        readQrLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readQrLabel.setText("Read Qrcode");
        readQrLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        readQrLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readQrLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                readQrLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                readQrLabelMouseExited(evt);
            }
        });

        org.jdesktop.layout.GroupLayout readQrPanelLayout = new org.jdesktop.layout.GroupLayout(readQrPanel);
        readQrPanel.setLayout(readQrPanelLayout);
        readQrPanelLayout.setHorizontalGroup(
            readQrPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(readQrLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        readQrPanelLayout.setVerticalGroup(
            readQrPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(readQrLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout containerLayout = new org.jdesktop.layout.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(containerLayout.createSequentialGroup()
                .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(genBarPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(containerLayout.createSequentialGroup()
                        .add(50, 50, 50)
                        .add(readBarPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(0, 0, 0)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(genQrPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(containerLayout.createSequentialGroup()
                        .add(50, 50, 50)
                        .add(readQrPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(0, 0, Short.MAX_VALUE))
            .add(containerLayout.createSequentialGroup()
                .add(5, 5, 5)
                .add(jScrollPane1)
                .add(5, 5, 5))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, containerLayout.createSequentialGroup()
                .add(5, 5, 5)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 189, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(5, 5, 5)
                .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jSeparator1)
                    .add(containerLayout.createSequentialGroup()
                        .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(genBarPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(genQrPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(readQrPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(readBarPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(20, 20, 20))))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(titleBar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(container, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(titleBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(container, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked
    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        int xDist = evt.getXOnScreen() - xOnScreen,
                yDist = evt.getYOnScreen() - yOnScreen;
        this.setLocation(xOnScreen + xDist - x, yOnScreen + yDist - y);
    }//GEN-LAST:event_titleBarMouseDragged
    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        xOnScreen = evt.getXOnScreen();
        yOnScreen = evt.getYOnScreen();
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_titleBarMousePressed


    private void genBarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genBarLabelMouseEntered
        genBarPanel.setBackground(GEN_MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_genBarLabelMouseEntered
    private void genBarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genBarLabelMouseExited
        genBarPanel.setBackground(titleBar.getBackground());
    }//GEN-LAST:event_genBarLabelMouseExited
    private void genQrLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genQrLabelMouseEntered
        genQrPanel.setBackground(GEN_MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_genQrLabelMouseEntered
    private void genQrLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genQrLabelMouseExited
        genQrPanel.setBackground(titleBar.getBackground());
    }//GEN-LAST:event_genQrLabelMouseExited

    private void genBarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genBarLabelMouseClicked
        String pathToSave = getPathToSave();
        if (pathToSave != null) {
            boolean isGenerated = Barcode.generate(pathToSave, textarea.getText());
            genBarPanel.setBackground(isGenerated ? SUCCESS_COLOR : ERROR_COLOR);
//            if (isGenerated) {
//                try {
//                    Desktop.getDesktop().print(new File(pathToSave));
//                } catch (IOException ex) {
//                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
        }
    }//GEN-LAST:event_genBarLabelMouseClicked
    private void genQrLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genQrLabelMouseClicked
        String pathToSave = getPathToSave();
        if (pathToSave != null) {
            boolean isGenerated = QRcode.generate(pathToSave, textarea.getText());
            genQrPanel.setBackground(isGenerated ? SUCCESS_COLOR : ERROR_COLOR);
        }
    }//GEN-LAST:event_genQrLabelMouseClicked


    private void readBarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readBarLabelMouseEntered
        readBarLabel.setForeground(container.getBackground());
        readBarPanel.setBackground(titleBar.getBackground());
//        readBarLabel.setText("<html>"
//                + "<p style='font-family:mali;box-shadow:3px 3px #99f;font-size:20px;color:99f'>"
//                + "Test html text"
//                + "</p>"
//                + "</html>");
    }//GEN-LAST:event_readBarLabelMouseEntered
    private void readBarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readBarLabelMouseExited
        readBarLabel.setForeground(titleBar.getBackground());
        readBarPanel.setBackground(container.getBackground());
    }//GEN-LAST:event_readBarLabelMouseExited
    private void readQrLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readQrLabelMouseEntered
        readQrLabel.setForeground(container.getBackground());
        readQrPanel.setBackground(titleBar.getBackground());
    }//GEN-LAST:event_readQrLabelMouseEntered
    private void readQrLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readQrLabelMouseExited
        readQrLabel.setForeground(titleBar.getBackground());
        readQrPanel.setBackground(container.getBackground());
    }//GEN-LAST:event_readQrLabelMouseExited

    private void readBarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readBarLabelMouseClicked
        String barcode = Barcode.read(browseForImage());
        if (barcode == null) {
            readBarPanel.setBackground(ERROR_COLOR);
        } else {
            readBarPanel.setBackground(SUCCESS_COLOR);
            textarea.setText(barcode);
        }
    }//GEN-LAST:event_readBarLabelMouseClicked
    private void readQrLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readQrLabelMouseClicked
        String qrcode = QRcode.read(browseForImage());
        if (qrcode == null) {
            readQrPanel.setBackground(ERROR_COLOR);
        } else {
            readQrPanel.setBackground(SUCCESS_COLOR);
            textarea.setText(qrcode);
        }
    }//GEN-LAST:event_readQrLabelMouseClicked

    private void infoIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoIconLabelMouseClicked
        if (!appeared) {
            container.setVisible(false);
            this.add(infoLabel);
            this.add(blogLabel);
            appeared = true;
        } else {
            this.remove(infoLabel);
            this.remove(blogLabel);
            container.setVisible(true);
            appeared = false;
        }
    }//GEN-LAST:event_infoIconLabelMouseClicked

    private String browseForImage() {
        JFileChooser chooser = new JFileChooser();
        chooser.setPreferredSize(new Dimension(600, 500));
        chooser.setDialogTitle("Select code image...");
        chooser.setCurrentDirectory(new File("D:\\My Projects\\Java\\Barcode"));
        chooser.setApproveButtonText("Select");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(new FileNameExtensionFilter("Images Only (jpg, jpeg, png, bmp)", "jpg", "jpeg", "png", "bmp"));
        int status = chooser.showOpenDialog(this);

        if (status == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (file != null) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    private String getPathToSave() {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select output image location..");
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(new FileNameExtensionFilter("Images Only (jpg, jpeg, png, bmp)", "jpg", "jpeg", "png", "bmp"));
        int status = chooser.showSaveDialog(this);
        if (status == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (file != null) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    static void showError(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            String osName = System.getProperty("os.name"),
                    UIname = osName.equals("Linux") ? "GTK+"
                    : osName.startsWith("Windows") ? "Windows"
                    : "Nimbus";
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (UIname.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    //<editor-fold defaultstate="collapsed" desc=" Variables declaration - do not modify ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel container;
    private javax.swing.JLabel genBarLabel;
    private javax.swing.JPanel genBarPanel;
    private javax.swing.JLabel genQrLabel;
    private javax.swing.JPanel genQrPanel;
    private javax.swing.JLabel infoIconLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel readBarLabel;
    private javax.swing.JPanel readBarPanel;
    private javax.swing.JLabel readQrLabel;
    private javax.swing.JPanel readQrPanel;
    private javax.swing.JTextArea textarea;
    private javax.swing.JPanel titleBar;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
