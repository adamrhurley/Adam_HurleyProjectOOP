import java.util.ArrayList;

public class oldPhone extends newPhone{
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
    private String keyboardType;
    private String flip;

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }

    public String getFlip() {
        return flip;
    }

    public void setFlip(String flip) {
        this.flip = flip;
    }

    //public static void createPhone() { oldPhone Nokia3310 = new oldPhone("t9","No"); }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDimensions() { return dimensions; }

    public void setDimensions(String dimensions) { this.dimensions = dimensions; }

    public double getWeight() { return weight; }

    public void setWeight(double weight) { this.weight = weight; }

    public String getDisplayType() { return displayType; }

    public void setDisplayType(String displayType) { this.displayType = displayType; }

    public double getDisplaySize() { return displaySize; }

    public void setDisplaySize(double displaySize) { this.displaySize = displaySize; }

    public String getResolution() { return Resolution; }

    public void setResolution(String resolution) { Resolution = resolution; }

    public String getMultitouch() { return multitouch; }

    public void setMultitouch(String multitouch) { this.multitouch = multitouch; }

    public String getOs() { return os; }

    public void setOs(String os) { this.os = os; }

    public String getCpu() { return cpu; }

    public void setCpu(String cpu) { this.cpu = cpu; }

    public String getFingerprint() { return fingerprint; }

    public void setFingerprint(String fingerprint) { this.fingerprint = fingerprint; }

    public double getCost() { return cost; }

    public void setCost(String Cost) { this.cost = cost; }

    public oldPhone(){
        this("Unknown","Unknown",0,"Unknown",0,"Unknown","Unknown","Unknown","Unknown","Unknown",0,"Unknown","Unknown");
    }


    public oldPhone(String name,String dimensions, double weight, String displayType, double displaySize, String resolution, String multitouch, String os, String cpu, String fingerprint, int cost, String keyboardType, String flip) {
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
        this.keyboardType = keyboardType;
        this.flip = flip;
    }



    @Override
    public String toString() {
        return  "Name: " + name +
                "\nDimensions: " + dimensions +
                "\nWeight: " + weight + "g" +
                "\nDisplay Type: " + displayType +
                "\nDisplay Size: " + displaySize +
                "\nResolution: " + Resolution +
                "\nMultitouch: " + multitouch +
                "\nOperating System:" + os +
                "\nCPU: " + cpu +
                "\nFingerprint: " + fingerprint +
                "\nCost: €" + cost +
                "\nKeyboard Type: " + keyboardType +
                "\nFlip: " + flip;
}
}