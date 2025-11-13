import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Classe responsável pela conexão com o banco de dados
 * e verificação de login de usuários.
 *
 * Autor: Exemplo didático (corrigido)
 */
public class User {

    private String nome = "";

    /**
     * Método para conectar ao banco de dados MySQL.
     * @return Connection objeto de conexão com o banco, ou null em erro.
     */
    public Connection conectarBD() {
        try {
            // Classe do driver MySQL (conector moderno)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // String de conexão - ajuste host/banco conforme necessário
            String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC";

            // Usuário e senha (exemplo)
            String user = "lopes";
            String password = "123";

            // Realiza a conexão
            return DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
            return null;
        }
    }

    /**
     * Método para verificar se o usuário e senha existem no banco.
     * Usa PreparedStatement para evitar SQL injection.
     * @param login nome de usuário
     * @param senha senha do usuário
     * @return true se o usuário for encontrado, false caso contrário
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "SELECT nome FROM usuarios WHERE login = ? AND senha = ?";

        try (Connection conn = conectarBD()) {
            if (conn == null) {
                System.out.println("Conexão com o banco falhou.");
                return false;
            }

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, login);
                ps.setString(2, senha);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        nome = rs.getString("nome");
                        return true;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro ao verificar usuário: " + e.getMessage());
        }

        return false;
    }

    public String getNome() {
        return nome;
    }
}
