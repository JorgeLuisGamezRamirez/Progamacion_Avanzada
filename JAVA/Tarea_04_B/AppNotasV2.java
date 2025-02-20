package Tarea04_MAUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotesApp2 {
    private JTextArea textArea;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NotesApp().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Notas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(SharedResources.BACKGROUND_COLOR);

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setForeground(SharedResources.FONT_COLOR);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(SharedResources.BACKGROUND_COLOR);

        JButton saveButton = new JButton("Guardar");
        saveButton.setForeground(SharedResources.FONT_COLOR);
        saveButton.setBackground(SharedResources.BACKGROUND_COLOR);
        saveButton.addActionListener(new SaveButtonListener());
        buttonPanel.add(saveButton);

        JButton deleteButton = new JButton("Borrar");
        deleteButton.setForeground(SharedResources.FONT_COLOR);
        deleteButton.setBackground(SharedResources.BACKGROUND_COLOR);
        deleteButton.addActionListener(new DeleteButtonListener());
        buttonPanel.add(deleteButton);

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }

    private class SaveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String noteText = textArea.getText();
            JOptionPane.showMessageDialog(null, "Tu nota ha sido guardada: " + noteText);
        }
    }

    private class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setText("");
            JOptionPane.showMessageDialog(null, "Tu nota ha sido borrada");
        }
    }
}
