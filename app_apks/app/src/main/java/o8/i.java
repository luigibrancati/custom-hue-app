package o8;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f41261a = new i() { // from class: o8.h
        @Override // o8.i
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
