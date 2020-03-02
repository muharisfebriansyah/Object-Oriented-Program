package Student;

public class Orang {

    private String nama;
    private String alamat;
    private String kota;
    private int umur;
    private char jenis_kelamin;

    void setnama(String nama) {
        this.nama=nama;
    }
    void setalamat(String alamat) {
        this.alamat=alamat;
    }
    void setkota(String kota) {
        this.kota=kota;
    }
    void setumur(int umur) {
        /*
            Umur harus lebih dari 0
         */
        if (umur>0) {
            this.umur = umur;
        }
    }
    void setjenis_kelamin(char jenis_kelamin) {
        /*
            Validasi bahawa karakter jenis kelamin adalah
            L: laki-laki dan
            P: perempuan
         */
        if(jenis_kelamin=='L'){
            this.jenis_kelamin=jenis_kelamin;
                    System.out.println("Laki=Laki");
        }
        else{
            this.jenis_kelamin=jenis_kelamin;
                System.out.println("Perempuan");
        }
    }
    String getnama() {
        return nama;
    }
    String getalamat() {
        return alamat;
    }
    String getkota() {
        return kota;
    }
    int getumur() {
        return 0;
    }
    char getjenis_kelamin() {
        return 'x';
    }
    public String toString() {
        /*
            Mengembalikan informasi identitas orang
         */
        System.out.println("============================");
        System.out.println("Nama       : "+nama);
        System.out.println("Alamat     : "+alamat);
        System.out.println("Kota       : "+kota);
        System.out.println("Umur       : "+umur);
        return "";
    }
}