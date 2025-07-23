package MediatorDesignPattern;

public class Main {
    public static void main(String args[]){
        IMediator auction = new Auction();
        Icolleague bidder1 = new Bidder("1", auction);
        Icolleague bidder2 = new Bidder("2", auction);

        bidder1.placeBid(100);
        bidder2.placeBid(200);

    }
}
