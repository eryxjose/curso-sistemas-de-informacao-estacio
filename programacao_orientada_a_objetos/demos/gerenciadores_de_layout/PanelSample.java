package programacao_orientada_a_objetos.demos.gerenciadores_de_layout;

import java.awt.Color;
import javax.swing.JPanel;

public class PanelSample extends JPanel {

    public PanelSample(Color color, String texto) {
        super();
        this.setOpaque(true);
        this.setBackground(color);
        add(new SampleComponent(texto));
    }
    
}
