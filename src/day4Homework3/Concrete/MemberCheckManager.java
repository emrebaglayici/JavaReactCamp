package day4Homework3.Concrete;

import day4Homework3.Abstracts.MemberCheckService;
import day4Homework3.Entities.Member;

public class MemberCheckManager implements MemberCheckService {
    @Override
    public boolean isValid(Member member) {
        if(member.getFirstName().equals("emre"))
            System.out.println("Validation True");
        else{
            System.out.println("Validasyon yapılamadı");
            return false;
        }
        return true;
    }

}
