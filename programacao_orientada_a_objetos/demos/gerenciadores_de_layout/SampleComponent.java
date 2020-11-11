package programacao_orientada_a_objetos.demos.gerenciadores_de_layout;

import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Dimension;

public class SampleComponent extends JComponent {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String message;
    
    public SampleComponent(String message) {
        super();
        this.message = message;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setFont(new Font("SansSerif", Font.BOLD, 18));
        g.drawString(this.message, 10, 50);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(150,100);
    }
}
