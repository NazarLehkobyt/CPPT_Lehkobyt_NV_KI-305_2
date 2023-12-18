public class Package implements Item
{
    private double volume;
    private String typeOfContent;
    private String color;

    public Package(double volume, String typeOfContent, String color) {
        this.volume = volume;
        this.typeOfContent = typeOfContent;
        this.color = color;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getTypeOfContent() {
        return typeOfContent;
    }

    public void setTypeOfContent(String typeOfContent) {
        this.typeOfContent = typeOfContent;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Basket: volume - " + volume + "; type of content - " + typeOfContent + "; color - " + color);
    }
}
