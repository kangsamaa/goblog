package com.meblo.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meblo.blog.model.Board;

public interface BoardRepository extends JpaRepository<Board, Integer>{

}
