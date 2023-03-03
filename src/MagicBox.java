import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    private T[] items;
    Random random = new Random();

    public MagicBox(int max) {
        this.items = (T[]) new Object[max];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                //Для определения незаполненности коробки проверяем массив items на наличие null
                items[i] = item;
                //Если коробка ещё не полна, то элемент должен в ней сохраниться
                System.out.println("В коробку добавили : " + item);
                return true;
            }
        }
        //Если полна, то коробка не должна измениться
        System.out.println("Коробка заполнена!");
        System.out.println(Arrays.deepToString(items));
        return false;
    }

    public T pick() {
        int i = 0;
        for (T cell : items) { //Для определения незаполненности коробки проверьте массив items на наличие null
            if (cell == null) {
                throw new RuntimeException("Коробка не полна, осталось заполнить еще:   " + (items.length - i) + " ячеек");
                //Если коробка не полна, то он выкидывает
            }
            i++;
        }
        return items[getRandomInt()];
    }
    //Если коробка полна, то метод выбирает
    //случайным образом (см. ниже) один из сохранённых элементов
    //Для выбора случайного элемента выберите случайное число-индекс массива
    // и верните его содержимое
    // и возвращает его из метода
    // джава подберёт случайное число от 0 до ЧИСЛО невключительно
    public int getRandomInt() {
        int randomInt = random.nextInt(items.length);
        T item = (T) items[randomInt];
        System.out.println("Вам достается " + item);
        return randomInt;
    }

    @Override
    public String toString() {
        return "MagicBox{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}







