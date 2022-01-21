package day4Homework3.Abstracts;

import day4Homework3.Entities.Member;

public interface MemberService {
    void registerMember(Member member);
    void updateMember(Member member);
    void deleteMember(Member member);
}
