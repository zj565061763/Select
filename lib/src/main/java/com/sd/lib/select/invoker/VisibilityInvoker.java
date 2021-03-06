package com.sd.lib.select.invoker;

import android.view.View;

public class VisibilityInvoker implements PropertyInvoker<Integer>
{
    @Override
    public void invoke(View view, Integer value)
    {
        if (value == null)
            return;

        view.setVisibility(value);
    }
}
