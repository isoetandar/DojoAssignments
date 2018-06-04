// importing the Date class
import java.util.Date;
public class DemoImportTest2 {
    public static void main(String[] args) {
        ImportDemo iD = new ImportDemo();
        String currentDate = iD.getCurrentDate();
        System.out.println(currentDate);
    }
}


//Below is a class that is not declared as public access, if it is public then it should be run as separate file!
class ImportDemo {
    public String getCurrentDate() {
        Date date = new Date();
        return "Current date is: " + date;
    }
}

