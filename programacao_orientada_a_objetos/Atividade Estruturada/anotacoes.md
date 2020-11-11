# Programação Orientada a Objetos



## Atividade Estruturada

Implementação de um aplicativo em linguagem Java com interface gráfica e acesso a banco de dados.

Requisitos:

* Utilizar javax.swing ou java.awt para interface gráfica.
* Utilizar JDBC para acesso a base de dados.
* Apresentar modelo conceitual contendo:
  * Herança de mais de um nível
  * Um relacionamento de agregação ou agregação por composição
  * Uma associação simples
  * Uma classe abstrata
  * Uma interface
* Utilizar arquitetura MVC II com uso de front Control e DAO
* Fazer duas sobrecargas e duas sobrescritas de métodos e construtores
* Utilizar formulário MDI (Multiple Document Interface) onde serão carregados fomrulários selecionados por menu
* Incluir os controles JTable, GridBagLayout
* Desenvolver CRUD 



# Aula 2 - Gerenciadores de Layout

O código de exemplo apresentado na Tela 4 da webaula (copiado abaixo) não funciona. Vocês podem fornecer um exemplo que funcione?


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


