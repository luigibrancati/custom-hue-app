package K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class B0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6832a;

    public B0(int i10) {
        super(a(i10));
        this.f6832a = i10;
    }

    public static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
