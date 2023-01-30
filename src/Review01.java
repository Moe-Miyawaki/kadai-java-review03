
public class Review01 {

    public static void main(String[] args) {
        double price = 1200.0;

        double result = tax(price);

        System.out.println
        ( (int)price + "円の商品の税込価格は" + ((int)price + (int)result) + "円" + "(消費税は" + (int)result +"円)です。");
    }
    public static double tax(double num1){

        double rate = 0.1;
        double result = num1 * rate;
        return result;
    }

}

