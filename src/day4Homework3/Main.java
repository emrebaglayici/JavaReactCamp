package day4Homework3;

import day4Homework3.Concrete.CampaignManager;
import day4Homework3.Concrete.GameManager;
import day4Homework3.Concrete.MemberCheckManager;
import day4Homework3.Concrete.MemberManager;
import day4Homework3.Entities.Campaign;
import day4Homework3.Entities.Game;
import day4Homework3.Entities.Member;

public class Main {
    public static void main(String[] args) {
        MemberCheckManager memberCheckManager=new MemberCheckManager();
        MemberManager manager=new MemberManager(memberCheckManager);
        Member member=new Member(123,"emre","Bağlayici", 1996);
        Game game=new Game("Gta5",250);


        /*manager.registerMember(member);
        manager.updateMember(member);
        manager.deleteMember(member);*/

        Campaign campaign=new Campaign(1,"KaraCuma",0.20);
        /*CampaignManager campaignManager=new CampaignManager();
        campaignManager.addCampaign(campaign);*/

        GameManager gameManager=new GameManager(campaign);
        gameManager.discountSale(member,game);
        /*gameManager.makeSale(member,game);*/
    }
}
