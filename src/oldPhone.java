public class oldPhone extends newPhone{
    private String keyboardType;
    private String flip;


    public oldPhone(String keyboardType, String flip) {
        this.keyboardType = keyboardType;
        this.flip = flip;
    }
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

    @Override
    public String toString() {
        return "oldPhone{" +
                "keyboardType='" + keyboardType + '\'' +
                ", flip='" + flip + '\'' +
                '}';
}
}