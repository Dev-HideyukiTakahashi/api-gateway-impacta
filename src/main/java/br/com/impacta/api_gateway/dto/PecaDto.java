package br.com.impacta.api_gateway.dto;

import java.util.List;

public class PecaDto {
    private Long id;
    private String codigo;
    private String nome;
    private List<ComponenteDto> componentes;

    public PecaDto() {
    }

    public PecaDto(Long id, String codigo, String nome, List<ComponenteDto> componentes) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.componentes = componentes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public List<ComponenteDto> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<ComponenteDto> componentes) {
        this.componentes = componentes;
    }
}
