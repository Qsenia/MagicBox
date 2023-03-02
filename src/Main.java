public class Main {
    public static void main(String[] args) {

        MagicBox<String> magicBox = new MagicBox(4);
        System.out.println(magicBox.add("Квартира"));
        System.out.println(magicBox.add("Машина"));
        System.out.println(magicBox.add("Поездка заграницу"));
        System.out.println(magicBox.add("Билет в кино"));
        System.out.println(magicBox.add("Ужин в ресторане"));
        magicBox.pick();
        System.out.println(magicBox.add("Велосипед"));
        magicBox.pick();
        magicBox.getRandomInt();


        MagicBox<Number> magicBox1 = new MagicBox(3);
        System.out.println(magicBox1.add(1000));
        System.out.println(magicBox1.add(50));
        magicBox1.pick();//создаю ошибку
        System.out.println(magicBox1.add(200));
        System.out.println(magicBox1.add(40));
        magicBox1.pick();
        magicBox1.getRandomInt();

        // создайте  магическую коробку для строк и вторую для чисел
        //и продемонстрируйте на них работу методов
    }
}