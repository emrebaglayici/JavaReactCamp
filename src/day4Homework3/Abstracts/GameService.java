package day4Homework3.Abstracts;

import day4Homework3.Entities.Game;
import day4Homework3.Entities.Member;

public interface GameService {
    void makeSale(Member member, Game game);
    void discountSale(Member member,Game game);
}
