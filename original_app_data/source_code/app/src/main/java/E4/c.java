package E4;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c extends a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public String f3308U = "$groupidentify";

    @Override // E4.a
    public String F0() {
        return this.f3308U;
    }

    @Override // E4.a
    public boolean J0() {
        return (H0() == null || G0() == null) ? false : true;
    }

    @Override // E4.a
    public void M0(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.f3308U = str;
    }
}
