
package daa;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Font;
import java.util.StringTokenizer;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class BubbleSort extends javax.swing.JFrame {

    JLabel[] labelsIn = new JLabel[12];                                     //CREATE AN ARRAY OF LABLES TO STORE USER INPUT VALUES
    JLabel[] labelsOut = new JLabel[12];                                    //CREATE AN ARRAY OF LABLES TO STORE SORTED ARRAY VALUES
    JLabel[] labelsI = new JLabel[12];                                    //CREATE AN ARRAY OF LABLES TO STORE i VALUES
    int array[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};                     //INT ARRAY TO STORE USER INPUTS
    int noOfUserInputs = 0;                                                 //VARIABLE TO STORE NUMBER OF USER INPUT NUMBERS AT A TIME  
    AnimationClass AC = new AnimationClass();                               //MAKE A OBJECT FROM 'AnimationClass' CLASS
      
    //VARIABLES TO SORE USER SELECTED CHOICE WHETHER ASCENDING OD DESCENDING
    int choiceAscen = 0;
    int choiceDescen = 0;
    
    public BubbleSort() {
        initComponents();
        
        pnl_array.setVisible(false);
        clearArrayA();
        clearSortingA();
        
        //----INIATILZE INPUT LABEL ARRAY 'labelsIn'
        labelsIn[0] = lbl_n1;
        labelsIn[1] = lbl_n2;
        labelsIn[2] = lbl_n3;
        labelsIn[3] = lbl_n4;
        labelsIn[4] = lbl_n5;
        labelsIn[5] = lbl_n6;
        labelsIn[6] = lbl_n7;
        labelsIn[7] = lbl_n8;
        labelsIn[8] = lbl_n9;
        labelsIn[9] = lbl_n10;
        labelsIn[10] = lbl_n11;
        labelsIn[11] = lbl_n12;
        
        //----INIATILZE INPUT LABEL ARRAY 'labelsOut'
        labelsOut[0] = lbl_s1;
        labelsOut[1] = lbl_s2;
        labelsOut[2] = lbl_s3;
        labelsOut[3] = lbl_s4;
        labelsOut[4] = lbl_s5;
        labelsOut[5] = lbl_s6;
        labelsOut[6] = lbl_s7;
        labelsOut[7] = lbl_s8;
        labelsOut[8] = lbl_s9;
        labelsOut[9] = lbl_s10;
        labelsOut[10] = lbl_s11;
        labelsOut[11] = lbl_s12;
        
        //----INIATILZE INPUT LABEL ARRAY 'labelsI'
        labelsI[0] = lbl_i0;
        labelsI[1] = lbl_i1;
        labelsI[2] = lbl_i2;
        labelsI[3] = lbl_i3;
        labelsI[4] = lbl_i4;
        labelsI[5] = lbl_i5;
        labelsI[6] = lbl_i6;
        labelsI[7] = lbl_i7;
        labelsI[8] = lbl_i8;
        labelsI[9] = lbl_i9;
        labelsI[10] = lbl_i10;
        labelsI[11] = lbl_i11;
    }
    
    
//================CLEAR INPUT ARRAY=================================================//
    public void clearArrayA()
    {
        pnl_order.setVisible(false);
        lbl_aSize.setVisible(false);

        lbl_n1.setVisible(false);
        lbl_n2.setVisible(false);
        lbl_n3.setVisible(false);
        lbl_n4.setVisible(false);
        lbl_n5.setVisible(false);
        lbl_n6.setVisible(false);
        lbl_n7.setVisible(false);
        lbl_n8.setVisible(false);
        lbl_n9.setVisible(false);
        lbl_n10.setVisible(false);
        lbl_n11.setVisible(false);
        lbl_n12.setVisible(false);
        
        btn_asc.setEnabled(true);
        btn_dsc.setEnabled(true);
        
    }
    
//=========================CLEAR SORTED ARRAY=============================================//
    public void clearSortingA()
    {
        pnl_sorting.setVisible(false);

        lbl_s1.setVisible(false);
        lbl_s2.setVisible(false);
        lbl_s3.setVisible(false);
        lbl_s4.setVisible(false);
        lbl_s5.setVisible(false);
        lbl_s6.setVisible(false);
        lbl_s7.setVisible(false);
        lbl_s8.setVisible(false);
        lbl_s9.setVisible(false);
        lbl_s10.setVisible(false);
        lbl_s11.setVisible(false);
        lbl_s12.setVisible(false);
                
        lbl_i0.setVisible(false);
        lbl_i1.setVisible(false);
        lbl_i2.setVisible(false);
        lbl_i3.setVisible(false);
        lbl_i4.setVisible(false);
        lbl_i5.setVisible(false);
        lbl_i6.setVisible(false);
        lbl_i7.setVisible(false);
        lbl_i8.setVisible(false);
        lbl_i9.setVisible(false);
        lbl_i10.setVisible(false);
        lbl_i11.setVisible(false);
        
        clearDots();
        lbl_finish.setVisible(false);
        lbl_finishI.setVisible(false);
        lbl_arrow.setVisible(false);
        lbl_swap.setVisible(false);
        lbl_tf.setVisible(false);
        pnl_show.setVisible(false);
    }

//=========================CLEAR PROGRASS DOTS=============================================//
    public void clearDots()
    {
        lbl_finish1.setVisible(false);
        lbl_finish2.setVisible(false);
        lbl_finish3.setVisible(false);
        lbl_finish4.setVisible(false);
        lbl_finish5.setVisible(false);
        
    }
   
    
//=========================SORTING THE ARRAY=============================================//    
    public void sortingArray(int a, int b){
        
        int temp;
        try{
            lbl_line4.setBackground(new java.awt.Color(0,0,102));               //HIGHLIGHT THE RELATED ALOGITHM LINE 4               
            lbl_algoSign.setBackground(new java.awt.Color(0,0,102));               //HIGHLIGHT THE RELATED ALOGITHM LINE 4               
            
            lbl_tf.setBackground(new java.awt.Color(0,0,102));
            lbl_tf.setText("TRUE");                                             //DISPLAY WHETHER THE 5TH LINE IS TRUE OR FLASE
            lbl_tf.setVisible(true);
            sortThread.sleep(1500);
            lbl_line4.setBackground(new java.awt.Color(21,101,192));            //CHANGE THE COLOR OF LINE INTO PREVIOUS COLOR
            lbl_algoSign.setBackground(new java.awt.Color(21,101,192));            //CHANGE THE COLOR OF LINE INTO PREVIOUS COLOR
            lbl_tf.setBackground(new java.awt.Color(21,101,192));

            lbl_swap.setVisible(true);                                          //HIGHLIGHT THE RELATED ALOGITHM LINE 5,6,7
            lbl_line5.setBackground(new java.awt.Color(0,0,102));
            lbl_line6.setBackground(new java.awt.Color(0,0,102));
            lbl_line7.setBackground(new java.awt.Color(0,0,102));
            sortThread.sleep(1500);
            
            //--SWAP THE ELEMENTS AND DISPLAY THEM ON LABLES
            temp = array[a];
            array[a] = array [b] ;
            labelsOut[a].setText(labelsOut[b].getText());
            array [b] = temp; 
            labelsOut[b].setText(Integer.toString(temp));
        }
        
        catch(InterruptedException v){
            System.out.println(v);
        }
            
    }
    
    
    //=========================THREAD TO BLINK DOTS=====================================//
    Thread dots = new Thread()
    {
        public void run()
        {
            try{
                while(lbl_finish.getText().equals("Array is Still Sorting")){       
                    //DISPLAY DOT ONE AFTER THE OTHER
                    lbl_finish1.setVisible(true);
                    dots.sleep(500);
                    lbl_finish2.setVisible(true);
                    dots.sleep(500);
                    lbl_finish3.setVisible(true);
                    dots.sleep(500);
                    lbl_finish4.setVisible(true);
                    dots.sleep(500);
                    lbl_finish5.setVisible(true);
                    dots.sleep(500);
                    
                    clearDots();                                                
                    dots.sleep(200);
                    
                }
            }
            catch(InterruptedException v){
                System.out.println(v);
            }
            catch(IllegalThreadStateException v){
                System.out.println("array is still sorting");
            }
        }
    };
     
    //============================THREAD TO SORT ELEMENTS================================//
    Thread sortThread = new Thread() 
    {
        public void run()                                   
        {            
            try
            {
              //=====DISPLAY USER INPUT ARRAY ELEMENT IN BELOW ARRAY WHICH IS UDER TO DISPLAY SORTING=====//
                int a = 0;
                while(a<12 && a<noOfUserInputs) {                                           //CHECK WHETHER THE ARRAY ELEMNT IS NOT 0
                    for (int j=0; j<labelsOut.length; j++) {
                        if (!labelsOut[j].isVisible()) {                         //CHECK WHETHER THE LABLE IS VISIBLE
                            labelsI[j].setVisible(true); 
                            labelsOut[j].setVisible(true);                       //IF LABLE IS NOT VISIBLE MAKE IT VISIBLE
                            labelsOut[j].setText(labelsIn[j].getText());         //SET USER INPUT VALUE TO THAT VARIABLE
                            break;
                        }                    
                    }
                    a++;
                    sortThread.sleep(200);
                }                
                sortThread.sleep(1500);
                
                
              //=================START OF SORTING=======================================//
            
                //int temp;
                lbl_line1.setBackground(new java.awt.Color(0,0,102));           //HIGHLIGHT THE RELATED ALOGITHM LINE 1
                sortThread.sleep(1000);
                lbl_line1.setBackground(new java.awt.Color(21,101,192));

                
                for (int pass = 1; pass < noOfUserInputs; pass++) 
                {
                    lbl_finish.setVisible(true);                            //MALE ARRAY PROGRESS LABEL VISIBLE
                    lbl_finish.setText("Array is Still Sorting");      //SHOW MESSAGE THAT ARRAY IS STILL SORTING
                    if(!dots.isAlive())                                //STARTING POINT OF THE dots THREAD
                        dots.start();
                    
                    lbl_line2.setBackground(new java.awt.Color(0,0,102));           //HIGHLIGHT THE RELATED ALOGITHM LINE
                    sortThread.sleep(1300);
                    lbl_line2.setBackground(new java.awt.Color(21,101,192));
                    
                    int current = 50;                             //VARIABLE TO KEEP TRACK OF CURRENT POISTION OF THE GREEN POINTER AND SWAP MESSAGE
                    int next = 60;                                //DEFINES X DIRECTION ON EACH STEP
                    
                    lbl_arrow.setBounds(50, 90, 90, 60);               //BRING GREEN ARROW TO THE BEGINING
                    lbl_swap.setBounds(50, 140, 90, 35);               //BRING SWAP MESSAGE TO THE BEGINING
                                                                                
                    for (int i = 0; i < noOfUserInputs-pass; i++) 
                    {
                        lbl_line3.setBackground(new java.awt.Color(0,0,102));   //HIGHLIGHT THE RELATED ALOGITHM LINE
                        lbl_arrow.setVisible(true);                             //MAKE GREEN POINTER VISIBLE
                        sortThread.sleep(1300);
                        lbl_line3.setBackground(new java.awt.Color(21,101,192));
                        
                        //MAKE SWAP PANEL DISPALY AND DISPALY RELEVANT VALUES
                        pnl_show.setVisible(true);                              
                        lbl_i.setText(labelsOut[i].getText());                     
                        lbl_ii.setText(labelsOut[i+1].getText());
                        
                        
                        //--SORT ARRAY IN ASCENDING ORDER--------------------//
                        if (array[i] > array[i+1] && choiceAscen == 1) {
                            sortingArray(i, i+1);                        
                        }
                        
                        //--SORT ARRAY IN DESCENDING ORDER--------------------//
                        else if (array[i] < array[i+1] && choiceDescen == 1) {
                            sortingArray(i, i+1);                      
                        }
                        
                        //--IF CONDTION/4th LINE IS FLASE DO THIS
                        else{
                            lbl_line4.setBackground(new java.awt.Color(0,0,102));
                            lbl_algoSign.setBackground(new java.awt.Color(0,0,102));
                            lbl_tf.setBackground(new java.awt.Color(0,0,102));
                            lbl_tf.setText("FALSE");     
                            lbl_tf.setVisible(true);
                            sortThread.sleep(1000);
                            lbl_tf.setBackground(new java.awt.Color(21,101,192));
                            lbl_line4.setBackground(new java.awt.Color(21,101,192));                            
                            lbl_algoSign.setBackground(new java.awt.Color(21,101,192));                            
                        }
                        
                        sortThread.sleep(1500);
                        pnl_show.setVisible(false);
                        lbl_swap.setVisible(false);
                        
                        //MOVING GREEN ARROW AND SWAP MESSAGE TO RIGHT
                        if(i< noOfUserInputs-pass-1){
                            AC.jLabelXRight(current, current+next, 5, 2, lbl_arrow);
                            AC.jLabelXRight(current, current+next, 5, 2, lbl_swap);
                            current = current+next;
                        }
                        lbl_tf.setVisible(false);
                        lbl_line5.setBackground(new java.awt.Color(21,101,192));            //CHANGE THE ALGORITHM COLORS INTO PREVIOUS COLORS
                        lbl_line6.setBackground(new java.awt.Color(21,101,192));
                        lbl_line7.setBackground(new java.awt.Color(21,101,192));
                        //END OF INNER LOOP
                    }
                    labelsOut[noOfUserInputs-pass].setBackground(new java.awt.Color(204,0,51));         //COLOR THE LAST SORTED ELEMENTS
                    lbl_arrow.setVisible(false);                    
                    sortThread.sleep(1500);
                    //END OF OUTER LOOP                    
                }
                
                //----------THINGS TO DO WHEN SOTRING IS COMPLETED
                lbl_arrow.setVisible(false);                                                    //MAKE GREEN ARROW INVISIBLE
                lbl_swap.setVisible(false);                                                    //MAKE GREEN ARROW INVISIBLE
                labelsOut[0].setBackground(new java.awt.Color(204,0,51));  
                
                lbl_finish.setText("Array is SORTED");                                          //NOTIFY THAT ARRAY SORTING IS FINISH
                lbl_finish.setForeground(new java.awt.Color(0,0,48)); 
                Font f = lbl_finish.getFont();                                                  //MAKE LABEL FONT TO BOLD                                
                lbl_finish.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
                lbl_finishI.setVisible(true);                                                   
                
                while(dots.isAlive())                                                           //IF dots THREAD IS STILL ALIVE MAKE DOTS INVISIBLE
                    clearDots();          
                
            }
            
            catch(InterruptedException v){
                System.out.println(v);
            }
            catch(IllegalThreadStateException v){
                System.out.println("array is still sorting");
            }            
        }  
    };

           
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_heading = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnl_heading1 = new javax.swing.JPanel();
        pnl_edit = new javax.swing.JPanel();
        pnl_algorithm = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnl_bubbleAlgo = new javax.swing.JPanel();
        lbl_tf = new javax.swing.JLabel();
        lbl_algoSign = new javax.swing.JLabel();
        lbl_line1 = new javax.swing.JLabel();
        lbl_line2 = new javax.swing.JLabel();
        lbl_line3 = new javax.swing.JLabel();
        lbl_line4 = new javax.swing.JLabel();
        lbl_line5 = new javax.swing.JLabel();
        lbl_line6 = new javax.swing.JLabel();
        lbl_line7 = new javax.swing.JLabel();
        pnl_sortDisplay = new javax.swing.JPanel();
        btn_random = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_inputs = new javax.swing.JTextField();
        btn_create = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        pnl_array = new javax.swing.JPanel();
        lbl_n1 = new javax.swing.JLabel();
        lbl_n2 = new javax.swing.JLabel();
        lbl_n3 = new javax.swing.JLabel();
        lbl_n4 = new javax.swing.JLabel();
        lbl_n5 = new javax.swing.JLabel();
        lbl_n6 = new javax.swing.JLabel();
        lbl_n7 = new javax.swing.JLabel();
        lbl_n8 = new javax.swing.JLabel();
        lbl_n9 = new javax.swing.JLabel();
        lbl_n10 = new javax.swing.JLabel();
        lbl_n11 = new javax.swing.JLabel();
        lbl_n12 = new javax.swing.JLabel();
        lbl_aSize = new javax.swing.JLabel();
        pnl_sorting = new javax.swing.JPanel();
        lbl_s1 = new javax.swing.JLabel();
        lbl_s2 = new javax.swing.JLabel();
        lbl_s3 = new javax.swing.JLabel();
        lbl_s4 = new javax.swing.JLabel();
        lbl_s5 = new javax.swing.JLabel();
        lbl_s6 = new javax.swing.JLabel();
        lbl_s7 = new javax.swing.JLabel();
        lbl_s8 = new javax.swing.JLabel();
        lbl_s9 = new javax.swing.JLabel();
        lbl_s10 = new javax.swing.JLabel();
        lbl_s11 = new javax.swing.JLabel();
        lbl_s12 = new javax.swing.JLabel();
        lbl_finishI = new javax.swing.JLabel();
        lbl_finish1 = new javax.swing.JLabel();
        lbl_finish2 = new javax.swing.JLabel();
        lbl_finish3 = new javax.swing.JLabel();
        lbl_finish4 = new javax.swing.JLabel();
        lbl_finish5 = new javax.swing.JLabel();
        lbl_finish = new javax.swing.JLabel();
        lbl_arrow = new javax.swing.JLabel();
        lbl_swap = new javax.swing.JLabel();
        pnl_show = new javax.swing.JPanel();
        lbl_i = new javax.swing.JLabel();
        lbl_ii = new javax.swing.JLabel();
        lbl_swap1 = new javax.swing.JLabel();
        lbl_sign = new javax.swing.JLabel();
        lbl_swap5 = new javax.swing.JLabel();
        lbl_swap6 = new javax.swing.JLabel();
        lbl_i0 = new javax.swing.JLabel();
        lbl_i1 = new javax.swing.JLabel();
        lbl_i2 = new javax.swing.JLabel();
        lbl_i3 = new javax.swing.JLabel();
        lbl_i4 = new javax.swing.JLabel();
        lbl_i5 = new javax.swing.JLabel();
        lbl_i6 = new javax.swing.JLabel();
        lbl_i7 = new javax.swing.JLabel();
        lbl_i8 = new javax.swing.JLabel();
        lbl_i9 = new javax.swing.JLabel();
        lbl_i10 = new javax.swing.JLabel();
        lbl_i11 = new javax.swing.JLabel();
        pnl_order = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_asc = new javax.swing.JButton();
        btn_dsc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1145, 590));
        setMinimumSize(new java.awt.Dimension(1145, 590));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1145, 590));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(26, 26, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(1145, 638));
        jPanel1.setLayout(null);

        pnl_heading.setBackground(new java.awt.Color(40, 53, 147));
        pnl_heading.setToolTipText("");
        pnl_heading.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUBBLE SORT");
        pnl_heading.add(jLabel1);
        jLabel1.setBounds(350, 10, 350, 30);

        jPanel8.setBackground(new java.awt.Color(57, 73, 171));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa/ic_close_white_24dp_1x.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel4);
        jLabel4.setBounds(13, 10, 30, 30);

        pnl_heading.add(jPanel8);
        jPanel8.setBounds(1095, 0, 50, 50);

        jPanel9.setBackground(new java.awt.Color(57, 73, 171));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa/back.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel5);
        jLabel5.setBounds(10, 10, 30, 30);

        pnl_heading.add(jPanel9);
        jPanel9.setBounds(0, 0, 50, 50);

        jPanel1.add(pnl_heading);
        pnl_heading.setBounds(0, 0, 1145, 50);

        pnl_heading1.setBackground(new java.awt.Color(13, 71, 161));
        pnl_heading1.setToolTipText("");
        pnl_heading1.setLayout(null);
        jPanel1.add(pnl_heading1);
        pnl_heading1.setBounds(0, 615, 1146, 23);

        pnl_edit.setLayout(null);

        pnl_algorithm.setBackground(new java.awt.Color(21, 101, 192));
        pnl_algorithm.setLayout(null);

        jLabel7.setBackground(new java.awt.Color(13, 71, 161));
        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Algorithm");
        jLabel7.setOpaque(true);
        pnl_algorithm.add(jLabel7);
        jLabel7.setBounds(0, 0, 360, 70);

        pnl_bubbleAlgo.setBackground(new java.awt.Color(21, 101, 192));
        pnl_bubbleAlgo.setLayout(null);

        lbl_tf.setBackground(new java.awt.Color(21, 101, 192));
        lbl_tf.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 20)); // NOI18N
        lbl_tf.setForeground(new java.awt.Color(117, 255, 3));
        lbl_tf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tf.setText("FALSE");
        lbl_tf.setOpaque(true);
        pnl_bubbleAlgo.add(lbl_tf);
        lbl_tf.setBounds(270, 185, 70, 30);

        lbl_algoSign.setBackground(new java.awt.Color(21, 101, 192));
        lbl_algoSign.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        lbl_algoSign.setForeground(new java.awt.Color(255, 255, 255));
        lbl_algoSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_algoSign.setText("<");
        lbl_algoSign.setOpaque(true);
        pnl_bubbleAlgo.add(lbl_algoSign);
        lbl_algoSign.setBounds(170, 180, 20, 38);

        lbl_line1.setBackground(new java.awt.Color(21, 101, 192));
        lbl_line1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        lbl_line1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_line1.setText("1.     int temp;");
        lbl_line1.setOpaque(true);
        pnl_bubbleAlgo.add(lbl_line1);
        lbl_line1.setBounds(12, 60, 328, 38);

        lbl_line2.setBackground(new java.awt.Color(21, 101, 192));
        lbl_line2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        lbl_line2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_line2.setText("2.    for (int pass=1;  pass<size;  pass++)");
        lbl_line2.setOpaque(true);
        pnl_bubbleAlgo.add(lbl_line2);
        lbl_line2.setBounds(12, 100, 328, 38);

        lbl_line3.setBackground(new java.awt.Color(21, 101, 192));
        lbl_line3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        lbl_line3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_line3.setText("3.           for (int i=0;  i<size – pass;   i++)\t ");
        lbl_line3.setOpaque(true);
        pnl_bubbleAlgo.add(lbl_line3);
        lbl_line3.setBounds(12, 140, 328, 38);

        lbl_line4.setBackground(new java.awt.Color(21, 101, 192));
        lbl_line4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        lbl_line4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_line4.setText("4.                  if ( array [i] > array [i+1] )");
        lbl_line4.setOpaque(true);
        pnl_bubbleAlgo.add(lbl_line4);
        lbl_line4.setBounds(12, 180, 328, 38);

        lbl_line5.setBackground(new java.awt.Color(21, 101, 192));
        lbl_line5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        lbl_line5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_line5.setText("5.                        temp = array[i] ; ");
        lbl_line5.setOpaque(true);
        pnl_bubbleAlgo.add(lbl_line5);
        lbl_line5.setBounds(12, 220, 328, 38);

        lbl_line6.setBackground(new java.awt.Color(21, 101, 192));
        lbl_line6.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        lbl_line6.setForeground(new java.awt.Color(255, 255, 255));
        lbl_line6.setText("6.                        array[i] = array [i+1] ; ");
        lbl_line6.setOpaque(true);
        pnl_bubbleAlgo.add(lbl_line6);
        lbl_line6.setBounds(12, 260, 328, 38);

        lbl_line7.setBackground(new java.awt.Color(21, 101, 192));
        lbl_line7.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        lbl_line7.setForeground(new java.awt.Color(255, 255, 255));
        lbl_line7.setText("7.                        array [i+1] = temp ; ");
        lbl_line7.setOpaque(true);
        pnl_bubbleAlgo.add(lbl_line7);
        lbl_line7.setBounds(12, 300, 328, 38);

        pnl_algorithm.add(pnl_bubbleAlgo);
        pnl_bubbleAlgo.setBounds(0, 50, 360, 515);

        pnl_edit.add(pnl_algorithm);
        pnl_algorithm.setBounds(0, 0, 360, 565);

        pnl_sortDisplay.setBackground(new java.awt.Color(25, 118, 210));
        pnl_sortDisplay.setLayout(null);

        btn_random.setBackground(new java.awt.Color(3, 169, 244));
        btn_random.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btn_random.setForeground(new java.awt.Color(255, 255, 255));
        btn_random.setText("Generate Random Numbers");
        btn_random.setBorder(null);
        btn_random.setBorderPainted(false);
        btn_random.setContentAreaFilled(false);
        btn_random.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_random.setOpaque(true);
        btn_random.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_randomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_randomMouseExited(evt);
            }
        });
        btn_random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_randomActionPerformed(evt);
            }
        });
        pnl_sortDisplay.add(btn_random);
        btn_random.setBounds(535, 75, 230, 28);

        jPanel2.setBackground(new java.awt.Color(30, 136, 229));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Vales");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 90, 30);

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 228, 236));
        jLabel3.setText("*****Seperate values by spaces ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(100, 30, 260, 30);

        txt_inputs.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jPanel2.add(txt_inputs);
        txt_inputs.setBounds(100, 10, 420, 26);

        btn_create.setBackground(new java.awt.Color(3, 169, 244));
        btn_create.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btn_create.setForeground(new java.awt.Color(255, 255, 255));
        btn_create.setText("Create Array");
        btn_create.setBorder(null);
        btn_create.setBorderPainted(false);
        btn_create.setContentAreaFilled(false);
        btn_create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_create.setOpaque(true);
        btn_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_createMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_createMouseExited(evt);
            }
        });
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });
        jPanel2.add(btn_create);
        btn_create.setBounds(530, 10, 110, 28);

        btn_reset.setBackground(new java.awt.Color(3, 169, 244));
        btn_reset.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setText("Reset Array");
        btn_reset.setBorder(null);
        btn_reset.setBorderPainted(false);
        btn_reset.setContentAreaFilled(false);
        btn_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reset.setOpaque(true);
        btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_resetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_resetMouseExited(evt);
            }
        });
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reset);
        btn_reset.setBounds(650, 10, 110, 28);

        pnl_sortDisplay.add(jPanel2);
        jPanel2.setBounds(6, 10, 773, 60);

        pnl_array.setBackground(new java.awt.Color(25, 118, 210));
        pnl_array.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        pnl_array.setLayout(null);

        lbl_n1.setBackground(new java.awt.Color(0, 0, 48));
        lbl_n1.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lbl_n1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_n1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_n1.setText("1234");
        lbl_n1.setOpaque(true);
        pnl_array.add(lbl_n1);
        lbl_n1.setBounds(110, 40, 40, 40);

        lbl_n2.setBackground(new java.awt.Color(0, 0, 48));
        lbl_n2.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lbl_n2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_n2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_n2.setText("1234");
        lbl_n2.setOpaque(true);
        pnl_array.add(lbl_n2);
        lbl_n2.setBounds(155, 40, 40, 40);

        lbl_n3.setBackground(new java.awt.Color(0, 0, 48));
        lbl_n3.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lbl_n3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_n3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_n3.setText("1234");
        lbl_n3.setOpaque(true);
        pnl_array.add(lbl_n3);
        lbl_n3.setBounds(200, 40, 40, 40);

        lbl_n4.setBackground(new java.awt.Color(0, 0, 48));
        lbl_n4.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lbl_n4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_n4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_n4.setText("1234");
        lbl_n4.setOpaque(true);
        pnl_array.add(lbl_n4);
        lbl_n4.setBounds(245, 40, 40, 40);

        lbl_n5.setBackground(new java.awt.Color(0, 0, 48));
        lbl_n5.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lbl_n5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_n5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_n5.setText("1234");
        lbl_n5.setOpaque(true);
        pnl_array.add(lbl_n5);
        lbl_n5.setBounds(290, 40, 40, 40);

        lbl_n6.setBackground(new java.awt.Color(0, 0, 48));
        lbl_n6.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lbl_n6.setForeground(new java.awt.Color(255, 255, 255));
        lbl_n6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_n6.setText("1234");
        lbl_n6.setOpaque(true);
        pnl_array.add(lbl_n6);
        lbl_n6.setBounds(335, 40, 40, 40);

        lbl_n7.setBackground(new java.awt.Color(0, 0, 48));
        lbl_n7.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lbl_n7.setForeground(new java.awt.Color(255, 255, 255));
        lbl_n7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_n7.setText("1234");
        lbl_n7.setOpaque(true);
        pnl_array.add(lbl_n7);
        lbl_n7.setBounds(380, 40, 40, 40);

        lbl_n8.setBackground(new java.awt.Color(0, 0, 48));
        lbl_n8.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lbl_n8.setForeground(new java.awt.Color(255, 255, 255));
        lbl_n8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_n8.setText("1234");
        lbl_n8.setOpaque(true);
        pnl_array.add(lbl_n8);
        lbl_n8.setBounds(425, 40, 40, 40);

        lbl_n9.setBackground(new java.awt.Color(0, 0, 48));
        lbl_n9.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lbl_n9.setForeground(new java.awt.Color(255, 255, 255));
        lbl_n9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_n9.setText("1234");
        lbl_n9.setOpaque(true);
        pnl_array.add(lbl_n9);
        lbl_n9.setBounds(470, 40, 40, 40);

        lbl_n10.setBackground(new java.awt.Color(0, 0, 48));
        lbl_n10.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lbl_n10.setForeground(new java.awt.Color(255, 255, 255));
        lbl_n10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_n10.setText("1234");
        lbl_n10.setOpaque(true);
        pnl_array.add(lbl_n10);
        lbl_n10.setBounds(515, 40, 40, 40);

        lbl_n11.setBackground(new java.awt.Color(0, 0, 48));
        lbl_n11.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lbl_n11.setForeground(new java.awt.Color(255, 255, 255));
        lbl_n11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_n11.setText("1234");
        lbl_n11.setOpaque(true);
        pnl_array.add(lbl_n11);
        lbl_n11.setBounds(560, 40, 40, 40);

        lbl_n12.setBackground(new java.awt.Color(0, 0, 48));
        lbl_n12.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lbl_n12.setForeground(new java.awt.Color(255, 255, 255));
        lbl_n12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_n12.setText("1234");
        lbl_n12.setOpaque(true);
        pnl_array.add(lbl_n12);
        lbl_n12.setBounds(605, 40, 40, 40);

        lbl_aSize.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_aSize.setForeground(new java.awt.Color(255, 255, 255));
        lbl_aSize.setText("Array Size");
        pnl_array.add(lbl_aSize);
        lbl_aSize.setBounds(10, 10, 170, 30);

        pnl_sortDisplay.add(pnl_array);
        pnl_array.setBounds(6, 85, 773, 90);

        pnl_sorting.setBackground(new java.awt.Color(25, 118, 210));
        pnl_sorting.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnl_sorting.setLayout(null);

        lbl_s1.setBackground(new java.awt.Color(0, 0, 40));
        lbl_s1.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        lbl_s1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_s1.setText("888");
        lbl_s1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_s1.setOpaque(true);
        pnl_sorting.add(lbl_s1);
        lbl_s1.setBounds(30, 30, 55, 50);

        lbl_s2.setBackground(new java.awt.Color(0, 0, 40));
        lbl_s2.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        lbl_s2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_s2.setText("1234");
        lbl_s2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_s2.setOpaque(true);
        pnl_sorting.add(lbl_s2);
        lbl_s2.setBounds(90, 30, 55, 50);

        lbl_s3.setBackground(new java.awt.Color(0, 0, 40));
        lbl_s3.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        lbl_s3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_s3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_s3.setText("1234");
        lbl_s3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_s3.setOpaque(true);
        pnl_sorting.add(lbl_s3);
        lbl_s3.setBounds(150, 30, 55, 50);

        lbl_s4.setBackground(new java.awt.Color(0, 0, 40));
        lbl_s4.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        lbl_s4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_s4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_s4.setText("1234");
        lbl_s4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_s4.setOpaque(true);
        pnl_sorting.add(lbl_s4);
        lbl_s4.setBounds(210, 30, 55, 50);

        lbl_s5.setBackground(new java.awt.Color(0, 0, 40));
        lbl_s5.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        lbl_s5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_s5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_s5.setText("1234");
        lbl_s5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_s5.setOpaque(true);
        pnl_sorting.add(lbl_s5);
        lbl_s5.setBounds(270, 30, 55, 50);

        lbl_s6.setBackground(new java.awt.Color(0, 0, 40));
        lbl_s6.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        lbl_s6.setForeground(new java.awt.Color(255, 255, 255));
        lbl_s6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_s6.setText("1234");
        lbl_s6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_s6.setOpaque(true);
        pnl_sorting.add(lbl_s6);
        lbl_s6.setBounds(330, 30, 55, 50);

        lbl_s7.setBackground(new java.awt.Color(0, 0, 40));
        lbl_s7.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        lbl_s7.setForeground(new java.awt.Color(255, 255, 255));
        lbl_s7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_s7.setText("1234");
        lbl_s7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_s7.setOpaque(true);
        pnl_sorting.add(lbl_s7);
        lbl_s7.setBounds(390, 30, 55, 50);

        lbl_s8.setBackground(new java.awt.Color(0, 0, 40));
        lbl_s8.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        lbl_s8.setForeground(new java.awt.Color(255, 255, 255));
        lbl_s8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_s8.setText("1234");
        lbl_s8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_s8.setOpaque(true);
        pnl_sorting.add(lbl_s8);
        lbl_s8.setBounds(450, 30, 55, 50);

        lbl_s9.setBackground(new java.awt.Color(0, 0, 40));
        lbl_s9.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        lbl_s9.setForeground(new java.awt.Color(255, 255, 255));
        lbl_s9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_s9.setText("1234");
        lbl_s9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_s9.setOpaque(true);
        pnl_sorting.add(lbl_s9);
        lbl_s9.setBounds(510, 30, 55, 50);

        lbl_s10.setBackground(new java.awt.Color(0, 0, 40));
        lbl_s10.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        lbl_s10.setForeground(new java.awt.Color(255, 255, 255));
        lbl_s10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_s10.setText("1234");
        lbl_s10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_s10.setOpaque(true);
        pnl_sorting.add(lbl_s10);
        lbl_s10.setBounds(570, 30, 55, 50);

        lbl_s11.setBackground(new java.awt.Color(0, 0, 40));
        lbl_s11.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        lbl_s11.setForeground(new java.awt.Color(255, 255, 255));
        lbl_s11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_s11.setText("1234");
        lbl_s11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_s11.setOpaque(true);
        pnl_sorting.add(lbl_s11);
        lbl_s11.setBounds(630, 30, 55, 50);

        lbl_s12.setBackground(new java.awt.Color(0, 0, 40));
        lbl_s12.setFont(new java.awt.Font("Leelawadee UI", 0, 22)); // NOI18N
        lbl_s12.setForeground(new java.awt.Color(255, 255, 255));
        lbl_s12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_s12.setText("1234");
        lbl_s12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_s12.setOpaque(true);
        pnl_sorting.add(lbl_s12);
        lbl_s12.setBounds(690, 30, 55, 50);

        lbl_finishI.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lbl_finishI.setForeground(new java.awt.Color(204, 204, 204));
        lbl_finishI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa/ic_done_black_24dp_1x.png"))); // NOI18N
        pnl_sorting.add(lbl_finishI);
        lbl_finishI.setBounds(570, 210, 30, 30);

        lbl_finish1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        lbl_finish1.setForeground(new java.awt.Color(189, 189, 189));
        lbl_finish1.setText(".");
        pnl_sorting.add(lbl_finish1);
        lbl_finish1.setBounds(600, 210, 10, 30);

        lbl_finish2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        lbl_finish2.setForeground(new java.awt.Color(189, 189, 189));
        lbl_finish2.setText(".");
        pnl_sorting.add(lbl_finish2);
        lbl_finish2.setBounds(610, 210, 10, 30);

        lbl_finish3.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        lbl_finish3.setForeground(new java.awt.Color(189, 189, 189));
        lbl_finish3.setText(".");
        pnl_sorting.add(lbl_finish3);
        lbl_finish3.setBounds(620, 210, 10, 30);

        lbl_finish4.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        lbl_finish4.setForeground(new java.awt.Color(189, 189, 189));
        lbl_finish4.setText(".");
        pnl_sorting.add(lbl_finish4);
        lbl_finish4.setBounds(630, 210, 10, 30);

        lbl_finish5.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        lbl_finish5.setForeground(new java.awt.Color(189, 189, 189));
        lbl_finish5.setText(".");
        pnl_sorting.add(lbl_finish5);
        lbl_finish5.setBounds(640, 210, 10, 30);

        lbl_finish.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        lbl_finish.setForeground(new java.awt.Color(189, 189, 189));
        lbl_finish.setText("Array is Still Sorting");
        pnl_sorting.add(lbl_finish);
        lbl_finish.setBounds(420, 210, 230, 30);

        lbl_arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa/drawing.png"))); // NOI18N
        pnl_sorting.add(lbl_arrow);
        lbl_arrow.setBounds(50, 90, 90, 60);

        lbl_swap.setBackground(new java.awt.Color(25, 118, 210));
        lbl_swap.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 20)); // NOI18N
        lbl_swap.setForeground(new java.awt.Color(245, 245, 245));
        lbl_swap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_swap.setText("swap ");
        lbl_swap.setOpaque(true);
        pnl_sorting.add(lbl_swap);
        lbl_swap.setBounds(50, 140, 90, 35);

        pnl_show.setBackground(new java.awt.Color(25, 118, 210));
        pnl_show.setLayout(null);

        lbl_i.setBackground(new java.awt.Color(25, 118, 210));
        lbl_i.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 20)); // NOI18N
        lbl_i.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_i.setText("1234");
        lbl_i.setOpaque(true);
        pnl_show.add(lbl_i);
        lbl_i.setBounds(50, 0, 50, 30);

        lbl_ii.setBackground(new java.awt.Color(25, 118, 210));
        lbl_ii.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 20)); // NOI18N
        lbl_ii.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ii.setText("1234");
        lbl_ii.setOpaque(true);
        pnl_show.add(lbl_ii);
        lbl_ii.setBounds(150, 0, 50, 30);

        lbl_swap1.setBackground(new java.awt.Color(25, 118, 210));
        lbl_swap1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 20)); // NOI18N
        lbl_swap1.setForeground(new java.awt.Color(245, 245, 245));
        lbl_swap1.setText(")");
        lbl_swap1.setOpaque(true);
        pnl_show.add(lbl_swap1);
        lbl_swap1.setBounds(220, 0, 30, 30);

        lbl_sign.setBackground(new java.awt.Color(25, 118, 210));
        lbl_sign.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 30)); // NOI18N
        lbl_sign.setForeground(new java.awt.Color(245, 245, 245));
        lbl_sign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sign.setText("<");
        lbl_sign.setOpaque(true);
        pnl_show.add(lbl_sign);
        lbl_sign.setBounds(110, -2, 30, 30);

        lbl_swap5.setBackground(new java.awt.Color(25, 118, 210));
        lbl_swap5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        lbl_swap5.setForeground(new java.awt.Color(245, 245, 245));
        lbl_swap5.setText("then swap ");
        lbl_swap5.setOpaque(true);
        pnl_show.add(lbl_swap5);
        lbl_swap5.setBounds(70, 30, 100, 30);

        lbl_swap6.setBackground(new java.awt.Color(25, 118, 210));
        lbl_swap6.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 20)); // NOI18N
        lbl_swap6.setForeground(new java.awt.Color(245, 245, 245));
        lbl_swap6.setText("if   (");
        lbl_swap6.setOpaque(true);
        pnl_show.add(lbl_swap6);
        lbl_swap6.setBounds(0, 0, 40, 30);

        pnl_sorting.add(pnl_show);
        pnl_show.setBounds(90, 200, 270, 80);

        lbl_i0.setBackground(new java.awt.Color(25, 118, 210));
        lbl_i0.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_i0.setForeground(new java.awt.Color(245, 245, 245));
        lbl_i0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_i0.setText("0");
        lbl_i0.setOpaque(true);
        pnl_sorting.add(lbl_i0);
        lbl_i0.setBounds(42, 0, 30, 30);

        lbl_i1.setBackground(new java.awt.Color(25, 118, 210));
        lbl_i1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_i1.setForeground(new java.awt.Color(245, 245, 245));
        lbl_i1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_i1.setText("1");
        lbl_i1.setOpaque(true);
        pnl_sorting.add(lbl_i1);
        lbl_i1.setBounds(102, 0, 30, 30);

        lbl_i2.setBackground(new java.awt.Color(25, 118, 210));
        lbl_i2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_i2.setForeground(new java.awt.Color(245, 245, 245));
        lbl_i2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_i2.setText("2");
        lbl_i2.setOpaque(true);
        pnl_sorting.add(lbl_i2);
        lbl_i2.setBounds(162, 0, 30, 30);

        lbl_i3.setBackground(new java.awt.Color(25, 118, 210));
        lbl_i3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_i3.setForeground(new java.awt.Color(245, 245, 245));
        lbl_i3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_i3.setText("3");
        lbl_i3.setOpaque(true);
        pnl_sorting.add(lbl_i3);
        lbl_i3.setBounds(222, 0, 30, 30);

        lbl_i4.setBackground(new java.awt.Color(25, 118, 210));
        lbl_i4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_i4.setForeground(new java.awt.Color(245, 245, 245));
        lbl_i4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_i4.setText("4");
        lbl_i4.setOpaque(true);
        pnl_sorting.add(lbl_i4);
        lbl_i4.setBounds(282, 0, 30, 30);

        lbl_i5.setBackground(new java.awt.Color(25, 118, 210));
        lbl_i5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_i5.setForeground(new java.awt.Color(245, 245, 245));
        lbl_i5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_i5.setText("5");
        lbl_i5.setOpaque(true);
        pnl_sorting.add(lbl_i5);
        lbl_i5.setBounds(342, 0, 30, 30);

        lbl_i6.setBackground(new java.awt.Color(25, 118, 210));
        lbl_i6.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_i6.setForeground(new java.awt.Color(245, 245, 245));
        lbl_i6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_i6.setText("6");
        lbl_i6.setOpaque(true);
        pnl_sorting.add(lbl_i6);
        lbl_i6.setBounds(402, 0, 30, 30);

        lbl_i7.setBackground(new java.awt.Color(25, 118, 210));
        lbl_i7.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_i7.setForeground(new java.awt.Color(245, 245, 245));
        lbl_i7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_i7.setText("7");
        lbl_i7.setOpaque(true);
        pnl_sorting.add(lbl_i7);
        lbl_i7.setBounds(462, 0, 30, 30);

        lbl_i8.setBackground(new java.awt.Color(25, 118, 210));
        lbl_i8.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_i8.setForeground(new java.awt.Color(245, 245, 245));
        lbl_i8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_i8.setText("8");
        lbl_i8.setOpaque(true);
        pnl_sorting.add(lbl_i8);
        lbl_i8.setBounds(522, 0, 30, 30);

        lbl_i9.setBackground(new java.awt.Color(25, 118, 210));
        lbl_i9.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_i9.setForeground(new java.awt.Color(245, 245, 245));
        lbl_i9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_i9.setText("9");
        lbl_i9.setOpaque(true);
        pnl_sorting.add(lbl_i9);
        lbl_i9.setBounds(582, 0, 30, 30);

        lbl_i10.setBackground(new java.awt.Color(25, 118, 210));
        lbl_i10.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_i10.setForeground(new java.awt.Color(245, 245, 245));
        lbl_i10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_i10.setText("10");
        lbl_i10.setOpaque(true);
        pnl_sorting.add(lbl_i10);
        lbl_i10.setBounds(642, 0, 30, 30);

        lbl_i11.setBackground(new java.awt.Color(25, 118, 210));
        lbl_i11.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_i11.setForeground(new java.awt.Color(245, 245, 245));
        lbl_i11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_i11.setText("11");
        lbl_i11.setOpaque(true);
        pnl_sorting.add(lbl_i11);
        lbl_i11.setBounds(704, 0, 30, 30);

        pnl_sortDisplay.add(pnl_sorting);
        pnl_sorting.setBounds(10, 270, 760, 300);
        pnl_sorting.getAccessibleContext().setAccessibleName("");

        pnl_order.setOpaque(false);
        pnl_order.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sort in :");
        pnl_order.add(jLabel6);
        jLabel6.setBounds(130, 10, 60, 30);

        btn_asc.setBackground(new java.awt.Color(153, 153, 255));
        btn_asc.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        btn_asc.setText("Ascending Order");
        btn_asc.setBorder(null);
        btn_asc.setBorderPainted(false);
        btn_asc.setContentAreaFilled(false);
        btn_asc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_asc.setEnabled(false);
        btn_asc.setOpaque(true);
        btn_asc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ascActionPerformed(evt);
            }
        });
        pnl_order.add(btn_asc);
        btn_asc.setBounds(200, 10, 180, 32);

        btn_dsc.setBackground(new java.awt.Color(153, 153, 255));
        btn_dsc.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        btn_dsc.setText("Descending Order");
        btn_dsc.setBorder(null);
        btn_dsc.setBorderPainted(false);
        btn_dsc.setContentAreaFilled(false);
        btn_dsc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_dsc.setEnabled(false);
        btn_dsc.setOpaque(true);
        btn_dsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dscActionPerformed(evt);
            }
        });
        pnl_order.add(btn_dsc);
        btn_dsc.setBounds(410, 10, 210, 32);

        pnl_sortDisplay.add(pnl_order);
        pnl_order.setBounds(10, 190, 760, 50);

        pnl_edit.add(pnl_sortDisplay);
        pnl_sortDisplay.setBounds(360, 0, 785, 565);

        jPanel1.add(pnl_edit);
        pnl_edit.setBounds(0, 50, 1145, 565);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1145, 638);

        setSize(new java.awt.Dimension(1145, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_createMouseEntered
        btn_create.setBackground(new java.awt.Color(5, 150, 160));
    }//GEN-LAST:event_btn_createMouseEntered

    private void btn_createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_createMouseExited
        btn_create.setBackground(new java.awt.Color(12, 173, 183));
    }//GEN-LAST:event_btn_createMouseExited

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        try{
            String inNums = txt_inputs.getText();                               //GET USER USER INPUT TO A VARIABLE

            String num;                                                         //VARIABLE TO STORE ONE ELEMENT AT A TIME
            int i=0;                                                            //VARIABLE TO KEEP TRACK OF ARRAY INDEX

            StringTokenizer token = new StringTokenizer(inNums, " ");


            if(inNums.matches("[\\d+\\s]+"))                                    //VALIDATE USER INPUT           //"\\s?[\\d+\\s]{2,12}"    
            {
                pnl_array.setVisible(true);
                clearArrayA();                                                  //CLEAR IF THERE IS ARRAY

                //===== display array size==============================//
                int arraySize = token.countTokens();                                
                lbl_aSize.setText("Array Size = " + arraySize);
                lbl_aSize.setVisible(true);

                //=============set elements in array lables===============//
                while (token.hasMoreTokens()) {
                    num = token.nextToken();                                    //GET VALUE AT ATIME                              
                    array[i] = Integer.parseInt(num);                           //CONVERT THAT VALUE TO INTEGER

                    //--SET VALUES TO LABELS
                    for (int j=0; j<labelsIn.length; j++) {
                        if (!labelsIn[j].isVisible()) {                         //CHECK WHETHER THE LABLE IS VISIBLE
                            labelsIn[j].setVisible(true);                       //IF LABLE IS NOT VISIBLE MAKE IT VISIBLE
                            labelsIn[j].setText(num);                           //SET USER INPUT VALUE TO THAT VARIABLE
                            break;
                        }                    
                    }   
                    i++;                                                        //INCREASE ARRAY INDEX
                }

                noOfUserInputs = arraySize;                                     //GET THE NUMBER OF USER INPUT NUMBERS TO VARIABLE

                pnl_order.setVisible(true);
                btn_asc.setEnabled(true);
                btn_dsc.setEnabled(true);
            }

            else{
                new Warning().setVisible(true);
                txt_inputs.setText("");
            }
        }
        catch(NumberFormatException e){
            new Warning().setVisible(true);
            txt_inputs.setText("");
            clearArrayA();                                                  //CLEAR IF THERE IS ARRAY            
        }
        //====to print array in output // error checking tool
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "  ");
        }
        System.out.print("\n oOfUserInputs = " + noOfUserInputs);
        
    }//GEN-LAST:event_btn_createActionPerformed

    private void btn_resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseEntered
        btn_reset.setBackground(new java.awt.Color(5, 150, 160));
    }//GEN-LAST:event_btn_resetMouseEntered

    private void btn_resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseExited
        btn_reset.setBackground(new java.awt.Color(12, 173, 183));
    }//GEN-LAST:event_btn_resetMouseExited

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        if(!sortThread.isAlive()){
            txt_inputs.setText("");
            clearArrayA();
            clearSortingA();
            
        }        
    }//GEN-LAST:event_btn_resetActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btn_ascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ascActionPerformed

        UIManager.getDefaults().put("Button.disabledText",Color.LIGHT_GRAY);
        btn_dsc.setEnabled(false);
        btn_reset.setEnabled(false);
        btn_create.setEnabled(false);
        btn_random.setEnabled(false);
        
        pnl_sorting.setVisible(true);
        
        choiceAscen = 1;
        choiceDescen = 0;        
        lbl_algoSign.setText(">");
        lbl_sign.setText(">");

        if(!sortThread.isAlive())
            sortThread.start();                 //START THE THREAD
        else
            System.out.println("thread still running");
        
        System.out.println("\n Main Thread exit");
        
    }//GEN-LAST:event_btn_ascActionPerformed

    private void btn_dscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dscActionPerformed
        UIManager.getDefaults().put("Button.disabledText",Color.LIGHT_GRAY);
        btn_asc.setEnabled(false);
        btn_reset.setEnabled(false);
        btn_create.setEnabled(false);
        btn_random.setEnabled(false);
        
        pnl_sorting.setVisible(true);
        
        choiceDescen = 1;
        choiceAscen = 0;
        lbl_algoSign.setText("<");
        lbl_sign.setText("<");
        
        if(!sortThread.isAlive())
            sortThread.start();                 //START THE THREAD
        else
            System.out.println("thread still running");
        
        System.out.println("\n Main Thread exit");
        
    }//GEN-LAST:event_btn_dscActionPerformed

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        System.exit(0);        
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel9MouseClicked

    private void btn_randomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_randomMouseEntered
        btn_random.setBackground(new java.awt.Color(5, 150, 160));
    }//GEN-LAST:event_btn_randomMouseEntered

    private void btn_randomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_randomMouseExited
        btn_random.setBackground(new java.awt.Color(12, 173, 183));
    }//GEN-LAST:event_btn_randomMouseExited

    private void btn_randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_randomActionPerformed

        pnl_array.setVisible(true);
        clearArrayA();                                                  //CLEAR IF THERE IS ARRAY

        //===== display array size==============================//
        int arraySize = 12;
        lbl_aSize.setText("Array Size = " + arraySize);
        lbl_aSize.setVisible(true);

        //--SET VALUES TO LABELS----------//
        for (int j=0; j<12; j++) {

            int random = 0;

            for (int k = 0; k < 12; k++) {
                random = (int) (Math.random()*100);        //generate random number;
                if (array[k] != random){
                    break;
                }
            }

            array[j] = random;

            labelsIn[j].setVisible(true);                       //IF LABLE IS NOT VISIBLE MAKE IT VISIBLE
            labelsIn[j].setText(Integer.toString(random));                           //SET USER INPUT VALUE TO THAT VARIABLE
            //break;

        }

        noOfUserInputs = arraySize;                                     //GET THE NUMBER OF USER INPUT NUMBERS TO VARIABLE

        pnl_order.setVisible(true);
        btn_asc.setEnabled(true);
        btn_dsc.setEnabled(true);

    }//GEN-LAST:event_btn_randomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BubbleSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BubbleSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BubbleSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BubbleSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BubbleSort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_asc;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_dsc;
    private javax.swing.JButton btn_random;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_aSize;
    private javax.swing.JLabel lbl_algoSign;
    private javax.swing.JLabel lbl_arrow;
    private javax.swing.JLabel lbl_finish;
    private javax.swing.JLabel lbl_finish1;
    private javax.swing.JLabel lbl_finish2;
    private javax.swing.JLabel lbl_finish3;
    private javax.swing.JLabel lbl_finish4;
    private javax.swing.JLabel lbl_finish5;
    private javax.swing.JLabel lbl_finishI;
    private javax.swing.JLabel lbl_i;
    private javax.swing.JLabel lbl_i0;
    private javax.swing.JLabel lbl_i1;
    private javax.swing.JLabel lbl_i10;
    private javax.swing.JLabel lbl_i11;
    private javax.swing.JLabel lbl_i2;
    private javax.swing.JLabel lbl_i3;
    private javax.swing.JLabel lbl_i4;
    private javax.swing.JLabel lbl_i5;
    private javax.swing.JLabel lbl_i6;
    private javax.swing.JLabel lbl_i7;
    private javax.swing.JLabel lbl_i8;
    private javax.swing.JLabel lbl_i9;
    private javax.swing.JLabel lbl_ii;
    private javax.swing.JLabel lbl_line1;
    private javax.swing.JLabel lbl_line2;
    private javax.swing.JLabel lbl_line3;
    private javax.swing.JLabel lbl_line4;
    private javax.swing.JLabel lbl_line5;
    private javax.swing.JLabel lbl_line6;
    private javax.swing.JLabel lbl_line7;
    private javax.swing.JLabel lbl_n1;
    private javax.swing.JLabel lbl_n10;
    private javax.swing.JLabel lbl_n11;
    private javax.swing.JLabel lbl_n12;
    private javax.swing.JLabel lbl_n2;
    private javax.swing.JLabel lbl_n3;
    private javax.swing.JLabel lbl_n4;
    private javax.swing.JLabel lbl_n5;
    private javax.swing.JLabel lbl_n6;
    private javax.swing.JLabel lbl_n7;
    private javax.swing.JLabel lbl_n8;
    private javax.swing.JLabel lbl_n9;
    private javax.swing.JLabel lbl_s1;
    private javax.swing.JLabel lbl_s10;
    private javax.swing.JLabel lbl_s11;
    private javax.swing.JLabel lbl_s12;
    private javax.swing.JLabel lbl_s2;
    private javax.swing.JLabel lbl_s3;
    private javax.swing.JLabel lbl_s4;
    private javax.swing.JLabel lbl_s5;
    private javax.swing.JLabel lbl_s6;
    private javax.swing.JLabel lbl_s7;
    private javax.swing.JLabel lbl_s8;
    private javax.swing.JLabel lbl_s9;
    private javax.swing.JLabel lbl_sign;
    private javax.swing.JLabel lbl_swap;
    private javax.swing.JLabel lbl_swap1;
    private javax.swing.JLabel lbl_swap5;
    private javax.swing.JLabel lbl_swap6;
    private javax.swing.JLabel lbl_tf;
    private javax.swing.JPanel pnl_algorithm;
    private javax.swing.JPanel pnl_array;
    private javax.swing.JPanel pnl_bubbleAlgo;
    private javax.swing.JPanel pnl_edit;
    private javax.swing.JPanel pnl_heading;
    private javax.swing.JPanel pnl_heading1;
    private javax.swing.JPanel pnl_order;
    private javax.swing.JPanel pnl_show;
    private javax.swing.JPanel pnl_sortDisplay;
    private javax.swing.JPanel pnl_sorting;
    private javax.swing.JTextField txt_inputs;
    // End of variables declaration//GEN-END:variables
}
