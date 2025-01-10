

/* 6) Create a StringBuffer and illustrate how to append character. 
Display capacity, length of the StringBuffer.*/

class str_buffer{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("hii"); // 
        System.out.println(sb.append("x"));
        System.out.println(sb.insert(2,"x"));
        System.out.println(sb.delete(2,3));
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}