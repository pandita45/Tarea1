package org.example;


class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, ProductoYPrecios NumPad, Expendedor exp) throws Errores{
        //se ingresa una moneda, el id del objeto que se quiere comprar y el expendedor.

        Producto b = exp.comprarProducto(m,NumPad);
        if (b != null) {
            sonido = b.accion();
        } else {
            sonido = null;
        }
        Moneda mon;
        while ((mon = exp.getVuelto()) != null) {
            vuelto += mon.getValor();
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        return sonido;
    }
}