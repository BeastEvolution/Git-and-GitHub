public class People {
    String Name;
    int age;
    Pan pan = new Pan("Read");
    Paper paper = new Paper();
    public void print()
    {
        System.out.println(Name + ' ' + age);
    }
    public void say()
    {
        System.out.println("Hello");
    }

    public void printTextOnPaper()
    {
        pan.write("This is the end.");
        paper.writeText("This is the end.");
    }
}
