package v4;

import com.amplitude.android.internal.locators.ComposeViewTargetLocator;
import fc.C4029l;
import fc.InterfaceC4028k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;
import vc.l;
import z4.C6509h;

/* JADX INFO: renamed from: v4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6040c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6040c f45772a = new C6040c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC4028k f45773b = C4029l.b(a.f45774a);

    /* JADX INFO: renamed from: v4.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f45774a = new a();

        /* JADX INFO: renamed from: v4.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0625a extends v implements l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0625a f45775a = new C0625a();

            public C0625a() {
                super(1);
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(A4.a logger) {
                AbstractC4862t.e(logger, "logger");
                ArrayList arrayList = new ArrayList();
                if (C6509h.b(C6509h.f48763a, null, 1, null)) {
                    arrayList.add(new ComposeViewTargetLocator(logger));
                }
                arrayList.add(new C6038a());
                return arrayList;
            }
        }

        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l invoke() {
            return C0625a.f45775a;
        }
    }

    public final l a() {
        return (l) f45773b.getValue();
    }
}
