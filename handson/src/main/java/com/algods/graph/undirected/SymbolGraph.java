package com.algods.graph.undirected;

import java.util.Map;

/**
  * <h1>SymbolGraph</h1>
  * This class is an implementation for Symbol Graph for graphs
  * <p> Implementation for Symbol Graph layer for Graphs  in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-09
  */


public class SymbolGraph
{

    private Graph g;
    private Map<String, Integer> nameMap;
    private String[] indexArray;

    public SymbolGraph(String filePath, String delim)
    {
       this.populateNameMap(filePath,delim);
       this.populateIndexArray();
       this.populateGraph();
    }


    public boolean contains(String s)
    {

       if(s == null || s.length() == 0)
       {
          return false;
       }

       return nameMap.containsKey(s);
    }

    public int index(String s)
    {
      
       if(s == null || s.length() == 0)
       {
          return -1;
       }

       return nameMap.get(s);
    }

    public String name(int v)
    {
       if(v < 0 || v >= indexArray.length)
       {
          return null;
       }
       return indexArray[v];
    }

    public Graph G()
    {
       return g;
    }

    private void populateNameMap(String filePath,String delim)
    {
         // TBD
    }

    private void populateIndexArray()
    {
       indexArray = new String[nameMap.size()];

       for(String s:nameMap.keySet())
       {
          indexArray[nameMap.get(s)] = s;
       }
    }

    private void populateGraph()
    {


    }
}
