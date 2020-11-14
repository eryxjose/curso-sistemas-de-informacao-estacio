
# Programação Orientada a Objetos


## FlowLayout

    package projaula2pooead;
     
    import java.awt.FlowLayout;
    import javax.swing.JButton;
     
    /**
    *
    * @author Eduardo
    */
    public class JFrameFlowLayout extends javax.swing.JFrame {
       FlowLayout layout;
     
       /** Construtor do JFrameFlowLayout */
       public JFrameFlowLayout() {
           super("Teste FlowLayout");
           initialize();
       }
     
       private void initialize() {
     
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
           
      //      setPreferredSize(new Dimension(400, 200));
     
           layout = new FlowLayout();
           getContentPane().setLayout(layout);
           for (int i=0; i<5; i++){
               add(new JButton("Botão- "+i));
           }
           pack();
       }
       /**
       * @param args the command line arguments
       */
       public static void main(String args[]) {
           java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                   new JFrameFlowLayout().setVisible(true);
               }
           });
       }
     
       // Variables declaration - do not modify
       // End of variables declaration
     
    }




## GridLayout

Código da webaula:

    public class JFrameGridLayout extends javax.swing.JFrame {
     
       GridLayout layout;
     
       /** Creates new form JFrameGridLayout */
       public JFrameGridLayout() {
           super("Teste GridLayout ");
           initialize();
       }
           private void initialize() {
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
     
           setPreferredSize(new Dimension(400, 200));
     
           layout = new GridLayout(3,5);
           // setLayout(layout);
           getContentPane().setLayout(layout);
     
           //layout.setAlignment(FlowLayout.TRAILING);
           //layout.setHgap(15);
           //layout.setVgap(60);
           for (int i=0; i<10; i++){
               add(new JButton("Botão- "+i));
           }
           pack();
       }
     
       /**
       * @param args the command line arguments
       */
       public static void main(String args[]) {
           java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                   new JFrameGridLayout().setVisible(true);
               }
           });
       }
    }


## BorderLayout

Código da webaula:

    import java.awt.BorderLayout;
    import java.awt.Dimension;
    import javax.swing.JButton;
    import javax.swing.JLabel;
     
    /**
    *
    * @author Eduardo
    */
    public class JFrameBorderLayout extends javax.swing.JFrame {
     
       BorderLayout layout;
     
       /** Creates new form JFrameBorderLayout */
       public JFrameBorderLayout() {
           super("Teste BorderLayout");
           initialize();
       }
     
       private void initialize() {
     
           setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
     
           setPreferredSize(new Dimension(400, 200)); //define o tamanho
           layout = new BorderLayout();
           getContentPane().setLayout(layout);
     
           layout.setHgap(5);//define o espaçamento horizontal entre GUI
           layout.setVgap(5);//define o espaçamento vertical entre GUI
           add(new JButton("Norte"), BorderLayout.NORTH);
           add(new JButton("Sul"), BorderLayout.SOUTH);
           add(new JButton("Leste"),  BorderLayout.EAST);
           add(new JButton("Oeste"), BorderLayout.WEST);
           add(new JLabel("Um texto no Centro"), BorderLayout.CENTER);
           pack();
       }
       public static void main(String args[]) {
           java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                   new JFrameBorderLayout().setVisible(true);
               }
           });
       }
     
     
    }


## CardLayout

## BoxLayout

## GridBagLayout

Código da webaula:

    ……
    public class JFrameGridBagLayout
    extends javax.swing.JFrame {
        /** Creates new form
    JFrameGridBagLayout */
        public JFrameGridBagLayout() {
            super("Teste GridBagLayout");
            initialize();
        }
     
     
            GridBagLayout layout;
            
            private final int noLinhas = 3;
        /** Creates new form JFrameFlowLayout */
     
     
        private void initialize() {
     
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
     
            setPreferredSize(new Dimension(400, 200));
     
            layout = new GridBagLayout();
     
            // setLayout(layout);
            getContentPane().setLayout(layout);
     
    List lEsq = new List(noLinhas, true);
    lEsq.add("Um");
    lEsq.add("Dois");
    lEsq.add("Tres");
    lEsq.add("Quatro");
    lEsq.add("Cinco");
    lEsq.add("Seis");
    lEsq.add("Sete");
    Button add = new Button(">>");
    Button clear = new Button("Clear");
    Button close = new Button("Close");
    TextArea tDir = new TextArea("", noLinhas,
                    10, TextArea.SCROLLBARS_NONE);
     
    GridBagConstraints restricoes = new GridBagConstraints();
    restricoes.gridx = 0;
    restricoes.gridy = 0;
    restricoes.gridwidth = 1;
    restricoes.gridheight = 3;
    restricoes.fill = GridBagConstraints.VERTICAL;
    add(lEsq, restricoes);
     
    restricoes.gridx = 2;
    add(tDir, restricoes);
     
    Insets margens = new Insets(4, 3, 4, 3);
    restricoes.gridx = 1;
    restricoes.gridy = 0;
    restricoes.gridwidth = 1;
    restricoes.gridheight = 1;
    restricoes.fill = GridBagConstraints.BOTH;
    restricoes.ipadx = 4;
    restricoes.ipady = 4;
    restricoes.insets = margens;
    add(add, restricoes);
     
    restricoes.gridy = 1;
    add(clear, restricoes);
     
    restricoes.gridy = 2;
    add(close, restricoes);
     
            pack();
        }
     
        public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new JFrameGridBagLayout().setVisible(true);
                }
            });
        }
     
    }





