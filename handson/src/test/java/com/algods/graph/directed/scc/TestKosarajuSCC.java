package com.algods.graph.directed.scc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.directed.DiGraph;
import com.algods.graph.directed.scc.KosarajuSCC;

import java.util.List;
import java.util.ArrayList;


public class TestKosarajuSCC
{
        private DiGraph g2;
	

	@Before
	public void setUp()
	{
                // this is a cyclic Directed Graph.
                g2 = new DiGraph(13);
                g2.addEdge(0,1);
                g2.addEdge(0,5);
                g2.addEdge(2,0);
                g2.addEdge(2,3);
                g2.addEdge(3,2);
                g2.addEdge(3,5);
                g2.addEdge(4,2);
                g2.addEdge(4,3);
                g2.addEdge(5,4);
                g2.addEdge(6,0);
                g2.addEdge(6,4);            
                g2.addEdge(6,9);
                g2.addEdge(7,6);
                g2.addEdge(7,8);
                g2.addEdge(8,7);
                g2.addEdge(8,9);
                g2.addEdge(9,10);
                g2.addEdge(9,11);
                g2.addEdge(10,12);
                g2.addEdge(11,4);
                g2.addEdge(11,12);
                g2.addEdge(12,9);
	}

        @Test
        public void testStronglyConnected()
        {

           KosarajuSCC kosarajuSCC = new KosarajuSCC(g2);

           assertTrue(kosarajuSCC.stronglyConnected(0,4));
           assertFalse(kosarajuSCC.stronglyConnected(0,6));
           assertFalse(kosarajuSCC.stronglyConnected(0,12));

           assertEquals(Integer.valueOf(5), Integer.valueOf(kosarajuSCC.count()));

        }
	
        @Test
        public void testPrintStronglyConnectedComponents()
        {

           System.out.println("\n\n");

           KosarajuSCC kosarajuSCC = new KosarajuSCC(g2);

           int count = kosarajuSCC.count();
           List<Integer>[] listArray = (List<Integer>[])new List[count];

           for(int i = 0; i < listArray.length; i++)
           {
              listArray[i] = new ArrayList<>();
           }

           for(int i=0; i < g2.V(); i++)
           {
              listArray[kosarajuSCC.id(i)].add(i);
           }

           for(List<Integer> list:listArray)
           {
               for(int k:list)
               {
                   System.out.print(k + " ");
               }
               System.out.println();
           }

           System.out.println("\n\n");

           assertEquals(true,true);

        }

}

