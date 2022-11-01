package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario) {
        if(usuario.getId() == null) {
            System.out.println("SAVE - Recebendo usuário na camada de repositorio");
        } else
            System.out.println("UPDATE - Recebendo usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o  id:" + id + " para excluir na camada de repositório"));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário"));
        return new Usuario("gleyson", "password");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - recebendo username: " +username+ " para localizar usuário"));
        return new Usuario("gleyson", "password");
    }

}
