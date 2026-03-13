package s6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2734o;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: s6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5791j extends DialogInterfaceOnCancelListenerC2734o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Dialog f44169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DialogInterface.OnCancelListener f44170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Dialog f44171s;

    public static C5791j z(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C5791j c5791j = new C5791j();
        Dialog dialog2 = (Dialog) AbstractC6056k.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c5791j.f44169q = dialog2;
        if (onCancelListener != null) {
            c5791j.f44170r = onCancelListener;
        }
        return c5791j;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2734o, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f44170r;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2734o
    public Dialog r(Bundle bundle) {
        Dialog dialog = this.f44169q;
        if (dialog != null) {
            return dialog;
        }
        w(false);
        if (this.f44171s == null) {
            this.f44171s = new AlertDialog.Builder((Context) AbstractC6056k.l(getContext())).create();
        }
        return this.f44171s;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2734o
    public void y(androidx.fragment.app.J j10, String str) {
        super.y(j10, str);
    }
}
