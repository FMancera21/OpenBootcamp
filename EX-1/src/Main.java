public class Main {
    public static void main(String[] args) {
        plus(5,10,15);
        Car miCoche = new Car();
        miCoche.addDoors();
        System.out.println(miCoche.doors);
    }
    public static void plus(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static class Car{
        public int doors = 0;
        public void addDoors(){
            this.doors ++;
        }
    }
}