
import java.util.ArrayList;
import java.awt.Point;



public class main extends javax.swing.JFrame {

    public theShapes classOfShape;
    public double Wightx,Wighty,LR,TH,YA,YD,E,DiffInWeght,Iteration,xa ,xb ,ya, yb;
    public Point tempPoint;
    public ArrayList<theShapes>allShapes;
    public ArrayList<theShapes>AfterNormalized;



    public main() {
        initComponents();
        classOfShape=new theShapes();
        allShapes = new ArrayList<theShapes>();
        AfterNormalized = new ArrayList<theShapes>();

        if(numOfClasses.getSelectedIndex()==0)
        {
            circle.setEnabled(false);
            triangle.setEnabled(false);
            square.setEnabled(false);
            BlueSqure.setEnabled(false);
            Wightx=Wighty=E=0;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bg1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        circle = new javax.swing.JRadioButton();
        triangle = new javax.swing.JRadioButton();
        square = new javax.swing.JRadioButton();
        BlueSqure = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Classify = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        numOfIter = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        numOfClasses = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        LearningRate = new javax.swing.JTextField();
        p1 = new thePanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 948, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 732, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel4.setForeground(new java.awt.Color(139, 0, 0));
        jLabel4.setText("Learning rate:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(226, 164, 164));

        circle.setBackground(new java.awt.Color(225, 189, 202));
        bg1.add(circle);
        circle.setFont(new java.awt.Font("Arial", 1, 18));
        circle.setForeground(new java.awt.Color(139, 0, 0));
        circle.setText("Circle");
        circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleActionPerformed(evt);
            }
        });

        triangle.setBackground(new java.awt.Color(225, 189, 202));
        bg1.add(triangle);
        triangle.setFont(new java.awt.Font("Arial", 1, 18));
        triangle.setForeground(new java.awt.Color(139, 0, 0));
        triangle.setText("Triangle");

        square.setBackground(new java.awt.Color(225, 189, 202));
        bg1.add(square);
        square.setFont(new java.awt.Font("Arial", 1, 18));
        square.setForeground(new java.awt.Color(139, 0, 0));
        square.setText("Square");

        BlueSqure.setBackground(new java.awt.Color(225, 189, 202));
        bg1.add(BlueSqure);
        BlueSqure.setFont(new java.awt.Font("Arial", 1, 18));
        BlueSqure.setForeground(new java.awt.Color(139, 0, 0));
        BlueSqure.setText("Blue Squre");
        BlueSqure.setActionCommand("BlueSqure");
        BlueSqure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueSqureActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel1.setForeground(new java.awt.Color(139, 0, 0));
        jLabel1.setText("Binary &Multi Classification");

