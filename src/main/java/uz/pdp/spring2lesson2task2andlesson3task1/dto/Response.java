package uz.pdp.spring2lesson2task2andlesson3task1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    private String message;
    private boolean status;

}
