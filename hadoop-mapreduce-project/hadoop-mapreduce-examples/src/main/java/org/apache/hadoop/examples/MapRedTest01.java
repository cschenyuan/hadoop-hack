package org.apache.hadoop.examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.directory.api.util.Strings;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MapRedTest01 {

	public static class MyMapper extends Mapper<Object,Text,Text,IntWritable>{
		
		public void map(Object key,Text value, Context context ) 
				throws IOException, InterruptedException{
		    List<Object> list = new ArrayList<Object>();
		    for(Object obj : list){
		        
		    }
		}
	}
}
