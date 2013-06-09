public class Lista{
    protected NodoCola Datos;

    public Lista(){
	Datos = null;
    }

    protected void CrearCola(int NumElementos){
	NodoCola actual = Datos;
	int i = 0;
	do{	
	    if(actual == null){
		NodoCola nuevo = new NodoCola();
		Datos = nuevo;
		actual = Datos;
	    }
	    else{
		NodoCola nuevo = new NodoCola();
		while(actual.sig != null)
		    actual = actual.sig;
		actual.sig = nuevo;		
	    }
	    i++;
	}while(i < NumElementos);
	actual = Datos;
	i = 0;
	while(actual != null){
	    i++;
	    System.out.println(i);
	    actual = actual.sig;
	}
    }

    protected void InsertarElemento(int numCola, int dato){
	NodoCola actual = Datos;
	int cont = 1;
	if(actual == null){
	    System.out.println("Lista vacia");
	    return; 
	}
	while(actual != null && cont < numCola){
	    actual = actual.sig;
	    System.out.println(cont);
	    cont++;
	}
	if(cont < numCola)
	    System.out.println("Numero de cola fuera de rango");
	else{
	    actual.dato.Insertar(dato);
	} 
    }

    protected int EliminaElemento(int numCola){
	NodoCola actual = Datos;
	int datoEliminado, cont = 1;
	if(actual != null){
	    while(cont != numCola){
		actual = actual.sig;
		cont++;
	    }
	    return(actual.dato.Eliminar());
	}
	else
	    return -1;
    }

    protected void MostrarCola(int numCola){
	NodoCola actual = Datos;
	int cont = 1;
	if(actual != null){
	    while(cont != numCola){
		actual = actual.sig;
		cont++;
	    }
	    actual.dato.Mostrar();
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
	    System.out.println("\n**********MENU********** ");
	    System.out.println("\t1.Insertar valor");
	    System.out.println("\t2.Eliminar valor");
	    System.out.println("\t3.Mostrar");
	    System.out.println("\t4.Salir");
	    System.out.println("************************** ");
	    System.out.print(">> ");
	    op = Integer.parseInt(System.console().readLine());

	    switch(op){
	    case 1:
		System.out.println("¿En que cola?");
		System.out.print(">> ");
		numCola = Integer.parseInt(System.console().readLine());
		System.out.println("Ingresar dato:");
		System.out.print(">> ");
		dato = Integer.parseInt(System.console().readLine());
		Elementos.InsertarElemento(numCola,dato);
		break;
	    case 2:
		System.out.println("¿En que cola?");
		System.out.print(">> ");
		numCola = Integer.parseInt(System.console().readLine());
		datoEliminado= Elementos.EliminaElemento(numCola);
		if(datoEliminado != -1)
		    System.out.println("Dato eliminado:"+datoEliminado);
		else
		    System.out.println("Lista vacia");
		break;
	    case 3:
		System.out.println("¿Que cola?");
		System.out.print(">> ");
		numCola = Integer.parseInt(System.console().readLine());
		Elementos.MostrarCola(numCola);
	    }
	}while(op != 4);
    }

    
}
