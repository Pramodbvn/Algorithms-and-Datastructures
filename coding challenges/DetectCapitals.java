public class detectCapitals {
    public static void main(String args[]) {
        String a = "FlaG";
        if (a.toLowerCase().equals(a) || a.toUpperCase().equals(a)) {
            System.out.println(true);
        }
        else{
            if(a.charAt(0)==a.toUpperCase().charAt(0)){
                if(a.substring(1).toLowerCase().equals(a.substring(1))){
                    System.out.println(true);
                }
                else{
                    System.out.println(false);
                }
            }
            System.out.println(false);
        }
    }

}
