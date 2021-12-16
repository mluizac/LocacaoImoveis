package locacaoImoveis.service;

import locacaoImoveis.model.TipoUsuario;
import locacaoImoveis.model.Usuario;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class UsuarioService {
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    //inicializa
    public void iniciar(){
        listaUsuarios.add(new Usuario("Maria", "8", TipoUsuario.LOCADOR));
        listaUsuarios.add(new Usuario("Luiza", "6", TipoUsuario.LOCATARIO));
    }

    //cadastrar
    public Usuario cadastraUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
        return usuario;
    }

    //buscar todos
    public List busca() {
        return listaUsuarios;
    }

    //buscar um
    public Usuario buscaUm(String user) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getUser().equals(user)) {
                return listaUsuarios.get(i);
            }
        }
        return null;
    }

    //deletar
    public void delete(String user) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getUser().equals(user)) {
                listaUsuarios.remove(i);
            }
        }
        System.out.println("Removido com sucesso");
    }

    //verificando se o usuario esta logado
    public String valida(String user, String senha) {
        Usuario usuario = listaUsuarios.stream().filter(s->s.getUser().equals(user)).findFirst().get();
        if(usuario.getSenha().equals(senha) && usuario.getTipoUsuario().equals(TipoUsuario.LOCADOR)){
            boolean locadorLogado = true;
            return "Logado";
        }
        else if (usuario.getSenha().equals(senha) && usuario.getTipoUsuario().equals(TipoUsuario.LOCATARIO)){
            boolean locatarioLogado = true;
            return "Logado";
        }
        return "Não logado";
    }
}
