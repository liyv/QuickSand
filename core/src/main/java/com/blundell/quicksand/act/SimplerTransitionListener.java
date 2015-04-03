package com.blundell.quicksand.act;

import android.transition.Transition;

/**
 * A simpler listener that only enforces to override start
 */
abstract class SimplerTransitionListener implements Transition.TransitionListener {
    @Override
    public abstract void onTransitionStart(Transition transition);

    @Override
    public void onTransitionCancel(Transition transition) {
        // not-used
    }

    @Override
    public void onTransitionPause(Transition transition) {
        // not-used
    }

    @Override
    public void onTransitionResume(Transition transition) {
        // not-used
    }

    @Override
    public void onTransitionEnd(Transition transition) {
        // not-used
    }
}
