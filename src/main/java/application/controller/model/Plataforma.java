package application.controller.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Column;

@Entity
@Table(name = "plataformas")
@Getter
@Setter
public class Plataforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true) // unique = true é para definir que o campo é único, vira um campo indexado
                                             // demora mais para cadastrar dados
    private String nome;

}
