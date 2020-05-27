package com.fastcampus.javaallinon.project1.demo.repository;

import com.fastcampus.javaallinon.project1.demo.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * PersonRepositoryTest
 *
 * @author: s2
 * @version: 1.0.0
 * @since: 2020-05-26오전 2:12
 */

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    /**
    * CRUD TEST
    * @param
    * @return
    * @author CHASEONGHOON
    * @version 1.0.0
    * @since 2020-05-26 오전 2:16
    **/
    @Test
    void crud() {
        Person person = new Person();
        person.setAge(10);
        person.setName("NABI");
        person.setBloodType("A");
        personRepository.save(person);

        List<Person> people = personRepository.findAll();

        assertThat(people.size()).isEqualTo(1);
        assertThat(people.get(0).getName()).isEqualTo("NABI");
    }

    @Test
    void hashCodeAndEquals() {
        Person person1 = new Person("M", 10, "A");
        Person person2 = new Person("M", 10, "A");

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        Map<Person, Integer> map = new HashMap<>();
        map.put(person1, person1.getAge());
        System.out.println(map);
        System.out.println(map.get(person2));

    }

}