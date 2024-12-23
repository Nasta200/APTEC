// Пример использования класса
    public static void main(String[] args) {
        Аптека аптека = new Аптека();

        HashMap<String, Double> лекарства = new HashMap<>();
        лекарства.put("Парацетамол", 280.0);
        лекарства.put("Ибупрофен", 350.0);
        лекарства.put("Анальгин", 100.0);

        аптека.инициализировать("Мир", лекарства);

        System.out.println(аптека.получитьИнформацию());
        System.out.println("Стоимость самого дорогого лекарства: " + аптека.стоимостьСамогоДорогогоЛекарства() + " руб.");
        System.out.println("Общая стоимость всех лекарств: " + аптека.общаяСтоимостьЛекарств() + " руб.");
    }
}
