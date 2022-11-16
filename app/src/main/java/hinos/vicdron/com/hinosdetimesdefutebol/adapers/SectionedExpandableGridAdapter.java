package hinos.vicdron.com.hinosdetimesdefutebol.adapers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import hinos.vicdron.com.hinosdetimesdefutebol.R;
import hinos.vicdron.com.hinosdetimesdefutebol.cantos.Teste;
import hinos.vicdron.com.hinosdetimesdefutebol.models.Clube;

public class SectionedExpandableGridAdapter extends RecyclerView.Adapter<SectionedExpandableGridAdapter.ViewHolder> {
  //  private static final int VIEW_TYPE_ITEM = 2131427372;
  //  private static final int VIEW_TYPE_SECTION = 2131427373;
    private final Context mContext;
    private ArrayList<Object> mDataArrayList;
    private final ItemClickListener mItemClickListener;
    private final SectionStateChangeListener mSectionStateChangeListener;

    public SectionedExpandableGridAdapter(Context context, ArrayList<Object> arrayList, final GridLayoutManager gridLayoutManager, ItemClickListener itemClickListener, SectionStateChangeListener sectionStateChangeListener) {
        this.mContext = context;
        this.mItemClickListener = itemClickListener;
        this.mSectionStateChangeListener = sectionStateChangeListener;
        this.mDataArrayList = arrayList;
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i) {
                if (SectionedExpandableGridAdapter.this.isSection(i)) {
                    return gridLayoutManager.getSpanCount();
                }
                return 1;
            }
        });
    }

    private boolean isSection(int i) {
        return this.mDataArrayList.get(i) instanceof Section;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.mContext).inflate(i, viewGroup, false), i);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        switch (viewHolder.viewType) {
            case R.layout.layout_item:
                final Clube clube = (Clube) this.mDataArrayList.get(i);
                viewHolder.name.setText(clube.getName());
                viewHolder.cover.setImageResource(clube.getCover());
                viewHolder.view.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        Intent intent = new Intent(SectionedExpandableGridAdapter.this.mContext, Teste.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("letra", clube.getLetraCantico());
                        bundle.putString("nome_ringtone", clube.getRingtone());
                        bundle.putString("titulo", clube.getName());
                        bundle.putInt("cover", clube.getCover());
                        bundle.putInt("completo", clube.getEnviaHino());
                        intent.putExtras(bundle);
                        SectionedExpandableGridAdapter.this.mContext.startActivity(intent);
                    }
                });
                return;
            case R.layout.layout_section:
                final Section section = (Section) this.mDataArrayList.get(i);
                viewHolder.sectionTextView.setText(section.getName());
                viewHolder.sectionTextView.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                    }
                });
                viewHolder.sectionToggleButton.setChecked(section.isExpanded);
                viewHolder.sectionToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        SectionedExpandableGridAdapter.this.mSectionStateChangeListener.onSectionStateChanged(section, z);
                    }
                });
                return;
            default:
                return;
        }
    }

    @Override
    public int getItemCount() {
        return this.mDataArrayList.size();
    }

    @Override
    public int getItemViewType(int i) {
        return isSection(i) ? R.layout.layout_section : R.layout.layout_item;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView cover;
        TextView name;
        TextView sectionTextView;
        ToggleButton sectionToggleButton;
        View view;
        int viewType;

        public ViewHolder(View view2, int i) {
            super(view2);
            this.viewType = i;
            this.view = view2;
            if (i == R.layout.layout_item) {
                this.name = (TextView) view2.findViewById(R.id.text_item);
                this.cover = (ImageView) view2.findViewById(R.id.cover);
                return;
            }
            this.sectionTextView = (TextView) view2.findViewById(R.id.text_section);
            this.sectionToggleButton = (ToggleButton) view2.findViewById(R.id.toggle_button_section);
        }
    }
}