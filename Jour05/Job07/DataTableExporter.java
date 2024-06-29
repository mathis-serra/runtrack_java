import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class DataTableExporter {

    public static void main(String[] args) {
        // Créez une nouvelle fenêtre (JFrame)
        JFrame frame = new JFrame("Data Table Exporter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        
        // Définissez la disposition de la fenêtre
        frame.setLayout(new BorderLayout());
        
        // Créez les données du tableau
        String[] columnNames = {"Nom", "Prénom", "Âge", "Email"};
        Object[][] data = {
            {"Dupont", "Jean", 25, "jean.dupont@example.com"},
            {"Durand", "Marie", 30, "marie.durand@example.com"},
            {"Martin", "Paul", 35, "paul.martin@example.com"}
        };
        
        // Créez le modèle de tableau
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        
        // Ajoutez le tableau à un JScrollPane pour permettre le défilement
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Créez un bouton "Exporter"
        JButton exportButton = new JButton("Exporter");
        exportButton.setFont(new Font("Arial", Font.BOLD, 14));
        exportButton.setBackground(Color.GREEN);
        exportButton.setForeground(Color.WHITE);
        exportButton.setOpaque(true);
        exportButton.setBorderPainted(false);
        
        // Ajoutez un ActionListener au bouton "Exporter"
        exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exporter les données du tableau dans un fichier CSV
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
                    for (int i = 0; i < model.getRowCount(); i++) {
                        for (int j = 0; j < model.getColumnCount(); j++) {
                            csvWriter.append(model.getValueAt(i, j).toString());
                            if (j < model.getColumnCount() - 1) {
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
        
        // Ajoutez les composants à la fenêtre
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(exportButton, BorderLayout.SOUTH);
        
        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}
