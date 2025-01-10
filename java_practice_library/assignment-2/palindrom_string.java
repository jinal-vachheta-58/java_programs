class palindrom_string{
    public static void main(String[] args) {
        String str = new String("cmvddkjo");
        
        StringBuilder s= new StringBuilder();

        for(int i = str.length()-1 ; i >=0 ; i--)
        {
            s = s.append(str.charAt(i)) ;
        }

        if(str.equals(s.toString()))
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}