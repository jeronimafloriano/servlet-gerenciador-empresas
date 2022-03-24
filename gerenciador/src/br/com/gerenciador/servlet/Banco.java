package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

  public static List<Empresa> lista = new ArrayList<>();
  private static Integer chaveSequencial = 1;
  
  public void adiciona(Empresa empresa) {
    empresa.setId(Banco.chaveSequencial++);
    Banco.lista.add(empresa); 
  }
  
  public List<Empresa> getEmpresas(){
    return Banco.lista;
  }

  public void removeEmpresa(Integer id) {
    Iterator<Empresa> it = lista.iterator(); 
    
    while(it.hasNext()) {   
      Empresa empresa = it.next();
      if(empresa.getId() == id) {
        it.remove();
      }
      
    }
    
    
  }

  public Empresa buscaEmpresaPeloId(Integer id) {
    for (Empresa empresa : lista) {
      if(empresa.getId() == id) {
        return empresa;
      }
    }
    return null;
  }

}
