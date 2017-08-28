package com.action.amp.alexa.interfaces.speechrecognizer;

import com.action.amp.alexa.interfaces.AvsItem;

/**
 * {@link com.action.amp.alexa.data.Directive} to prompt the user for a speech input
 *
 * {@link com.action.amp.alexa.data.Directive} response item type parsed so we can properly
 * deal with the incoming commands from the Alexa server.
 *
 * @author will on 5/21/2016.
 */
public class AvsExpectSpeechItem extends AvsItem {
    long timeoutInMiliseconds;

    public AvsExpectSpeechItem(){
        this(null, 2000);
    }

    public AvsExpectSpeechItem(String token, long timeoutInMiliseconds){
        super(token);
        this.timeoutInMiliseconds = timeoutInMiliseconds;
    }

    public long getTimeoutInMiliseconds() {
        return timeoutInMiliseconds;
    }
}
