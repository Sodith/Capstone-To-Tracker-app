package com.niit.TrashService.rabbitmq.domain;

import com.niit.TrashService.model.TaskList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    private String email;
    private List<TaskList> list;
}
