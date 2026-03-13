package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f48676a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(h hVar);

        Object b();

        void c(CaptureRequest captureRequest);
    }

    public o(int i10, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f48676a = new a(i10, list, executor, stateCallback);
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((i) it.next()).h());
        }
        return arrayList;
    }

    public static List d(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i.i((OutputConfiguration) it.next()));
        }
        return arrayList;
    }

    public void a(h hVar) {
        this.f48676a.a(hVar);
    }

    public void b(CaptureRequest captureRequest) {
        this.f48676a.c(captureRequest);
    }

    public Object e() {
        return this.f48676a.b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f48676a.equals(((o) obj).f48676a);
        }
        return false;
    }

    public int hashCode() {
        return this.f48676a.hashCode();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SessionConfiguration f48677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f48678b;

        public a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f48677a = sessionConfiguration;
            this.f48678b = Collections.unmodifiableList(o.d(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // z.o.b
        public void a(h hVar) {
            this.f48677a.setInputConfiguration((InputConfiguration) hVar.a());
        }

        @Override // z.o.b
        public Object b() {
            return this.f48677a;
        }

        @Override // z.o.b
        public void c(CaptureRequest captureRequest) {
            this.f48677a.setSessionParameters(captureRequest);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f48677a, ((a) obj).f48677a);
            }
            return false;
        }

        public int hashCode() {
            return this.f48677a.hashCode();
        }

        public a(int i10, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, o.c(list), executor, stateCallback));
        }
    }
}
