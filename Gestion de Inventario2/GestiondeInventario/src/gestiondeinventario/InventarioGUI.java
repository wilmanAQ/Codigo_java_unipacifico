
package gestiondeinventario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase de la interfaz gráfica para manejar el inventario
public class InventarioGUI extends JFrame {
    private Supermercado supermercado;
    private JTextArea textArea;
    private JTextField txtCodigo, txtNombre, txtPrecio, txtVolumen, txtFechaExpiracion;
    private JComboBox<String> tipoProductoComboBox;

    public InventarioGUI() {
        supermercado = new Supermercado("SuperMax");

        setTitle("Gestión de Inventarios");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear componentes de la interfaz
        tipoProductoComboBox = new JComboBox<>(new String[]{"Alimento", "Bebida"});
        txtCodigo = new JTextField(15);
        txtNombre = new JTextField(15);
        txtPrecio = new JTextField(15);
        txtVolumen = new JTextField(15);
        txtFechaExpiracion = new JTextField(15);
        textArea = new JTextArea(10, 50);
        textArea.setEditable(false);

        JButton btnAgregar = new JButton("Agregar Producto");
        JButton btnMostrar = new JButton("Mostrar Inventario");
        JButton btnProductoMasCaro = new JButton("Mostrar Producto Más Caro");
        JButton btnProductoMasBarato = new JButton("Mostrar Producto Más Barato");
        JButton btnMasVendido = new JButton("Mostrar Producto Más Vendido");
        JButton btnMenosVendido = new JButton("Mostrar Producto Menos Vendido");

        // Panel para agregar productos
        JPanel panelAgregar = new JPanel();
        panelAgregar.setLayout(new GridLayout(7, 2));
        panelAgregar.add(new JLabel("Código:"));
        panelAgregar.add(txtCodigo);
        panelAgregar.add(new JLabel("Nombre:"));
        panelAgregar.add(txtNombre);
        panelAgregar.add(new JLabel("Precio:"));
        panelAgregar.add(txtPrecio);
        panelAgregar.add(new JLabel("Tipo Producto:"));
        panelAgregar.add(tipoProductoComboBox);
        
        panelAgregar.add(new JLabel("o Fecha Expiración:"));
        panelAgregar.add(txtFechaExpiracion);
        panelAgregar.add(btnAgregar);

        // Panel para mostrar inventario y otras opciones
        JPanel panelMostrar = new JPanel();
        panelMostrar.add(btnMostrar);
        panelMostrar.add(btnProductoMasCaro);
        panelMostrar.add(btnProductoMasBarato);
        panelMostrar.add(btnMasVendido);
        panelMostrar.add(btnMenosVendido);
        panelMostrar.add(new JScrollPane(textArea));

        // Layout
        setLayout(new BorderLayout());
        add(panelAgregar, BorderLayout.NORTH);
        add(panelMostrar, BorderLayout.CENTER);

        // Acciones de los botones
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarProducto();
            }
        });

        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarInventario();
            }
        });

        btnProductoMasCaro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarProductoMasCaro();
            }
        });

        btnProductoMasBarato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarProductoMasBarato();
            }
        });

        btnMasVendido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarProductoMasVendido();
            }
        });

        btnMenosVendido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarProductoMenosVendido();
            }
        });
    }

    // Método para agregar productos
    private void agregarProducto() {
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        double precio = Double.parseDouble(txtPrecio.getText());

        // Crear el producto basado en el tipo seleccionado
        if (tipoProductoComboBox.getSelectedItem().equals("Alimento")) {
            String fechaExpiracion = txtFechaExpiracion.getText();
            Producto producto = new Alimento(codigo, nombre, precio, fechaExpiracion);
            supermercado.agregarProducto(producto);
        } else {
            double volumen = Double.parseDouble(txtVolumen.getText());
            Producto producto = new Bebida(codigo, nombre, precio, volumen);
            supermercado.agregarProducto(producto);
        }

        JOptionPane.showMessageDialog(this, "Producto agregado correctamente.");
        limpiarCampos();
    }

    // Método para mostrar el inventario
    private void mostrarInventario() {
        StringBuilder sb = new StringBuilder();
        sb.append("Inventario del supermercado ").append(supermercado.getNombre()).append(":\n");

        for (Producto producto : supermercado.getInventario().getProductos()) {
            sb.append(producto.mostrarInformacion()).append("\n");
        }

        textArea.setText(sb.toString());
    }

    // Métodos para mostrar los productos más caros, más baratos, más vendidos y menos vendidos
    private void mostrarProductoMasCaro() {
        Producto producto = supermercado.getInventario().obtenerProductoMasCaro();
        textArea.setText("Producto más caro: \n" + producto.mostrarInformacion());
    }

    private void mostrarProductoMasBarato() {
        Producto producto = supermercado.getInventario().obtenerProductoMasBarato();
        textArea.setText("Producto más barato: \n" + producto.mostrarInformacion());
    }

    private void mostrarProductoMasVendido() {
        Producto producto = supermercado.getInventario().obtenerProductoMasVendido();
        textArea.setText("Producto más vendido: \n" + producto.mostrarInformacion());
    }

    private void mostrarProductoMenosVendido() {
        Producto producto = supermercado.getInventario().obtenerProductoMenosVendido();
        textArea.setText("Producto menos vendido: \n" + producto.mostrarInformacion());
    }

    // Limpiar los campos de entrada
    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtVolumen.setText("");
        txtFechaExpiracion.setText("");
    }

    // Método main para ejecutar la interfaz gráfica
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InventarioGUI().setVisible(true);
            }
        });
    }
}
