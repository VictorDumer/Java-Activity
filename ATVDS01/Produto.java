public class Produto {
    private String endereco;
    private String preco;
    private boolean avenda;
    private boolean nova;
    private String imovel;
    private int info;
    
    public Produto(int info,String imovel,String endereco, String preco, boolean avenda, boolean nova){
        this.imovel = imovel;
        this.endereco = endereco;
        this.preco = preco;
        this.avenda = avenda;
        this.nova = nova;
    }
    public static String index(int info,String endereco, String imovel, boolean avenda, boolean nova, String preco) {
        return "\n"+ "Index: "+ info+"\nEndereco: " + endereco + "\nTipo de imóvel: " + imovel + "\nÀ venda: " + avenda + "\nNovo: " + nova + "\nPreço: " + preco +"\n";
    }
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
    public void setNome(String endereco) {
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