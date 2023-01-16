public class Main{
    public static void main(String[] args) {
        Car sonata = new Car("Silver Sonata");
        System.out.println(sonata); //sonata.toString()

        //선언형에서도 Car를 못찾고
        //실제형에서도 Car를 못찾아서 오류
    }
}