
package employeepolimorpisme;

/**
 *
 * @author Mas Syahrul
 */
public class bagian_umum extends FT{
    private final double bagian_umum;
    double gaji_pokok;

    public bagian_umum(double akademmik, 
            double keuangan, 
            double bagian_umum, 
            double gaji_pokok, 
            String nama) {
        super(nama);
        this.bagian_umum = bagian_umum;
        this.gaji_pokok = gaji_pokok;
    }
    
    public String getNama()
    {
        return nama;
    }

    public double getBagian_umum(){
        return bagian_umum;
    }
    
    public double getGajiPkk(){
        return gaji_pokok;
    }
    
    
    @Override
    protected void hitungGaji(){
        double total=gaji_pokok+bagian_umum;
        System.out.println("Total Gaji  : Rp"+total);
    }
}
