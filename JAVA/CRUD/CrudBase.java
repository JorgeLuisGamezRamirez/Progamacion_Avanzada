package Crud120225;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;

public class CrudBase extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton BotonBuscar;
    private JButton BotonEliminar;
    private JButton BotonModificar;
    private JButton BotonSalir;
    private JButton BotonAlta;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CrudBase frame = new CrudBase();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CrudBase() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridBagLayout());

        BotonEliminar = new JButton("Eliminar");
        BotonBuscar = new JButton("Buscar");
        BotonAlta = new JButton("Alta");
        BotonModificar = new JButton("Modificar");
        BotonSalir = new JButton("Salir");

        // Crear la tabla con una cuadrícula de 6x6
        table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[6][6], // 6 filas y 6 columnas
            new String[] {"Matricula", "Nombre", "Matricula", "Nombre", "Matricula", "Nombre"}
        ));
        JScrollPane scrollPane = new JScrollPane(table);

        // Configurar GridBagConstraints para la tabla
        GridBagConstraints gbc_table = new GridBagConstraints();
        gbc_table.insets = new Insets(5, 5, 5, 5);
        gbc_table.gridx = 0;
        gbc_table.gridy = 0;
        gbc_table.gridwidth = 6;
        gbc_table.fill = GridBagConstraints.BOTH;
        gbc_table.weightx = 1.0;
        gbc_table.weighty = 0.8;
        contentPane.add(scrollPane, gbc_table);

        // Configurar GridBagConstraints para los botones
        GridBagConstraints gbc_botonAlta = new GridBagConstraints();
        gbc_botonAlta.insets = new Insets(5, 5, 5, 5);
        gbc_botonAlta.gridx = 0;
        gbc_botonAlta.gridy = 1;
        contentPane.add(BotonAlta, gbc_botonAlta);

        GridBagConstraints gbc_botonBuscar = new GridBagConstraints();
        gbc_botonBuscar.insets = new Insets(5, 5, 5, 5);
        gbc_botonBuscar.gridx = 1;
        gbc_botonBuscar.gridy = 1;
        contentPane.add(BotonBuscar, gbc_botonBuscar);

        GridBagConstraints gbc_botonEliminar = new GridBagConstraints();
        gbc_botonEliminar.insets = new Insets(5, 5, 5, 5);
        gbc_botonEliminar.gridx = 2;
        gbc_botonEliminar.gridy = 1;
        contentPane.add(BotonEliminar, gbc_botonEliminar);

        GridBagConstraints gbc_botonModificar = new GridBagConstraints();
        gbc_botonModificar.insets = new Insets(5, 5, 5, 5);
        gbc_botonModificar.gridx = 3;
        gbc_botonModificar.gridy = 1;
        contentPane.add(BotonModificar, gbc_botonModificar);

        GridBagConstraints gbc_botonSalir = new GridBagConstraints();
        gbc_botonSalir.insets = new Insets(5, 5, 5, 5);
        gbc_botonSalir.gridx = 4;
        gbc_botonSalir.gridy = 1;
        contentPane.add(BotonSalir, gbc_botonSalir);

        // Añadir acción al botón "Alta"
        BotonAlta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearVentanaAlta();
            }
        });

        // Añadir acción al botón "Buscar"
        BotonBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearVentanaBuscar();
            }
        });
    }

    // Método para crear una nueva ventana de alta
    private void crearVentanaAlta() {
        JFrame ventanaAlta = new JFrame("Alta de Usuario");
        ventanaAlta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaAlta.setBounds(100, 100, 400, 200);
        
        JPanel panelAlta = new JPanel();
        ventanaAlta.getContentPane().add(panelAlta);
        
        JLabel lblMatricula = new JLabel("Matrícula:");
        JTextField txtMatricula = new JTextField(10);
        
        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField(10);
        
        JButton btnGuardar = new JButton("Guardar");

        // Añadir acción al botón "Guardar" para agregar datos a la tabla
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String matricula = txtMatricula.getText();
                String nombre = txtNombre.getText();
                if (!matricula.isEmpty() && !nombre.isEmpty()) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.addRow(new Object[]{matricula, nombre});
                }
                ventanaAlta.dispose(); // Cerrar la ventana de alta
            }
        });

        panelAlta.add(lblMatricula);
        panelAlta.add(txtMatricula);
        panelAlta.add(lblNombre);
        panelAlta.add(txtNombre);
        panelAlta.add(btnGuardar);

        ventanaAlta.setVisible(true);
    }

    // Método para crear una nueva ventana de búsqueda
    private void crearVentanaBuscar() {
        JFrame ventanaBuscar = new JFrame("Buscar Usuario");
        ventanaBuscar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaBuscar.setBounds(100, 100, 400, 200);
        
        JPanel panelBuscar = new JPanel();
        ventanaBuscar.getContentPane().add(panelBuscar);
        
        JLabel lblMatriculaBuscar = new JLabel("Matrícula:");
        JTextField txtMatriculaBuscar = new JTextField(10);
        
        JButton btnBuscar = new JButton("Buscar");

        JLabel lblResultado = new JLabel("Nombre:");
        JTextField txtResultado = new JTextField(30);
        txtResultado.setEditable(false);

        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String matriculaBuscar = txtMatriculaBuscar.getText();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                for (int i = 0; i < model.getRowCount(); i++) {
                    if (matriculaBuscar.equals(model.getValueAt(i, 0))) {
                        String nombre = (String) model.getValueAt(i, 1);
                        txtResultado.setText(nombre);
                        return;
                    }
                }
                txtResultado.setText("No encontrado");
            }
        });

        panelBuscar.add(lblMatriculaBuscar);
        panelBuscar.add(txtMatriculaBuscar);
        panelBuscar.add(btnBuscar);
        panelBuscar.add(lblResultado);
        panelBuscar.add(txtResultado);

        ventanaBuscar.setVisible(true);
    }
}

