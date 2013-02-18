package com.dridco.dss.solr.index;

import org.apache.solr.SolrTestCaseJ4;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.embedded.EmbeddedSolrServer;

/**
 * 
 * @author jdifranco
 *
 */
public abstract class AbstractIndexAndSearchTest extends SolrTestCaseJ4 {
	
	protected Index index;
	
	@Override
	public void setUp() throws Exception {
		super.setUp();
		initCore(this.getConfigFileLocation(), this.getSchemaFileLocation(), "solr/", this.getCoreName());
		SolrServer server = new EmbeddedSolrServer(h.getCoreContainer(), h.getCore().getName());
		index = new Index(server);
        index.empty();
	}
	
    protected String getSchemaFileLocation() {
        return "solr/books/conf/schema.xml";
    }

    protected String getConfigFileLocation() {
        return "solr/books/conf/solrconfig.xml";
    }
    
    protected String getCoreName() {
        return "books";
    }
    
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        deleteCore();
    }
    
}
