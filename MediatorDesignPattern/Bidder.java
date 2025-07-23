package MediatorDesignPattern;

public class Bidder implements Icolleague{
    IMediator auctionMediator;
    private String name;

    Bidder(String name, IMediator mediator){
        this.name = name;
        auctionMediator = mediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void placeBid(int bidAmount){
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void getBidNotification(int bidAmount){
        System.out.println(name + " Bid Of Amount " + bidAmount + "recieved.");
    }

}
