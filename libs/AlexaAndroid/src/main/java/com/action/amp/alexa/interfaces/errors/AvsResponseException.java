package com.action.amp.alexa.interfaces.errors;

import com.action.amp.alexa.data.Directive;
import com.action.amp.alexa.interfaces.AvsItem;

/**
 * Created by will on 6/26/2016.
 */

public class AvsResponseException extends AvsItem {
    Directive directive;
    public AvsResponseException(Directive directive) {
        super(null);
        this.directive = directive;
    }

    public Directive getDirective() {
        return directive;
    }
}
