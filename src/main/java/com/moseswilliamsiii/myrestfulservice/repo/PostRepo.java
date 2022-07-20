package com.moseswilliamsiii.myrestfulservice.repo;

import com.moseswilliamsiii.myrestfulservice.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Integer> {
}
