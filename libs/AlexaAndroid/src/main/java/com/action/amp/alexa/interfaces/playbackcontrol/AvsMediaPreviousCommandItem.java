package com.action.amp.alexa.interfaces.playbackcontrol;

import com.action.amp.alexa.interfaces.AvsItem;

/**
 * {@link com.action.amp.alexa.data.Directive} to send a previous command to any app playing media
 *
 * This directive doesn't seem applicable to mobile applications
 *
 * @author will on 5/31/2016.
 */

public class AvsMediaPreviousCommandItem extends AvsItem {
    public AvsMediaPreviousCommandItem(String token) {
        super(token);
    }
}
