package com.dridco.dss.solr.index;

import junit.framework.Assert;

import org.apache.solr.client.solrj.SolrQuery;
import org.junit.Test;

/**
 * 
 * @author jdifranco
 *
 */
public class IndexTest extends AbstractIndexAndSearchTest {

	@Test
	public void testQueryHavingZeroDocumentsIndexed() {
		SolrQuery qry = new SolrQuery("*:*");
		Result result = this.index.query(qry);
		Assert.assertNotNull(result);
		Assert.assertEquals(Long.valueOf(0), result.getTotal());
	}
	
}
