import javax.swing.*;
import java.awt.*;

public class UserInterface {

    public static void main(String[] args) {
        // Créez une nouvelle fenêtre (JFrame)
        JFrame frame = new JFrame("User Interface with FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        
        // Définissez la disposition de la fenêtre
        frame.setLayout(new FlowLayout());
        
        // Créez une étiquette "Nom :"
        JLabel nameLabel = new JLabel("Nom :");
        
        // Créez un champ de texte pour entrer un nom
        JTextField nameTextField = new JTextField(20);
        
        // Créez un bouton "Envoyer"
        JButton sendButton = new JButton("Envoyer");
        
        // Ajoutez les composants à la fenêtre
        frame.add(nameLabel);
        frame.add(nameTextField);
        frame.add(sendButton);
        
        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}
