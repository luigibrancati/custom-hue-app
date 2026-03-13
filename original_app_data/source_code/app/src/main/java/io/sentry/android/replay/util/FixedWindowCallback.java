package io.sentry.android.replay.util;

import android.annotation.SuppressLint;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FixedWindowCallback implements Window.Callback {
    public final Window.Callback delegate;

    public FixedWindowCallback(Window.Callback callback) {
        this.delegate = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i10) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return null;
        }
        return callback.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public void onPointerCaptureChanged(boolean z10) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onPointerCaptureChanged(z10);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onPreparePanel(i10, view, menu);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onProvideKeyboardShortcuts(list, menu, i10);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Window.Callback callback2 = this.delegate;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public boolean onSearchRequested(SearchEvent searchEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        Window.Callback callback2 = this.delegate;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback, i10);
    }
}
