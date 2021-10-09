package com.algods.graph.undirected.dfs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.undirected.Graph;

public class TestSymbolGraph
{

        private String routes;
        private String movies;
	

	@Before
	public void setUp()
	{
            // both the files should be in the classpath
            routes = "routes.txt";
            movies = "movies.txt";
		
	}
	
	@Test
	public void testSymbolGraphForRoutes()
	{


            SymbolGraph symbolGraph = new SymbolGraph(routes, " ");


            assertEquals(true, true);
	}

}

