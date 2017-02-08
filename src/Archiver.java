/**
 * Created by Home on 08.02.2017.
 */
public abstract class Archiver {

    ICompression iCompression;

    public abstract void ShowData();

    void compesion(){
        iCompression.compression();
    }

    public ICompression getiCompression() {
        return iCompression;
    }

    public void setiCompression(ICompression iCompression) {
        this.iCompression = iCompression;
    }
}

