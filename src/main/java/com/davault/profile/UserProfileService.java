package com.davault.profile;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Service
public class UserProfileService {

    private final UserProfileDAO userProfileDAO;

    public List<UserProfile> getUserProfiles(){
        return userProfileDAO.getUserProfiles();
    }


    public void uploadUserProfileImage(UUID userprofileId, MultipartFile file) {
        //1. Check if image is empty
        //2. Check if file is an image
        //3. Check if user exists in DB
        //4. Grab some metadata from file if necessary and exists
        //5. Store image in s3 and update database with S3 image line

    }
}
