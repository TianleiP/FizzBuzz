public class Reduce {
    public static void main(String[] args) {
        int x = 100;
        int y = 0;
        while (x>0){
            if(x%2 == 0){
                y += 1;
                x /= 2;
            }
            else{
                y += 1;
                x -= 1;
            }


        }
        System.out.println(y);

    }
}
