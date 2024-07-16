public class ch6_4_2{
    public static void main(String args[]){
        int sum=0;
        int[][] sales = {{32,35,23,30},{34,33,30,31}};

        for(int[] row:sales){
            for(int n:row){
                System.out.printf("%3d",n);;
                
                
            }
            System.out.println();
        }
            
        System.out.printf("總銷售量為 %d 部車",sum);

    }
}