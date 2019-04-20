package service;


import java.util.*;
import entity.*;

public class SmartphoneService {
    
    private static List<Smartphone> data = new LinkedList<Smartphone>();

    public void addData(Smartphone lp) {
        data.add(lp);
        System.out.println("Data telah tersimpan");
    }

    public void updateData(Smartphone lp) {
        int index = data.indexOf(lp);
        if(index >= 0) {
            data.set(index, lp);
            System.out.println("Data telah berubah");
        }
    }

    public void deleteData(String Seri) {
        int idx = data.indexOf(new Smartphone(Seri, "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("Data telah terhapus");
        }
    }

    public void showAllData() {
        int i=1;
        System.out.println("\nData di List :");
        for(Smartphone lp : data) {
            System.out.println("data ke-" + i++);
            System.out.println("  SERI : " + lp.getSeri());
            System.out.println("  NAMA SMARTPHONE : " + lp.getnama_smartphone());
            System.out.println("  TIPE SMARTPHONE : " + lp.gettipe_smartphone());
        }
    }
}
