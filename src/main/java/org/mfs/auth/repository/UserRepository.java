package org.mfs.auth.repository;

import org.mfs.auth.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	User findUserByUsername(String username);
}
