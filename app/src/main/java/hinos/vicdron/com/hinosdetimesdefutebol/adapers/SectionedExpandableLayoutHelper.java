package hinos.vicdron.com.hinosdetimesdefutebol.adapers;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import hinos.vicdron.com.hinosdetimesdefutebol.models.Clube;

public class SectionedExpandableLayoutHelper implements SectionStateChangeListener {
    private ArrayList<Object> mDataArrayList = new ArrayList<>();
    RecyclerView mRecyclerView;
    private LinkedHashMap<Section, ArrayList<Clube>> mSectionDataMap = new LinkedHashMap<>();
    private HashMap<String, Section> mSectionMap = new HashMap<>();
    private SectionedExpandableGridAdapter mSectionedExpandableGridAdapter;

    public SectionedExpandableLayoutHelper(Context context, RecyclerView recyclerView, ItemClickListener itemClickListener, int i) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, i);
        recyclerView.setLayoutManager(gridLayoutManager);
        SectionedExpandableGridAdapter sectionedExpandableGridAdapter = new SectionedExpandableGridAdapter(context, this.mDataArrayList, gridLayoutManager, itemClickListener, this);
        this.mSectionedExpandableGridAdapter = sectionedExpandableGridAdapter;
        recyclerView.setAdapter(sectionedExpandableGridAdapter);
        this.mRecyclerView = recyclerView;
    }

    public void notifyDataSetChanged() {
        generateDataList();
        this.mSectionedExpandableGridAdapter.notifyDataSetChanged();
    }

    public void addSection(String str, ArrayList<Clube> arrayList) {
        HashMap<String, Section> hashMap = this.mSectionMap;
        Section section = new Section(str);
        hashMap.put(str, section);
        this.mSectionDataMap.put(section, arrayList);
    }

    public void addItem(String str, Clube clube) {
        this.mSectionDataMap.get(this.mSectionMap.get(str)).add(clube);
    }

    public void removeItem(String str, Clube clube) {
        this.mSectionDataMap.get(this.mSectionMap.get(str)).remove(clube);
    }

    public void removeSection(String str) {
        this.mSectionDataMap.remove(this.mSectionMap.get(str));
        this.mSectionMap.remove(str);
    }

    private void generateDataList() {
        this.mDataArrayList.clear();
        for (Map.Entry<Section, ArrayList<Clube>> entry : this.mSectionDataMap.entrySet()) {
            ArrayList<Object> arrayList = this.mDataArrayList;
            Section key = entry.getKey();
            arrayList.add(key);
            if (key.isExpanded) {
                this.mDataArrayList.addAll(entry.getValue());
            }
        }
    }

    @Override // hinos.vicdron.com.hinosdetimesdefutebol.adapers.SectionStateChangeListener
    public void onSectionStateChanged(Section section, boolean z) {
        if (!this.mRecyclerView.isComputingLayout()) {
            section.isExpanded = z;
            notifyDataSetChanged();
        }
    }
}