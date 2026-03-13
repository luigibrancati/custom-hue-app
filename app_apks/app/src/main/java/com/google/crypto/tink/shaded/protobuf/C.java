package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f31384a;

    public C(Iterator it) {
        this.f31384a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f31384a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f31384a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f31384a.remove();
    }
}
