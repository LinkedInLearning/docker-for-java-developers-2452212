import lombok.extern.java.Log;
@Log
public class Forever {
    public static void main(String[] args) throws InterruptedException{
        log.info("Run Forever using lombok");
        Thread.currentThread().join();
    }
}
