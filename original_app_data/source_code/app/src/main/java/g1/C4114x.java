package g1;

import fc.C4015H;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: g1.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4114x implements c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f35097d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f35098e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f35099f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4087W f35100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f35101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC6082a f35102c;

    /* JADX INFO: renamed from: g1.x$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public C4114x(InterfaceC4087W serializer, vc.l coordinatorProducer, InterfaceC6082a produceFile) {
        AbstractC4862t.e(serializer, "serializer");
        AbstractC4862t.e(coordinatorProducer, "coordinatorProducer");
        AbstractC4862t.e(produceFile, "produceFile");
        this.f35100a = serializer;
        this.f35101b = coordinatorProducer;
        this.f35102c = produceFile;
    }

    public static final InterfaceC4069D d(File it) {
        AbstractC4862t.e(it, "it");
        return AbstractC4071F.a(it);
    }

    public static final C4015H e(File file) {
        synchronized (f35099f) {
            f35098e.remove(file.getAbsolutePath());
        }
        return C4015H.f34254a;
    }

    @Override // g1.c0
    public d0 a() throws IOException {
        final File canonicalFile = ((File) this.f35102c.invoke()).getCanonicalFile();
        synchronized (f35099f) {
            String absolutePath = canonicalFile.getAbsolutePath();
            Set set = f35098e;
            if (set.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            AbstractC4862t.b(absolutePath);
            set.add(absolutePath);
        }
        AbstractC4862t.b(canonicalFile);
        return new C4115y(canonicalFile, this.f35100a, (InterfaceC4069D) this.f35101b.invoke(canonicalFile), new InterfaceC6082a() { // from class: g1.w
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C4114x.e(canonicalFile);
            }
        });
    }

    public /* synthetic */ C4114x(InterfaceC4087W interfaceC4087W, vc.l lVar, InterfaceC6082a interfaceC6082a, int i10, AbstractC4854k abstractC4854k) {
        this(interfaceC4087W, (i10 & 2) != 0 ? new vc.l() { // from class: g1.v
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C4114x.d((File) obj);
            }
        } : lVar, interfaceC6082a);
    }
}
