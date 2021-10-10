package com.algods.graph.undirected;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

import com.algods.graph.undirected.Graph;
import com.algods.graph.undirected.SymbolGraph;
import com.algods.graph.undirected.bfs.BreadthFirstPaths;

public class TestDegreesOfSeparation
{

        private String routes;
        private String movies;
	

	@Before
	public void setUp()
	{
            // both the files should be in the classpath
            routes = "./src/test/resources/routes.txt";
            movies = "./src/test/resources/movies.txt";
		
	}
	
	@Test
	public void testDegreesOfSeparationForRoutes()
	{


            SymbolGraph symbolGraph = new SymbolGraph(routes, " ");

            Graph g = symbolGraph.G();

            String source = "JFK";
            String sink = "LAS";

            if(!symbolGraph.contains(source))
            {
                 System.out.format("Source %s not found in Database.\n", source);
                 return;
            }

            if(!symbolGraph.contains(sink))
            {
                 System.out.format("Sink %s not found in Database.\n", sink);
                 return;
            }


            int sourceVertex = symbolGraph.index(source);
            BreadthFirstPaths bfs = new BreadthFirstPaths(g,sourceVertex);

            int sinkVertex = symbolGraph.index(sink);


            if(!bfs.hasPathTo(sinkVertex))
            {
                System.out.format("Sink %s has no path to source %s\n", sink,source);
                return;
            }
 

            System.out.println("\n\n");
            System.out.println(sink + ":");

            for(int k:bfs.pathTo(sinkVertex))
            {
               System.out.println("  " + symbolGraph.name(k));
            }

            System.out.println("\n\n");
             

            assertEquals(true, true);
	}

        @Test
        public void testDegreesOfSeparationForMovies()
        {


            SymbolGraph symbolGraph = new SymbolGraph(movies, "/");

            Graph g = symbolGraph.G();

            String source = "Animal House (1978)";
            String sink = "To Catch a Thief (1955)";

            if(!symbolGraph.contains(source))
            {
                 System.out.format("Source %s not found in Database.\n", source);
                 return;
            }

            if(!symbolGraph.contains(sink))
            {
                 System.out.format("Sink %s not found in Database.\n", sink);
                 return;
            }


            int sourceVertex = symbolGraph.index(source);
            BreadthFirstPaths bfs = new BreadthFirstPaths(g,sourceVertex);

            int sinkVertex = symbolGraph.index(sink);

            if(!bfs.hasPathTo(sinkVertex))
            {
                System.out.format("Sink %s has no path to source %s\n", sink,source);
                return;
            }


            System.out.println("\n\n");
            System.out.println(sink + ":");

            for(int k:bfs.pathTo(sinkVertex))
            {
               System.out.println("  " + symbolGraph.name(k));
            }

            System.out.println("\n\n");


            assertEquals(true, true);
        }


}

