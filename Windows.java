package firstInterfaceGraphique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Windows extends JFrame{

	private JButton btnValider;
	
	public Windows() {
		this.setBounds(100, 100, 400, 400); //Pour déternimer l'amplacement et les dimensions de la fenêtre
		this.setTitle("Exemple de fenêtre");
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Pour fermer la fenêtre et arrêter le processus
		
		btnValider = new JButton();
		btnValider.setText("Confirm");
		btnValider.setBounds(10, 10, 200, 50);
		this.add(btnValider); //Pour Ajouter le bouton sur la fenêtre
		
		btnValider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Confirmed");
			}
		});
		
	}
}
