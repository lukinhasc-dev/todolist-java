package br.com.lucassilva.ToDoList.user;

public class UserModel {

    private String username;
    private String name;
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    
    // Getters e Setters
    /****
     * Getters e Setters** são métodos usados em programação orientada a objetos
     * para acessar e modificar atributos privados de uma classe, garantindo
     * encapsulamento. O **Getter** recupera o valor de um atributo, enquanto o
     * **Setter** altera esse valor. Eles ajudam a proteger os dados e permitem
     * aplicar lógica adicional ao acessar ou modificar atributos. Exemplo: um
     * atributo `nome` privado pode ser acessado com `getNome()` e alterado com
     * `setNome(String nome)`. Isso mantém o controle sobre o que entra ou sai da
     * classe. 🎯
     */

}
