package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/score")
public class ScoreResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Score> score() {
        return Score.total();
    }
}
