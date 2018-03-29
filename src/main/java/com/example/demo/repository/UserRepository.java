/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.User;

/**
 * @author T_IbrahimaK1
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {

	
}
