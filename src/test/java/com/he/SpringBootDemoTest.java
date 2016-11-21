package com.he;

import com.he.domain.Merchant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by hzq on 16/11/15.
 */
@SpringBootTest()
@RunWith(SpringRunner.class)
public class SpringBootDemoTest {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	public void test1(){
		String sql = "select * from merchant limit 1";

		Merchant merchant = jdbcTemplate.queryForObject(sql, new RowMapper<Merchant>() {
			@Override
			public Merchant mapRow(ResultSet rs, int rowNum) throws SQLException {
				Merchant m = new Merchant();
				m.setId(rs.getLong(1));

				return m;
			}
		});
		System.out.println("-===============");
		System.out.println(merchant.getStatus());
	}

}
