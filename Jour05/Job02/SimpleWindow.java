import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleWindow {

    public static void main(String[] args) {
        // Créez une nouvelle fenêtre (JFrame)
        JFrame frame = new JFrame("Simple Window with BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Définissez la disposition de la fenêtre
        frame.setLayout(new BorderLayout());
        
        // Créez un bouton "Quitter"
        JButton quitButton = new JButton("Quitter");
        
        // Ajoutez une action au bouton "Quitter"
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ferme l'application lorsque le bouton est cliqué
                System.exit(0);
            }
        });
        
        // Ajoutez le bouton "Quitter" à la partie sud de la fenêtre
        frame.add(quitButton, BorderLayout.SOUTH);
        
        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}
