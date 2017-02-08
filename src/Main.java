public class Main {

    public static void main(String[] args) {

        ICompression zip7Compression = new I7ZipCompression();
        ICompression rarCompression = new IRarCompression();
        ICompression arcCompression = new IArcCompression();
        ICompression zipCompression = new IZipCompression();

        Arc arc = new Arc(arcCompression);
        Zip7 zip7 = new Zip7(zip7Compression);
        PKZip pkZip = new PKZip(zipCompression);
        WinZip winZip = new WinZip(zipCompression);
        WinRar winRar = new WinRar(rarCompression);

        arc.ShowData();
        arc.compesion();
        System.out.println("-----------------\n");

        zip7.ShowData();
        zip7.compesion();
        System.out.println("-----------------\n");

        pkZip.ShowData();
        pkZip.compesion();
        System.out.println("-----------------\n");

        winZip.ShowData();
        winZip.compesion();
        System.out.println("-----------------\n");

        winRar.ShowData();
        winRar.compesion();
        winRar.setiCompression(zipCompression);
        winRar.compesion();
    }
}
