package com.app.spring.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;




import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.app.spring.entidades.User;
import com.app.spring.entidades.UserLogin;
import java.util.List;


@Repository
public class UserDAOImpl implements UserDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void registrarUser(User user) {
		
		String sql = "INSERT INTO users values (?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] {
				user.getId(), user.getNombre(), user.getApellido(), user.getMail(), user.getPass()
				});
		
	}

	@Override
	public User loginUser(UserLogin userLogin) {
		String sql = " SELECT * FROM users where email='"+userLogin.getMail()+"' AND pass='"+ userLogin.getPass()+ "'";
		
                List <User> users = jdbcTemplate.query(sql, new UserMapper());              
 
                return users.size() > 0 ? users.get(0) : null;
	}
}    

        class UserMapper implements RowMapper<User> {

        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				User user = new User();
				user.setId(rs.getInt(1));
				user.setNombre(rs.getString(2));
				user.setApellido(rs.getString(3));
				user.setMail(rs.getString(4));
				user.setPass(rs.getString(5));
				return user;
			}
    }
 


	
