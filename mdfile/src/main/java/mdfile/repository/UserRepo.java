package mdfile.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mdfile.dto.UserDTO;

@Repository("UserRepo")
public class UserRepo {

	
	public UserDTO getUserDetail() {
		return null;
	}

	public UserDTO getUserDetail(String username) {
		UserDTO userDTO=new UserDTO();
		List<UserDTO> userList=prepareUserData();
		for(UserDTO userDTO1:userList){
			if(userDTO1.getUsername().equalsIgnoreCase(username)){
				userDTO=userDTO1;
				break;
			}
		}
		return userDTO;
	}
	
	private List<UserDTO> prepareUserData() {
		List<UserDTO> userDTOs= new ArrayList<>();
		UserDTO userDTO=new UserDTO();
		userDTO.setName("Bill Gates");
		userDTO.setUsername("bill");
		
		UserDTO userDTO2=new UserDTO();
		userDTO2.setName("Elon Musk");
		userDTO2.setUsername("elon");
		
		userDTOs.add(userDTO);
		userDTOs.add(userDTO2);
		return userDTOs;
	}
}
