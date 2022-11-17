package model;

/**
 * @author kelwin_santos
 */
public class Products {

    private int id_produto;
    private String nm_produto;
    private String txtCategoria;
    private float txtValorCusto;
    private float txtValorVenda;
    private int txtQtdProduto;
    
    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNm_produto() {
        return nm_produto;
    }

    public void setNm_produto(String nm_produto) {
        this.nm_produto = nm_produto;
    }

    public String getTxtCategoria() {
        return txtCategoria;
    }

    public void setTxtCategoria(String txtCategoria) {
        this.txtCategoria = txtCategoria;
    }

    public float getTxtValorCusto() {
        return txtValorCusto;
    }

    public void setTxtValorCusto(float txtValorCusto) {
        this.txtValorCusto = txtValorCusto;
    }

    public float getTxtValorVenda() {
        return txtValorVenda;
    }

    public void setTxtValorVenda(float txtValorVenda) {
        this.txtValorVenda = txtValorVenda;
    }

    public int getTxtQtdProduto() {
        return txtQtdProduto;
    }

    public void setTxtQtdProduto(int txtQtdProduto) {
        this.txtQtdProduto = txtQtdProduto;
    }
    
}
