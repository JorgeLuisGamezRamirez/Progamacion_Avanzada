package Tarea10_reinge;

import javax.swing.*;
import java.awt.*;

public class SwingFormExample {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 350);
        frame.setLayout(new BorderLayout());

        // Crear barra de menú
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenu menuWindow = new JMenu("Window");
        menuBar.add(menuFile);
        menuBar.add(menuWindow);
        frame.setJMenuBar(menuBar);

        // Crear panel superior con los botones "Hello" y "Goodbye"
        JPanel topPanel = new JPanel();
        JButton btnHello = new JButton("Hello");
        JButton btnGoodbye = new JButton("Goodbye");
        topPanel.add(btnHello);
        topPanel.add(btnGoodbye);
        frame.add(topPanel, BorderLayout.NORTH);

        // Crear panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frame.add(mainPanel, BorderLayout.CENTER);

        // Crear panel lateral para el formulario
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(formPanel, BorderLayout.WEST);

        // Etiqueta "Add Person"
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        JLabel lblAddPerson = new JLabel("Add Person");
        lblAddPerson.setFont(new Font("Arial", Font.BOLD, 14));
        formPanel.add(lblAddPerson, gbc);

        // Etiqueta y campo de texto para el nombre
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 1;
        formPanel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        JTextField nameField = new JTextField(15);
        formPanel.add(nameField, gbc);

        // Etiqueta y campo de texto para la ocupación
        gbc.gridx = 0; gbc.gridy = 2;
        formPanel.add(new JLabel("Occupation:"), gbc);
        gbc.gridx = 1;
        JTextField occupationField = new JTextField(15);
        formPanel.add(occupationField, gbc);

        // Lista de selección de edad
        gbc.gridx = 0; gbc.gridy = 3;
        formPanel.add(new JLabel("Age:"), gbc);
        gbc.gridx = 1;
        String[] ageOptions = {"Under 18", "18 to 65", "65 or over"};
        JList<String> ageList = new JList<>(ageOptions);
        ageList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane ageScrollPane = new JScrollPane(ageList);
        ageScrollPane.setPreferredSize(new Dimension(100, 50));
        formPanel.add(ageScrollPane, gbc);

        // ComboBox para empleo
        gbc.gridx = 0; gbc.gridy = 4;
        formPanel.add(new JLabel("Employment:"), gbc);
        gbc.gridx = 1;
        String[] employmentOptions = {"employed", "unemployed", "self-employed"};
        JComboBox<String> employmentBox = new JComboBox<>(employmentOptions);
        formPanel.add(employmentBox, gbc);

        // Checkbox para ciudadano estadounidense
        gbc.gridx = 0; gbc.gridy = 5;
        JCheckBox usCitizenCheck = new JCheckBox("US Citizen");
        formPanel.add(usCitizenCheck, gbc);

        // Campo de texto para el Tax ID (se desactiva inicialmente)
        gbc.gridx = 1;
        JTextField taxIdField = new JTextField(10);
        taxIdField.setEnabled(false);
        formPanel.add(taxIdField, gbc);

        // Habilitar campo de Tax ID si se marca el checkbox
        usCitizenCheck.addActionListener(e -> taxIdField.setEnabled(usCitizenCheck.isSelected()));

        // Radio buttons para género
        gbc.gridx = 0; gbc.gridy = 6;
        formPanel.add(new JLabel("Gender:"), gbc);
        gbc.gridx = 1;
        JRadioButton maleRadio = new JRadioButton("male");
        JRadioButton femaleRadio = new JRadioButton("female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        formPanel.add(genderPanel, gbc);

        // Botón OK
        gbc.gridx = 1; gbc.gridy = 7;
        JButton okButton = new JButton("OK");
        formPanel.add(okButton, gbc);

        // Agregar un área vacía a la derecha
        JPanel rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(200, 200));
        mainPanel.add(rightPanel, BorderLayout.CENTER);

        // Mostrar ventana
        frame.setVisible(true);
    }
}

