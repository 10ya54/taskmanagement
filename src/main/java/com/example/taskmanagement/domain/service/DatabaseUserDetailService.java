package com.example.taskmanagement.domain.service;

import com.example.taskmanagement.domain.model.User;
import com.example.taskmanagement.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NullMarked;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Primary
@RequiredArgsConstructor
public class DatabaseUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    /**
     * ユーザーIDからユーザー情報を取得する
     *
     * @param username ユーザーID
     * @return ユーザー情報
     * @throws UsernameNotFoundException ユーザーが見つからない場合
     */
    @Override
    @NullMarked
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserId(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with userId: " + username);
        }

        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUserId())
                .password(user.getPassword())
                .build();
    }
}
