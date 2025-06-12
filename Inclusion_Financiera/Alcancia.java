package agroahorroapp.panels;

import javax.swing.*;
import java.awt.*;

public class MiAlcanciaPanel extends JPanel {
    public MiAlcanciaPanel() {
        // Color de fondo “verde muy claro”
        setBackground(new Color(245, 255, 245));
        setLayout(new BorderLayout());

        // —— 1) TÍTULO SUPERIOR —— 
        JLabel title = new JLabel("MI ALCANCÍA DE AHORRO", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.BLACK);
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        add(title, BorderLayout.NORTH);

        // —— 2) PANEL CENTRAL (FORMULARIO) —— 
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(new Color(245, 255, 245));
        formPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200), 2, true),
                BorderFactory.createEmptyBorder(20, 40, 20, 40)
        ));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        // 2.1) Saludo al usuario
        JLabel saludo = new JLabel("Hola, (nombre del usuario):");
        saludo.setFont(new Font("Arial", Font.PLAIN, 14));
        formPanel.add(saludo, gbc);

        // 2.2) Línea indicativa
        gbc.gridy++;
        JLabel instruccion = new JLabel("¡Revisa el estado de tus ahorros!");
        instruccion.setFont(new Font("Arial", Font.PLAIN, 14));
        formPanel.add(instruccion, gbc);

        // 2.3) Metas Activos
        gbc.gridy++;
        formPanel.add(new JLabel("Metas Activos:"), gbc);
        gbc.gridx = 1;
        JComboBox<String> comboMetas = new JComboBox<>(new String[]{"Meta 1", "Meta 2"});
        comboMetas.setPreferredSize(new Dimension(150, 25));
        formPanel.add(comboMetas, gbc);

        // 2.4) Crear nueva meta
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(new JLabel("Crear nueva meta:"), gbc);
        gbc.gridx = 1;
        JTextField txtNuevaMeta = new JTextField();
        txtNuevaMeta.setPreferredSize(new Dimension(150, 25));
        formPanel.add(txtNuevaMeta, gbc);

        // 2.5) Fecha límite
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(new JLabel("Fecha límite:"), gbc);
        gbc.gridx = 1;
        JTextField txtFechaLimite = new JTextField();
        txtFechaLimite.setPreferredSize(new Dimension(150, 25));
        formPanel.add(txtFechaLimite, gbc);

        // 2.6) Monto de Ahorro
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(new JLabel("Monto de Ahorro:"), gbc);
        gbc.gridx = 1;
        JTextField txtMonto = new JTextField();
        txtMonto.setPreferredSize(new Dimension(150, 25));
        formPanel.add(txtMonto, gbc);

        add(formPanel, BorderLayout.CENTER);

        // —— 3) PANEL INFERIOR (BOTONES) —— 
        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 20));
        buttonsPanel.setBackground(new Color(245, 255, 245));

        // Botón SALIR
        JButton btnSalir = new JButton("SALIR");
        btnSalir.setBackground(new Color(180, 250, 180));
        btnSalir.setFont(new Font("Arial", Font.BOLD, 14));
        btnSalir.setPreferredSize(new Dimension(120, 40));
        buttonsPanel.add(btnSalir);

        // Botón CONTINUAR
        JButton btnContinuar = new JButton("CONTINUAR");
        btnContinuar.setBackground(new Color(180, 250, 180));
        btnContinuar.setFont(new Font("Arial", Font.BOLD, 14));
        btnContinuar.setPreferredSize(new Dimension(120, 40));
        buttonsPanel.add(btnContinuar);

        // Botón GUARDAR
        JButton btnGuardar = new JButton("GUARDAR");
        btnGuardar.setBackground(new Color(180, 250, 180));
        btnGuardar.setFont(new Font("Arial", Font.BOLD, 14));
        btnGuardar.setPreferredSize(new Dimension(120, 40));
        buttonsPanel.add(btnGuardar);

        add(buttonsPanel, BorderLayout.SOUTH);
    }
}

