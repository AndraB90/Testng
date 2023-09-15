package classes;

public class Math {
    public int add(int x, int y) {
        return x + y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int findMax(int x, int y) {
        return java.lang.Math.max(x, y);
    }

    public String isEvenOrOdd(int x) {
        if (x % 2 == 0) {
            return "Is even";
        } else {
            return "Is odd";
        }
    }

    public boolean isPositive(int x){
        if (x > 0){
            return true;
        }else{
            return false;
        }
    }

}
