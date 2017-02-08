/**
 * Created by Home on 08.02.2017.
 */
public class Zip7 extends Archiver {

    Zip7(ICompression iCompression){
        super.iCompression=iCompression;
    }

    @Override
    public void ShowData() {
        System.out.println("This is archiver 7-Zip");
    }
}
