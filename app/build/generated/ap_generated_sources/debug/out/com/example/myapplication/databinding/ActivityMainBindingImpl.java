package com.example.myapplication.databinding;
import com.example.myapplication.R;
import com.example.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textview_main_user, 7);
        sViewsWithIds.put(R.id.edittext_main_nextpage, 8);
        sViewsWithIds.put(R.id.button_main_nextpage, 9);
        sViewsWithIds.put(R.id.imageview_main_avatar, 10);
        sViewsWithIds.put(R.id.group_main_information, 11);
        sViewsWithIds.put(R.id.textview_main_follower, 12);
        sViewsWithIds.put(R.id.textview_main_follow, 13);
        sViewsWithIds.put(R.id.textview_main_photo, 14);
        sViewsWithIds.put(R.id.imageview_main_list1, 15);
        sViewsWithIds.put(R.id.imageview_main_list2, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[9]
            , (android.widget.EditText) bindings[8]
            , (androidx.constraintlayout.widget.Group) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[7]
            );
        this.buttonMainCheckgroup.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textviewMainAddress.setTag(null);
        this.textviewMainName.setTag(null);
        this.textviewMainNumberfollow.setTag(null);
        this.textviewMainNumberfollower.setTag(null);
        this.textviewMainNumberhoto.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.codeCheck == variableId) {
            setCodeCheck((java.lang.String) variable);
        }
        else if (BR.follower == variableId) {
            setFollower((java.lang.String) variable);
        }
        else if (BR.follow == variableId) {
            setFollow((java.lang.String) variable);
        }
        else if (BR.name == variableId) {
            setName((java.lang.String) variable);
        }
        else if (BR.photo == variableId) {
            setPhoto((java.lang.String) variable);
        }
        else if (BR.add == variableId) {
            setAdd((java.lang.String) variable);
        }
        else if (BR.texthello == variableId) {
            setTexthello((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCodeCheck(@Nullable java.lang.String CodeCheck) {
        this.mCodeCheck = CodeCheck;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.codeCheck);
        super.requestRebind();
    }
    public void setFollower(@Nullable java.lang.String Follower) {
        this.mFollower = Follower;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.follower);
        super.requestRebind();
    }
    public void setFollow(@Nullable java.lang.String Follow) {
        this.mFollow = Follow;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.follow);
        super.requestRebind();
    }
    public void setName(@Nullable java.lang.String Name) {
        this.mName = Name;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.name);
        super.requestRebind();
    }
    public void setPhoto(@Nullable java.lang.String Photo) {
        this.mPhoto = Photo;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.photo);
        super.requestRebind();
    }
    public void setAdd(@Nullable java.lang.String Add) {
        this.mAdd = Add;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.add);
        super.requestRebind();
    }
    public void setTexthello(@Nullable java.lang.String Texthello) {
        this.mTexthello = Texthello;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String codeCheck = mCodeCheck;
        java.lang.String follower = mFollower;
        java.lang.String follow = mFollow;
        java.lang.String name = mName;
        java.lang.String photo = mPhoto;
        java.lang.String add = mAdd;

        if ((dirtyFlags & 0x81L) != 0) {
        }
        if ((dirtyFlags & 0x82L) != 0) {
        }
        if ((dirtyFlags & 0x84L) != 0) {
        }
        if ((dirtyFlags & 0x88L) != 0) {
        }
        if ((dirtyFlags & 0x90L) != 0) {
        }
        if ((dirtyFlags & 0xa0L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x81L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.buttonMainCheckgroup, codeCheck);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewMainAddress, add);
        }
        if ((dirtyFlags & 0x88L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewMainName, name);
        }
        if ((dirtyFlags & 0x84L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewMainNumberfollow, follow);
        }
        if ((dirtyFlags & 0x82L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewMainNumberfollower, follower);
        }
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewMainNumberhoto, photo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): codeCheck
        flag 1 (0x2L): follower
        flag 2 (0x3L): follow
        flag 3 (0x4L): name
        flag 4 (0x5L): photo
        flag 5 (0x6L): add
        flag 6 (0x7L): texthello
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}