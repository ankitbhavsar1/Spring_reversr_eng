package reverse_eng.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reverse_eng.com.model.User;
import reverse_eng.com.repository.AddUserRepository;

@Service
public class AddUserService {

	@Autowired
	private AddUserRepository addUserRepository;

	public List<User> submitService(User user) {
		List list = new ArrayList();
		list = null;
		list = addUserRepository.submitRepo(user);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}
}
