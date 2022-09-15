package polymorphismDemo;

public class DatabaseLogger extends BaseLogger{

    @Override
    public void Log(String message) {
        System.out.println("Log to database : "+message);
    }
}
