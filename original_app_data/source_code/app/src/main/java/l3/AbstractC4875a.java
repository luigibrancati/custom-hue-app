package l3;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: l3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4875a implements InterfaceC4880f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0520a f39838a = new C0520a(null);

    /* JADX INFO: renamed from: l3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0520a {
        public /* synthetic */ C0520a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final void a(InterfaceC4879e interfaceC4879e, int i10, Object obj) {
            if (obj == null) {
                interfaceC4879e.t(i10);
                return;
            }
            if (obj instanceof byte[]) {
                interfaceC4879e.s(i10, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                interfaceC4879e.I(i10, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                interfaceC4879e.I(i10, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                interfaceC4879e.r(i10, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                interfaceC4879e.r(i10, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                interfaceC4879e.r(i10, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                interfaceC4879e.r(i10, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                interfaceC4879e.s0(i10, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                interfaceC4879e.r(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(InterfaceC4879e statement, Object[] objArr) {
            AbstractC4862t.e(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(statement, i10, obj);
            }
        }

        public C0520a() {
        }
    }
}
