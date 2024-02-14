package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros(  )
      {
        return Arrays.copyOf(arregloEnteros, getCantidadEnteros());
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
        return Arrays.copyOf(arregloCadenas, getCantidadCadenas( ));
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int[] nuevoArreglo = new int[arregloEnteros.length + 1];
    	System.arraycopy(arregloEnteros, 0, nuevoArreglo, 0, arregloEnteros.length);
    	nuevoArreglo[nuevoArreglo.length-1]=entero;
    	arregloEnteros=nuevoArreglo;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	
    	String[] nuevoArreglo = new String[arregloCadenas.length + 1];
    	System.arraycopy(arregloCadenas, 0, nuevoArreglo, 0, arregloCadenas.length);
    	nuevoArreglo[nuevoArreglo.length-1]=cadena;
    	arregloCadenas=nuevoArreglo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {	
    	ArrayList<Integer> lista = new ArrayList<>();
    	
        for (int elemento : arregloEnteros) {
        	if (elemento!=valor) {
        		lista.add(elemento);
        	}
        }
        	
        int[] arreglo = new int[lista.size()];
        
        for(int i=0;i<lista.size();i++) {
        	arreglo[i]=lista.get(i);
        	
        }
        arregloEnteros=arreglo;
        }
        

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	ArrayList<String> lista = new ArrayList<>();
    	
        for (String elemento : arregloCadenas) {
        	if (elemento!=cadena) {
        		lista.add(elemento);
        	}
        }
        	
        String[] arreglo = new String[lista.size()];
        
        for(int i=0;i<lista.size();i++) {
        	arreglo[i]=lista.get(i);
        	
        }
        arregloCadenas=arreglo;
        }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	ArrayList<Integer> lista = new ArrayList<>();
    	
        for (int elemento : arregloEnteros) {
        	lista.add(elemento);}
        
        if (posicion<0) {
        	lista.addFirst(entero);}
    	else if (posicion>lista.size()) {
    		lista.addLast(entero);}
    	else {
    		lista.add(posicion, entero);}
        	
        int[] arreglo = new int[lista.size()];
        
        for(int i=0;i<lista.size();i++) {
        	arreglo[i]=lista.get(i);
        	
        }
        arregloEnteros=arreglo;
        }


    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	if (posicion>=0 && posicion<arregloEnteros.length) {
    		
    		ArrayList<Integer> lista = new ArrayList<>();
        	
            for (int elemento : arregloEnteros) {
            	lista.addLast(elemento);
            }
            lista.remove(posicion);
            
            int[] arreglo = new int[lista.size()];
            for(int i=0;i<lista.size();i++) {
            	arreglo[i]=lista.get(i);
            	
            }
            arregloEnteros=arreglo;
            }
    	}

    

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int [] arreglo = new int[valores.length];
    	
    	for (int i=0; i<valores.length;i++) {
    		int elemento=(int)valores[i];
    		
    		arreglo[i]=elemento;
    		
    	}
    	arregloEnteros=arreglo;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	String[] arreglo = new String[objetos.length];
    	
    	for (int i=0; i<objetos.length;i++) {
    		String elemento=(objetos[i]).toString();
    		
    		arreglo[i]=elemento;
    		
    	}
    	arregloCadenas=arreglo;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	for (int i=0; i<arregloEnteros.length;i++) {
    		int elemento=arregloEnteros[i];
    		if (elemento<0) {
    			arregloEnteros[i]=elemento*-1;;
    		}
    	}

    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	Arrays.sort(arregloEnteros);

    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	Arrays.sort(arregloCadenas);

    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {	int contador=0;
    	for (int elemento: arregloEnteros) {
    		if (elemento==valor) {
    			contador ++;
    		}
    	
    }
        return contador;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {	int contador=0;
    
	for (String elemento: arregloCadenas) {
		if (elemento.compareToIgnoreCase(cadena)==0) {
			contador ++;
		}
	
}
    return contador;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {	
    	ArrayList<Integer> posiciones=new ArrayList<Integer>( );
    	int i=0;
    	while ( i<arregloEnteros.length) {
    		int elemento=arregloEnteros[i];
    		if(elemento==valor) {
    			posiciones.addLast(i);
    		}
    		i++;
    }
    	int[] arreglo = new int[posiciones.size()];
        for (int ii = 0; ii < posiciones.size(); ii++) {
            arreglo[ii] = posiciones.get(ii);
        }
        return arreglo;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {	
    	int min=1000000000;
    	int max=-100000000;
    	for (int elemento: arregloEnteros) {
    		if (elemento<min) {
    			min=elemento;
    		}
    		if (elemento>max) {
    			max=elemento;
    		}
    		}
    	if (arregloEnteros.length==0) {
    		int[] arregloVacio = new int[0];
    		return arregloVacio;
    	}
    	int[]arreglo = {min,max};
        return arreglo;
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>( );
    	for (int elemento:arregloEnteros) {
    		if (mapa.containsKey(elemento)) {
    			int cantidad=mapa.get(elemento);
    			mapa.put(elemento, cantidad+1);
    		}
    		else {mapa.put(elemento, 1);}
    	}
        return mapa;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	ArrayList<Integer> revisados=new ArrayList<Integer>( );
    	ArrayList<Integer> listaRepetidos=new ArrayList<Integer>( );
    	
    	for (int elemento: arregloEnteros) {
    		if (revisados.contains(elemento)) {
    			revisados.addLast(elemento);
    			if (listaRepetidos.contains(elemento)==false)
    				{listaRepetidos.addLast(elemento);}
    			}
    		else {
    			revisados.addLast(elemento);
    			}
    	}
        return listaRepetidos.size();
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {	
    	boolean encontro=true;
    	
    	if (arregloEnteros.length != otroArreglo.length) 
    	{
    		encontro=false;}
    
    	int i=0;
    	while (encontro==true && i<arregloEnteros.length) {
    		int ele1=arregloEnteros[i];
    		
    		int ele2=otroArreglo[i];
    		System.out.println("-"+ele1+ele2+"-");
    		if (ele1 != ele2) {
    			encontro=false;}
    		i++;
    	}
        return encontro;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	if (arregloEnteros.length != otroArreglo.length) {
            return false;}
            
    	ArrayList<Integer> lista = new ArrayList<>();
    	
        for (int elemento : arregloEnteros) {
        	lista.add(elemento);}
        
    	boolean encontro=true;
    	int i=0;
    	while (encontro==true && i<arregloEnteros.length) {
    		int entero=otroArreglo[i];
    		if (lista.contains(entero)==true) {
    			i++;}
    		else {
    		
    			encontro=false;}
    		}
    	
        return encontro;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {	
    	int[] nuevoArreglo = new int[cantidad];
    	
    	for (int i=0; i<cantidad;i++) {
    		int nuevo=(int) (Math.floor(Math.random() * (maximo - minimo + 1)) + minimo);
    		nuevoArreglo[i]= nuevo;
    		}
    	
    	arregloEnteros=nuevoArreglo;

    }

}
