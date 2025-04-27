package org.example;

import java.util.Scanner;

public class MainInteractivo {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        Moneda m = null;
        Expendedor exp = new Expendedor(10);
        int saldo=0;
        System.out.println();
        System.out.println("         ###----- Bienvenido a DoomMachine v7 -----###");
        System.out.println("La maquina expenderora favorita de Concepcion desde el año 2009");

        while(true){
            System.out.println("Ingrese una moneda");
            System.out.println("1. *Se ingresa moneda de 100*");
            System.out.println("2. *Se ingresa moneda de 500*");
            System.out.println("3. *Se ingresa moneda de 1000*");
            System.out.println("4. *Continuar sin ingresar moneda*");
            System.out.println();

            int valor=0;
            while (valor!=4){
                valor = scan.nextInt();
                if(valor == 1){
                    m = new Moneda100();
                    saldo+= m.getValor();
                    break;
                }
                if (valor == 2){
                    m = new Moneda500();
                    saldo+= m.getValor();
                    break;
                }
                if(valor == 3){
                    m = new Moneda1000();
                    saldo+= m.getValor();
                    break;
                }
            }

            System.out.println("Saldo:  $"+ saldo);
            System.out.println();
            System.out.println("Seleccione el producto que sea comprar");
            System.out.println("1. Coca Cola:  $"+ ProductoYPrecios.COCACOLA.getPrecio());
            System.out.println("2. Sprite:     $"+ ProductoYPrecios.SPRITE.getPrecio());
            System.out.println("3. Fanta:      $"+ ProductoYPrecios.FANTA.getPrecio());
            System.out.println("4. Super 8:    $"+ ProductoYPrecios.SUPER8.getPrecio());
            System.out.println("5. Snickers:   $"+ ProductoYPrecios.SNICKER.getPrecio());

            int opcion;
            ProductoYPrecios id;
            while (true) {
                opcion = scan.nextInt();
                if (opcion == 1) {
                    id = ProductoYPrecios.COCACOLA;
                    break;
                }
                if (opcion == 2) {
                    id = ProductoYPrecios.SPRITE;
                    break;
                }
                if (opcion == 3) {
                    id = ProductoYPrecios.FANTA;
                    break;
                }
                if (opcion == 4) {
                    id = ProductoYPrecios.SUPER8;
                    break;
                }
                if (opcion == 5) {
                    id = ProductoYPrecios.SNICKER;
                    break;
                } else {
                    System.out.println("Opcion invalida, seleccione uno de los productos listados");
                }
            }
            saldo = 0;
            try {
                Comprador c = new Comprador(m,id,exp);
            } catch (NoHayProductoException a){
                System.out.println("No hay stock");
            } catch (PagoIncorrectoException a){
                System.out.println("No se ingreso moneda");
            } catch (PagoInsuficienteException a){
                System.out.println("No alcanza para comprar el produto");
            }
            System.out.println("Termino de comprar?:");
            System.out.println("1. Si");
            System.out.println("2. No");
            int seguir = scan.nextInt();
            if(seguir == 1){
                System.out.println("¡Gracias por su compra, que tenga buen dia!");
                break;
            }
        }
    }
}
