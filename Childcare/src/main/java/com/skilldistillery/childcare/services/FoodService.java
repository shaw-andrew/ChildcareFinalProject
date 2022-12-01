package com.skilldistillery.childcare.services;

import java.util.List;

import com.skilldistillery.childcare.entities.Food;

public interface FoodService {
 List<Food> listAllFoods(String username);
 
 Food create(String username, Food food);
 
 Food update(String username, Food food, int foodId);
 
 boolean delete(int foodId);
 
 List<Food> foodByReportId(int reportId);
}
