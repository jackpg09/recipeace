package com.recipeace.recipeaceMVC.Models.Data;

import com.recipeace.recipeaceMVC.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Integer> {

}