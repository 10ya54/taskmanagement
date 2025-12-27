package com.example.taskmanagement.domain.repository;

import com.example.taskmanagement.domain.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

    /**
     * ユーザーIDからユーザー情報を取得する
     *
     * @param userId ユーザーID
     * @return ユーザー情報
     */
    User findByUserId(String userId);
}
