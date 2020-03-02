package Student;

public class Dosen extends Orang
{
    private String mk;
    private String strata;
    private int salary; // Nilai salary harus lebih dari 0

    public Dosen(String nama, String alamat, String kota, int umur, char jenis_kelamin, String mk, String strata, int salary)
    {
        setnama(nama);
        setalamat(alamat);
        setkota(kota);
        setumur(umur);
        setjenis_kelamin(jenis_kelamin);
        setMk(mk);
        setStrata(strata);
        setSalary(salary);
    }
    public void setStrata(String strata) {
        this.strata=strata;
    }
    public void setMk(String tittle) {
        this.mk=tittle;
    }
    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    @Override
    public String toString()
    {
        /*
            Mengembalikan informasi dosen
         */
        System.out.println("Informasi Dosen");
        super.toString();
        System.out.println("MK         : "+mk);
        System.out.println("Strata     : "+strata);
        System.out.println("salary     : "+salary);
        return "";
    }
}