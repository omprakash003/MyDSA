package RegularExpression;
abstract class Car {
    public abstract void EngineType();
   public abstract void Color();

}
class BMW extends Car {


    @Override
    public void EngineType() {

    }

    @Override
    public void Color() {
        System.out.println("Red");
    }
}



public class File {
    public static void main(String[] args) {
       BMW car=new BMW();
       car.Color();
       car.EngineType();
    }
}

