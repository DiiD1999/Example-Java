import Interpreter.Log;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class InterpreterTest {
    @Test
    public void test(){

        Log.log("[{}] start {} at {}...", LocalTime.now().withNano(0), "engine", LocalDate.now());
    }
}
