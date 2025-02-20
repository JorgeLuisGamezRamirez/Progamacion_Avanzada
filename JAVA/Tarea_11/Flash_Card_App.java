package Tarea011_flashcards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class FlashcardApp extends JFrame {
    private JTextArea areaPregunta;
    private JTextArea areaRespuesta;
    private JButton botonGuardar, botonSiguiente;
    private List<String[]> flashcards;
    private int indiceActual = 0;
    private static final String NOMBRE_ARCHIVO = "flashcards.txt";
    
    public FlashcardApp() {
        setTitle("Aplicación de Flashcards");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        flashcards = new ArrayList<>();
        cargarFlashcards();
        
        JPanel panel = new JPanel(new BorderLayout());
        
        areaPregunta = new JTextArea(5, 20);
        areaRespuesta = new JTextArea(5, 20);
        
        JPanel panelPregunta = new JPanel(new BorderLayout());
        panelPregunta.add(new JLabel("Pregunta:"), BorderLayout.NORTH);
        panelPregunta.add(new JScrollPane(areaPregunta), BorderLayout.CENTER);
        
        JPanel panelRespuesta = new JPanel(new BorderLayout());
        panelRespuesta.add(new JLabel("Respuesta:"), BorderLayout.NORTH);
        panelRespuesta.add(new JScrollPane(areaRespuesta), BorderLayout.CENTER);
        
        panel.add(panelPregunta, BorderLayout.NORTH);
        panel.add(panelRespuesta, BorderLayout.CENTER);
        
        botonGuardar = new JButton("Guardar Flashcard");
        botonSiguiente = new JButton("Siguiente Flashcard");
        
        botonGuardar.addActionListener(e -> guardarFlashcard());
        botonSiguiente.addActionListener(e -> mostrarSiguienteFlashcard());
        
        JPanel panelBotones = new JPanel();
        panelBotones.add(botonGuardar);
        panelBotones.add(botonSiguiente);
        
        add(panel, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
    }
    
    private void guardarFlashcard() {
        String pregunta = areaPregunta.getText().trim();
        String respuesta = areaRespuesta.getText().trim();
        if (!pregunta.isEmpty() && !respuesta.isEmpty()) {
            flashcards.add(new String[]{pregunta, respuesta});
            escribirArchivo();
            areaPregunta.setText("");
            areaRespuesta.setText("");
        }
    }
    
    private void mostrarSiguienteFlashcard() {
        if (!flashcards.isEmpty()) {
            indiceActual = (indiceActual + 1) % flashcards.size();
            String[] flashcard = flashcards.get(indiceActual);
            areaPregunta.setText(flashcard[0]);
            areaRespuesta.setText(flashcard[1]);
        }
    }
    
    private void escribirArchivo() {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO))) {
            for (String[] flashcard : flashcards) {
                escritor.write(flashcard[0] + "|" + flashcard[1]);
                escritor.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void cargarFlashcards() {
        try (BufferedReader lector = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length == 2) {
                    flashcards.add(partes);
                }
            }
        } catch (IOException e) {
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FlashcardApp().setVisible(true));
    }
}
