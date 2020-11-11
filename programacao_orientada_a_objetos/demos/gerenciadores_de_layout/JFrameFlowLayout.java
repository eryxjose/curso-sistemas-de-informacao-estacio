package programacao_orientada_a_objetos.demos.gerenciadores_de_layout;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;

public class JFrameFlowLayout extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public JFrameFlowLayout() {
        super("Janela JFrameFlowLayout.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new PanelSample(Color.BLUE, "Teste Blue"));
        add(new PanelSample(Color.GRAY, "Teste Gray"));
        pack();
        setVisible(true);
    }

}

