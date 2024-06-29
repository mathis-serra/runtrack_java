import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StyledUserInterface {

    public static void main(String[] args) {
        // Créez une nouvelle fenêtre (JFrame)
        JFrame frame = new JFrame("Styled User Interface with FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        
        // Définissez la disposition de la fenêtre
        frame.setLayout(new FlowLayout());
        
        // Créez une étiquette "Nom :" avec un style personnalisé
        JLabel nameLabel = new JLabel("Nom :");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nameLabel.setForeground(Color.BLUE);
        
        // Créez un champ de texte pour entrer un nom avec un style personnalisé
        JTextField nameTextField = new JTextField(20);
        nameTextField.setFont(new Font("Arial", Font.PLAIN, 14));
        nameTextField.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        nameTextField.setBackground(new Color(230, 230, 250)); // Light lavender background
        
        // Créez un bouton "Envoyer" avec un style personnalisé
        JButton sendButton = new JButton("Envoyer");
        sendButton.setFont(new Font("Arial", Font.BOLD, 14));
        sendButton.setBackground(Color.GREEN);
        sendButton.setForeground(Color.WHITE);
        sendButton.setOpaque(true);
        sendButton.setBorderPainted(false);
        
        // Ajoutez un ActionListener au bouton "Envoyer"
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Récupère le texte du champ de texte et l'affiche dans la console
                String enteredName = nameTextFi
