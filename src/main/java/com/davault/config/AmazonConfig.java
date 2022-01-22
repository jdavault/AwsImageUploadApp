package com.davault.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    /*
    //fullstack-amigo:5432
    joe.davault@p3SolutionsGroup
    Access Key ID:AKIAT4WVEXMYLTQJ27FC
    Secret Access Key: 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

    joe.davault@gmail.com
    Key: "AKIA4FIZUGAHWD5NCBHG",
    Secret: "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"
     */
    @Bean
    public AmazonS3 s3(){
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                //joe.davault@gmail.com
                "AKIAT4WVEXMYLTQJ27FC",
                "Wob35gDeyGF9zoNp7Udai28OZCcjriYbGfopGAX9"
        );
        return AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    };
}
