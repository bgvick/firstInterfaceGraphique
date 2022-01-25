package firstInterfaceGraphique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Windows extends JFrame{

	private JButton btnValider;
	
	public Windows() {
		this.setBounds(100, 100, 400, 400); //Pour d�ternimer l'amplacement et les dimensions de la fen�tre
		this.setTitle("Exemple de fen�tre");
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Pour fermer la fen�tre et arr�ter le processus
		
		btnValider = new JButton();
		btnValider.setText("Confirm");
		btnValider.setBounds(10, 10, 200, 50);
		this.add(btnValider); //Pour Ajouter le bouton sur la fen�tre
		
		btnValider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Confirmed");
			}
		});
		
	}
}
