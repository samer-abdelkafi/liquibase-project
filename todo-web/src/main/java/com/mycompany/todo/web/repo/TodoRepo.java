package com.mycompany.todo.web.repo;

import com.mycompany.todo.web.entity.Todo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo extends PagingAndSortingRepository<Todo, Long> {

    List<Todo> findByUser_name(String userName);

}
