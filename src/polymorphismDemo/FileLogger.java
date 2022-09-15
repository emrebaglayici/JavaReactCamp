package polymorphismDemo;

public class FileLogger extends BaseLogger{
    @Override
    public void Log(String message) {
        System.out.println("Log to file : "+message);
    }
}
