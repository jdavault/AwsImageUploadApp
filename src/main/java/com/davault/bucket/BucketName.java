package com.davault.bucket;

public enum BucketName {
    PROFILE_IMAGE("fullstack-amigo-image-upload"); //us-west-1

    private final String bucketName;

    BucketName(String bucketName){
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
