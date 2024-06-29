import javax.swing.*;
import java.awt.*;

public class TabbedPaneExample {

    public static void main(String[] args) {
        // Créez une nouvelle fenêtre (JFrame)
        JFrame frame = new JFrame("Tabbed Pane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        
        // Créez un JTabbedPane pour contenir les onglets
        JTabbedPane tabbedPane = new JTabbedPane();
        
        // Créez les premiers panneaux avec BoxLayout pour une disposition verticale
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(new JLabel("Nom :"));
        panel1.add(new JTextField(20));
        panel1.add(new JLabel("Prénom :"));
        panel1.add(new JTextField(20));
        JButton button1 = new JButton("Envoyer");
        panel1.add(button1);
        
        // Créez le deuxième panneau avec BoxLayout pour une disposition horizontale
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        panel2.add(new JLabel("Sélectionnez un élément :"));
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> itemComboBox = new JComboBox<>(items);
        panel2.add(itemComboBox);
        panel2.add(Box.createRigidArea(new Dimension(10, 0))); // Espace horizontal
        panel2.add(new JLabel("Sélectionnez une couleur :"));
        String[] colors = {"Red", "Green", "Blue"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        panel2.add(colorComboBox);
        JButton button2 = new JButton("OK");
        panel2.add(button2);
        
        // Créez le troisième panneau avec un tableau de données et un bouton "Exporter"
        JPanel panel3 = new JPanel(new BorderLayout());
        String[] columnNames = {"Nom", "Prénom", "Âge", "Email"};
        Object[][] data = {
            {"Dupont", "Jean", 25, "jean.dupont@example.com"},
            {"Durand", "Marie", 30, "marie.durand@example.com"},
            {"Martin", "Paul", 35, "paul.martin@example.com"}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        JButton exportButton = new JButton("Exporter");
        panel3.add(scrollPane, BorderLayout.CENTER);
        panel3.add(exportButton, BorderLayout.SOUTH);
        
        // Ajoutez les panneaux aux onglets
        tabbedPane.addTab("Formulaire", panel1);
        tabbedPane.addTab("Sélections", panel2);
        tabbedPane.addTab("Tableau", panel3);
        
        // Ajoutez le JTabbedPane à la fenêtre
        frame.add(tabbedPane);
        
        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}
