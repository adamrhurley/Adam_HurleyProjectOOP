import java.util.ArrayList;

public class newPhone {
    private String name;
    private String dimensions;
    private double weight;
    private String displayType;
    private double displaySize;
    private String Resolution;
    private String multitouch;
    private String os;
    private String cpu;
    private String fingerprint;
    private double cost;

    private static ArrayList<newPhone> allPhones;


    public newPhone(){
    this("Unknown","Unknown",0,"Unknown",0,"Unknown","Unknown","Unknown","Unknown","Unknown",0);
    }


    public newPhone(String name,String dimensions, double weight, String displayType, double displaySize, String resolution, String multitouch, String os, String cpu, String fingerprint, int cost) {
        this.name = name;
        this.dimensions = dimensions;
        this.weight = weight;
        this.displayType = displayType;
        this.displaySize = displaySize;
        Resolution = resolution;
        this.multitouch = multitouch;
        this.os = os;
        this.cpu = cpu;
        this.fingerprint = fingerprint;
        this.cost = cost;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public String getResolution() {
        return Resolution;
    }

    public void setResolution(String resolution) {
        Resolution = resolution;
    }

    public String getMultitouch() {
        return multitouch;
    }

    public void setMultitouch(String multitouch) {
        this.multitouch = multitouch;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) { this.fingerprint = fingerprint; }

    public double getCost() {
        return cost;
    }

    public void setCost(String Cost) { this.cost = cost; }



    @Override
    public String toString() {
        return
                "Name: " + name +
                "\nDimensions: " + dimensions +
                "\nWeight: " + weight + "g" +
                "\nDisplay Type: " + displayType +
                "\nDisplay Size: " + displaySize + "''" +
                "\nResolution: " + Resolution +
                "\nMultitouch: " + multitouch +
                "\nOperating System:" + os +
                "\nCPU: " + cpu +
                "\nFingerprint: " + fingerprint +
                "\nCost: €" + cost;
    }

    public static void createPhone() {
        newPhone onePlus6 = new newPhone("OnePlus 6\n", "155.7 x 75.4 x 7.8 mm\n", 177, "Optic AMOLED\n",
                6.28, "1080 x 2280 pixels\n", "Yes\n", "Android 9.0 (Pie)\n",
                "Qualcomm Snapdragon 845 Octa-core (4x2.8 GHz Kryo 385 Gold & 4x1.7 GHz Kryo 385 Silver)\n", "Yes\n",580);

        newPhone galaxyNote9 = new newPhone("Samsung Galaxy Note 9\n", "161.9 x 76.4 x 8.8 mm\n", 201,
                "Super AMOLED\n", 6.4, "1440 x 2960 pixels\n", "Yes\n", "Android 8.1 (Oreo)\n",
                "Qualcomm Snapdragon 845 Octa-core (4x2.8 GHz Kryo 385 Gold & 4x1.7 GHz Kryo 385 Silver)\n", "Yes\n", 980);

        newPhone mate20pro = new newPhone("Huawei Mate 20 Pro\n", "157.8 x 72.3 x 8.6 mm\n", 201,
                "Super AMOLED\n", 6.4, "1440 x 2960 pixels\n", "Yes\n", "Android 8.1 (Oreo)\n",
                "Qualcomm Snapdragon 845 Octa-core (4x2.8 GHz Kryo 385 Gold & 4x1.7 GHz Kryo 385 Silver)\n", "Yes\n",790);

        newPhone iphonexsmax = new newPhone("Apple iPhone XS Max\n", "157.5 x 77.4 x 7.7 mm\n", 208,
                "Super AMOLED\n", 6.5, "1242 x 2688 pixels\n", "Yes\n", "iOS 12.1\n",
                "Apple A12 Bionic Hexa-core (2x2.5 GHz Vortex + 4x1.6 GHz Tempest)\n", "No (FaceID)\n",1200);

        newPhone pixel3xl = new newPhone("Google Pixel 3 XL\n", "158 x 76.7 x 7.9 mm\n", 184,
                "P-OLED\n", 6.3, "1440 x 2960 pixels\n", "Yes\n", "Android 9.0 (Pie)\n",
                "Qualcomm Snapdragon 845 Octa-core (4x2.8 GHz Kryo 385 Gold & 4x1.7 GHz Kryo 385 Silver)\n", "Yes\n",850);

        newPhone nokia3310 = new oldPhone("Nokia 3310\n", "113 x 48 x 22mm\n", 133,
                "Monochrome\n", 1.5, "84x48\n", "No\n", "Series 20\n",
                "MAD2WD1\n", "No\n",75,"T9\n","No\n");


        allPhones = new ArrayList<newPhone>();
        allPhones.add(onePlus6);
        allPhones.add(galaxyNote9);
        allPhones.add(mate20pro);
        allPhones.add(iphonexsmax);
        allPhones.add(pixel3xl);
        allPhones.add(nokia3310);
    }
    public static ArrayList<newPhone> getAllPhones()
    {
        return allPhones;
    }

}



