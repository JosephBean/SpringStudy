package com.java.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.java.dto.Member;

@Mapper
public interface MemberMapper {

	@Select("SELECT * FROM `member` WHERE id = #{id} AND pwd = #{pwd}")
	public Member findByIdAndPwd(Member member);
	
}
