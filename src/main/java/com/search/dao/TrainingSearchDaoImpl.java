package com.search.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.search.model.User;

@Repository
@Transactional
public class TrainingSearchDaoImpl implements TrainingSearchDao{
	
	@PersistenceContext
	  private EntityManager entityManager;
	
	public User getByUnamePass(String username, String password) {
	    return (User) entityManager.createQuery(
	        "from User where username = :username and password = :password")
	        .setParameter("username", username).setParameter("password", password)
	        .getSingleResult();
	  }

}
