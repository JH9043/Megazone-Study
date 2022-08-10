public class Car{
    private String name;
    public Car(String name){ //Constructor
        this.name =name;
        }

        @Override
        public String toString(){
            return String.format("My name is %s", this.name);
        }

}