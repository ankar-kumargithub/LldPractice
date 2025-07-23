package MediatorDesignPattern;

public interface IMediator {
    void addBidder(Icolleague bidder);
    void placeBid(Icolleague bidder, int bidAmount);
}
