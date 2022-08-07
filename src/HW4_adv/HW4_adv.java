package HW4_adv;

public class HW4_adv {
    //Продвинутый уровень
    //Задача №1
    //1. Создать следующую структуру из классов и интерфейсов:
    // дерево -> ель (имеет шишки, умеет пахнуть)
    // дерево -> сосна (имеет шишки, умеет пахнуть)
    // растение -> роза (умеет цвести, умеет пахнуть)
    // растение -> папоротник (умеет цвести)
    // Создать у каждого класса по объекту, распределить по массивам интерфейсов
    // И у каждого массива вызвать характерный метод
    //Ожидание:
    // сосна : умеет пахнуть
    // ель : умееть пахнуть
    // роза: умееть пахнуть
    // роза: умеет цвести
    // папоротник: умеет цвести
    public static void main(String[] args) {
        Sosna sosna1 = new Sosna(true);
        El el1 = new El(true);
        Rose rose1 = new Rose();
        Paporotnik paporotnik1 = new Paporotnik();
        Smellable[] smellables = {sosna1, el1, rose1};
        Bloomable[] bloomables = {rose1, paporotnik1};

        for (Smellable smellable : smellables) {
            smellable.smell();
        }

        for (Bloomable bloomable : bloomables) {
            bloomable.bloom();
        }


    }
}
