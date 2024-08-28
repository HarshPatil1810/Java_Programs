
interface  vehicle {
    public void speedUp(int a);
    public void applyBreak(int a);
        
    }
    class bike implements vehicle{
    int speed=50;
    int dec;
        @Override
        public void applyBreak(int decrement) {
            speed = speed - decrement;
            System.out.println("After Break "+speed);
        }
    
        @Override
        public void speedUp(int increment) {
            speed = speed + increment;
            System.out.println("Current speed is "+speed);
        }
    
    }
    public class interfacerefer {
        public static void main(String[] args) {
            bike b=new bike();
            b.speedUp(20);
            b.applyBreak(10);
        }
    }
    
