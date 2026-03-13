package E;

import L.InterfaceC1093d0;
import L.InterfaceC1097f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC1093d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f2782a;

        public a(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f2782a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // L.InterfaceC1093d0
        public List a() {
            return this.f2782a;
        }
    }

    public static InterfaceC1093d0 a(InterfaceC1097f0... interfaceC1097f0Arr) {
        return new a(Arrays.asList(interfaceC1097f0Arr));
    }

    public static InterfaceC1093d0 b() {
        return a(new InterfaceC1097f0.a());
    }
}
