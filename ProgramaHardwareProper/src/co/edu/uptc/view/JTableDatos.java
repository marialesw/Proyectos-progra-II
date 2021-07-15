package co.edu.uptc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableDatos extends JPanel {

	private DefaultTableModel dTM;
	private JTable jTable;
	private JScrollPane jSP;
	
	public JTableDatos() {
		initComponentes();
	}
	
	public void initComponentes() {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBackground(Color.decode("#282E33"));
		dTM = new DefaultTableModel();
		titulos();
		Font Letra = new Font("Franklin Ghotic Demi", Font.ITALIC, 14);
		jTable = new JTable(dTM);
		jTable.setSize(200, 500);
		jTable.setIntercellSpacing(new Dimension(100,50));
		jTable.setModel(dTM);
		jTable.getTableHeader().setReorderingAllowed(false);
		jTable.getTableHeader().setBackground(Color.decode("#282E33"));
		jTable.getTableHeader().setForeground(Color.BLACK);
		jTable.getTableHeader().setFont(Letra);
		jTable.setBackground(Color.WHITE);
		jTable.setBorder(null);
		
		jSP = new JScrollPane(jTable);
		//jSP.setForeground(Color.BLACK);
		jSP.setBorder(null);
		jSP.setAlignmentX(Component.CENTER_ALIGNMENT);

		add(jSP, BorderLayout.CENTER);
		String[] elementos = {"id", "name", "description","cantidad", "unitPrice"};
		addElemn(elementos);
		
		this.setBorder(null);
	}
	
	public void titulos() {
		String[] Panel = { "ID", "Nombre", "Descripcion", "Cantidad", "PrecioUnitario" };
		dTM.setColumnIdentifiers(Panel);
	}
	
	public void addElemn(Object[] fila) {
		dTM.addRow(fila);
		jTable.setModel(dTM);
	}
}
