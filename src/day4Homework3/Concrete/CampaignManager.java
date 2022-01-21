package day4Homework3.Concrete;

import day4Homework3.Abstracts.CampaignService;
import day4Homework3.Entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println(campaign.getName()+" kampanyası eklenmiştir");
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("Id si "+campaign.getId()+" olan kampanya silinmiştir");
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("Kampanya güncellenmiştir"+campaign.getName());
    }
}
