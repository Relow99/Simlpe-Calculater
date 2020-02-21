public class Calculator {

    public static int add(int... numbers){
        int sum=0;
        for (int number: numbers){

            sum+=number;
        }
        System.out.println(sum);
        return sum;
    }


    public static int multiply(int... numbers){
        int product=1;
        for (int number: numbers) product *= number;
        System.out.println(product);
        return product;

    }

    public static void main(String [] args) {

        add(1,2,3,4,5);
        multiply(1,2,3,4,5);
    }


}
