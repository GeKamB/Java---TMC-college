public class infiniteLoop {
    
    public static void main(String[] args) {
        int num = 0;
        while(true) {
            System.out.println("value of x is " + num);
            if (num == 400) break;          
                
            
            num++;
        }
    }
}
