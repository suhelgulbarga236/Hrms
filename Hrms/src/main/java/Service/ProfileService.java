package Service;

import org.springframework.stereotype.Service;

import Entity.Profile;

@Service
public interface ProfileService {

	public Profile createProfile(Profile profile);

}
