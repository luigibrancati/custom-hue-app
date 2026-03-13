package s6;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: s6.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5805x extends AbstractBinderC5802u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakReference f44179c = new WeakReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f44180b;

    public AbstractBinderC5805x(byte[] bArr) {
        super(bArr);
        this.f44180b = f44179c;
    }

    public abstract byte[] I6();

    @Override // s6.AbstractBinderC5802u
    public final byte[] K() {
        byte[] bArrI6;
        synchronized (this) {
            try {
                bArrI6 = (byte[]) this.f44180b.get();
                if (bArrI6 == null) {
                    bArrI6 = I6();
                    this.f44180b = new WeakReference(bArrI6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrI6;
    }
}
