import java.util.HashMap;
import java.util.Map;

public class Аптека {
    private String названиеАптеки;
    private HashMap<String, Double> лекарства; // Название лекарства и его стоимость

    // Конструктор
    public Аптека() {
        лекарства = new HashMap<>();
    }

    // Метод для инициализации полей
    public void инициализировать(String названиеАптеки, HashMap<String, Double> лекарства) {
        this.названиеАптеки = названиеАптеки;
        this.лекарства = лекарства;
    }

    // Метод для получения полной информации об аптеке
    public String получитьИнформацию() {
        StringBuilder информация = new StringBuilder();
        информация.append("Название аптеки: ").append(названиеАптеки).append("\n");
        информация.append("Лекарства:\n");
        for (Map.Entry<String, Double> entry : лекарства.entrySet()) {
            информация.append(" - ").append(entry.getKey()).append(": ").append(entry.getValue()).append(" руб.\n");
        }
        return информация.toString();
    }

    // Метод для выяснения стоимости самого дорогого лекарства
    public double стоимостьСамогоДорогогоЛекарства() {
        double максимальнаяСтоимость = 0.0;
        for (double стоимость : лекарства.values()) {
            if (стоимость > максимальнаяСтоимость) {
                максимальнаяСтоимость = стоимость;
            }
        }
        return максимальнаяСтоимость;
    }

    // Метод для нахождения стоимости всех лекарств
    public double общаяСтоимостьЛекарств() {
        double общаяСтоимость = 0.0;
        for (double стоимость : лекарства.values()) {
            общаяСтоимость += стоимость;
        }
        return общаяСтоимость;
    }
