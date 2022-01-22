package com.davault.profile;

import com.davault.datastore.FakeUserProfileStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDAO {

    private final FakeUserProfileStore fakeUserProfileStore;

    @Autowired
    public UserProfileDAO(FakeUserProfileStore fakeUserProfileStore) {
        this.fakeUserProfileStore = fakeUserProfileStore;
    }

    public List<UserProfile> getUserProfiles(){
        return fakeUserProfileStore.getUserProfiles();
    }
}
