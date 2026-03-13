package b2;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f25049a = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements n {
        @Override // b2.n
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // b2.n
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // b2.n
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
