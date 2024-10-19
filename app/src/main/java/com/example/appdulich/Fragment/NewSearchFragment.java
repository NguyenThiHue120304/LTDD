package com.example.appdulich.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdulich.Adapter.SearchAdapter;
import com.example.appdulich.Model.Search;
import com.example.appdulich.R;

import java.util.ArrayList;

public class NewSearchFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Search> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_top_search, container, false);
        initData();
        recyclerView = v.findViewById(R.id.rcv_all);
        SearchAdapter searchAdapter = new SearchAdapter(list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(searchAdapter);


        return v;
    }

    private void initData() {
        list = new ArrayList<>();
        Search search1 = new Search(R.drawable.img_new1, "Vé Opera Tại Nhà Hát Thành Phố", "TP. Hồ Chí Minh", 600000); list.add(search1);
        Search search2 = new Search(R.drawable.img_new2, "Vé Tham Quan Chợ Đêm", "Đà Nẵng", 850000);list.add(search2);
        Search search3 = new Search(R.drawable.img_new3, "Vé Đêm Nhạc Jazz Tại Nhà Hát Lớn", "TP. Hồ Chí Minh", 300000);list.add(search3);
        Search search4 = new Search(R.drawable.img_new4, "Vé Buổi Diễn Ảo Thuật Quốc Tế", "Đà Nẵng", 150000);list.add(search4);
        Search search5 = new Search(R.drawable.img_new5, "Vé Triển Lãm Ẩm Thực Quốc Tế", "Hội An", 150000);list.add(search5);
        Search search6 = new Search(R.drawable.img_new6, "Vé Show Thời Trang Mùa Hè 2024", "TP. Hồ Chí Minh", 1500000);list.add(search6);
    }
}
