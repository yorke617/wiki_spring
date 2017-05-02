package com.kiwi.baseBS;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class BaseService {
	@Resource(name="jdbc")
	public JdbcTemplate jdbc;

}
