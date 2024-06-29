import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class TabbedPaneWithDialogs {

    public static void main(String[] args) {
        // Créez une nouvelle fenêtre (JFrame)
        JFrame frame = new JFrame("Tabbed Pane Example with Dialogs");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(600, 400);
        
        // Ajoutez une confirmation avant de quitter l'application
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(frame, 
                    "Êtes-vous sûr de vouloir quitter l'application?", "Confirmation de sortie", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });

        // Créez un JTabbedPane pour contenir les onglets
        JTabbedPane tabbedPane = new JTabbedPane();
        
        // Créez le premier panneau avec BoxLayout pour une disposition verticale
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(new JLabel("Nom :"));
        JTextField nameField = new JTextField(20);
        panel1.add(nameField);
        panel1.add(new JLabel("Prénom :"));
        JTextField surnameField = new JTextField(20);
        panel1.add(surnameField);
        JButton sendButton = new JButton("Envoyer");
        panel1.add(sendButton);
        
        // Ajoutez une action au bouton "Envoyer"
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String surname = surnameField.getText();
                if (name.isEmpty() || surname.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Nom et Prénom doivent être remplis", "Erreur de validation", JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("Nom: " + name + ", Prénom: " + surname);
                }
            }
        });
        
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
        JButton okButton = new JButton("OK");
        panel2.add(okButton);
        
        // Ajoutez une action au bouton "OK"
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) itemComboBox.getSelectedItem();
                String selectedColor = (String) colorComboBox.getSelectedItem();
                System.out.println("Choix sélectionné : " + selectedItem);
                System.out.println("Couleur sélectionnée : " + selectedColor);
            }
        });
        
        // Créez le troisième panneau avec un tableau de données et un bouton "Exporter"
        JPanel panel3 = new JPanel(new BorderLayout());
        String[] columnNames = {"Nom", "Prénom", "Âge", "Email"};
        Object[][] data = {
            {"Dupont", "Jean", 25, "jean.dupont@example.com"},
            {"Durand", "Marie", 30, "marie.durand@example.com"},
            {"Martin", "Paul", 35, "paul.martin@example.com"}
        };
        JTable table = new JTable(new DefaultTableModel(data, columnNames));
        JScrollPane scrollPane = new JScrollPane(table);
        JButton exportButton = new JButton("Exporter");
        panel3.add(scrollPane, BorderLayout.CENTER);
        panel3.add(exportButton, BorderLayout.SOUTH);
        
        // Ajoutez une action au bouton "Exporter"
        exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (FileWriter csvWriter = new FileWriter("data_export.csv")) {
                    // Écrire les en-têtes des colonnes
                    for (int i = 0; i < columnNames.length; i++) {
                        csvWriter.append(columnNames[i]);
                        if (i < columnNames.length - 1) {
                            csvWriter.append(",");
                        }
                    }
                    csvWriter.append("\n");
                    
                    // Écrire les données du tableau
                    for (int i = 0; i < table.getRowCount(); i++) {
                        for (int j = 0; j < table.getColumnCount(); j++) {
                            csvWriter.append(table.getValueAt(i, j).toString());
                            if (j < table.getColumnCount() - 1) {
                                csvWriter.append(",");
                            }
                        }
                        csvWriter.append("\n");
                    }
                    
                    csvWriter.flush();
                    JOptionPane.showMessageDialog(frame, "Données exportées avec succès !");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(frame, "Erreur lors de l'exportation des données !");
                }
            }
        });
        
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
