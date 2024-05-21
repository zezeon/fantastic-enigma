
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int param = sc.nextInt();


        Calculable expression1 = new MultiplyExpression();
        Calculable expression2 = new AddExpression();

        System.out.printf("my multiply expression's result : %d \n", expression1.calculate(param));
        System.out.printf("my add expression's result : %d \n", expression2.calculate(param));

    }
}

interface Calculable {
    int calculate(int param);
}

//본인이 작성한 코드를 붙여넣어주세요!
class MultiplyExpression implements Calculable {
    @Override
    public int calculate(int param) {
        return param * 9;

    }
}
    class AddExpression implements Calculable {
        @Override
        public int calculate(int param) {
            return param + 1;
        }

    }