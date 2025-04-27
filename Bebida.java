package org.example;

abstract class Bebida extends Producto {
    /**
     * Este es el constructor de la clase abstracta Bebida
     * @param a sera el número de serie que se le asignara a la Bebida.
     */
    public Bebida (int a){
        super(a);
    }

    /**
     * @return Una cadena que indica que es una bebida.
     */
    public String accion(){
        return "Bebida";
    }
}

class Sprite extends Bebida {
    /**
     * Este es el constructor de Sprite, el cual usa el metodo super() para usar el constructor de Bebida
     * @param serie es el numero de serie que se le asignará
     */
    public Sprite(int serie) {
        super(serie);
    }

    /**
     * @return Una cadena que indica que es una Sprite.
     */
    public String accion() {
        return "sprite";
    }
}

class CocaCola extends Bebida {
    /**
     * Este es el constructor de CocaCola, el cual usa el metodo super() para usar el constructor de Bebida
     * @param serie es el numero de serie que se le asignará
     */
    public CocaCola(int serie) {
        super(serie);
    }

    /**
     * @return Una cadena que indica que es una CocaCola.
     */
    public String accion() {
        return "cocacola";
    }
}

class Fanta extends Bebida {
    /**
     * Este es el constructor de Fanta, el cual usa el metodo super() para usar el constructor de Bebida
     * @param serie es el numero de serie que se le asignará
     */
    public Fanta(int serie) {
        super(serie);
    }

    /**
     * @return Una cadena que indica que es una Fanta.
     */
    public String accion() {
        return "fanta";
    }
}
