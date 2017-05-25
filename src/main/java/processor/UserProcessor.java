package processor;

import org.springframework.batch.item.ItemProcessor;

import domain.User;

public class UserProcessor implements ItemProcessor<User, User> {

	@Override
	public User process(User user) throws Exception {
		// TODO Auto-generated method stub
		return user;
	}

}
