package com.example.gwaza.agriproject.functions;

import com.example.gwaza.agriproject.models.Help;

/**
 * Created by gwaza on 1/21/2019.
 */

public class HelpHandler {

    private Help help;

    public HelpHandler(Help help) {
        this.help = help;
    }

    public String getSolution(Help help){

        String answer="";
        String issue1 = help.getIssue1();
        String issue2 =help.getIssue2();
        String issue3 =help.getIssue3();


        if(issue1.equals("Goat")){
            //proceed  to goat problems and set answer
        }else if(issue1.equals("feeds")){
            //proceed  to feeds problems and set answer
        }

        return  "Thanks for contacting us,  The answer to your question is "+answer;
    }
}
