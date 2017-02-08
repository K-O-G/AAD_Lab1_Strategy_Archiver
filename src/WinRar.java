/**
 * Created by Home on 08.02.2017.
 */
public class WinRar extends Archiver {

    WinRar(ICompression iCompression){
        super.iCompression=iCompression;
    }

    @Override
    public void ShowData() {
        System.out.println("This is archiver WinRar");
    }
}
