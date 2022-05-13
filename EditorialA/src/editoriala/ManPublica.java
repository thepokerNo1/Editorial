/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editoriala;

import java.util.ArrayList;
import java.util.Iterator;
import jerarquiaHerencia.Libro;
import jerarquiaHerencia.Publicaciones;
import jerarquiaHerencia.Revista;
import jerarquiaHerencia.Periodico;
/**
 *
 * @author areli
 */
public class ManPublica {
    public static ArrayList<Publicaciones> Arrpublica = new ArrayList<Publicaciones>();
    private Libro objLibro;
    private Revista objRevista;
    private Publicaciones objPublicaciones;
    private Periodico objPeriodico;
    
    public ManPublica(String tit, double precio, int np)
    {
       
        objPublicaciones = new Publicaciones();
        objPublicaciones.setTitulo(tit);
        objPublicaciones.setPrecio(precio);
        objPublicaciones.setNoPag(np);
    }
    public ManPublica()
    {
    }
    public ArrayList Datos()
  {
     return Arrpublica;
  }

    
    public void alta (String ISBN, String Autor, String edicion)
    {
         objLibro = new Libro();
         objLibro.setTitulo(objPublicaciones.getTitulo());
         objLibro.setPrecio(objPublicaciones.getPrecio());
         objLibro.setNoPag(objPublicaciones.getNoPag());
         objLibro.setAutor(Autor);
         objLibro.setISBN(ISBN);
         objLibro.setEdicion(edicion);
         Arrpublica.add(objLibro);
    }

   public void desplegar()
  {
     System.out.println("...OBJETOS EN LA PUBLICACION...");
     
     Iterator<Publicaciones> itrPublica = Arrpublica.iterator();
     while(itrPublica.hasNext()){
         Publicaciones publica = itrPublica.next();
         if (publica instanceof Libro )
         {
          Libro book = new Libro();
          book = (Libro)publica;
          System.out.println("Titulo: " + book.getTitulo());
          System.out.println("ISBN: " + book.getISBN());
          System.out.println("Autor: " + book.getAutor());
         }
         else if (publica instanceof Revista )
         {
          Revista maga = new Revista();
          maga = (Revista)publica;
          System.out.println("Titulo: " + maga.getTitulo());
          System.out.println("ISSN: " + maga.getISSN());
          System.out.println("Número : " + maga.getNumero());
         } else if (publica instanceof Periodico )
         {
          Periodico peri = new Periodico();
          peri = (Periodico)publica;
          System.out.println("Titulo: " + peri.getTitulo());
          System.out.println("Editor: " + peri.getEditor());
         } 
     }
   }
   
    public void alta (String ISSN, int num)
    {
         objRevista = new Revista();
         objRevista.setTitulo(objPublicaciones.getTitulo());
         objRevista.setPrecio(objPublicaciones.getPrecio());
         objRevista.setNoPag(objPublicaciones.getNoPag());
         objRevista.setNumero(num);
         objRevista.setISSN(ISSN);
         Arrpublica.add(objRevista);
    }
    
    public void alta (String editor)
    {
         objPeriodico = new Periodico();
         objPeriodico.setTitulo(objPublicaciones.getTitulo());
         objPeriodico.setPrecio(objPublicaciones.getPrecio());
         objPeriodico.setNoPag(objPublicaciones.getNoPag());
        objPeriodico.setEditor(editor);
         Arrpublica.add(objPeriodico);
    }
}
