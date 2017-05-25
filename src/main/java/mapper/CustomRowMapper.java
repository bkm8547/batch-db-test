package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import domain.User;

public class CustomRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=new User();
		user.setNo(rs.getLong("no"));
		user.setName(rs.getString("name"));
		return user;
	}

}
