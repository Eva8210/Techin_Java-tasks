import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PhilatelistImpl implements Philatelist {

    private List<PostStamp> postStamps;


    public PhilatelistImpl() {
        postStamps = new ArrayList<>();
    }

    @Override
    public void addToCollection(PostStamp postStamp) {

            if(postStamp == null) throw new IllegalArgumentException();
            if(postStamp.getName() == null) throw new IllegalArgumentException();
            if (postStamp.getName().isEmpty()) throw new IllegalArgumentException();
            if(!postStamps.contains(postStamp)) {
                postStamps.add(postStamp);
            }

    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return postStamps.size();
    }

    @Override
    public void printAllPostStampNames() {

        for (PostStamp theName : postStamps) {
            System.out.println(theName.getName());
        }
    }

    @Override
    public void printPostStampsWithPriceGreaterThan(double price) {
        for (PostStamp theName : postStamps) {
            if(theName.getMarketPrice() > price) {
                System.out.println(theName.getName());
            }
        }
    }

    @Override
    public boolean isPostStampInCollection(PostStamp postStamp) {
        if (postStamps.contains(postStamp)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isPostStampWithNameInCollection(String name) {
        for (PostStamp theName : postStamps) {
            if(theName.getName().equals(name)) {
                return true;

            }
        }
        return false;
    }

    @Override
    public double calculateTotalMarketPrice() {
        double sum = 0;
        for (PostStamp theName : postStamps) {
             sum += theName.getMarketPrice();
        }
        return sum;
    }

    @Override
    public double getAveragePostStampPrice() {
        double sum = 0;
        double avg = 0;
        for (PostStamp theName : postStamps) {
            sum += theName.getMarketPrice();
            avg = sum /postStamps.size();
        }
        return avg;

    }

    @Override
    public PostStamp getTheMostExpensivePostStampByMarketValue() {
        double largestNumber = 0;
        PostStamp largestNumberName = null;
        for (PostStamp theName : postStamps) {
            if (theName.getMarketPrice() >largestNumber) {
                largestNumber = theName.getMarketPrice();
                largestNumberName = theName;
            }
        }
        return largestNumberName;
    }

    @Override
    public List<PostStamp> findPostStampsByNameContaining(String nameFragment) {
        List<PostStamp> newList = new ArrayList<>();
        for (PostStamp containsName : postStamps) {
            String name = containsName.getName();
            if(name.contains(nameFragment)) {
                newList.add(containsName);
            }
        }
        return newList;
    }

    @Override
    public List<PostStamp> getSortedPostStampsByName() {

        Collections.sort(postStamps, Comparator.comparing(PostStamp::getName));

        return postStamps;
    }
}
