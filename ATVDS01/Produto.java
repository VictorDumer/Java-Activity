public class Produto {
    private String endereco;
    private String preco;
    private boolean avenda;
    private boolean nova;
    private String imovel;
    
    public Produto(String imovel,String endereco, String preco, boolean avenda, boolean nova){
        this.imovel = imovel;
        this.endereco = endereco;
        this.preco = preco;
        this.avenda = avenda;
        this.nova = nova;
    }
    public Produto(){
        this.imovel = imovel;
        this.endereco = endereco;
        this.preco = preco;
        this.avenda = avenda;
        this.nova = nova;
    }
    
    public static String index(String endereco, String imovel, boolean avenda, boolean nova, String preco) {
        return "\n"+"\nEndereco: " + endereco + "\nTipo de imóvel: " + imovel + "\nÀ venda: " + avenda + "\nNovo: " + nova + "\nPreço: " + preco +"\n";
    }
    //getters
    public String getEndereco(){
        return endereco;
    }
    public String getPreco(){
        return preco;
    }
    public boolean isAvenda(){
        return avenda;
    }
    public boolean isNova(){
        return nova;
    }
    public String getImovel(){
        return imovel;
    }
    // setters
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setPreco(String preco){
        this.preco= preco;
    }
    public void setAvenda(boolean avenda){
        this.avenda= avenda;
    }
    public void setNova(boolean nova){
        this.nova = nova;
    }
    public void setImovel(String imovel){
        this.imovel=imovel;
    }
}