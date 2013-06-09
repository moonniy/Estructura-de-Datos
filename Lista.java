public class Lista{
    protected NodoCola Datos;

    public Lista(){
	Datos = null;
	ColaD Cola = new ColaD();
    }

    protected void CrearCola(int NumElementos){
	NodoCola actual = Datos;
	int i = 0;
	do{	
	    if(actual == null){
		NodoCola nuevo = new NodoCola();
		Datos = nuevo;
	    }
	    else{
		NodoCola nuevo = new NodoCola();
		while(actual.sig != null)
		    actual = actual.sig;
		actual.sig = nuevo;		
	    }
	    i++;
	    //	    System.out.println(i);
	}while(i < NumElementos);
    }

    protected void InsertarElemento(int numCola, int dato){
	NodoCola actual = Datos;
	ColaD Cola = new ColaD();
	int cont = 1;
	if(actual != null){
	    while(cont != numCola){
		actual = actual.sig;
		cont++;
	    }
	    Cola.Insertar(dato); 
	}
	else
	    System.out.println("Lista vacia");
	Cola.Mostrar();
    }

    protected int EliminaElemento(int numCola){
	NodoCola actual = Datos;
       	ColaD Cola = new ColaD();
	int datoEliminado, cont = 1;
	if(actual != null){
	    while(cont != numCola){
		actual = actual.sig;
		cont++;
	    }
	    return(Cola.Eliminar());
	}
	else
	    return -1;
    }

    protected void MostrarCola(int numCola){
	NodoCola actual = Datos;
       	ColaD Cola = new ColaD();
	int cont = 1;
	if(actual != null){
	    while(cont != numCola){
		actual = actual.sig;
		cont++;
	    }
	    Cola.Mostrar();
	}
	else
	    System.out.println("Cola vacia");
    }

    public static void main(String args[]){
	Lista Elementos = new Lista();
	int op, numCola, numElementos, dato, datoEliminado;
	System.out.println("Ingresar numero de listas a crear:");
	numElementos = Integer.parseInt(System.console().readLine());
	Elementos.CrearCola(numElementos);
	do{
	    System.out.println("1.Insertar valor");
	    System.out.println("2.Eliminar valor");
	    System.out.println("3.Mostrar");
	    System.out.println("4.Salir");
	    op = Integer.parseInt(System.console().readLine());

	    switch(op){
	    case 1:
		System.out.println("¿En que cola?");
		numCola = Integer.parseInt(System.console().readLine());
		System.out.println("Ingresar dato:");
		dato = Integer.parseInt(System.console().readLine());
		Elementos.InsertarElemento(numCola,dato);
		break;
	    case 2:
		System.out.println("¿En que cola?");
		numCola = Integer.parseInt(System.console().readLine());
		datoEliminado= Elementos.EliminaElemento(numCola);
		if(datoEliminado != -1)
		    System.out.println("Dato eliminado:"+datoEliminado);
		else
		    System.out.println("Lista vacia");
		break;
	    case 3:
		System.out.println("¿Que cola?");
		numCola = Integer.parseInt(System.console().readLine());
		Elementos.MostrarCola(numCola);
	    }
	}while(op != 4);
    }

    
}
