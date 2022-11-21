package com.niit.TrashService.config1;

import com.niit.TrashService.exception.TaskAlreadyExistsException;
import com.niit.TrashService.exception.TrashNotFoundException;
import com.niit.TrashService.model.TaskList;
import com.niit.TrashService.model.User;
import com.niit.TrashService.rabbitmq.domain.UserDTO;
import com.niit.TrashService.service.TrashService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    private TrashService trashService;

    @RabbitListener(queues = "trash_queue")
    public void getUserFromRabbitMq(UserDTO userDTO) throws TrashNotFoundException, TaskAlreadyExistsException {
        User user=new User();
        user.setEmail(userDTO.getEmail());
        trashService.saveUser(user);
    }

}
