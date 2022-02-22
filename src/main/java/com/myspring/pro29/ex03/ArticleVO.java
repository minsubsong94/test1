package com.myspring.pro29.ex03;

public class ArticleVO {
	private String Writer;
	private String ArticleNO;
	private String Title;
	private String Content;

	public String getWriter() {
		return Writer;
	}

	public void setWriter(String Writer) {
		this.Writer = Writer;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;

	}

	public String getContent() {
		return Content;
	}

	public void setContent(String Content) {
		this.Content = Content;

	}

	public void setArticleNO(int i) {
		this.ArticleNO = ArticleNO;
	}

	public String getArticleNO() {
		return ArticleNO;
	}

	@Override
	public String toString() {
		String info = "";
		info += "\n" + ArticleNO + "\n" + Writer + "\n" + Title + "\n" + Content;
		return info;
	}

}