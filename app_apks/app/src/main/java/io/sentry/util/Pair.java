package io.sentry.util;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Pair<A, B> {
    private final A first;
    private final B second;

    public Pair(A a10, B b10) {
        this.first = a10;
        this.second = b10;
    }

    public A getFirst() {
        return this.first;
    }

    public B getSecond() {
        return this.second;
    }
}
