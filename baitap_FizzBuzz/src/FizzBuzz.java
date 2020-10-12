public class FizzBuzz {
    public static String display1(int number) {
        if (number % 3 == 0) {
            if (number % 5 != 0) {
                return "Fizz";
            } else {
                return "FizzBuzz";
            }
        } else {
            if (number % 5 == 0) {
                return "Buzz";
            } else {
                return "" + number;
            }
        }
    }

    public static String display2(int number) {
        String num = number + "";
        String result = "";
        for (int i = 0; i < num.length(); i++) {
            String f = "3";
            if (num.charAt(i) == f.charAt(0)) {
                result += "Fizz";
                break;
            }
        }
        for (int i = 0; i < num.length(); i++) {
            String b = "5";
            if (b.charAt(0) == num.charAt(i)) {
                result += "Buzz";
                break;
            }
        }
        return result;
    }

        public static String display3(int number){

        String result = "";

        if(number <= 0 || number >= 100){
            result = "SO BAN NHAP KO THOA MAN!";
        }else if(number < 10){
            result = strNum(number);
        }else{
            int first = number/10;
            int second = number%10;
            if(first == 1){
                result += "MUOI ";
                result += strNum(second);
            }else {
                result += strNum(first)+" ";
                if(second == 0){
                    result +="MUOI";
                }else{
                    result += strNum(second);
                }
            }
        }
        return result;
    }
    private static String strNum(int number) {
                    switch (number){
                case 1:
                    return "MOT";
                case 2:
                    return "HAI";
                case 3:
                    return "BA";
                case 4:
                    return "BON";
                case 5:
                    return "NAM";
                case 6:
                    return "SAU";
                case 7:
                    return "BAY";
                case 8:
                    return "TAM";
                case 9:
                    return "CHIN";
                        default:
                            return "";
    }
}


}
