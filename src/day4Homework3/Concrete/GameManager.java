package day4Homework3.Concrete;

import day4Homework3.Abstracts.CampaignService;
import day4Homework3.Abstracts.GameService;
import day4Homework3.Entities.Campaign;
import day4Homework3.Entities.Game;
import day4Homework3.Entities.Member;

public class GameManager implements GameService {
    private Campaign campaign;

    public GameManager(Campaign campaign) {
        this.campaign = campaign;
    }

    @Override
    public void discountSale(Member member, Game game) {
        System.out.println("Fiyatı : "+game.getPrice()
                            +" olan oyuna yüzde "+campaign.getDiscountRate()
                            +" indirim yapılarak satılmıştır = "+(game.getPrice()-(game.getPrice())* campaign.getDiscountRate()));
    }

    @Override
    public void makeSale(Member member, Game game) {
        System.out.println(member.getFirstName()+" tarafından " +game.getGameName()+" oyunu alındı");
    }
}
