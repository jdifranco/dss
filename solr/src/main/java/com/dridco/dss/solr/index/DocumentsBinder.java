package com.dridco.dss.solr.index;

import java.util.ArrayList;
import java.util.List;

import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;

import com.dridco.dss.solr.model.Book;
import com.dridco.dss.solr.model.Language;
import com.dridco.dss.solr.model.Rating;

/**
 * 
 * @author jdifranco
 *
 */
public class DocumentsBinder {
	
	protected static Result getResult(QueryResponse qryResponse) {
		List<Book> books = new ArrayList<Book>();
		
		for(SolrDocument document : qryResponse.getResults()) {
			Book book = new Book(
					(String) document.getFieldValue(FieldsList.ISBN), 
					Language.ES, null, null, null, Rating.FOUR_STAR, null, null);
			
			books.add(book);
		}
		
		Result result = new Result(books, qryResponse.getResults().getNumFound());
		return result;
	}
}
