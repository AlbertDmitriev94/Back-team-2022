package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FoodService {

    List<Food> getRolls() {
        Food filadelphia = new Food("1", "Филадельфия", 200);
        Food california = new Food("2", "Калифорния", 300);
        Food dracon = new Food("3", "Дракон", 400);
        List<Food> rools = new ArrayList<>();
        rools.add(filadelphia);
        rools.add(california);
        rools.add(dracon);
        return rools;
    };
    List<Food> getNaborRolls() {
        Food filadelphia = new Food("1", "Филадельфия", 200);
        Food california = new Food("2", "Калифорния", 300);
        Food dracon = new Food("3", "Дракон", 400);
        List<Food> rools = new ArrayList<>();
        rools.add(filadelphia);
        rools.add(california);
        rools.add(dracon);
        return rools;
    };

    public String byFood (Integer userSum){
        List<Food> naborRolls = getNaborRolls();
        if (userSum < calculatePrice(naborRolls)) {
          return "У вас не хватает денег";
        } else {
            return "Спасибо, что пользуетесь нами!Сумма заказа составляет " + userSum +
                    " Курьер приедет через 40 минут";
        }
    };

    private int calculatePrice (List<Food> naborRolls) {
        int sumOfRools = 0;
        for (Food food: naborRolls) {
            sumOfRools += food.getPrice();
        }
        return sumOfRools;
    }


        //Сделать метод, который будет принимать userSum будет ложить в список товары, проверять Хватает ли денег
        //пользователю на всю еду. Нужно использовать ArrayList, if, for, счетчик в виде переменной int=0 (филадельфия=200,
        //+дракон400, тогда счетчик =600), тогда делается проверка if. Если userDum < sum, кидать исключение throw Exception
        //"у вас не хватает денег", else "Возвращает список товаров", и  написать пользователю "Товар будет доставлен
            // через 30 минут", товар бдоставит "------".
    }

    /*List<Food> getBurgers () {
        List<String> burgers = new ArrayList<>();
        burgers.add("Чизбергер");
        burgers.add("Биг тейсти");
        burgers.add("Биг мак");
        return burgers;
    };


    List<Food> getFoodByType(String typeFood) {
        List<Food> list = null;
        if (typeFood.equals("Бургер")) {
            list = getBurgers();
        } else if (typeFood.equals("Роллы")){
            list = getRolls();
        }
        return list;
    };
         */

