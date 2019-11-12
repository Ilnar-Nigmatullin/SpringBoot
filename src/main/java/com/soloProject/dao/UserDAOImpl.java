package com.soloProject.dao;

import com.soloProject.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceUnit
    private EntityManager entityManager;

/*    @Autowired
    public UserRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }*/

    @SuppressWarnings("unchecked")
    public List<User> readUsers() {
        return entityManager.createQuery("FROM User").getResultList();
    }

    public void addUser(User user) {
        if (user != null) {
            entityManager.persist(user);
        }
    }

    public User editUser(User user) {
        User editUser = entityManager.find(User.class, user.getId());

        if (user.getUserName() != null) {
            editUser.setUserName(user.getUserName());
        }
        if (user.getPassword() != null) {
            editUser.setPassword(user.getPassword());
        }

        return editUser;
    }

    public void deleteUser(User user) {
        entityManager.remove(user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public User findByUserName(String userName) {
        return (User) entityManager.createQuery("FROM User where userName= :userName")
                .setParameter("userName", userName).getSingleResult();
    }
}
