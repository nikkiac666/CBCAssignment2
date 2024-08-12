class main {
    public static void main( String[] args ) {
        System.out.println( "so far so good" );

        int n = 5;
        int[] refectoredasf = { 0, 1, 2, 3, 4 };

        int m = 100;
        int[] bar = new int[m];

        for( int i = 0; i < m; i++ ) {
            bar[i] = i;
        }

        System.out.println( "Amount of even numbers in refectoredasf: " );
        System.out.println( countEvenNum( refectoredasf, n ));

        System.out.println( "Amount of even numbers in bar: " );
        System.out.println( countEvenNum( bar, m ));

    }


    public static int countEvenNum( int[] arr, int size ) {
        int count = 0;

        for( int i = 0; i < size; i++ ) {
            if( arr[i] % 2 == 0) {
                count++;
            }
            else {
                //do nothing
            }
        }

        return count;
    }

}
