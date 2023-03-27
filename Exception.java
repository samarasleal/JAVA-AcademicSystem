
public class Exception {
    // É subclasse da superclase Exception
    private String codigo;
    private String mensagem;
    private String novaMensagem;
      
    public Exception(String codigo,String mensagem,String novaMensagem){
        // Deve invocar o construtor de Exception
        // Recebe código por parâmetro mas não usa
        super();
    
        try{
           Curso c = new Curso();
          
           
          mensagem = "Finalizado com sucesso";
       }catch(Exception e){
           novaMensagem = "Aconteceu um erro";
           System.out.println("mensagem do Erro: "+e.toString());
            
        }
    }
      /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
   
       
    

}

