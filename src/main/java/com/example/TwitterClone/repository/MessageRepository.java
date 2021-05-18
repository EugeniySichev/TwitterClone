package com.example.TwitterClone.repository;



import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.TwitterClone.domain.Message;

import java.util.List;
public interface MessageRepository extends CrudRepository<Message, Long> {
   List<Message> findByTag(String tag);
}
