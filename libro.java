package jsonmanager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fra81n
 */
public class libro {
    private String genere;
    private String titolo;
    private String autore;
    private float prezzo;
    
    public void setGenere(String genere){
        this.genere = genere;
    }
    
    public void setAutore(String autore){
        this.autore = autore;
    }
    
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    
    public void setPrezzo(float prezzo){
        this.prezzo = prezzo;
    }
    
    public String getGenere()
    {
        return this.genere;
    }
    
    public String getTitolo()
    {
        return this.titolo;
    }
    
    public String getAutore()
    {
        return this.autore;
    }
    
    public float getPrezzo()
    {
        return this.prezzo;
    }
    
    public String toString(){
        return "Libro: \n" + " titolo: " + this.getTitolo() + "\n autore: " 
                + this.getAutore() + "\n genere: " + this.getGenere() +
                "\n prezzo: " + this.getPrezzo() + "euro";
    }
}
