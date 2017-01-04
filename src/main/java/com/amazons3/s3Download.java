package com.amazons3;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.util.IOUtils;

public class s3Download {
	
	public static void main(String []s) throws IOException{
		AWSCredentials credentials = new BasicAWSCredentials("AKIAJN6O4XIP2IDVE2EQ", "s/pg8vxxbENbAG9G18T+h8+UMCgLx+vt8lnCzhaU");
		AmazonS3 s3Client = new AmazonS3Client(credentials);
		S3Object object = s3Client.getObject(new GetObjectRequest("nvaultstorage", "sample"));
//		InputStream is = object.getObjectContent();
//		BufferedReader reader = new BufferedReader(new 
//        		InputStreamReader(is));
//        while (true) {
//            String line = reader.readLine();
//            if (line == null) break;
//
//            System.out.println("    " + line);
//        }
		BufferedOutputStream stream =
		          new BufferedOutputStream(new FileOutputStream(new File("/Users/nisumconsulting/s3test.txt")));
		      stream.write(IOUtils.toByteArray(object.getObjectContent()));
		      stream.close();
	}

}
