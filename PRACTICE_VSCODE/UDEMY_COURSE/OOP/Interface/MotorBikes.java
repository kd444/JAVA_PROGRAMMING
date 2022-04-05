public class MotorBikes {
    
    private int speed;
     
    // Static: We dont need any object to call methods or variables

    public int getspeed() {
        return speed;
    }
    public void setspeed(int speed) {
        this.speed = speed;
    }

    public void increment(){
        this.speed+=1000;
    }

    public static int calculatespeed(int speed){
        return speed + 10;
    }
    public static void main(String[] args) {
        
       Mot
        // vishal.setspeed(100);

        // int vishalSal = calculatespeed(vishal.getspeed());

        // System.out.println("Vishals speed:"+vishalSal);
        // vishal.increment();
        // System.out.println("Vishals speed after increment:"+vishal.getspeed());
    }
    
}
