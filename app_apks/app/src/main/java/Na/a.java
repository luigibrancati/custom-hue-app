package Na;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {
    @Override // Na.f
    public void error(String str, String str2, Object obj) {
        l().error(str, str2, obj);
    }

    public abstract f l();

    @Override // Na.f
    public void success(Object obj) {
        l().success(obj);
    }
}
