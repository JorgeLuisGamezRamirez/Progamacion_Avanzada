package tarea03_layout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ejemploJFrame_05_a2 extends JFrame implements ActionListener {
    static JLabel L0, L1b, L1c;
    static JButton Bcalcular, Bsalir;
    static JTextField Ta, Th, Tb;

    public ejemploJFrame_05_a2() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 3)); 
        // Instancia un objeto FlowLayout alineado al centro y con una separación de 3px en horizontal y vertical
        this.setTitle("Layout FlowLayout JPanel");
        this.setBounds(20,20, 550, 500);

        JPanel Panel = new JPanel();

        // Inicialización de componentes
        L0 = new JLabel("Altura --->");
        L1b = new JLabel("Base --->");
        L1c = new JLabel("El área es --->");
        Th = new JTextField(" ");
        Tb = new JTextField(" ");
        Ta = new JTextField(" ");
        Ta.setEditable(false);
        Bcalcular = new JButton("Calcular");
        Bsalir = new JButton("Salir");
        Bcalcular.addActionListener(this);
        Bsalir.addActionListener(this);

        // Agregar componentes al panel
        Panel.add(L0);
        Panel.add(Th);
        Panel.add(L1b);
        Panel.add(Tb);
        Panel.add(L1c);
        Panel.add(Ta);
        Panel.add(Bcalcular);
        Panel.add(Bsalir);

        // Agregar el panel al JFrame
        this.add(Panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Bcalcular) {
            double h, b, a;
            String Sh, Sb;
            Sh = Th.getText();
            Sb = Tb.getText();
            if (!Sh.isEmpty() && !Sb.isEmpty()) {
                try {
                    h = Double.parseDouble(Sh);
                    b = Double.parseDouble(Sb);
                    a = (h * b) / 2;
                    Ta.setText(String.valueOf(a));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numéricos válidos.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Lo siento, uno o dos textos están vacíos");
            }
        } else if (e.getSource() == Bsalir) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        ejemploJFrame_05_a2 ventana = new ejemploJFrame_05_a2();
        ventana.setVisible(true);
    }
}