        Classify.setBackground(new java.awt.Color(102, 0, 0, 255));
        Classify.setFont(new java.awt.Font("Arial", 1, 18));
        Classify.setForeground(new java.awt.Color(255, 255, 255));
        Classify.setText("Train");
        Classify.setActionCommand("Train");
        Classify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClassifyMouseClicked(evt);
            }
        });
        Classify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassifyActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(225, 189, 202));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel2.setForeground(new java.awt.Color(139, 0, 0));
        jLabel2.setText("Classes #:");

        numOfIter.setFont(new java.awt.Font("Arial", 1, 18));
        numOfIter.setForeground(new java.awt.Color(139, 0, 0));

        jLabel3.setBackground(new java.awt.Color(225, 189, 202));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel3.setForeground(new java.awt.Color(139, 0, 0));
        jLabel3.setText("iteration #:");

        numOfClasses.setFont(new java.awt.Font("Arial", 1, 18));
        numOfClasses.setForeground(new java.awt.Color(139, 0, 0));
        numOfClasses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "2", "3", "4" }));
        numOfClasses.setToolTipText("");
        numOfClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfClassesActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(225, 189, 202));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel5.setForeground(new java.awt.Color(139, 0, 0));
        jLabel5.setText("Learning rate:");

        LearningRate.setFont(new java.awt.Font("Arial", 1, 18));
        LearningRate.setForeground(new java.awt.Color(139, 0, 0));
        LearningRate.setText("0.1");
        LearningRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LearningRateActionPerformed(evt);
            }
        });

        p1.setPreferredSize(new java.awt.Dimension(680, 375));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
                p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 680, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
                p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 375, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(numOfClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabel5)
                                                .addGap(28, 28, 28)
                                                .addComponent(LearningRate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addGap(27, 27, 27)
                                                .addComponent(numOfIter, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(125, 125, 125))
                                                .addGroup(layout.createSequentialGroup()
                                                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(circle, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(triangle, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(BlueSqure, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel1)))
                                                .addGap(44, 44, 44))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Classify, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(circle)
                                                .addGap(18, 18, 18)
                                                .addComponent(triangle)
                                                .addGap(18, 18, 18)
                                                .addComponent(square)
                                                .addGap(18, 18, 18)
                                                .addComponent(BlueSqure)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numOfClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LearningRate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numOfIter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(Classify)
                                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1MouseClicked(java.awt.event.MouseEvent evt) {//set the shapes on the empty panel
        classOfShape = new theShapes();
        Point p =new Point();
        int myx = evt.getX();
        int myy=evt.getY();
        p.x=myx;
        p.y=myy;
        //but the selected shape in this x and y
        classOfShape.setX(myx);
        classOfShape.setY(myy);


        if(circle.isSelected())
            classOfShape.setType("circle");

        else if(triangle.isSelected())
            classOfShape.setType("triangle");


        else if (square.isSelected())
            classOfShape.setType("square");


        else  if(BlueSqure.isSelected())
            classOfShape.setType("blue square");

        allShapes.add(classOfShape);
        p1.draw(classOfShape);
    }

    private void circleActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }//GEN-LAST:event_circleActionPerformed

    private void numOfClassesActionPerformed(java.awt.event.ActionEvent evt) {
        if(numOfClasses.getSelectedIndex()==1)
        {
            circle.setEnabled(true);
            triangle.setEnabled(true);
            square.setEnabled(false);
            BlueSqure.setEnabled(false);
        }

        else if(numOfClasses.getSelectedIndex()==2)
        {
            circle.setEnabled(true);
            triangle.setEnabled(true);
            square.setEnabled(true);
            BlueSqure.setEnabled(false);
        }

        else if(numOfClasses.getSelectedIndex()==3)
        {
            circle.setEnabled(true);
            triangle.setEnabled(true);
            square.setEnabled(true);
            BlueSqure.setEnabled(true);
        }
    }//GEN-LAST:event_numOfClassesActionPerformed

    private void ClassifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClassifyMouseClicked
        p1.clearLines();
        LR=Double.parseDouble(LearningRate.getText());
        Iteration=Integer.parseInt(numOfIter.getText());
        double max=2.4/2;
        double min=-2.4/2;
        double range = (max - min) + 1;
        TH= (int)(Math.random() * range) + min;
        Wightx=(int)(Math.random() * range) + min;
        Wighty=(int)(Math.random() * range) + min;

        if(numOfClasses.getSelectedIndex()==1)
        {

            neuron("circle");
            detect();
            p1.drawLine((int)xa,(int)ya,(int) xb, (int)yb);
        }

        if(numOfClasses.getSelectedIndex()==2)
        {
            neuron("circle");
            detect();
            p1.drawLine((int)xa,(int)ya,(int) xb, (int)yb);
            LR=Double.parseDouble(LearningRate.getText());
            Iteration=Integer.parseInt(numOfIter.getText());
            TH= (int)(Math.random() * range) + min;
            Wightx=(int)(Math.random() * range) + min;
            Wighty=(int)(Math.random() * range) + min;

            neuron("triangle");
            detect();
            p1.drawLine((int)xa,(int)ya,(int) xb, (int)yb);
            LR=Double.parseDouble(LearningRate.getText());
            Iteration=Integer.parseInt(numOfIter.getText());
            TH= (int)(Math.random() * range) + min;
            Wightx=(int)(Math.random() * range) + min;
            Wighty=(int)(Math.random() * range) + min;

            neuron("square");
            detect();
            p1.drawLine((int)xa,(int)ya,(int) xb, (int)yb);
        }

        if(numOfClasses.getSelectedIndex()==3)
        {

            neuron("circle");

            detect();
            p1.drawLine((int)xa,(int)ya,(int) xb, (int)yb);

            LR=Double.parseDouble(LearningRate.getText());
            Iteration=Integer.parseInt(numOfIter.getText());
            TH= (int)(Math.random() * range) + min;
            Wightx=(int)(Math.random() * range) + min;
            Wighty=(int)(Math.random() * range) + min;


            neuron("triangle");

            detect();



            p1.drawLine((int)xa,(int)ya,(int) xb, (int)yb);
            LR=Double.parseDouble(LearningRate.getText());
            Iteration=Integer.parseInt(numOfIter.getText());
            TH= (int)(Math.random() * range) + min;
            Wightx=(int)(Math.random() * range) + min;
            Wighty=(int)(Math.random() * range) + min;


            neuron("square");

            detect();



            p1.drawLine((int)xa,(int)ya,(int) xb, (int)yb);
            LR=Double.parseDouble(LearningRate.getText());
            Iteration=Integer.parseInt(numOfIter.getText());
            TH= (int)(Math.random() * range) + min;
            Wightx=(int)(Math.random() * range) + min;
            Wighty=(int)(Math.random() * range) + min;

            neuron("blue square");

            detect();



            p1.drawLine((int)xa,(int)ya,(int) xb, (int)yb);

            LR=Double.parseDouble(LearningRate.getText());
            Iteration=Integer.parseInt(numOfIter.getText());
            TH= (int)(Math.random() * range) + min;
            Wightx=(int)(Math.random() * range) + min;
            Wighty=(int)(Math.random() * range) + min;



        }
    }//GEN-LAST:event_ClassifyMouseClicked

    private void LearningRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LearningRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LearningRateActionPerformed

    private void ClassifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassifyActionPerformed

    private void BlueSqureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueSqureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BlueSqureActionPerformed


    public void detect(){
        double m = -Wightx/Wighty;
        double c = TH/Wighty;
        double tmpXa = convertx(0.0);
        double tmpXb = convertx(670.0);

        ya = m*tmpXa +c;
        yb = m*tmpXb +c ;
        ya = returnx(ya);
        yb = returnx(yb);
        xa = returnx(tmpXa);
        xb = returnx(tmpXb);
    }

    public void neuron(String Type)
    {
        int counter =0 ;
//        int counterOfIter = 0;
        for (theShapes array : allShapes){
            theShapes Ns = new theShapes();
            Ns.type = array.type;
            Ns.x = convertx(array.x);
            Ns.y = converty(array.y);
            AfterNormalized.add(Ns);
        }

        for(int i=0;i<Iteration;i++){
            if (counter ==0){
                for (theShapes S : AfterNormalized){
                    double x , y ;
                    x = S.x ;
                    y = S.y ;
                    boolean b = S.getType().equals(Type);
                    YA = Sign((x*Wightx) + (y*Wighty) - TH);


                    if (b) YD=1;
                    else  YD=-1;
                    E = YD-YA;
                    if (E != 0){
                        counter = 0;
                        DiffInWeght=LR*x*E;
                        Wightx=Wightx+DiffInWeght;
                        DiffInWeght=LR*y*E;
                        Wighty=Wighty+DiffInWeght;
                        DiffInWeght=LR*-1*E;

                        TH=TH+DiffInWeght;
                    }
                    else counter++;
                }}
            else if (counter+1 >=AfterNormalized.size())
                break;
        }
    }


    public double convertx(double inx ){
        //normalizationX
        double iMin =0, iMaxX = 680,iMaxY = 375, Nmax =1, Nmin=-1 ;
        double InX = ( (inx - iMin) *( (Nmax -Nmin)/(iMaxX-iMin)) + Nmin);

        return InX;

    }

    public double converty(double iny){
        //normalizationY
        double iMin =0, iMaxX = 680,iMaxY = 375, Nmax =1, Nmin=-1 ;
        double InY = ( (iny - iMin) *( (Nmax -Nmin)/(iMaxY-iMin)) + Nmin);
        return InY;
    }



    public double returnx (double inx ){
        //denormalizationX
        double Nmin=-1, Nmax=1 , Omaxx=680 , Omin=0,  Omaxy = 375;
        double On= inx;
        double OX =  ((On - Nmin )*((Omaxx - Omin)/(Nmax-Nmin)) + Omin);
        return OX;
    }


    public double returny (double iny ){
        //denormalizationY
        double Nmin=-1, Nmax=1 , Omaxx=680 , Omin=0,  Omaxy = 375;
        double On= iny;
        double OY =  ((On - Nmin )*((Omaxy - Omin)/(Nmax-Nmin)) + Omin);
        return OY;
    }

    public int Sign (double x){

        if(x<=0)
            return -1;

        else
            return 1;
    }



    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BlueSqure;
    private javax.swing.JButton Classify;
    private javax.swing.JTextField LearningRate;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JRadioButton circle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> numOfClasses;
    private javax.swing.JTextField numOfIter;
    private thePanel p1;
    private javax.swing.JRadioButton square;
    private javax.swing.JRadioButton triangle;
    // End of variables declaration//GEN-END:variables
}
