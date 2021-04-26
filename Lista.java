package lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lista {

public Integer indice;
public int eliminar;

public Lista(Integer indice){
  this.indice=indice;
}
public Lista(){
}
public int getEliminar(){
  return eliminar;
}
public Integer getIndice(){
  return indice;
}
public void setEliminar(int eliminar){
  this.eliminar = eliminar;
}
public void setIndice(Integer indice){
  this.indice = indice;
}
public boolean equals(Lista a){
  if(a.getEliminar()==indice){
    return true;
  }else{
    return false;
  }
}
public String toString(){
  return String.format("%s",this.indice);
}
public void mostrar(List<Lista>arreglo){
  System.out.println("El Arreglo ingresado es: ");
  for(int i=0;i<arreglo.size();i++){
    System.out.println(arreglo.get(i));
  }
}
public void filtrar(List<Lista>arreglo,Lista quitar){
  System.out.println("El Arreglo resultante es:");
  for(int j=0;j<arreglo.size();j++){
    if(arreglo.get(j).equals(quitar)){
      arreglo.remove(j);
    }
  }
  for(int k=0;k<arreglo.size();k++){
    System.out.println(arreglo.get(k));
  }
}
}
