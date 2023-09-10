package devandroid.tarsis.mylistapp.model;

public class Pessoa {
    private String primeiroNome;
    private String sobreNome;
    private String email;
    private String numeroTelefone;

    public Pessoa(){

    }

    public String getPrimeiroNome(){
        return this.primeiroNome;
    }
    public void setPrimeiroNome(String primeiroNome){
        this.primeiroNome = primeiroNome;
    }
    public String getSobreNome(){
        return this.sobreNome;
    }
    public void setSobreNome(String sobreNome){
        this.sobreNome = sobreNome;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getNumeroTelefone(){
        return this.numeroTelefone;
    }
    public void setNumeroTelefone(String numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", email='" + email + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                '}';
    }
}
