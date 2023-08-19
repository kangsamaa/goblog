package com.meblo.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meblo.blog.model.Board;
import com.meblo.blog.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	
	@Autowired
	private final BoardRepository boardRepository;
	
	public List<Board> findAll(){
		List<Board> boardList = boardRepository.findAll();
		return boardList;
	}
	
}
