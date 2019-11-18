package hello;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;

public class EqSearch {
    

    private int distance;
    private int minmag;

    public EqSearch(){
    }


    public int getDistance() {
        return distance;
    }

    public int getMinmag() {
        return minmag;
    }


    public void setDistance(int distance) {
        this.distance = distance;
    }
    
    public void setMinmag(int minmag) {
        this.minmag = minmag;
    }

}

