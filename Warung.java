/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author asus
 */
public class Warung {
    
    public String makanan, minuman;

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }

    
    
    //default constructor
    public Warung() {
    }

    public Warung(String nasi, String minuman) {
        this.makanan = nasi;
        this.minuman = minuman;
    }
    
    
    
    
    public static void main(String[] args) {
     Warung warung = new Warung();
     
     Warung sariBundo = new Warung("nasi padang", "es teh");
     System.out.println(sariBundo.makanan);
     
     Warung minang = new Warung("nasi kikil", "es cola");
     System.out.println(minang.makanan);
     
     sariBundo.setMakanan("rendang");
     sariBundo.setMinuman("es jeruk");
     
     System.out.println ("===========");
     System.out.println ("sariBundo");
     System.out.println(sariBundo.getMakanan());
     System.out.println(sariBundo.getMinuman());
     
     
     
    }
    
    
    
    
    
}
