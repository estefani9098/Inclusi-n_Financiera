package agroahorroapp.panels;

import javax.swing.*;
import java.awt.*;

public class AnadirAhorroPanel extends JPanel {
    public AnadirAhorroPanel() {
        setBackground(new Color(245, 255, 245));
        setLayout(new BorderLayout());

        // —— 1) TÍTULO SUPERIOR —— 
        JLabel title = new JLabel("AÑADIR AHORRO", SwingConstants.CENTER);
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
        gbc.insets = new Insets(15, 10, 15, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        // 2.1) Monto de ahorro
        formPanel.add(new JLabel("Monto de ahorro:"), gbc);
        gbc.gridx = 1;
        JTextField txtMonto = new JTextField();
        txtMonto.setPreferredSize(new Dimension(150, 25));
        formPanel.add(txtMonto, gbc);

        // 2.2) Meta de ahorro
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(new JLabel("Meta de ahorro:"), gbc);
        gbc.gridx = 1;
        JComboBox<String> comboMetas = new JComboBox<>(new String[]{"Meta 1", "Meta 2"});
        comboMetas.setPreferredSize(new Dimension(150, 25));
        formPanel.add(comboMetas, gbc);

        // 2.3) Fecha de ahorro
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(new JLabel("Fecha de ahorro:"), gbc);
        gbc.gridx = 1;
        JTextField txtFecha = new JTextField();
        txtFecha.setPreferredSize(new Dimension(150, 25));
        formPanel.add(txtFecha, gbc);

        // 2.4) Categoría
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(new JLabel("Categoría:"), gbc);
        gbc.gridx = 1;
        JComboBox<String> comboCategoria = new JComboBox<>(new String[]{"Alimentos", "Herramientas", "Otros"});
        comboCategoria.setPreferredSize(new Dimension(150, 25));
        formPanel.add(comboCategoria, gbc);

        add(formPanel, BorderLayout.CENTER);

        // —— 3) PANEL INFERIOR (BOTONES) —— 
        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 60, 20));
        buttonsPanel.setBackground(new Color(245, 255, 245));

        // Botón VOLVER
        JButton btnVolver = new JButton("VOLVER");
        btnVolver.setBackground(new Color(180, 250, 180));
        btnVolver.setFont(new Font("Arial", Font.BOLD, 14));
        btnVolver.setPreferredSize(new Dimension(120, 40));
        buttonsPanel.add(btnVolver);

        // Botón SALIR
        JButton btnSalir = new JButton("SALIR");
        btnSalir.setBackground(new Color(180, 250, 180));
        btnSalir.setFont(new Font("Arial", Font.BOLD, 14));
        btnSalir.setPreferredSize(new Dimension(120, 40));
        buttonsPanel.add(btnSalir);

        // Botón GUARDAR
        JButton btnGuardar = new JButton("GUARDAR");
        btnGuardar.setBackground(new Color(180, 250, 180));
        btnGuardar.setFont(new Font("Arial", Font.BOLD, 14));
        btnGuardar.setPreferredSize(new Dimension(120, 40));
        buttonsPanel.add(btnGuardar);

        add(buttonsPanel, BorderLayout.SOUTH);
    }
}
