package employeepolimorpisme;

public class EmployeePolimorpisme {

    public static void main(String[] args) {
       wakil_dekan3 Ahmad = new wakil_dekan3 (600935621,
                "Ahmad Muzani, ST. MT.", 10, 2500000, 500000, 1000000);
       dosen Murya = new dosen("Murya Arif Basuki, S.KOM, M.KOM",
                250000, 300000, 1800000);
       staf ririn = new staf(250000, 300000, 1500000, "Ririn Dwi Aryanti");
       bagian_umum Wahyu = new bagian_umum(250000, 300000, 150000, 1150000,
                "Wahyu Ario Ardi");
        
        
        System.out.println("Nama                 : "+Ahmad.getNama()+
             "\n"+"NIP                  : "+Ahmad.getNip()+"\n"+
                     "Tanggal Diterima     : "+Ahmad.getTanggal()+
             "\n"+"Gaji Pokok           : "+Ahmad.getGaji()+
             "\n"+"Tunjangan Fungsional : "+Ahmad.getTunjanganFungsional()+
             "\n"+"Tunjangan Jabatan    : "+Ahmad.getTunjanganJabatan());
        Ahmad.hitungGaji();
        
        System.out.println("\n"+"Nama       : "+Murya.getNama()+
                "\n"+"Gaji Pokok : "+Murya.getGajiPkk()+
                "\n"+"Akademik   : "+Murya.getAkademik()+
                "\n"+"Keuangan   : "+Murya.getKeuangan());
        Murya.hitungGaji();
        
        System.out.println("\n"+"Nama       : "+ririn.getNama()+
                "\n"+"Gaji Pokok : "+ririn.getGajiPkk()+
                "\n"+"Akademik   : "+ririn.getAkademik()+
                "\n"+"Keuangan   : "+ririn.getKeuangan());
        ririn.hitungGaji();
        
        System.out.println ("\n"+"Nama        : "+Wahyu.getNama()+
                "\n"+"Gaji Pokok  : "+Wahyu.getGajiPkk()+
                "\n"+"Bagian_umum :"+Wahyu.getBagian_umum());
        Wahyu.hitungGaji();
    }
    }