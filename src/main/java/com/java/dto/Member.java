package com.java.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {

	private int no;
	private String id;
	private String name;
	private String pwd;
	private String email;
	private String number;
	private String gender;
	private boolean delYn;
	private LocalDate Sdate;
	private LocalDateTime Ldate;
	
}
