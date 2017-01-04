package com.amazons3;

import java.io.File;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

public class s3Upload {
	
	public static void main(String []s){
		AWSCredentials credentials = new BasicAWSCredentials("AKIAJN6O4XIP2IDVE2EQ", "s/pg8vxxbENbAG9G18T+h8+UMCgLx+vt8lnCzhaU");
		AmazonS3 s3Client = new AmazonS3Client(credentials);
		//s3Client.putObject("nvaultstorage", "Resume_Nandini", new File("/Users/nisumconsulting/Downloads/Resume_NandiniSuggula_Nisum.docx"));
		s3Client.putObject("nvaultstorage","sample",new File("/Users/nisumconsulting/Downloads/singup"));
		System.out.println("File is uploaded");
	}

}
