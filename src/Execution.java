import java.util.function.Function;

public class Execution implements Runnable{

    private ArquivoBD arquivoBD;
    private int start;
    private int end;

    public Execution(ArquivoBD arquivoBD, int start, int end) {
        this.arquivoBD = arquivoBD;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
//        arquivoBD.ApresentarClientesCSV(start, end);
    }
}
