class prime_num {
    public static void main(String[] args) {

        // int num = 2;
        // int flag = 0; // prime
        // for (int i = 2; i < num; i++) {
        // if (num % i == 0) {
        // flag = 1; // not prime
        // break;
        // }
        // }

        // if (flag == 1) {
        // System.out.println("no prime");
        // }
        // else{
        // System.out.println("prime");
        // }

        // int num = 1;

        for (int num = 1; num <= 100; num++) {

            boolean flag = true;
            if (num <= 1) {
                flag = false;
            } 
            else if (num == 2) {
                flag = false;
            }
            else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println(num);
            }
            // else
            // {
            // System.out.println("not prime");
            // }
        }
    }
}
/*
output
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97
 */