package com.dridco.dss.solr.index;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;

/**
 * 
 * @author jdifranco
 * 
 */
public class Index {

	private SolrServer server;

	public Index(SolrServer solrServer) {
		this.server = solrServer;
	}
	
	public void empty() {
		try {
			this.server.deleteByQuery("*:*");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}	
	}
	
	public Result query(SolrQuery qry) {
		try {
			return DocumentsBinder.getResult(this.server.query(qry));
		} catch (SolrServerException e) {
			throw new RuntimeException(e);
		}
	}

}
