package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    //nombre de resturante
	
	
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        
        // Configurar el layout
        setLayout(new GridLayout(3, 2));
            
        // Crear campo para el nombre con etiqueta
        JLabel lblNombre = new JLabel("Nombre del restaurante:");
        txtNombre = new JTextField();
        add(lblNombre);
        add(txtNombre);

        // Crear selector para la calificación
        JLabel lblCalificacion = new JLabel("Calificación:");
        String[] calificaciones = {"1", "2", "3", "4", "5"};
        cbbCalificacion = new JComboBox<>(calificaciones);
        add(lblCalificacion);
        add(cbbCalificacion);

        // Crear selector para indicar si ya ha sido visitado
        JLabel lblVisitado = new JLabel("¿Ya visitado?");
        String[] opcionesVisitado = {"Sí", "No"};
        cbbVisitado = new JComboBox<>(opcionesVisitado);
        add(lblVisitado);
        add(cbbVisitado);
    

        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar

        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar

        // Agregar todos los elementos al panel
        // TODO completar

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODO completar
        String seleccion = (String) cbbVisitado.getSelectedItem();
        return "Sí".equals(seleccion);
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // TODO completar
        return txtNombre.getText();
    }
}
