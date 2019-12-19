public class JavaBasic1 {

    public static void main(String[] args) {
        //Remove "S" from string (1)
        String s1;
        String s = "This is very easy programme";
        s1 = s.replaceAll("s","");
        System.out.println(s1);

        // Length of string s (2)
        System.out.println(s.length());

        //Remove space from string s (3)
        s = s.replaceAll(" ", "");
        System.out.println(s);

        // Extract special characters from string s2 (4)
        String s2 = "This $300 is equivalent of £200 but not for @100";
        s2 = s2.replaceAll("[a-zA-Z0-9\\s+]", "");
        System.out.println(s2);

        //Extract  number from string s3 (5)
        String s3 = "The cost of iphone is £1,250";
        s3 = s3.replaceAll("[a-zA-Z£\\s+]","");
        System.out.println(s3);

        // Convert int i to double (6)
        int i = 450;
        double d = i;
        System.out.println(d);

        //Covert string s4 to integer (7)
        String s4 = "125";
        int i1 = Integer.parseInt(s4);
        System.out.println(i1);

        //Convert double d1 to string (8)
        double d1 = 123.45;
        String s5 = String.valueOf(d1);
        System.out.println(s5);

        //Convert string s6 to double (9)
        String s6= "560.25";
        double d2 = Double.parseDouble(s6);
        System.out.println(s6);

        //Find out answer 1/3 in decimal points (10)
        double a = 1;
        double b = 3;

        double d3 = (a/b);
        System.out.println(d3);

        //Replace currency symbol from $ to £
        String s7 = "$250.00";
        s7 = s7.replaceAll("[$]","£");
        System.out.println(s7);

        String s8 = "There";
        String s9 = "England";
        String s10 = "Orange";

        // Substring method
        s8 = s8.substring(2,3);
        System.out.println(s8);

        s9 = s9.substring(3,4);
        System.out.println(s9);

        s10 = s10.substring(2,4);
        System.out.println(s10);

    }
}
