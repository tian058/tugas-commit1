
package sdl.laporan.pkg10;
public class MainStatis {
    public static void main(String[] agrs){
        StackStatis Tumpukan = new StackStatis(7);
        Mahasiswa Data;
        Data = new Mahasiswa("kristian1", 205314058, "Informatika", "Kalbar");
        Tumpukan.push(Data);
        Data = new Mahasiswa("kristian2", 215314058, "Informatika", "Kalbar");
        Tumpukan.push(Data);
        Data = new Mahasiswa("kristian3", 225314058, "Informatika", "kalbar");
        Tumpukan.push(Data);
        Data = new Mahasiswa("kristian4", 235314058, "Informatika", "kalbar");
        Tumpukan.push(Data);
        Data = new Mahasiswa("kristian5", 245314058, "Informatika", "Kalbar");
        Tumpukan.push(Data);
       
        System.out.println(Tumpukan.pop());
        System.out.println(Tumpukan.pop());
        System.out.println(Tumpukan.pop());
        
        Tumpukan.Cetak();
        
    }
}
