package reverse_eng.com.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import reverse_eng.com.model.User;

@Repository
public class AddUserRepository {

	@Autowired
	private HibernateTemplate template;

	public List<User> submitRepo(User user) {
		ArrayList list = new ArrayList();
		template.save(user);
		list = (ArrayList) template.loadAll(User.class);
		if (list==null) {
			return null;
		} else {
			return list;
		}
	}
}
