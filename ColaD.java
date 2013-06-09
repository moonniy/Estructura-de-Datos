public class ColaD{
    protected Nodo Elemento;

    public ColaD(){
	Elemento = null;
    }

    protected void Insertar(int dato){
	Nodo actual = Elemento;
	Nodo nuevo = new Nodo(dato);
	if(Elemento == null)
	    Elemento = nuevo;
	else{
	    while (actual.liga != null)
		actual = actual.liga;
	    actual.liga = nuevo; 
	}
    }

    public int Eliminar(){
	Nodo actual = Elemento;
	if(Elemento == null)
	    return -1;
	else{
	    Elemento = actual.liga;
	    return (actual.info);
	} 
    }

    public boolean ColaDVacia(){
	return (Elemento == null);
    }

    public void Mostrar(){
	Nodo actual = Elemento;
	while (actual != null){
	    System.out.print(actual.info + " ");
	    actual = actual.liga;
	}
    }
}
