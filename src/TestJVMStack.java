import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by Snake on 2017/6/26.
 */
public class TestJVMStack {
    private int count = 0;
    public void recursion(){
        count++;
        recursion();
    }

    public void recursion(long a, long b, long c)throws InterruptedException{
        long d = 0, e = 0, f = 0;
        count++;
        recursion(a, b, c);
    }

    public void testStack(){
        try {
            recursion();
        }catch (Throwable e){
            System.out.println("deep of stack is"+ count);
            e.printStackTrace();
        }
    }

    public void testStack2(){
        try {
            recursion(1L, 2L, 3L);
        }catch (Throwable e){
            System.out.println("deep of stack is"+ count);
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        TestJVMStack ts = new TestJVMStack();
//        ts.testStack();
        ts.testStack2();
    }
}
