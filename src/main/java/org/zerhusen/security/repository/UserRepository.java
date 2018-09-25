package org.zerhusen.security.repository;

import org.springframework.stereotype.Repository;
import org.zerhusen.model.security.User;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository {
    User findByUsername(String username);
}
