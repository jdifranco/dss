package com.dridco.dss.solr.index;

import java.util.List;

import com.dridco.dss.solr.model.Book;

/**
 * 
 * @author jdifranco
 * 
 */
public class Result {

	private List<Book> books;

	private Long total;

	public Result(List<Book> books, Long total) {
		super();
		this.books = books;
		this.total = total;
	}

	public List<Book> getBooks() {
		return books;
	}

	public Long getTotal() {
		return total;
	}

}
