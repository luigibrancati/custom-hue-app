package fc;

import io.flutter.embedding.android.KeyboardMap;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: fc.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4043z implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34293b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34294a;

    /* JADX INFO: renamed from: fc.z$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C4043z(int i10) {
        this.f34294a = i10;
    }

    public static final /* synthetic */ C4043z a(int i10) {
        return new C4043z(i10);
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof C4043z) && i10 == ((C4043z) obj).s();
    }

    public static int p(int i10) {
        return Integer.hashCode(i10);
    }

    public static String q(int i10) {
        return String.valueOf(((long) i10) & KeyboardMap.kValueMask);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC4017J.a(s(), ((C4043z) obj).s());
    }

    public boolean equals(Object obj) {
        return j(this.f34294a, obj);
    }

    public int hashCode() {
        return p(this.f34294a);
    }

    public final /* synthetic */ int s() {
        return this.f34294a;
    }

    public String toString() {
        return q(this.f34294a);
    }

    public static int b(int i10) {
        return i10;
    }
}
