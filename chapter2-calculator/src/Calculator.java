import com.sun.org.apache.xpath.internal.SourceTreeManager;

public class Calculator {
    int add(int i, int j){
        return i + j;
    }

    int subtract(int i, int j){
        return i - j;
    }

    int mutiply(int i, int j){
        return i * j;
    }

    int divide(int i, int j){
        return i / j;
    }

    public static void main(String[] args){
        Calculator cal = new Calculator();
        System.out.println(cal.add(3, 4));
        System.out.println(cal.subtract(5,4));
        System.out.println(cal.mutiply(2, 6));
        System.out.println(cal.divide(8, 4));
    }
}
