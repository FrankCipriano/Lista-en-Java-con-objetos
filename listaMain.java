//___Implemente una funcion que reciba una lista de Integers y un numero entero, luego elimine de la lista todos los elementos que tengan el valor y retorna la lista resultante
//EJEMPLO (ENTRADA):({2,3,4,5,6,7,8,9,15,2},2)
//EJEMPLO (SALIDA):({3,4,5,6,7,8,9,15})
package lista;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class listaMain {

private static final Lista l1 = new Lista(2);
private static final Lista l2 = new Lista(3);
private static final Lista l3 = new Lista(4);
private static final Lista l4 = new Lista(5);
private static final Lista l5 = new Lista(6);
private static final Lista l6 = new Lista(7);
private static final Lista l7 = new Lista(8);
private static final Lista l8 = new Lista(9);
private static final Lista l9 = new Lista(2);
private static final Lista l10 = new Lista(15);
private static final Lista l11 = new Lista(2);

private static final Lista quitar = new Lista();
private static int valor =2;

  public static void main(String[] args) {
  Lista lista = new Lista();
  List<Lista>arreglo = new ArrayList();
    arreglo.add(l1);
    arreglo.add(l2);
    arreglo.add(l3);
    arreglo.add(l4);
    arreglo.add(l5);
    arreglo.add(l6);
    arreglo.add(l7);
    arreglo.add(l8);
    arreglo.add(l9);
    arreglo.add(l10);
    arreglo.add(l11);
    quitar.setEliminar(valor);
    lista.mostrar(arreglo);
    lista.filtrar(arreglo,quitar);
  }
}
