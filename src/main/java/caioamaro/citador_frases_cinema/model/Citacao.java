package caioamaro.citador_frases_cinema.model;

import jakarta.persistence.*;

@Entity
@Table(name = "citacoes")
public class Citacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public String getTitulo() {
        return titulo;
    }

    public String getFrase() {
        return frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public String getPoster() {
        return poster;
    }
}
