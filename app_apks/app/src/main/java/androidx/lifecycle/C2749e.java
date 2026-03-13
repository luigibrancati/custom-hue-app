package androidx.lifecycle;

import androidx.lifecycle.AbstractC2754j;
import fc.C4032o;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2749e implements InterfaceC2756l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultLifecycleObserver f23454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2756l f23455b;

    /* JADX INFO: renamed from: androidx.lifecycle.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23456a;

        static {
            int[] iArr = new int[AbstractC2754j.a.values().length];
            try {
                iArr[AbstractC2754j.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2754j.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2754j.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC2754j.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC2754j.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC2754j.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC2754j.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f23456a = iArr;
        }
    }

    public C2749e(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC2756l interfaceC2756l) {
        AbstractC4862t.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f23454a = defaultLifecycleObserver;
        this.f23455b = interfaceC2756l;
    }

    @Override // androidx.lifecycle.InterfaceC2756l
    public void d(InterfaceC2758n source, AbstractC2754j.a event) {
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(event, "event");
        switch (a.f23456a[event.ordinal()]) {
            case 1:
                this.f23454a.onCreate(source);
                break;
            case 2:
                this.f23454a.onStart(source);
                break;
            case 3:
                this.f23454a.onResume(source);
                break;
            case 4:
                this.f23454a.onPause(source);
                break;
            case 5:
                this.f23454a.onStop(source);
                break;
            case 6:
                this.f23454a.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new C4032o();
        }
        InterfaceC2756l interfaceC2756l = this.f23455b;
        if (interfaceC2756l != null) {
            interfaceC2756l.d(source, event);
        }
    }
}
