package capaPresentacion;

import javax.swing.*;
import java.awt.*;

public class FormLogin extends JFrame {
	
	public FormLogin() {
		super("Login");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contenedor = getContentPane();
		
		// Titulo del formulario
		JLabel lblTitulo = new JLabel("Introduzca su usuario y contraseña:");
		contenedor.add(lblTitulo, BorderLayout.NORTH);
		
		// Panel de datos
		JPanel panelDatos = new JPanel(new GridLayout(2,2,0,5));
		JLabel lblUsuario = new JLabel("Usuario");
		JTextField tfUsuario = new JTextField(18);
		JLabel lblPw = new JLabel("Contraseña");
		JTextField tfPw = new JTextField(18);
		panelDatos.add(lblUsuario);
		panelDatos.add(tfUsuario);
		panelDatos.add(lblPw);
		panelDatos.add(tfPw);
		
		// Panel de botones
		JPanel panelBotones = new JPanel(new FlowLayout());
		JButton btnAceptar = new JButton("Aceptar");
		JButton btnCancelar = new JButton("Cancelar");
		panelBotones.add(btnAceptar);
		panelBotones.add(btnCancelar);
		
		contenedor.add(panelDatos, BorderLayout.CENTER);
		contenedor.add(panelBotones, BorderLayout.SOUTH);
	}

}
