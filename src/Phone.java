public class Phone {
    private String dimensions;
    private double weight;
    private String displayType;
    private double displaySize;
    private String Resolution;
    private String multitouch;
    private String os;
    private String cpu;
    private String fingerprint;



    public Phone(){
    this("Unknown",0,"Unknown",0,"Unknown","Unknown","Unknown","Unknown","Unknown");
    }


    public Phone(String dimensions, double weight, String displayType, double displaySize, String resolution, String multitouch, String os, String cpu, String fingerprint) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.displayType = displayType;
        this.displaySize = displaySize;
        Resolution = resolution;
        this.multitouch = multitouch;
        this.os = os;
        this.cpu = cpu;
        this.fingerprint = fingerprint;
    }

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

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "dimensions='" + dimensions + '\'' +
                ", weight=" + weight +
                ", displayType='" + displayType + '\'' +
                ", displaySize='" + displaySize + '\'' +
                ", Resolution='" + Resolution + '\'' +
                ", multitouch='" + multitouch + '\'' +
                ", os='" + os + '\'' +
                ", cpu='" + cpu + '\'' +
                ", fingerprint='" + fingerprint + '\'' +
                '}';
    }
}
