package CaseStudyModule2.Task7.Commons;

import java.util.Scanner;

public class CheckValidate {
    private static String regx = "";
    private static Scanner scanner;

    public static boolean checkServiceName(String str) {
        regx = "^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]+))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){1,6}$";
        return str.matches(regx);
    }

    public static double checkDoubleNumber(String mess, String error) {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.println(mess);
                return scanner.nextDouble();
            } catch (Exception ex) {
                System.out.println(error);
            }
        }
    }

    public static int checkIntNumber(String mess, String error) {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.println(mess);
                return scanner.nextInt();
            } catch (Exception ex) {
                System.out.println(error);
            }
        }
    }

    public static String checkOtherFacilities(String mess, String error) {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.println(mess);
                return scanner.nextLine();
            } catch (Exception ex) {
                System.out.println(error);
            }
        }
    }

    public static boolean checkEmail(String srt) {
        regx = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        return srt.matches(regx);
    }

    public static boolean checkBrithday(String str) {
        regx = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        return str.matches(regx);
    }

    public static String checkGender(String srt) {
        String result = "";
        for (int i = 0; i < srt.length(); i++) {
            if (i == 0) {
                result = String.valueOf(srt.charAt(0)).toUpperCase();
                continue;
            }
            result += String.valueOf(srt.charAt(i)).toLowerCase();
        }
        return result;

    }

//    public static boolean checkIdCard(int number, String mess, String error ) {
//
//        while (true) {
//            try {
//                scanner = new Scanner(System.in);
//                System.out.println(mess);
//                return scanner.nextDouble();
//            } catch (Exception ex) {
//                System.out.println(error);
//            }
//        }
//    }

}

