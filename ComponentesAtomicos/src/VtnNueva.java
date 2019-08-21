import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VtnNueva extends JFrame implements ActionListener {
		
		private JButton btn1;
		private JLabel etiqueta;
		private JTextField txt;
		private JMenuBar barra;
		private JMenu menuArchivo, menuOpciones;
		private JMenuItem item1, item2, item3;
		
		public VtnNueva() {
			
			setSize(400,200);
			setLocationRelativeTo(null);
			iniciarComponentes();
			
		}
		
		public void iniciarComponentes() {
			setLayout(null);
			
			barra = new JMenuBar();
			item1 = new JMenuItem("Nuevo");
			item2 = new JMenuItem("Guardar");
			item3 = new JMenuItem("Salir");
			menuArchivo = new JMenu("Archivo");
			menuArchivo.add(item1);
			menuArchivo.add(item2);
			menuArchivo.add(item3);
			menuOpciones = new JMenu("Opciones");
			menuOpciones.add(item1);
			menuOpciones.add(item2);
			menuOpciones.add(item3);
			barra.add(menuArchivo);
			barra.add(menuOpciones);
			setJMenuBar(barra);
			
			btn1 = new JButton();
			btn1.setText("Presionar");
			btn1.setBounds(10, 30, 120, 30);
			btn1.addActionListener(this);
			etiqueta = new JLabel("Etiqueta Vacia");
			etiqueta.setBounds(150, 20, 150, 40);
			txt = new JTextField();
			txt.setBounds(10, 100, 120, 30);
			add(btn1);
			add(etiqueta);
			add(txt);
			
			
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == btn1) {
				etiqueta.setText(txt.getText());
			}
			
			
		}
		
		

}
