package Student;

public class Mahasiswa extends Orang {

    private String NIP;
    private String kelas;
    private int semester;
    private MahasiswaReport report;

    public Mahasiswa(String nama, String alamat, String kota, int umur, char jenis_kelamin, String NIP, String kelas, int semester, MahasiswaReport Report) {
        setnama(nama);
        setalamat(alamat);
        setkota(kota);
        setumur(umur);
        setjenis_kelamin(jenis_kelamin);
        setId(NIP);
        setkelas(kelas);
        setSemester(semester);
        this.report = Report;
    }
    public void setId(String id) {
        this.NIP=id;
    }
    public void setkelas(String kelas) {
        this.kelas=kelas;
    }
    public void setSemester(int semester) {
        this.semester=semester;
    }
    public void setReport(MahasiswaReport report) {
        this.report=report;
    }
    public String getNIP() {
        return NIP;
    }
    public String getkelas()
    {
        return kelas;
    }
    public int getSemester()
    {
        return semester;
    }
    public MahasiswaReport getReport()
    {
        return report;
    }
    @Override
    public String toString()
    {
        /*
            Mengembalikan informasi mahasiswa
         */
        System.out.println("Informasi Mahasiswa");
        super.toString();
        System.out.println("NIP        : "+getNIP());
        System.out.println("Kelas      : "+getkelas());
        System.out.println("Semester   : "+getSemester());
        report.toString();
        return "";
    }
}
