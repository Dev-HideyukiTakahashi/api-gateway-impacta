package br.com.impacta.api_gateway.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ComponenteDto {
    private Long id;
    private String sku;
    private String descricao;
    private BigDecimal preco;
    private Integer quantidade;

    @JsonProperty("codigo")
    private String pecaCodigo;

    public ComponenteDto() {
    }

    public ComponenteDto(Long id, String sku, String descricao, BigDecimal preco, Integer quantidade,
            String pecaCodigo) {
        this.id = id;
        this.sku = sku;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.pecaCodigo = pecaCodigo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getPecaCodigo() {
        return pecaCodigo;
    }

    public void setPecaCodigo(String pecaCodigo) {
        this.pecaCodigo = pecaCodigo;
    }
}
