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

    }
}
