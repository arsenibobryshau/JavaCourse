public class Exercises1_8 {
    public class PositiveNegativeZero {
        // write code here
        public static void checkNumber(int number) {
            if (number > 0)
                System.out.println("positive");
            else if (number < 0)
                System.out.println("negative");
            else
                System.out.println("zero");
        }
    }
    //-----------------------------------------------------------------------------------------------
    public class SpeedConverter {
        public static long toMilesPerHour(double kilometersPerHour) {

            if (kilometersPerHour < 0) {
                return -1;
            }
            return Math.round(kilometersPerHour / 1.609);
        }

        public static void printConversion(double kilometersPerHour) {

            if (kilometersPerHour < 0) {
                System.out.println("Invalid Value");
                return;
            }
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    //------------------------------------------------------------------------------------------------

    public class MegaBytesConverter {

        public static void printMegaBytesAndKiloBytes (int kiloBytes){


            if (kiloBytes < 0){
                System.out.println("Invalid Value");
                return;
            }

            int mb = kiloBytes / 1024;
            int remainingKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainingKB + " KB");
        }
    }

    //------------------------------------------------------------------------------------------------

    public class BarkingDog {

        public static boolean shouldWakeUp (boolean barking, int hourOfDay){

            if (hourOfDay < 0 || hourOfDay > 23){
                return false;
            }

            return barking && (hourOfDay < 8 || hourOfDay > 22);
        }
    }

    //------------------------------------------------------------------------------------------------

    public class LeapYear {
        public static boolean isLeapYear (int year){

            if (year < 1 || year > 9_999){
                return false;
            }

            if (year % 4 == 0){

                if (year % 100 != 0){
                    return true;
                }else{

                    if(year % 400 == 0){
                        return true;
                    }else{
                        return false;
                    }
                }
            } else {
                return false;
            }


        }
    }

    //------------------------------------------------------------------------------------------------

    public class DecimalComparator {
        public static boolean areEqualByThreeDecimalPlaces(double first, double second){

            long firstRounded = (long) (first * 1000);
            long secondRounded = (long) (second * 1000);
            return firstRounded == secondRounded;
        }
    }

    //------------------------------------------------------------------------------------------------

    public class EqualSumChecker {
        public static boolean hasEqualSum (int a, int b, int c){
            return (a + b) == c;
        }
    }

    //------------------------------------------------------------------------------------------------

    public class TeenNumberChecker {
        public static boolean hasTeen(int a, int b, int c){
            return isTeen(a) || isTeen(b) || isTeen(c);
        }

        public static boolean isTeen(int number){
            return number > 12 && number < 20;
        }
    }

    //------------------------------------------------------------------------------------------------



}
