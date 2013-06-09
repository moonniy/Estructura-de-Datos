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
	    System.out.println(actual.info + " ");
	    actual = actual.liga;
	}
    }
    /*
    public static void main(String args[]){
	ColaD Cola = new ColaD();
	int op, dato, datoEliminado;
	do{
	System.out.println("1.Insertar");
	System.out.println("2.Eliminar");
	System.out.println("3.Esta Vacia");
	System.out.println("4.Mostrar Cola");
	System.out.println("5.Salir");
	op = Integer.parseInt(System.console().readLine());
	
	    switch(op){
	    case 1:
		System.out.println("Ingresar dato:");
		dato = Integer.parseInt(System.console().readLine());
		Cola.Insertar(dato);
		break;
	    case 2:
		datoEliminado = Cola.Eliminar();
		if(datoEliminado == -1){
		    System.out.println("cola vacia!");
		}else
		System.out.println(datoEliminado);
		break;
	    case 3:
		if(Cola.ColaDVacia() == true)
		    System.out.println("cola vacia!");
		else
		    System.out.println("La cola tiene elementos!");
		break;
	    case 4:
		Cola.Mostrar();
		break;

	    }
	}while(op != 5);
	} */   
}
