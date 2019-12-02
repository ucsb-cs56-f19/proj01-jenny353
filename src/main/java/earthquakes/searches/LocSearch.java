package earthquakes.searches;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;

public class LocSearch {
    

    private int location;

    public LocSearch(){
    }


    public int getLocation() {
        return location;
    }


    public void setLocation(int location) {
        this.location = location;
    }

}

