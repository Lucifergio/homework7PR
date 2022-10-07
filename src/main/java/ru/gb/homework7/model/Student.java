package ru.gb.homework7.model;


import lombok.*;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_student")
@NamedQueries({
        @NamedQuery(name = "Student.findAll", query = "SELECT p FROM Student p"),
        @NamedQuery(name = "Student.findById", query = "SELECT p FROM Student p WHERE p.id = :id"),
        @NamedQuery(name = "Student.deleteById", query = "DELETE FROM Student p WHERE p.id = :id")
})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
