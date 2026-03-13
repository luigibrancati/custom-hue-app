package la;

import java.util.UUID;

/* JADX INFO: renamed from: la.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4972d extends C4974f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f39993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39994b;

    public C4972d(UUID uuid, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Characteristic ");
        sb2.append(uuid);
        sb2.append(" notification already set to ");
        sb2.append(z10 ? "indication" : "notification");
        super(sb2.toString());
        this.f39993a = uuid;
        this.f39994b = z10;
    }
}
