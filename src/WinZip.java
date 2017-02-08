/**
 * Created by Home on 08.02.2017.
 */
public class WinZip extends Archiver {

    WinZip(ICompression iCompression){
        super.iCompression=iCompression;
    }

    @Override
    public void ShowData() {
        System.out.println("This is archiver WinZip");
    }

}
