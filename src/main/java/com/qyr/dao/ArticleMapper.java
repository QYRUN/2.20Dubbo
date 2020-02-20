package com.qyr.dao;

import java.util.List;

import com.qyr.beans.Article;
import com.qyr.beans.ArticleWithBLOBs;
import com.qyr.beans.Vo;

public interface ArticleMapper {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询文章
	 * @param article
	 * @return
	 * @return: List<Article>
	 */
	List<Article> selects(Article article);
	
	List<Article> all();

    ArticleWithBLOBs selectByPrimaryKey(Integer id);


	List<Article> list(Vo vo);
}