package org.example;


class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int NumPad, Expendedor exp) {

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