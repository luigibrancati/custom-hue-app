package com.fasterxml.jackson.core.sym;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class Name {
    protected final int _hashCode;
    protected final String _name;

    public Name(String str, int i10) {
        this._name = str;
        this._hashCode = i10;
    }

    public abstract boolean equals(int i10);

    public abstract boolean equals(int i10, int i11);

    public abstract boolean equals(int i10, int i11, int i12);

    public boolean equals(Object obj) {
        return obj == this;
    }

    public abstract boolean equals(int[] iArr, int i10);

    public String getName() {
        return this._name;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public String toString() {
        return this._name;
    }
}
