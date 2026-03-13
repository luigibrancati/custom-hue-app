package s6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: s6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class DialogFragmentC5784c extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dialog f44151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f44152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Dialog f44153c;

    public static DialogFragmentC5784c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC5784c dialogFragmentC5784c = new DialogFragmentC5784c();
        Dialog dialog2 = (Dialog) AbstractC6056k.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC5784c.f44151a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC5784c.f44152b = onCancelListener;
        }
        return dialogFragmentC5784c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f44152b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f44151a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f44153c == null) {
            this.f44153c = new AlertDialog.Builder((Context) AbstractC6056k.l(getActivity())).create();
        }
        return this.f44153c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
