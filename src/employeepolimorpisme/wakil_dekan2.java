
package employeepolimorpisme;

/**
 *
 * @author Mas Syahrul
 */
public class wakil_dekan2 extends FT{
   private final int nip;
    double tgl_diterima;
    double gaji_pokok;
    double tunjangan_fungsional;
    double tunjangan_jabatan;
    
    public wakil_dekan2(int np, 
            String nama, 
            double tgl, 
            double pkk, 
            double tf, 
            double tj){
      super(nama);
      this.nip=np;
      this.tgl_diterima=tgl;
      this.gaji_pokok=pkk;
      this.tunjangan_fungsional=tf;
      this.tunjangan_jabatan=tj;
    }

    public String getNama() {
        return nama;
    }

    public int getNip() {
        return nip;
    }

    public double getTanggal(){
        return tgl_diterima;
    }
    
    public double getGaji(){
        return gaji_pokok;
    }
    
    public double getTunjanganFungsional(){
        return tunjangan_fungsional;
    }
    
    public double getTunjanganJabatan(){
        return tunjangan_jabatan;
    }
    
    @Override
    protected void hitungGaji() {
       double total=gaji_pokok+tunjangan_fungsional+tunjangan_jabatan;
        System.out.println("Gaji:"+total);
    }
    
    
}