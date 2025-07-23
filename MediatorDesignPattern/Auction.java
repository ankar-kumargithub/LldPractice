package MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements IMediator {
    List<Icolleague> bidders = new ArrayList<>();

    @Override
    public void addBidder(Icolleague bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Icolleague bidder, int bidAmount){
        for(Icolleague currBidder : bidders){
            if(currBidder.getName() != bidder.getName()){
                currBidder.getBidNotification(bidAmount);
            }
        }
    }
}
