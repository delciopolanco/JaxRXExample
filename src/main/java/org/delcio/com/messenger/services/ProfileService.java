package org.delcio.com.messenger.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.delcio.com.messenger.database.DatabaseClass;
import org.delcio.com.messenger.model.Profile;

public class ProfileService {
	private static Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService() {
		profiles.put("Adming", new Profile(1,  "Delcio Polanco"));
	}
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile updateProfile(Profile profile) {
		if(profile.getId() <= 0) {
			return null;
		}
		
		profiles.put(profile.getName(), profile);
		
		return profile;
	}

	public Profile removeProfile(long profileId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);	
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getName(), profile);
		
		return profile;
	}

}
