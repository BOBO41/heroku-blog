package com.herokuapp.lzqwebsoft.pojo;

import java.util.Date;
import java.util.Set;

/**
 * 封装文章对象
 * @author zqluo
 *
 */
public class Article {
	private int id;
	private User author;
	private ArticleType type;    // 关联一个文章类型
	private int patternTypeId;
	private String title;
	private boolean allowComment;
	private boolean isTop;
	private String contentPath;
	private int status;
	private long readedNum;
	private Date createAt;
	private Date updateAt;
	private Set<Image> images;   // 关联多个图片
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public ArticleType getType() {
		return type;
	}
	public void setType(ArticleType type) {
		this.type = type;
	}
	public int getPatternTypeId() {
		return patternTypeId;
	}
	public void setPatternTypeId(int patternTypeId) {
		this.patternTypeId = patternTypeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean getAllowComment() {
		return allowComment;
	}
	public void setAllowComment(boolean allowComment) {
		this.allowComment = allowComment;
	}
	public boolean getIsTop() {
		return isTop;
	}
	public void setTop(boolean isTop) {
		this.isTop = isTop;
	}
	public String getContentPath() {
		return contentPath;
	}
	public void setContentPath(String contentPath) {
		this.contentPath = contentPath;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public long getReadedNum() {
		return readedNum;
	}
	public void setReadedNum(long readedNum) {
		this.readedNum = readedNum;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public Set<Image> getImages() {
		return images;
	}
	public void setImages(Set<Image> images) {
		this.images = images;
	}
}