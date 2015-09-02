public class tarea2 {
    
    public static void main(String[] args) {
        
        String s = "2\n3 9\n17 24";
        String[] split = s.split("\\n");
        for (int i = 1; i <= Integer.parseInt(split[0]); i++) {
            String[] interval = split[i].split("\\ ");
            int a = Integer.parseInt(interval[0]);
            int b = Integer.parseInt(interval[1]);
            int roots = getNumberOfRoots(a, b);
            System.out.println();
            System.out.println("Interval " + a + " to "+ b + " has " + roots + " roots");
        }
        
    }
    
    private static int getNumberOfRoots(int a, int b) {
        int count = 0;
        if (b < a) { //por si el intervalo está escrito al revés
            final int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            if ( isPerfectRoot(i) ) count++;
        }
        return count;
    }
    
    private static boolean isPerfectRoot(int num) {
        final int sqrt = (int) Math.sqrt(num);
        return  sqrt*sqrt == num;
    }
    
}