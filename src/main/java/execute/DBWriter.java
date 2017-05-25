package execute;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;

import domain.User;

public class DBWriter implements ItemWriter {
	private JdbcTemplate jdbcTemplate;
	private ItemReader itemReader;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setItemReader(ItemReader itemReader) {
		this.itemReader = itemReader;
	}

	@Override
	public void write(List arg0) throws Exception {
		// TODO Auto-generated method stub
		User user = null;
		while (true) {
			user=(User)(itemReader.read());
			if (user == null) {
				break;
			}
			jdbcTemplate.execute("insert into batch_user_list values(" + user.getNo() + "," + user.getName() + ")");

		}
	}
}
