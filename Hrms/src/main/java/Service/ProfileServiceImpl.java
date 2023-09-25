package Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.Tech.Hrms.exceptions.UserAlreadyExistException;

import Entity.Profile;
import Repository.ProfileRepo;

public class ProfileServiceImpl implements ProfileService {

	@Autowired
	ProfileRepo profileRepo;

	@Override
	public Profile createProfile(Profile profile) {
		// TODO Auto-generated method stub
		try {
			return profileRepo.save(profile);
		} catch (Exception e) {
		
			throw new UserAlreadyExistException("user already exist");
		} 	
	}

}
