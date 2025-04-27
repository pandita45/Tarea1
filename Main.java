package org.example;


public class Main {
    public static void main(String[] args) throws Exception {
        Expendedor exp = new Expendedor(2);
        Moneda m = null;
        Moneda mon = new Moneda100();
        try {
            Comprador d = new Comprador(mon, ProductoYPrecios.FANTA, exp);
            Comprador c = new Comprador(m,ProductoYPrecios.COCACOLA,exp);
        } catch (NoHayProductoException a){
            System.out.println("No hay stock");
        } catch (PagoIncorrectoException a){
            System.out.println("No se ingreso moneda");
        } catch (PagoInsuficienteException a){
            System.out.println("No alcanza para comprar el produto");
        }
    }
}