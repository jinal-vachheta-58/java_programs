class bubble_sort {
    public static void main(String[] args) {
        int a[] = {4,2,6,8,1,9};

        // print array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // bubble sorting 
        for(int x = 0;x < a.length; x++)
        {
            for (int y = 0; y < a.length; y++) {
                if(a[x] < a[y])
                {
                    int temp = a[x];
                    a[x] = a[y];
                    a[y] = temp;
                }
            }
        }

        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + "  ");
        }
    }

}
