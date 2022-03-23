package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
//Сервис, который выдает еду
@RestController //Класс, который принимает конечные точки
public class Controller {

    @Autowired // аннотация бина Фуд сервис
    private final FoodService foodService;

    public Controller(FoodService foodService) {

        this.foodService = foodService;
    }


    @GetMapping("/food") //Будет конкретная конченая точка ФУД
    public List<String> food () {
        List <String> burgers = new ArrayList<>();
        burgers.add("Суши");
        burgers.add("Бургер");
        burgers.add("Пицца");
        return burgers;
    };
    //Получение роллов, без использования СПРИНГА
    @GetMapping ("/rolls")
    public List <Food> rolls () {
      FoodService foodService = new FoodService();
        return foodService.getRolls();
    };
    /*Получение роллов, с ипользованием СПРИНГА с помощью автосоздания объектов (Объект создался без
    ключевого слова NEW*/
    @GetMapping ("/rollsWithSpring")
    public List <Food> rollsWithSpring () {

        return foodService.getRolls();
    };

    @GetMapping ("/byFood/{userSum}")
    public String byFood (@PathVariable String userSum) {; ;
      return foodService.byFood(Integer.valueOf(userSum));
    }
//Получить еду по типу еды: бургер или роллы
//    @GetMapping ("/getFoodByType/{type}")
//    public List <String> getFoodByType (@PathVariable String type) {
//        return foodService.getFoodByType(type);
//    };

    @GetMapping ("/buyFood/{userSum}")
    public List <Food> buyFoodWithUserSum (String userSum) {

        return foodService.getRolls();
    };

}
