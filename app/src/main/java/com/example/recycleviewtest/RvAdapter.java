package com.example.recycleviewtest;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

public class RvAdapter extends BaseQuickAdapter<Fruit, BaseViewHolder> {

    public RvAdapter() {
        super(R.layout.fruit_item);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, Fruit fruit) {
        baseViewHolder.setText(R.id.fruit_name,fruit.getName());
        baseViewHolder.setImageResource(R.id.fruit_image,fruit.getImageId());
    }
}
