package com.spring.auth.repository;

import com.spring.auth.entity.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends MongoRepository<UserInfo,String> {
    public Optional<UserInfo> findByUserName(String username);
}
