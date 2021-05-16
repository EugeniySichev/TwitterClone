package com.example.TwitterClone.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.TwitterClone.domain.Message;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {
   List<Message> findByTag(String tag);
}
