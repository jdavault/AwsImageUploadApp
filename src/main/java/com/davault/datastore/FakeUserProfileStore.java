package com.davault.datastore;

import com.davault.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "jdavault", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "ldavault", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
