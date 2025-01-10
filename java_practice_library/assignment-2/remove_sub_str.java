class remove_sub_str{
    public static void main(String[] args)
    {
        // remove sub str
        String str = "jinal vachheta";

        int x = str.indexOf("nal");
        if(x != -1)
        {
            str = str.replace("nal","lan");
            System.out.println(str);
        }
        else
        {
            System.out.println(str);

        }
    }
    
}