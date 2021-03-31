package kr.ac.inhatc.mapper;

import java.util.List;

public interface BoardMapper {
	List<?> selectSubjectList(String name) throws Exception;
}
