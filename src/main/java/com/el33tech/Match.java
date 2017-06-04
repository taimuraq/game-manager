package com.el33tech;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by taimurqureshi on 6/4/17.
 */
public class Match implements Serializable {
    private static final long serialVersionUID = 4088487675653936764L;

    private String matchId;
    private List<String> teams;
    private Date date;
    private String winningTeam;

}
