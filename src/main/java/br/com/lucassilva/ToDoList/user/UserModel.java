package br.com.lucassilva.ToDoList.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name ="tbl_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true) // Significa que o username vai ser uma coluna que vai definir um atributo único, se tiver outro existente ele vai dar erro
    private String username;
    
    private String name;
    private String password;
    

    @CreationTimestamp
    private LocalDateTime createdAt;














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
     * 
     * @Data porque usa os Getters e Setters
     * @Setters para usar apenas os seters
     * @Geters para usar apenas os geters
     * @Entity 
     */

}
