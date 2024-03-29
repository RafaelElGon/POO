import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String codigo;
    private String nome;
    private List<CategoriaFilme> categorias;
    private List<String> nomesAtores;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Filme(String codigo) {
        this(codigo,"", new ArrayList<CategoriaFilme>(), new ArrayList<>());
    }

    public Filme(String codigo,String nome, List<CategoriaFilme> categorias,
                 List<String> nomesAtores) {
        this.codigo = codigo;
        this.nome = nome;
        this.categorias = categorias;
        this.nomesAtores = nomesAtores;
    }

    public void incluiAtorEmElenco(String nomeAtor){
        nomesAtores.add(nomeAtor);
    }

    public boolean ehDaCategoria(CategoriaFilme categoria) {
        for (CategoriaFilme cat: this.categorias) {
            if (cat ==categoria) {
                return true;
            }
        }
        return false;
    }
}
