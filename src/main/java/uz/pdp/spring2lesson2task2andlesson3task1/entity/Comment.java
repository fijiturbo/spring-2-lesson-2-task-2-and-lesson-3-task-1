package uz.pdp.spring2lesson2task2andlesson3task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User customer;

    private String message;

    private Date date;

    private double mark;        // agarda product ga otsiv yozayotgan bo'lsa, shunga qo'yilgan otsenka

    @ManyToOne
    private Product product;


}
