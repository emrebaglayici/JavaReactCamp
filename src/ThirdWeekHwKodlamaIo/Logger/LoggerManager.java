package ThirdWeekHwKodlamaIo.Logger;

public class LoggerManager implements Logger{
    @Override
    public void printLog(String message) {
        System.out.println(message);
    }
}
