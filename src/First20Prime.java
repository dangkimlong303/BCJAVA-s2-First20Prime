public class First20Prime {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        String strPrime = "";

        while (count < 20){
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                count++;
                strPrime += number + " ";
            }
            number++;
        }
        System.out.println(strPrime);
    }
}
