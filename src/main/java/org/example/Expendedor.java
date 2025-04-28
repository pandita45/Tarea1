package org.example;

class Expendedor {
    private DepositoBebida CocaCola;
    private DepositoBebida Sprite;
    private DepositoBebida Fanta;
    private DepositoDulce Super8;
    private DepositoDulce Snickers;
    private DepositoMoneda monVu;

    /**
     * El constructor de expendedor crea todos los depositos necesarios y los llena en base a un parametro
     * @param a Determina la cantidad de elementos que tendra el expendedor
     */
    public Expendedor(int a) {
        this.monVu = new DepositoMoneda();
        this.CocaCola = new DepositoBebida();
        this.Sprite = new DepositoBebida();
        this.Fanta = new DepositoBebida();
        this.Super8 = new DepositoDulce();
        this.Snickers = new DepositoDulce();
        for (int i = 0; i < a; i++) {
            CocaCola.add(new CocaCola(100 + i));
            Sprite.add(new Sprite(200 + i));
            Fanta.add(new Fanta(300 + i));
            Super8.add(new Super8(400 + i));
            Snickers.add(new Snickers(500+i));
        }
    }

    /**
     *  El metodo comprarProducto recibe una moneda y una opcion numerica
     *  Comprueba que haya stock, que alcance el dinero y que exista una moneda valida
     *  Luego llena el deposito de monedas con las correspodientes monedas de 100 (vuelto)
     * @param moneda  Corresponde a una moneda de 100, 500, o 1000
     * @param y       Corresponde a la opcion de producto
     * @return        Devuelve el producto solicitado
     * @throws NoHayProductoException Cuando el deposito no tiene productos
     * @throws PagoIncorrectoException Cuando no se ingreso ninguna moneda
     * @throws PagoInsuficienteException Cuando el valor de moneda es menor al precio
     */

    public Producto comprarProducto(Moneda moneda, ProductoYPrecios y) throws Errores {
        if (moneda != null) {
            switch (y) {
                case COCACOLA: {
                    int precio = ProductoYPrecios.COCACOLA.getPrecio();
                    int b = CocaCola.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return CocaCola.get();
                    } else if (moneda.getValor()<precio){
                        monVu.add(moneda);
                        monVu.get();
                        throw new PagoInsuficienteException();
                    } else {
                        monVu.add(moneda);
                        monVu.get();
                        throw new NoHayProductoException();
                    }
                }
                case SPRITE: {
                    int precio = ProductoYPrecios.SPRITE.getPrecio();
                    int b = Sprite.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return Sprite.get();
                    } else if (moneda.getValor()<precio){
                        monVu.add(moneda);
                        monVu.get();
                        throw new PagoInsuficienteException();
                    } else {
                        monVu.add(moneda);
                        monVu.get();
                        throw new NoHayProductoException();
                    }
                }
                case FANTA: {
                    int precio = ProductoYPrecios.FANTA.getPrecio();
                    int b = Fanta.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return Fanta.get();
                    } else if (moneda.getValor()<precio){
                        monVu.add(moneda);
                        monVu.get();
                        throw new PagoInsuficienteException();
                    } else {
                        monVu.add(moneda);
                        monVu.get();
                        throw new NoHayProductoException();
                    }
                }
                case SUPER8: {
                    int precio = ProductoYPrecios.SUPER8.getPrecio();
                    int b = Super8.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return Super8.get();
                    } else if (moneda.getValor()<precio){
                        monVu.add(moneda);
                        monVu.get();
                        throw new PagoInsuficienteException();
                    } else {
                        monVu.add(moneda);
                        monVu.get();
                        throw new NoHayProductoException();
                    }
                }
                case SNICKER: {
                    int precio = ProductoYPrecios.SNICKER.getPrecio();
                    int b = Snickers.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return Snickers.get();
                    } else if (moneda.getValor()<precio){
                        monVu.add(moneda);
                        monVu.get();
                        throw new PagoInsuficienteException();
                    } else {
                        monVu.add(moneda);
                        monVu.get();
                        throw new NoHayProductoException();
                    }
                }
            }
        }
        monVu.add(moneda);
        throw new PagoIncorrectoException();
    }

    /**
     * Getvuelto Llama a un metodo de la clase DepositoMoneda, la cual vacia y el deposito, devolviendo su contenido
     * @return Entrega todas las monedas de 100 correspondientes al vuelto
     */
    public Moneda getVuelto() {
        return monVu.get();
    }
}
