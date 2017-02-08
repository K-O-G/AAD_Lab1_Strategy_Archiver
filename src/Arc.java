/**
 * Created by Home on 08.02.2017.
 */
public class Arc extends Archiver {

    Arc(ICompression iCompression){
        super.iCompression=iCompression;
    }

    @Override
    public void ShowData() {
    System.out.println("This is archiver Arc");
}

}
