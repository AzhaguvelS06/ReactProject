import java.io.File;
import java.io.IOException;
class createfile()
{
    public static void main(String arg[])
    {
        try{
            File nf=new File("Filec.txt");
        }
        if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}