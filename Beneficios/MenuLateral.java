/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 https://www.youtube.com/watch?v=eWLliZXcLks
 */
package areacirculo;

/**
 *
 * @author 42414189
 */import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuLateral extends JFrame {
    private JPanel menuPanel;
    private JPanel contentPanel;
    private CardLayout cardLayout;

    public MenuLateral() {
        setTitle("Menu Lateral");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        menuPanel = new JPanel();
        menuPanel.setBackground(new Color(54, 63, 69));
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));

        contentPanel = new JPanel();
        cardLayout = new CardLayout();
        contentPanel.setLayout(cardLayout);

        addMenuOption("Dashboard", new ImageIcon("dashboard_icon.png"), createDashboardPanel());
        addMenuOption("Funcionários", new ImageIcon("employee_icon.png"), createEmployeesPanel());
        addMenuOption("Relatórios", new ImageIcon("report_icon.png"), createReportsPanel());
        addMenuOption("Configurações", new ImageIcon("settings_icon.png"), createSettingsPanel());

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(menuPanel, BorderLayout.WEST);
        getContentPane().add(contentPanel, BorderLayout.CENTER);
    }

    private void addMenuOption(String text, ImageIcon icon, JPanel panel) {
        JButton button = new JButton(text, icon);
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(54, 63, 69));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setPreferredSize(new Dimension(200, 50));
        button.setMaximumSize(new Dimension(200, 50));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, text);
            }
        });
        menuPanel.add(button);
        contentPanel.add(panel, text);
    }

    private JPanel createDashboardPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.add(new JLabel("Painel de Controle"));
        return panel;
    }

    private JPanel createEmployeesPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBackground(Color.WHITE);

        JLabel labelNome = new JLabel("Nome:");
        JTextField campoNome = new JTextField();
        JLabel labelCargo = new JLabel("Cargo:");
        JTextField campoCargo = new JTextField();
        JLabel labelEmail = new JLabel("E-mail:");
        JTextField campoEmail = new JTextField();
        JLabel labelTelefone = new JLabel("Telefone:");
        JTextField campoTelefone = new JTextField();

        panel.add(labelNome);
        panel.add(campoNome);
        panel.add(labelCargo);
        panel.add(campoCargo);
        panel.add(labelEmail);
        panel.add(campoEmail);
        panel.add(labelTelefone);
        panel.add(campoTelefone);

        return panel;
    }

    private JPanel createReportsPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.add(new JLabel("Relatórios"));
        return panel;
    }

    private JPanel createSettingsPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.add(new JLabel("Configurações"));
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuLateral().setVisible(true);
            }
        });
    }
}
