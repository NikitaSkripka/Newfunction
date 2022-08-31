public class Main {
    public static void main(String[] args) {

//        System.out.println("Funkcijos!");
//
//        int i = 28;
//        int sk = i;
//        int num;
//        System.out.println(dalikliai( num = i));
//
//    }
//    public static int dalikliai(int num){
//        int count = 0;
//        for (int i = 2; i <= num; i++) {
//            if(num % i == 0){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static String rndStr(int length){
//        String arr = "QWERTYUUIOOPPADSDSD3231424525";
//        System.out.println(arr.charAt(3));
//        return " ";
//    }


//    String txt = "Labas";
//
//    public static String txt (String input){
//        System.out.println("---" + input + "---");
//        return input;
//
//    }

        //Nr2


//
//        //Nr4
//    int [] array = new int [100];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//
//        }
//    }
//Myname();
//print("labas");
//print("vakaras");
        count("String str");
        name("String sample");
        double result = PISq();
        System.out.println(result);
        int a;
        int b;
        System.out.println(num ( 32,  7));

        int num1 = 25;
        int num2 = 35;
        int result1 = numbers(num1,num2);
    }



    public static void Myname () {
            System.out.println("Nikita Skripka");

        }
    //NR0
        public static void print(String Something){
            System.out.println(Something);
        }

        public static int num(int a, int b){
            return a + b;
        }
    //NR2
        public static double PISq(){
            return 9.8596;

        }

    ///NR3

        public static int numbers (int num1, int num2) {
        return num1 * num2;
        }


    ////NR4

        int[] intArray = new int [10];{
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

        int[] num = {2,6,8,9};{
        int[] numbers = new int[4];
        for (int num: numbers) {
            System.out.println(num);
        }
    }

    /////NR5
            public static void name(String sample){

            }
            int [] sample = {4,5,6,7,8};{
        for (int i = 0; i < sample.length; i++) {
            System.out.println(sample);
        }
    }
        /////NR9
        public static void count(String str)
        {
            System.out.println("count");
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                String s = "";
                while (i < ch.length && ch[i] != ' ') {
                    s = s + ch[i];
                    i++;
                }
                if (s.length() > 0) {
                    System.out.println(s + "->" + s.length());
                }
            }
            System.out.println("count end");
            System.out.println("I like summer");
        }













    }














