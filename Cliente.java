public class Cliente extends Pessoaa implements Autenticavel {

     private String endereco;
     private String telefone;
     private String senha;

      public String getSenha() {
         return this.senha;
     }
     
      public void setSenha(String senha) {
         this.senha = senha;
     }

     public String getEndereco() {
         return this.endereco;
     }

     public String getTelefone() {
         return this.telefone;
     }

     public void setEndereco(String endereco) {
         this.endereco = endereco;
     }

     public void setTelefone(String telefone) {
         this.telefone = telefone;
     }

        @Override
        public boolean autenticar(String senha) {
            if(this.senha.equals(senha)){
                return true;
            }
            return false;
        }

}

