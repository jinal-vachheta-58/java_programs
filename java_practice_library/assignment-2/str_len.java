/*Java Program to count the total number of characters in a string */

class str_len {

    public static int strlen(String str) {
        int c = 0;
        try {
            while (true) {
                str.charAt(c);
                c++;
            }
        } catch (IndexOutOfBoundsException e) {
            return c;
        }
    }

    public static void main(String[] args) {
        
        String s = "jinal";
        System.out.println(str_len.strlen(s));
    }


}
