package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum SemanticLabel {
    UNLABELED(0),
    SKY(1),
    BUILDING(2),
    TREE(3),
    ROAD(4),
    SIDEWALK(5),
    TERRAIN(6),
    STRUCTURE(7),
    OBJECT(8),
    VEHICLE(9),
    PERSON(10),
    WATER(11);

    final int nativeCode;

    SemanticLabel(int i10) {
        this.nativeCode = i10;
    }

    public static SemanticLabel forNumber(int i10) {
        for (SemanticLabel semanticLabel : values()) {
            if (semanticLabel.nativeCode == i10) {
                return semanticLabel;
            }
        }
        throw new FatalException(p.b((byte) 49, i10, "Unexpected value for native SemanticLabel, value="));
    }
}
