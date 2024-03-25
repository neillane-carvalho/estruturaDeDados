import java.util.ArrayList;
import java.util.List;
public class AgendaTelefonica {
    private List<Contato> contatos;

    public AgendaTelefonica(){
        this.contatos = new ArrayList<>();
    }

    public  void  adicionarContato(Contato contato){
        contatos.add(contato);
    }

    public  void removerContato(String nome){
        contatos.removeIf(contato -> contato.getNome().equals(nome));
    }

    public void atualizarContato(String nome, String novoContato){
        for (Contato contato : contatos){
            if (contato.getNome().equals(nome)){
                contato.setNumero(novoContato);
                break;
            }
        }
    }

    public void listaContatos(){
        System.out.println("Contatos na agenda:");
        System.out.println(contatos);
    }
}
