package gd;

import Bc.f;
import gc.C4179C;
import gc.C4207u;
import gc.M;
import hd.AbstractC4297a;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: gd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4209a extends AbstractC4297a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0466a f35616g = new C0466a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C4209a f35617h = new C4209a(1, 0, 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C4209a f35618i = new C4209a(new int[0]);

    /* JADX INFO: renamed from: gd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0466a {
        public /* synthetic */ C0466a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C4209a a(InputStream stream) {
            AbstractC4862t.e(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            f fVar = new f(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(C4207u.v(fVar, 10));
            Iterator it = fVar.iterator();
            while (it.hasNext()) {
                ((M) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrU0 = C4179C.U0(arrayList);
            return new C4209a(Arrays.copyOf(iArrU0, iArrU0.length));
        }

        public C0466a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4209a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        AbstractC4862t.e(numbers, "numbers");
    }

    public boolean h() {
        return f(f35617h);
    }
}
