public class Pan {
    int amountOfInk;
    String colorOfInk;

    public Pan(String colorOfInk)
    {
        this.colorOfInk = colorOfInk;
        amountOfInk = 100;
    }
    public void write(String text)
    {
        System.out.println(text);
    }
}
