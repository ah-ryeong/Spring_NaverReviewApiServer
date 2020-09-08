package com.winter.review.model;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import com.winter.util.Utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String blogUrl;
	private String title;
	private String thumnail;
	private String day;
	
	@CreationTimestamp
	private Timestamp createDate;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setBlogUrl(String blogUrl) {
		this.blogUrl = blogUrl;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setThumnail(String thumnail) {
		this.thumnail = thumnail;
	}

	public void setDay(String day) {
		this.day = Utils.dayParse(day);
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
}