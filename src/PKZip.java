/**
 * Created by Home on 08.02.2017.
 */
public class PKZip extends Archiver {

    PKZip(ICompression iCompression){
        super.iCompression=iCompression;
    }

    @Override
    public void ShowData() {
        System.out.println("This is archiver PKZip");
    }
}
