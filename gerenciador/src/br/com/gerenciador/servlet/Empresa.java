package br.com.gerenciador.servlet;

import java.util.Date;

public class Empresa {
  
  private Integer id;
  private String nome;
  private Date dataAbertura = new Date();
  
  public Integer getId() {
    return this.id;
  }
  
  public String getNome() {
    return this.nome;
  }

  public void setId(Integer id) {
    this.id = id;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void setDataAbertura(Date dataAbertura) {
    this.dataAbertura = dataAbertura;
  }
  
  public Date getDataAbertura() {
    return this.dataAbertura;
  }
  
}
