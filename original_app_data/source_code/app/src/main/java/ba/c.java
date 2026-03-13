package ba;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25478a = 1;

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.f25478a != 1 ? "Unknown error" : "Package not available";
        StringBuilder sb2 = new StringBuilder(str.length() + 17);
        sb2.append("LoaderException{");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
