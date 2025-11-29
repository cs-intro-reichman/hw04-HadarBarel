public class Primes {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        boolean [] primes_Arr = new boolean[n + 1];
        int shoresh_n = (int) Math.sqrt(n);

        for (int i = 2; i < primes_Arr.length; i ++){
            primes_Arr [i] = true;
        }
        
        int x = 2;

        while (shoresh_n > 0){

            int i = 2;
            while (i * x < primes_Arr.length){
                primes_Arr [i * x] = false;
                i ++;
            }
            x ++;
            shoresh_n --;
        }

        System.out.println("Prime numbers up to " + n + ":");
        int counter = 0;
        for (int i = 0; i < primes_Arr.length; i++){
            if (primes_Arr[i] == true){
                System.out.println(i);
                counter ++;
            }
        }

        int total_numbers = primes_Arr.length - 2;
        double percent = ((double) counter / total_numbers);
        percent  *= 100;
        int final_percent = (int) Math.round(percent);
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + final_percent + "% are primes)" );
    }
}