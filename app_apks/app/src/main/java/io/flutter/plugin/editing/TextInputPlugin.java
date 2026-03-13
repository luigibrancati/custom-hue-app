package io.flutter.plugin.editing;

import Y0.E;
import Y0.S;
import a1.C2607a;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.Editable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.Log;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.ScribeChannel;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback;
import io.flutter.plugin.editing.ListenableEditingState;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.platform.PlatformViewsController2;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TextInputPlugin implements ListenableEditingState.EditingStateWatcher {
    private static final String TAG = "TextInputPlugin";
    private final AutofillManager afm;
    private SparseArray<TextInputChannel.Configuration> autofillConfiguration;
    private TextInputChannel.Configuration configuration;
    private ImeSyncDeferringInsetsCallback imeSyncCallback;
    private InputTarget inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
    private boolean isInputConnectionLocked;
    private Rect lastClientRect;
    private InputConnection lastInputConnection;
    private ListenableEditingState mEditable;
    private final InputMethodManager mImm;
    private TextInputChannel.TextEditState mLastKnownFrameworkTextEditingState;
    private boolean mRestartInputPending;
    private final View mView;
    private PlatformViewsController platformViewsController;
    private PlatformViewsController2 platformViewsController2;
    private final ScribeChannel scribeChannel;
    private final TextInputChannel textInputChannel;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class InputTarget {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        int f37604id;
        Type type;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum Type {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public InputTarget(Type type, int i10) {
            this.type = type;
            this.f37604id = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface MinMax {
        void inspect(double d10, double d11);
    }

    @SuppressLint({"NewApi"})
    public TextInputPlugin(View view, TextInputChannel textInputChannel, ScribeChannel scribeChannel, PlatformViewsController platformViewsController, PlatformViewsController2 platformViewsController2) {
        this.mView = view;
        this.mEditable = new ListenableEditingState(null, view);
        this.mImm = (InputMethodManager) view.getContext().getSystemService("input_method");
        this.afm = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
        this.imeSyncCallback = imeSyncDeferringInsetsCallback;
        imeSyncDeferringInsetsCallback.install();
        this.imeSyncCallback.setImeVisibilityListener(new ImeSyncDeferringInsetsCallback.ImeVisibilityListener() { // from class: io.flutter.plugin.editing.TextInputPlugin.1
            @Override // io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.ImeVisibilityListener
            public void onImeVisibilityChanged(boolean z10) {
                if (z10) {
                    return;
                }
                TextInputPlugin.this.mImm.restartInput(TextInputPlugin.this.mView);
            }
        });
        this.textInputChannel = textInputChannel;
        textInputChannel.setTextInputMethodHandler(new TextInputChannel.TextInputMethodHandler() { // from class: io.flutter.plugin.editing.TextInputPlugin.2
            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void clearClient() {
                TextInputPlugin.this.clearTextInputClient();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void finishAutofillContext(boolean z10) {
                if (TextInputPlugin.this.afm == null) {
                    return;
                }
                if (z10) {
                    TextInputPlugin.this.afm.commit();
                } else {
                    TextInputPlugin.this.afm.cancel();
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void hide() {
                if (TextInputPlugin.this.inputTarget.type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                    TextInputPlugin.this.notifyViewExited();
                } else {
                    TextInputPlugin textInputPlugin = TextInputPlugin.this;
                    textInputPlugin.hideTextInput(textInputPlugin.mView);
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void requestAutofill() {
                TextInputPlugin.this.notifyViewEntered();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void sendAppPrivateCommand(String str, Bundle bundle) {
                TextInputPlugin.this.sendTextInputAppPrivateCommand(str, bundle);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setClient(int i10, TextInputChannel.Configuration configuration) {
                TextInputPlugin.this.setTextInputClient(i10, configuration);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditableSizeAndTransform(double d10, double d11, double[] dArr) {
                TextInputPlugin.this.saveEditableSizeAndTransform(d10, d11, dArr);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditingState(TextInputChannel.TextEditState textEditState) {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.setTextInputEditingState(textInputPlugin.mView, textEditState);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setPlatformViewClient(int i10, boolean z10) {
                TextInputPlugin.this.setPlatformViewTextInputClient(i10, z10);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void show() {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.showTextInput(textInputPlugin.mView);
            }
        });
        textInputChannel.requestExistingInputState();
        this.scribeChannel = scribeChannel;
        this.platformViewsController = platformViewsController;
        platformViewsController.attachTextInputPlugin(this);
        this.platformViewsController2 = platformViewsController2;
        platformViewsController2.attachTextInputPlugin(this);
    }

    private static boolean composingChanged(TextInputChannel.TextEditState textEditState, TextInputChannel.TextEditState textEditState2) {
        int i10 = textEditState.composingEnd - textEditState.composingStart;
        if (i10 != textEditState2.composingEnd - textEditState2.composingStart) {
            return true;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (textEditState.text.charAt(textEditState.composingStart + i11) != textEditState2.text.charAt(textEditState2.composingStart + i11)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideTextInput(View view) {
        notifyViewExited();
        this.mImm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int inputTypeFromTextInputType(io.flutter.embedding.engine.systemchannels.TextInputChannel.InputType r1, boolean r2, boolean r3, boolean r4, boolean r5, io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization r6) {
        /*
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r5 = r1.type
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r0 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.DATETIME
            if (r5 != r0) goto L8
            r1 = 4
            return r1
        L8:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r0 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.NUMBER
            if (r5 != r0) goto L1c
            boolean r2 = r1.isSigned
            if (r2 == 0) goto L13
            r2 = 4098(0x1002, float:5.743E-42)
            goto L14
        L13:
            r2 = 2
        L14:
            boolean r1 = r1.isDecimal
            if (r1 == 0) goto L1b
            r1 = r2 | 8192(0x2000, float:1.148E-41)
            return r1
        L1b:
            return r2
        L1c:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r1 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.PHONE
            if (r5 != r1) goto L22
            r1 = 3
            return r1
        L22:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r1 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.NONE
            if (r5 != r1) goto L28
            r1 = 0
            return r1
        L28:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r1 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.MULTILINE
            if (r5 != r1) goto L30
            r1 = 131073(0x20001, float:1.83672E-40)
            goto L5e
        L30:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r1 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.EMAIL_ADDRESS
            if (r5 == r1) goto L5c
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r1 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.TWITTER
            if (r5 != r1) goto L39
            goto L5c
        L39:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r1 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.URL
            if (r5 == r1) goto L59
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r1 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.WEB_SEARCH
            if (r5 != r1) goto L42
            goto L59
        L42:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r1 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.VISIBLE_PASSWORD
            if (r5 != r1) goto L49
            r1 = 145(0x91, float:2.03E-43)
            goto L5e
        L49:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r1 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.NAME
            if (r5 != r1) goto L50
            r1 = 97
            goto L5e
        L50:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r1 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.POSTAL_ADDRESS
            if (r5 != r1) goto L57
            r1 = 113(0x71, float:1.58E-43)
            goto L5e
        L57:
            r1 = 1
            goto L5e
        L59:
            r1 = 17
            goto L5e
        L5c:
            r1 = 33
        L5e:
            if (r2 == 0) goto L65
            r2 = 524416(0x80080, float:7.34863E-40)
        L63:
            r1 = r1 | r2
            goto L71
        L65:
            if (r3 == 0) goto L6b
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
        L6b:
            if (r4 != 0) goto L71
            r2 = 524432(0x80090, float:7.34886E-40)
            goto L63
        L71:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextCapitalization r2 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization.CHARACTERS
            if (r6 != r2) goto L78
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            return r1
        L78:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextCapitalization r2 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization.WORDS
            if (r6 != r2) goto L7f
            r1 = r1 | 8192(0x2000, float:1.148E-41)
            return r1
        L7f:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextCapitalization r2 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization.SENTENCES
            if (r6 != r2) goto L85
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.TextInputPlugin.inputTypeFromTextInputType(io.flutter.embedding.engine.systemchannels.TextInputChannel$InputType, boolean, boolean, boolean, boolean, io.flutter.embedding.engine.systemchannels.TextInputChannel$TextCapitalization):int");
    }

    private boolean needsAutofill() {
        return this.autofillConfiguration != null;
    }

    private void notifyValueChanged(String str) {
        if (this.afm == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyValueChanged(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewEntered() {
        if (this.afm == null || !needsAutofill()) {
            return;
        }
        String str = this.configuration.autofill.uniqueIdentifier;
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.lastClientRect);
        rect.offset(iArr[0], iArr[1]);
        this.afm.notifyViewEntered(this.mView, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewExited() {
        TextInputChannel.Configuration configuration;
        if (this.afm == null || (configuration = this.configuration) == null || configuration.autofill == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyViewExited(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveEditableSizeAndTransform(double d10, double d11, final double[] dArr) {
        final double[] dArr2 = new double[4];
        final boolean z10 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d12 = dArr[12];
        double d13 = dArr[15];
        double d14 = d12 / d13;
        dArr2[1] = d14;
        dArr2[0] = d14;
        double d15 = dArr[13] / d13;
        dArr2[3] = d15;
        dArr2[2] = d15;
        MinMax minMax = new MinMax() { // from class: io.flutter.plugin.editing.TextInputPlugin.3
            @Override // io.flutter.plugin.editing.TextInputPlugin.MinMax
            public void inspect(double d16, double d17) {
                double d18 = 1.0d;
                if (!z10) {
                    double[] dArr3 = dArr;
                    d18 = 1.0d / (((dArr3[3] * d16) + (dArr3[7] * d17)) + dArr3[15]);
                }
                double[] dArr4 = dArr;
                double d19 = ((dArr4[0] * d16) + (dArr4[4] * d17) + dArr4[12]) * d18;
                double d20 = ((dArr4[1] * d16) + (dArr4[5] * d17) + dArr4[13]) * d18;
                double[] dArr5 = dArr2;
                if (d19 < dArr5[0]) {
                    dArr5[0] = d19;
                } else if (d19 > dArr5[1]) {
                    dArr5[1] = d19;
                }
                if (d20 < dArr5[2]) {
                    dArr5[2] = d20;
                } else if (d20 > dArr5[3]) {
                    dArr5[3] = d20;
                }
            }
        };
        minMax.inspect(d10, 0.0d);
        minMax.inspect(d10, d11);
        minMax.inspect(0.0d, d11);
        double d16 = this.mView.getContext().getResources().getDisplayMetrics().density;
        this.lastClientRect = new Rect((int) (dArr2[0] * d16), (int) (dArr2[2] * d16), (int) Math.ceil(dArr2[1] * d16), (int) Math.ceil(dArr2[3] * d16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformViewTextInputClient(int i10, boolean z10) {
        if (!z10) {
            this.inputTarget = new InputTarget(InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, i10);
            this.lastInputConnection = null;
        } else {
            this.mView.requestFocus();
            this.inputTarget = new InputTarget(InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, i10);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    private void updateAutofillConfigurationIfNeeded(TextInputChannel.Configuration configuration) {
        if (configuration == null || configuration.autofill == null) {
            this.autofillConfiguration = null;
            return;
        }
        TextInputChannel.Configuration[] configurationArr = configuration.fields;
        SparseArray<TextInputChannel.Configuration> sparseArray = new SparseArray<>();
        this.autofillConfiguration = sparseArray;
        if (configurationArr == null) {
            sparseArray.put(configuration.autofill.uniqueIdentifier.hashCode(), configuration);
            return;
        }
        for (TextInputChannel.Configuration configuration2 : configurationArr) {
            TextInputChannel.Configuration.Autofill autofill = configuration2.autofill;
            if (autofill != null) {
                this.autofillConfiguration.put(autofill.uniqueIdentifier.hashCode(), configuration2);
                this.afm.notifyValueChanged(this.mView, autofill.uniqueIdentifier.hashCode(), AutofillValue.forText(autofill.editState.text));
            }
        }
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        TextInputChannel.Configuration.Autofill autofill;
        TextInputChannel.Configuration.Autofill autofill2;
        TextInputChannel.Configuration configuration = this.configuration;
        if (configuration == null || this.autofillConfiguration == null || (autofill = configuration.autofill) == null) {
            return;
        }
        HashMap<String, TextInputChannel.TextEditState> map = new HashMap<>();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextInputChannel.Configuration configuration2 = this.autofillConfiguration.get(sparseArray.keyAt(i10));
            if (configuration2 != null && (autofill2 = configuration2.autofill) != null) {
                String string = sparseArray.valueAt(i10).getTextValue().toString();
                TextInputChannel.TextEditState textEditState = new TextInputChannel.TextEditState(string, string.length(), string.length(), -1, -1);
                if (autofill2.uniqueIdentifier.equals(autofill.uniqueIdentifier)) {
                    this.mEditable.setEditingState(textEditState);
                } else {
                    map.put(autofill2.uniqueIdentifier, textEditState);
                }
            }
        }
        this.textInputChannel.updateEditingStateWithTag(this.inputTarget.f37604id, map);
    }

    public void clearPlatformViewClient(int i10) {
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if ((type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW || type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) && inputTarget.f37604id == i10) {
            this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
            notifyViewExited();
            this.mImm.hideSoftInputFromWindow(this.mView.getApplicationWindowToken(), 0);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    public void clearTextInputClient() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.mEditable.removeEditingStateListener(this);
        notifyViewExited();
        this.configuration = null;
        updateAutofillConfigurationIfNeeded(null);
        this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        S sB = E.B(this.mView);
        if (sB == null || sB.o(S.o.c())) {
            return;
        }
        this.mImm.restartInput(this.mView);
    }

    public InputConnection createInputConnection(View view, KeyboardManager keyboardManager, EditorInfo editorInfo) {
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if (type == InputTarget.Type.NO_TARGET) {
            this.lastInputConnection = null;
            return null;
        }
        if (type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.isInputConnectionLocked) {
                return this.lastInputConnection;
            }
            InputConnection inputConnectionOnCreateInputConnection = this.platformViewsController.getPlatformViewById(inputTarget.f37604id).onCreateInputConnection(editorInfo);
            this.lastInputConnection = inputConnectionOnCreateInputConnection;
            return inputConnectionOnCreateInputConnection;
        }
        TextInputChannel.Configuration configuration = this.configuration;
        int iInputTypeFromTextInputType = inputTypeFromTextInputType(configuration.inputType, configuration.obscureText, configuration.autocorrect, configuration.enableSuggestions, configuration.enableIMEPersonalizedLearning, configuration.textCapitalization);
        editorInfo.inputType = iInputTypeFromTextInputType;
        editorInfo.imeOptions = 33554432;
        int i10 = Build.VERSION.SDK_INT;
        TextInputChannel.Configuration configuration2 = this.configuration;
        if (!configuration2.enableIMEPersonalizedLearning) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = configuration2.inputAction;
        int iIntValue = num == null ? (iInputTypeFromTextInputType & 131072) != 0 ? 1 : 6 : num.intValue();
        TextInputChannel.Configuration configuration3 = this.configuration;
        String str = configuration3.actionLabel;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        if (configuration3.hintLocales != null) {
            editorInfo.hintLocales = new LocaleList(this.configuration.hintLocales);
        }
        String[] strArr = this.configuration.contentCommitMimeTypes;
        if (strArr != null) {
            C2607a.a(editorInfo, strArr);
        }
        if (i10 >= 34) {
            C2607a.b(editorInfo, true);
        }
        InputConnectionAdaptor inputConnectionAdaptor = new InputConnectionAdaptor(view, this.inputTarget.f37604id, this.textInputChannel, this.scribeChannel, keyboardManager, this.mEditable, editorInfo);
        editorInfo.initialSelStart = this.mEditable.getSelectionStart();
        editorInfo.initialSelEnd = this.mEditable.getSelectionEnd();
        this.lastInputConnection = inputConnectionAdaptor;
        return inputConnectionAdaptor;
    }

    @SuppressLint({"NewApi"})
    public void destroy() {
        this.platformViewsController.detachTextInputPlugin();
        this.platformViewsController2.detachTextInputPlugin();
        this.textInputChannel.setTextInputMethodHandler(null);
        notifyViewExited();
        this.mEditable.removeEditingStateListener(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.imeSyncCallback;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r5 == r9.composingEnd) goto L23;
     */
    @Override // io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void didChangeEditingState(boolean r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            if (r8 == 0) goto Lb
            io.flutter.plugin.editing.ListenableEditingState r8 = r7.mEditable
            java.lang.String r8 = r8.toString()
            r7.notifyValueChanged(r8)
        Lb:
            io.flutter.plugin.editing.ListenableEditingState r8 = r7.mEditable
            int r2 = r8.getSelectionStart()
            io.flutter.plugin.editing.ListenableEditingState r8 = r7.mEditable
            int r3 = r8.getSelectionEnd()
            io.flutter.plugin.editing.ListenableEditingState r8 = r7.mEditable
            int r4 = r8.getComposingStart()
            io.flutter.plugin.editing.ListenableEditingState r8 = r7.mEditable
            int r5 = r8.getComposingEnd()
            io.flutter.plugin.editing.ListenableEditingState r8 = r7.mEditable
            java.util.ArrayList r8 = r8.extractBatchTextEditingDeltas()
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r9 = r7.mLastKnownFrameworkTextEditingState
            if (r9 == 0) goto La7
            io.flutter.plugin.editing.ListenableEditingState r9 = r7.mEditable
            java.lang.String r9 = r9.toString()
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r10 = r7.mLastKnownFrameworkTextEditingState
            java.lang.String r10 = r10.text
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L50
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r9 = r7.mLastKnownFrameworkTextEditingState
            int r10 = r9.selectionStart
            if (r2 != r10) goto L50
            int r10 = r9.selectionEnd
            if (r3 != r10) goto L50
            int r10 = r9.composingStart
            if (r4 != r10) goto L50
            int r9 = r9.composingEnd
            if (r5 != r9) goto L50
            goto La7
        L50:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "send EditingState to flutter: "
            r9.append(r10)
            io.flutter.plugin.editing.ListenableEditingState r10 = r7.mEditable
            java.lang.String r10 = r10.toString()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "TextInputPlugin"
            io.flutter.Log.v(r10, r9)
            io.flutter.embedding.engine.systemchannels.TextInputChannel$Configuration r9 = r7.configuration
            boolean r9 = r9.enableDeltaModel
            if (r9 == 0) goto L81
            io.flutter.embedding.engine.systemchannels.TextInputChannel r9 = r7.textInputChannel
            io.flutter.plugin.editing.TextInputPlugin$InputTarget r10 = r7.inputTarget
            int r10 = r10.f37604id
            r9.updateEditingStateWithDeltas(r10, r8)
            io.flutter.plugin.editing.ListenableEditingState r8 = r7.mEditable
            r8.clearBatchDeltas()
            goto L99
        L81:
            io.flutter.embedding.engine.systemchannels.TextInputChannel r0 = r7.textInputChannel
            io.flutter.plugin.editing.TextInputPlugin$InputTarget r8 = r7.inputTarget
            int r1 = r8.f37604id
            io.flutter.plugin.editing.ListenableEditingState r8 = r7.mEditable
            java.lang.String r8 = r8.toString()
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r8
            r0.updateEditingState(r1, r2, r3, r4, r5, r6)
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
        L99:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r0 = new io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState
            io.flutter.plugin.editing.ListenableEditingState r8 = r7.mEditable
            java.lang.String r1 = r8.toString()
            r0.<init>(r1, r2, r3, r4, r5)
            r7.mLastKnownFrameworkTextEditingState = r0
            return
        La7:
            io.flutter.plugin.editing.ListenableEditingState r7 = r7.mEditable
            r7.clearBatchDeltas()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.TextInputPlugin.didChangeEditingState(boolean, boolean, boolean):void");
    }

    public Editable getEditable() {
        return this.mEditable;
    }

    public ImeSyncDeferringInsetsCallback getImeSyncCallback() {
        return this.imeSyncCallback;
    }

    public InputMethodManager getInputMethodManager() {
        return this.mImm;
    }

    public InputConnection getLastInputConnection() {
        return this.lastInputConnection;
    }

    public boolean handleKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!getInputMethodManager().isAcceptingText() || (inputConnection = this.lastInputConnection) == null) {
            return false;
        }
        return inputConnection instanceof InputConnectionAdaptor ? ((InputConnectionAdaptor) inputConnection).handleKeyEvent(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void lockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = true;
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        Rect rect;
        if (needsAutofill()) {
            String str = this.configuration.autofill.uniqueIdentifier;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i11 = 0; i11 < this.autofillConfiguration.size(); i11++) {
                int iKeyAt = this.autofillConfiguration.keyAt(i11);
                TextInputChannel.Configuration.Autofill autofill = this.autofillConfiguration.valueAt(i11).autofill;
                if (autofill != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
                    viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                    String[] strArr = autofill.hints;
                    if (strArr.length > 0) {
                        viewStructureNewChild.setAutofillHints(strArr);
                    }
                    viewStructureNewChild.setAutofillType(1);
                    viewStructureNewChild.setVisibility(0);
                    String str2 = autofill.hintText;
                    if (str2 != null) {
                        viewStructureNewChild.setHint(str2);
                    }
                    if (str.hashCode() != iKeyAt || (rect = this.lastClientRect) == null) {
                        viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(autofill.editState.text));
                    } else {
                        viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.lastClientRect.height());
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(this.mEditable));
                    }
                }
            }
        }
    }

    public void sendTextInputAppPrivateCommand(String str, Bundle bundle) {
        this.mImm.sendAppPrivateCommand(this.mView, str, bundle);
    }

    public void setTextInputClient(int i10, TextInputChannel.Configuration configuration) {
        notifyViewExited();
        this.configuration = configuration;
        this.inputTarget = new InputTarget(InputTarget.Type.FRAMEWORK_CLIENT, i10);
        this.mEditable.removeEditingStateListener(this);
        TextInputChannel.Configuration.Autofill autofill = configuration.autofill;
        this.mEditable = new ListenableEditingState(autofill != null ? autofill.editState : null, this.mView);
        updateAutofillConfigurationIfNeeded(configuration);
        this.mRestartInputPending = true;
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        this.mEditable.addEditingStateListener(this);
    }

    public void setTextInputEditingState(View view, TextInputChannel.TextEditState textEditState) {
        TextInputChannel.TextEditState textEditState2;
        if (!this.mRestartInputPending && (textEditState2 = this.mLastKnownFrameworkTextEditingState) != null && textEditState2.hasComposing()) {
            boolean zComposingChanged = composingChanged(this.mLastKnownFrameworkTextEditingState, textEditState);
            this.mRestartInputPending = zComposingChanged;
            if (zComposingChanged) {
                Log.i(TAG, "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.mLastKnownFrameworkTextEditingState = textEditState;
        this.mEditable.setEditingState(textEditState);
        if (this.mRestartInputPending) {
            this.mImm.restartInput(view);
            this.mRestartInputPending = false;
        }
    }

    public void showTextInput(View view) {
        TextInputChannel.InputType inputType;
        TextInputChannel.Configuration configuration = this.configuration;
        if (configuration != null && (inputType = configuration.inputType) != null && inputType.type == TextInputChannel.TextInputType.NONE) {
            hideTextInput(view);
        } else {
            view.requestFocus();
            this.mImm.showSoftInput(view, 0);
        }
    }

    public void unlockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = false;
        }
    }
}
