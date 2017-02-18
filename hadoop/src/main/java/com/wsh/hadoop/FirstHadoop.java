package com.wsh.hadoop;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;


public class FirstHadoop {
	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		Configuration conf = new Configuration();
		conf.set("dfs.replication","2");
		FileSystem hdfs = FileSystem.get(new URI("hdfs://192.168.48.130:9000"), conf,"root");
		hdfs.copyToLocalFile(false,new Path("/test_shell"), new Path("D:/"), true);
		//boolean flag = hdfs.mkdirs(new Path("/hadoop-client"));
		//System.out.println(flag);
	}

}







