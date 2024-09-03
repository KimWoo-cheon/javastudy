package com.smhrd.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor

@NoArgsConstructor
@RequiredArgsConstructor

@Getter

public class FarmhouseDTO  {
	
	 // 농가 식별자 
    private Double fh_idx;

    // 회원 아이디 
    @NonNull private String mb_id;
    // 농가 닉네임 
    @NonNull private String fh_nick;

    // 농가 명(사업 등록 인증용) 
    @NonNull private String fh_name;

    // 농가 대표자 
    @NonNull private String fh_owner;
    
    @NonNull private String fh_region;
    // 품목
    @NonNull private String agri_name;
    // 소개
    @NonNull private String fh_intro;


	

}
