package com.wan.nss.biz.member;

public interface MemberService {
	public boolean insert(MemberVO vo);
	public boolean update(MemberVO vo);
	public boolean delete(MemberVO vo);
	public MemberVO selectOne(MemberVO vo);
}
