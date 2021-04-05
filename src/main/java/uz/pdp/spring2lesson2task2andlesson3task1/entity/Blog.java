package uz.pdp.spring2lesson2task2andlesson3task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String body;

    @OneToMany
    private List<Attachment> photos; // 1 ta Blog uchun bir nechta rasm yoki video lar qo'yilishi mumkin
}
