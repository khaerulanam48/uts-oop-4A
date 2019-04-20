package entity;

public class Smartphone {
    
    private String Seri;
    private String nama_smartphone;
    private String tipe_smartphone;

    public String getSeri() {
        return Seri;
    }

    public void setSeri(String Seri) {
        this.Seri = Seri;
    }

    public String getnama_smartphone() {
        return nama_smartphone;
    }

    public void setnama_smartphone(String nama_smartphone) {
        this.nama_smartphone = nama_smartphone;
    }

    public String gettipe_smartphone() {
        return tipe_smartphone;
    }

    public void settipe_smartphone(String tipe_smartphone) {
        this.tipe_smartphone = tipe_smartphone;
    }

    public Smartphone(String Seri, String nama_smartphone, String tipe_smartphone) {
        this.Seri = Seri;
        this.nama_smartphone = nama_smartphone;
        this.tipe_smartphone = tipe_smartphone;
    }


    public boolean equals(Object object) {
        Smartphone temp = (Smartphone) object;
        return Seri.equals(temp.getSeri());
    }
}
