package com.dao;

import com.entities.Person;

import java.util.List;

/**
 * Created by Lenovo on 21.5.2017 г..
 */
public interface PersonDao {
    void createPersonTable();

    void insert(Person p);

    Person selectById(int id);

    List<Person> selectAll();

    void delete(int id);

    void update(Person p, int id);
}
