package com.google.ar.core;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface Trackable {
    Anchor createAnchor(Pose pose);

    Collection<Anchor> getAnchors();

    TrackingState getTrackingState();
}
