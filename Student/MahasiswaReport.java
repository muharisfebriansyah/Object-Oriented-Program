package Student;

public class MahasiswaReport
{
    private static final int A = 4;
    private static final int B = 3;
    private static final int C = 2;
    private static final int D = 1;
    private static final int E = 0;
    private String mk1;
    private String mk2;
    private int sks1;
    private int sks2;
    private String nilai1;
    private String nilai2;

    MahasiswaReport(String mk1, String mk2, int sks1, int sks2, String nilai1, String nilai2) {
        setmk1(mk1);
        setmk2(mk2);
        setsks1(sks1);
        setsks2(sks2);
        setnilai1(nilai1);
        setnilai2(nilai2);
    }
    MahasiswaReport(MahasiswaReport sp) {}
    public String getmk1() {
        return  mk1;
    }
    public void setmk1(String mk1) {
        this.mk1=mk1;
    }
    public String getmk2() {
        return  mk2;
    }
    public void setmk2(String mk2) {
        this.mk2=mk2;
    }
    public int getsks1() {
        return  sks1;
    }
    public void setsks1(int sks1) {
        this.sks1=sks1;
    }
    public int getsks2() {
        return  sks2;
    }
    public void setsks2(int sks2) {
        this.sks2=sks2;
    }
    public String getnilai1() {
        return  nilai1;
    }
    public void setnilai1(String nilai1) {
        this.nilai1=nilai1;
    }
    public String getnilai2() {
        return  nilai2;
    }
    public void setnilai2(String nilai2) {
        this.nilai2=nilai2;
    }
    public float HitungNR()
    {
        /*
            Nilai NR adalah : ( Nilai mutu MK1 + Nilai mutu MK2 ) / (sks MK1 + sks MK2)
         */

        return (ConvertNilaiMutu(nilai1)*sks1+ConvertNilaiMutu(nilai2)*sks2)/(getsks1()+getsks2());
    }
    public float ConvertNilaiMutu(String HurufMutu){
        /*
            Huruf mutu A : nilai mutu 4
            Huruf mutu B : nilai mutu 3
            Huruf mutu C : nilai mutu 2
            Huruf mutu D : nilai mutu 1
            Huruf mutu E : nilai mutu 0
         */
        float mutu=0.0f;
        if(HurufMutu.equals("A")){
            mutu=4.0f;
        }else if(HurufMutu.equals("B")){
            mutu=3.0f;
        }else if(HurufMutu.equals("C")){
            mutu=2.0f;
        }else if(HurufMutu.equals("D")){
            mutu=1.0f;
        }else if(HurufMutu.equals("E")) {
            mutu = 0.0f;
        }
        return mutu;
    }
    public String toString() {
        /*
            Mengembalikan informasi laporan nilai mahasiswa
         */
        System.out.println(" ");
        System.out.println("Information from Student Report");
        System.out.println("============================");
        System.out.println("MK1       : "+getmk1());
        System.out.println("SKS1      : "+getsks1());
        System.out.println("Nilai1    : "+getnilai1());
        System.out.println("MK2       : "+getmk2());
        System.out.println("SKS2      : "+getsks2());
        System.out.println("Nilai2    : "+getnilai2());
        System.out.println("NR        : "+HitungNR());
        return "";
    }
}
