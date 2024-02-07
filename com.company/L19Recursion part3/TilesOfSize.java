public class TilesOfSize{
    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int verPlacements = placeTiles(n-m, m);

        //horizontally
        int horPlacements = placeTiles(n-1, m);

        return verPlacements + horPlacements;
    }
    public static void main(String[] args){
        int n = 3;
        int m = 3;
        int totalPaths = placeTiles(n, m);
        System.out.println(totalPaths);
    }
}