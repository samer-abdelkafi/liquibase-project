package com.mycompany.todo.web.repo;

import com.mycompany.todo.web.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path ="users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {


}