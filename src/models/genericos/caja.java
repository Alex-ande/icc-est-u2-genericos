package models.genericos;

public class caja <T> { 
private T objeto;

public void guardar(T obejeto) {
    this.objeto = obejeto;
}

public T obtener() {
   return objeto;
} 


}
