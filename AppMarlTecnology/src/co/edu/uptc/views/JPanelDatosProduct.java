package co.edu.uptc.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import co.edu.uptc.models.Category;


public class JPanelDatosProduct extends JPanel{

    private JLabel labelImagen;
    private JLabel labelId;
    private JLabel labelName;
    private JLabel labelCategory;
    private JLabel labelUnitPrice;
    private JLabel labelDescription;
    private JLabel labelQuantity;
    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtCategory;
    private JTextField txtUnitPrice;
    private JTextField txtDescription;
    private JTextField txtQuantity;
	private Font fuente;
	private ImageIcon icon;
	private ImageIcon imagen;
	private JPanel panelImagen;


    public JPanelDatosProduct( ){
        setLayout(null);
        setBackground(new Color(29, 26, 91));
        TitledBorder tb = BorderFactory.createTitledBorder("Datos del Producto");
		fuente = new Font("Berlin Sans FB Demi", 0, 18);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.white);
		setBorder(tb);
        initComponents();
    }
    
    public void initComponents(){
        labelId = new JLabel( "Id: " );
        labelId.setForeground(Color.white);
        txtId = new JTextField( 10 );
        txtId.setEditable( false );
        labelId.setBounds(320, 50, 50, 20);
        txtId.setBounds(400, 50, 115, 20);
        add( labelId );
        add( txtId );

        labelName = new JLabel( "Nombre: " );
        labelName.setForeground(Color.white);
        txtName = new JTextField( 10 );
        txtName.setEditable( false );
        labelName.setBounds(320, 80, 100, 20);
        txtName.setBounds(400, 80, 115, 20);
        add( labelName );
        add( txtName);

        labelCategory = new JLabel( "Categoría: " );
        labelCategory.setForeground(Color.white);
        txtCategory = new JTextField( 10 );
        txtCategory.setEditable( false );
        labelCategory.setBounds(320, 110, 100, 20);
        txtCategory.setBounds(400, 110, 115, 20);
        add( labelCategory);
        add( txtCategory );

        labelUnitPrice = new JLabel( "Precio: " );
        labelUnitPrice.setForeground(Color.white);
        txtUnitPrice = new JTextField( 10 );
        txtUnitPrice.setEditable( false );
        labelUnitPrice.setBounds(320, 140, 100, 20);
        txtUnitPrice.setBounds(400, 140, 115, 20);
        add( labelUnitPrice);
        add( txtUnitPrice);

        labelDescription = new JLabel( "Descripción: " );
        labelDescription.setForeground(Color.white);

        txtDescription = new JTextField( 10 );
        txtDescription.setEditable( false );
        labelDescription.setBounds(320, 170, 110, 20);
        txtDescription.setBounds(400, 170, 115, 20);
        add( labelDescription );
        add( txtDescription );

        labelQuantity = new JLabel( "Cantidad: " );
        labelQuantity.setForeground(Color.white);

        txtQuantity = new JTextField( 10 );
        txtQuantity.setEditable( false );
        labelQuantity.setBounds(320, 200, 100, 20);
        txtQuantity.setBounds(400, 200, 115, 20);
        add( labelQuantity );
        add( txtQuantity);

        panelImagen = new JPanel( );
        panelImagen.setBackground(Color.white);
        panelImagen.setBounds(20, 40, 290, 350);
        labelImagen = new JLabel( );
        labelImagen.setBorder(null);
        panelImagen.add( labelImagen);
        add( panelImagen);
    }
    
    public void setCamps(int code, String name, Category category, double priceUnit, String description, String image, int quantity){
    	ImageIcon icono = new ImageIcon(image);
		icon = new ImageIcon(icono.getImage().getScaledInstance(panelImagen.getWidth(),panelImagen.getHeight(), Image.SCALE_DEFAULT));
    	 labelImagen.setIcon( icon);
         txtId.setText( String.valueOf(code));
         txtName.setText(name);
         txtQuantity.setText(String.valueOf(quantity));
         txtCategory.setText(category.getName());
         txtUnitPrice.setText(String.valueOf(priceUnit));
         txtDescription.setText(description);
    }

    public void limpiarCampos( ){
        labelImagen.setIcon( null );
        txtId.setText( "" );
        txtName.setText( "" );
        txtQuantity.setText( "" );
        txtCategory.setText( "" );
        txtUnitPrice.setText( "" );
        txtDescription.setText( "" );
    }
}