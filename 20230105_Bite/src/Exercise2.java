public class Exercise2 {
    public static void main(String[] args) {
        double height=100;
        double sum=100;
        for(int i=0;i<9;i++){
            sum+=height;
            height=height/2;
        }
        height=height/2;
        System.out.println("经过"+sum+"米，第十次反弹"+height+"米");
    }
}
