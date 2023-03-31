package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int forward = forwardCount(startIndex, selection);
        //backward
        int back = backwardCount(startIndex, selection);
        if(forward < back){
            return forward;
        }else{
            return back;
        }
    }
    public Integer forwardCount(Integer startIndex, String selection){
        int forwardCounter = 0;
        for (int i = startIndex; !playList[i].contains(selection); i++) {
            if(i == playList.length-1){
                i = -1;
            }
            if(!playList[i].matches(selection)){
            forwardCounter++;
            }
        }
        return forwardCounter;
    }
    public Integer backwardCount(Integer startIndex, String selection){
        int backCounter = 0;
        for (int i = startIndex; !playList[i].contains(selection); i--) {
            if(i == 0){
                i = playList.length;
            }
                backCounter++;
        }
        return backCounter;
    }

}
