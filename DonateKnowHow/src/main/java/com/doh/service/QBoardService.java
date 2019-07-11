package com.doh.service;

import java.util.List;

import com.doh.domain.QBoardVO;



public interface QBoardService {
	List<QBoardVO> listImpl();
	void insertImpl(QBoardVO vo);
	QBoardVO contentImpl(int q_no);
	boolean deleteImpl(int q_no);
	QBoardVO updateGetImpl(int q_no);
	void updateImpl(QBoardVO vo);
}
