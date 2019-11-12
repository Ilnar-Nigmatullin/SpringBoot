package com.soloProject.dao;

import com.soloProject.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

public class RoleDAOImpl implements RoleDAO {
    @PersistenceUnit
    EntityManager entityManager;

    @Override
    public Role getRoleByName(String roleName) {
        return (Role) entityManager.createQuery("FROM Role where name= :name")
                .setParameter("name", roleName).getSingleResult();
    }
}
