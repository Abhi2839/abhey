public class roundoff {
    public static void main(String[] args) {
        double x=1882.3654;
        String roundf=String.format("%.2f",x);
        double y=Math.round(x*100)/100.0;
        System.out.println(roundf);
        System.out.println(y);
    }
}
