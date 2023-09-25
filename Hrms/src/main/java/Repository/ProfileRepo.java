package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Profile;

public interface ProfileRepo extends JpaRepository<Profile, Long>{

}
