package l3;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: renamed from: l3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4877c extends Closeable {
    int D0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    void P();

    void Q(String str, Object[] objArr);

    void R();

    boolean R0();

    Cursor T0(InterfaceC4880f interfaceC4880f);

    boolean U0();

    void V();

    String getPath();

    boolean isOpen();

    void r0(int i10);

    g u0(String str);

    void v();

    List y();

    default void y0() {
        v();
    }

    void z(String str);
}
