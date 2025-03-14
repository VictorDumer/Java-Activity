public class Produto {
    private String endereco;
    private int preco;
    private boolean avenda;
    private boolean nova;
    private String imovel;
    
    public Produto(String imovel,String endereco, int preco, boolean avenda, boolean nova){
        this.imovel = imovel;
        this.endereco = endereco;
        this.preco = preco;
        this.avenda = avenda;
        this.nova = nova;
    }
    public Produto(String imovel,String endereco, boolean nova){
        this.imovel = imovel;
        this.endereco = endereco;
        this.nova = nova;
    }
    public String getEndereco(){
        return endereco;
    }
    public int getPreco(){
        return preco;
    }
    public boolean isAvenda(){
        return avenda;
    }
    public boolean isNova(){
        return nova;
    }
    public String getImovel(){
        return imovel
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}