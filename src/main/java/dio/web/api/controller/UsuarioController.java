package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/users")
    public List<Usuario> getUsers() {
      return usuarioRepository.findAll();
    }

    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username")  String username) {
        return usuarioRepository.findByUsername(username);
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable("id") Integer id) {
        usuarioRepository.deleteById(id);
    }

    public void 

}
