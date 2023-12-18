public class Box implements Item
{

    private double volume;
    private String typeOfContent;

    static int count = 0;
    public Box(double volume, String typeOfContent)
    {
        this.volume = volume;
        this.typeOfContent = typeOfContent;
        if(volume == 40)
            count++;
    }

    public void setVolume(double volume)
    {
        this.volume = volume;
    }

    public String getTypeOfContent()
    {
        return typeOfContent;
    }

    public void setTypeOfContent(String typeOfContent)
    {
        this.typeOfContent = typeOfContent;
    }

    @Override
    public double getVolume()
    {
        return volume;
    }

    @Override
    public void PrintInfo()
    {
        System.out.println("Box: volume - " + volume + "; type of content - " + typeOfContent);
    }
}
