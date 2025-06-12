package agroahorroapp.main;

import agroahorroapp.panels.MiAlcanciaPanel;
import agroahorroapp.panels.AnadirAhorroPanel;
import agroahorroapp.panels.ProgresoAhorroPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JPanel contentPanel;

    public MainFrame() {
        setTitle("AGROAHORRO - Inclusión Financiera");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);

        // Layout principal
        setLayout(new BorderLayout());

        // Panel lateral
        JPanel sidePanel = new JPanel(new GridLayout(3, 1));
        sidePanel.setBackground(new Color(220, 255, 220));

        JButton btnAlcancia = new JButton("Mi alcancía");
        JButton btnAnadir = new JButton("Añadir ahorro");
        JButton btnProgreso = new JButton("Progreso de tu ahorro");

        sidePanel.add(btnAlcancia);
        sidePanel.add(btnAnadir);
        sidePanel.add(btnProgreso);
        add(sidePanel, BorderLayout.WEST);

        // Panel principal (contenido)
        contentPanel = new JPanel(new BorderLayout());
        add(contentPanel, BorderLayout.CENTER);

        // Eventos
        btnAlcancia.addActionListener(e -> setPanel(new MiAlcanciaPanel()));
        btnAnadir.addActionListener(e -> setPanel(new AnadirAhorroPanel()));
        btnProgreso.addActionListener(e -> setPanel(new ProgresoAhorroPanel()));

        // Mostrar primero
        setPanel(new MiAlcanciaPanel());
    }

    private void setPanel(JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}

