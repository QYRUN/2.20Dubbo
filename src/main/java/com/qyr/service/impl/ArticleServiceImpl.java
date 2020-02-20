package com.qyr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qyr.beans.Article;
import com.qyr.beans.ArticleWithBLOBs;
import com.qyr.beans.Vo;
import com.qyr.dao.ArticleMapper;
import com.qyr.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleMapper articleMapper;

	@Override
	public ArticleWithBLOBs selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return articleMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Article> list(Vo vo) {
		// TODO Auto-generated method stub
		return articleMapper.list(vo);
	}
}
