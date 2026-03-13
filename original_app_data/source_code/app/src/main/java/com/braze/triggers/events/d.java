package com.braze.triggers.events;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f28713f;

    public d(String str) {
        this.f28712e = i.a(str);
    }

    @Override // com.braze.triggers.events.b
    public final String a() {
        return "iam_click";
    }

    public d(String str, String str2) {
        this.f28712e = i.a(str);
        this.f28713f = str2;
    }
}
