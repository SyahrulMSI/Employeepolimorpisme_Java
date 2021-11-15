package employeepolimorpisme;


public abstract class FT {
    String nama;
    
    public FT(String nama){
      this.nama=nama;
    }
    
    protected abstract void hitungGaji();
    
} 
