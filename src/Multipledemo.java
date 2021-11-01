interface Backend
{
     void connectServer();
}
class Frontend{
    public void response(String name)
    {
        System.out.println(name + " can also be used for Frontend development");
    }
}
class Language extends Frontend implements Backend
{
    String language = "JAVA ";
    public void connectServer()
    {
        System.out.println(language+"can also be used as a backend language");
    }
}
public class Multipledemo
{
    public static void main(String[] args)
    {
        Language code= new Language();
        code.connectServer();
        code.response(code.language);
    }
}