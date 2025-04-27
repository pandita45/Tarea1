package org.example;


abstract class Dulce extends Producto{
    /**
     * Constructor de Dulce que le da su numero de serie.
     * @param serie numero de serie que se le asignara.
     */
    public Dulce(int serie) {
        super(serie);
    }

    /**
     * Metodo necesario de la clase Dulce (es abstracto en la clase Producto)
     * @return devuelve el tipo de producto que es (Dulce en este caso), luego se le hara override.
     */
    public String accion(){
        return "Dulce";
    }
}

class Super8 extends Dulce {
    /**
     * Constructor de Super8 que le da su número de serie, llama al constructor de la superclase.
     * @param serie numero de serie que se le asignara al Super8.
     */
    public Super8(int serie) {
        super(serie);
    }

    /**
     *
     * @return devuelve que tipo de dulce es, en este caso un Super8.
     */
    @Override
    public String accion() {
        return "Super8";
    }
}

class Snickers extends Dulce {
    /**
     * Constructor de Snickers que le da su número de serie, llama al constructor de la superclase.
     * @param serie numero de serie que se le asignara al Snickers.
     */
    public Snickers(int serie) {
        super(serie);
    }

    /**
     *
     * @return devuelve que tipo de dulce es, en este caso un Snickers.
     */
    @Override
    public String accion() {
        return "Snickers";
    }
}
