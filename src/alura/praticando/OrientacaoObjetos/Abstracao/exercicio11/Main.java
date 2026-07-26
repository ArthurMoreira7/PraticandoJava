package alura.praticando.OrientacaoObjetos.Abstracao.exercicio11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Compras compra1 = new Compras();
        compra1.nome = "Teclado";
        compra1.preco = 120.0;
        compra1.quantidade = 1;

        Compras compra2 = new Compras();
        compra2.nome = "Mouse";
        compra2.preco = 60.0;
        compra2.quantidade = 2;

        List<Compras> listaCompras = new ArrayList<>();
        listaCompras.add(compra1);
        listaCompras.add(compra2);

        double totalCompras = 0;
       for (Compras c: listaCompras){
           totalCompras+=c.retornaValorTotal();
       }
        System.out.println("Total da compra: R$" + totalCompras);
    }
}
