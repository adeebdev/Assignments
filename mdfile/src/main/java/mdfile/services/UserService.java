package mdfile.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;

import mdfile.dto.UserDTO;
import mdfile.repository.UserRepo;

@Service("UserService")
@Component
public class UserService {

	@Autowired
	private UserRepo userRepo;

	@Transactional
	public UserDTO getUserDetail() {
		return userRepo.getUserDetail();

	}

	public UserDTO getUserDetail(String username) {
		return userRepo.getUserDetail(username);
	}
}
