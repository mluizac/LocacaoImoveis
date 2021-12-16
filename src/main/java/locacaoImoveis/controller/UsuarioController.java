package locacaoImoveis.controller;

import locacaoImoveis.model.Usuario;
import locacaoImoveis.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    public static boolean locatarioLogado = false;
    public static boolean locadorLogado = false;

    @Autowired //construtor
    UsuarioService usuarioService;

    @PostMapping()
    public void cadastro(@RequestBody Usuario usuario){
        usuarioService.cadastraUsuario(usuario);
    }

    @PostMapping("/login/{user}/{senha}")
    public String login(@PathVariable String user, @PathVariable String senha){
        return usuarioService.valida(user, senha);
    }

    @GetMapping("/iniciar")
    public void iniciar(){
        usuarioService.iniciar();
    }

    @GetMapping()
    public List buscaTodos(){
        return usuarioService.busca();
    }

    @GetMapping("/{user}")
    public Usuario buscaUm(@RequestParam String user){
        return usuarioService.buscaUm(user);
    }

    @DeleteMapping("/{user}")
    public void delete(@PathVariable String user){
        usuarioService.delete(user);
    }

}