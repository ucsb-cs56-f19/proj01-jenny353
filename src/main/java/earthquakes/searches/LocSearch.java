package earthquakes.searches;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;

public class LocSearch {
    

    private String location;

    public LocSearch(){
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }

}

