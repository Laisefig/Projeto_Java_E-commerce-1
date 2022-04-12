package Modelo;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private Produto produto1 = new Produto("Calça jeans", 1,80.0);
    private Produto produto2 = new Produto("Camisa Raglan",2, 55.0);
    private Produto produto3 = new Produto("Camiseta Regata Branca", 3, 35.0);
    private List<Produto> catalogo = new ArrayList<>();

    public Produto getProduto1() {
        return produto1;
    }

    public Produto getProduto2() {
        return produto2;
    }

    public Produto getProduto3() {
        return produto3;
    }
    public void catalogo(){
        this.catalogo.add(produto1);
        this.catalogo.add(produto2);
        this.catalogo.add(produto3);
    }
    public void visualizacaoEstoque(){
        catalogo();
        for (Produto catalogo : catalogo) {
            System.out.println(catalogo.getNome() + "\t\t\t"+ catalogo.getCodigo()+"\t\t\t"+ NumberFormat.getCurrencyInstance().format(catalogo.getPreco()));
        }
    }
}
