/*
 
 */
package Entidad;

import java.util.Scanner;

// Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas
public class Libro {
    public String isbn;
    public String titulo;
    public String autor;
    public int numPaginas;
    
// y un constructor con todos los atributos pasados por parámetro
    public Libro(String isbn, String titulo, String autor,int numPaginas ) {
    
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.numPaginas=numPaginas;
        
   }
//y un constructor vacío.
    public Libro() {
    }
// Crear un método para cargar un libro pidiendo los datos al usuario
    public void ingresoDatos (){
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese ISBN:");
        this.isbn=Leer.nextLine();
        System.out.println("Ingrese Titulo:");
        this.titulo=Leer.nextLine();
        System.out.println("Ingrese Autor:");
        this.autor=Leer.nextLine();
        System.out.println("Ingrese Número de Paginas:");
        this.numPaginas=Leer.nextInt();
        
    }    
// y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el numero de páginas.
    public void mostrarInfo(){
        System.out.println("");
        System.out.println("Datos del Libro: "); 
        System.out.println("ISBN: " + this.isbn + ", Titulo: " + 
                this.titulo + ", Autor: " + this.autor + 
                ", Número de Paginas: " + this.numPaginas); 
    }


    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }

}

