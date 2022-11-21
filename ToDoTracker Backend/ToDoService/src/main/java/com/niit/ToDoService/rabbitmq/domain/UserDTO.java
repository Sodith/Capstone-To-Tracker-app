package com.niit.ToDoService.rabbitmq.domain;

import com.niit.ToDoService.model.TempTaskList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    private String email;
    private List<TempTaskList> list;
}
