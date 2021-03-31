package kr.ac.inhatc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.inhatc.mapper.BoardMapper;

@Service
public class BoardService {
	@Autowired
	BoardMapper boardMapper;
	
	public List<?> selectSubjectList(String name) throws Exception{
		return boardMapper.selectSubjectList(name);
	}
}
