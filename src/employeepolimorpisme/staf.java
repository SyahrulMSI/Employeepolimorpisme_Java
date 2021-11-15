
package employeepolimorpisme;

/**
 *
 * @author Mas Syahrul 
 */
public class staf extends FT{
    private final double akademik;
    private final double keuangan;
    double gaji_pokok;

    public staf(double akademik, 
            double keuangan, 
            double gaji_pokok, 
            String nama) {
        super(nama);
        this.akademik = akademik;
        this.keuangan = keuangan;
        this.gaji_pokok = gaji_pokok;
    }

    public String getNama(){
        return nama;
    }
    
    public double getAkademik(){
        return akademik;
    }
    
    public double getKeuangan(){
        return keuangan;
    }
    
    public double getGajiPkk(){
        return gaji_pokok;
    }
    @Override
    protected void hitungGaji() {
        double total=gaji_pokok+akademik+keuangan;
        System.out.println("Total Gaji : Rp"+total);
    }
    
}
