package com.niit.ToDoService.repository;

import com.niit.ToDoService.model.User;
import org.bouncycastle.cms.RecipientInformationStore;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

    Optional<User> findByTaskId(long taskId);
}
