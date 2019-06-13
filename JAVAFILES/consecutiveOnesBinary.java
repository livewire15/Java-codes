public static void main(String[] args) {
    Scanner scan = new Scanner(System.in) ;
    int n = scan.nextInt() ;
    scan.close() ;

    int ans = 0 ;
    while (n > 0) {
        n &= (n<<1) ;
        ans += 1 ;
    }
    System.out.println(ans) ;
}
