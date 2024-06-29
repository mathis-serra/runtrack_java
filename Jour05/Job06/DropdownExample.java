import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropdownExample {

    public static void main(String[] args) {
        // Créez une nouvelle fenêtre (JFrame)
        JFrame frame = new JFrame("Dropdown Example with FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        // Définissez la disposition de la fenêtre
        frame.setLayout(new FlowLayout());
        
        // Créez une liste déroulante pour les choix d'éléments
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> itemComboBox = new JComboBox<>(items);
        itemComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        
        // Créez une liste déroulante pour les choix de couleur
        String[] colors = {"Red", "Green", "Blue"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        colorComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        
        // Créez un bouton "OK"
        JButton okButton = new JButton("OK");
        okButton.setFont(new Font("Arial", Font.BOLD, 14));
        okButton.setBackground(Color.GREEN);
        okButton.setForeground(Color.WHITE);
        okButton.setOpaque(true);
        okButton.setBorderPainted(false);
        
        // Ajoutez un ActionListener au bouton "OK"
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Récupère les choix des listes déroulantes et les affiche dans la console
                String selectedItem = (String) itemComboBox.getSelectedItem();
                String selectedColor = (String) colorComboBox.getSelectedItem();
                System.out.println("Choix sélectionné : " + selectedItem);
                System.out.println("Couleur sélectionnée : " + selectedColor);
            }
        });
        
        // Ajoutez les composants à la fenêtre
        frame.add(itemComboBox);
        frame.add(colorComboBox);
        frame.add(okButton);
        
        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}
