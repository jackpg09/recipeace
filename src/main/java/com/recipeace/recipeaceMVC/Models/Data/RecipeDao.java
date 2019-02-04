package com.recipeace.recipeaceMVC.Models.Data;

import com.recipeace.recipeaceMVC.Models.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RecipeDao extends CrudRepository<Recipe, Integer> {
}
