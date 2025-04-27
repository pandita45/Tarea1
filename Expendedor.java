package org.example;

class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int FANTA= 3;
    public static final int SUPER8 = 4;
    public static final int SNICKERS= 5;
    private DepositoBebida CocaCola;
    private DepositoBebida Sprite;
    private DepositoBebida Fanta;
    private DepositoDulce Super8;
    private DepositoDulce Snickers;
    private DepositoMoneda monVu;
    private final int precio;

    public Expendedor(int a, int b) {
        this.precio = b;
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

    public Producto comprarProducto(Moneda moneda, int y) {
        if (moneda != null) {
            switch (y) {
                case COCA: {
                    int a = CocaCola.getStock();
                    if (moneda.getValor() >= precio && a != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return CocaCola.get();
                    } else {
                        monVu.add(moneda);
                        return null;
                    }
                }
                case SPRITE: {
                    int b = Sprite.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return Sprite.get();
                    } else {
                        monVu.add(moneda);
                        return null;
                    }
                }
                case FANTA: {
                    int b = Fanta.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return Fanta.get();
                    } else {
                        monVu.add(moneda);
                        return null;
                    }
                }
                case SUPER8: {
                    int b = Super8.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return Super8.get();
                    } else {
                        monVu.add(moneda);
                        return null;
                    }
                }
                case SNICKERS: {
                    int b = Snickers.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        for (int i = 0; i < (moneda.getValor() - precio) / 100; i++) {
                            monVu.add(new Moneda100());
                        }
                        return Snickers.get();
                    } else {
                        monVu.add(moneda);
                        return null;
                    }
                }
            }
        }
        monVu.add(moneda);
        return null;
    }

    public Moneda getVuelto() {
        return monVu.get();
    }
}
