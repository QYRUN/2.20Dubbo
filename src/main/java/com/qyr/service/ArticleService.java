package com.qyr.service;



import java.util.List;

import com.qyr.beans.Article;
import com.qyr.beans.ArticleWithBLOBs;
import com.qyr.beans.Vo;

public interface ArticleService {

	ArticleWithBLOBs selectByPrimaryKey(Integer id);
	

	List<Article> list(Vo vo);

}
