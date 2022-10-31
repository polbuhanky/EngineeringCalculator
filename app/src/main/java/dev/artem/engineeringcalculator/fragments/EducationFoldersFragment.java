package dev.artem.engineeringcalculator.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import dev.artem.engineeringcalculator.MainActivity;
import dev.artem.engineeringcalculator.R;
import dev.artem.engineeringcalculator.utils.ComparatorFolders;

public class EducationFoldersFragment extends Fragment {
    private RecyclerView menuRV;
    MainActivity activity;
    private View rootView;
    private String path = "";

    public EducationFoldersFragment(String path){
        if (path != null){
        this.path = path + "/";}
    }
    public EducationFoldersFragment(){

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (MainActivity) activity;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.menu, null);
        menuRV = rootView.findViewById(R.id.menuRV);
        String[] folders = new String[0];
        try {
            folders = getContext().getAssets().list("pdfs" + "/" + path);
            folders = sortDirectories(folders);
        } catch (IOException e) {
            Toast.makeText(getContext(), "Произошла ошибка при загрузке данных", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
        menuRV.setAdapter(new menuAdapter(activity, folders));

        return rootView;
    }

    class menuAdapter extends RecyclerView.Adapter<menuAdapter.ViewHolder>{
        private String[] data;

        private Context context;

        public menuAdapter(Context context, String[] data){
            this.context = context;
            this.data = data;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.menu_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
            holder.itemTV.setText(data[position].replace(".pdf", ""));
            holder.backgroundItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Adapter", "position: " + position);
                    FragmentManager myFragmentManager = ((FragmentActivity)context).getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = myFragmentManager.beginTransaction();
                    String selectedText = data[position];
                    if (selectedText.contains(".pdf")){
                        fragmentTransaction.replace(R.id.big_container, new PDFViewerFragment("pdfs" + "/"+ path + selectedText));
                    }
                    else {
                    fragmentTransaction.replace(R.id.big_container, new EducationFoldersFragment(path + selectedText));}
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            });
        }

        @Override
        public int getItemCount() {
            return data.length;
        }

        public class ViewHolder extends RecyclerView.ViewHolder{
            TextView itemTV;
            LinearLayout backgroundItem;

            ViewHolder(View view) {
                super(view);

                itemTV = view.findViewById(R.id.itemTV);
                backgroundItem = view.findViewById(R.id.backgroundItem);
            }
        }

    }
    public static String [] sortDirectories(String [] a) {
        ArrayList<String> arrayForFolders = new ArrayList<>();
        ArrayList<String> arrayForCalculators = new ArrayList<>();
        ArrayList<String> arrayForPdfs = new ArrayList<>();
        String[] resultArray = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i].contains("$")) {
                arrayForCalculators.add(a[i]);
            }
            else if(a[i].contains(".pdf")) {
                arrayForPdfs.add(a[i]);
            }
            else {
                arrayForFolders.add(a[i]);
            }
        }
        for (int i = 0; i < arrayForCalculators.size(); i++) {
            arrayForCalculators.set(i, arrayForCalculators.get(i).replaceFirst(" ", "~"));
        }
        for (int i = 0; i < arrayForFolders.size(); i++) {
            arrayForFolders.set(i, arrayForFolders.get(i).replaceFirst(" ", "~"));
        }
        for (int i = 0; i < arrayForPdfs.size(); i++) {
            arrayForPdfs.set(i, arrayForPdfs.get(i).replaceFirst(" ", "~"));
        }
        Collections.sort(arrayForFolders, new ComparatorFolders());
        Collections.sort(arrayForCalculators, new ComparatorFolders());
        Collections.sort(arrayForPdfs, new ComparatorFolders());
        for (int i = 0; i < arrayForFolders.size(); i++) {
            resultArray[i] = arrayForFolders.get(i);
        }
        for (int i = 0; i < arrayForPdfs.size(); i++) {
            resultArray[arrayForFolders.size() + i] = arrayForPdfs.get(i);
        }
        for (int i = 0; i < arrayForCalculators.size(); i++) {
            resultArray[arrayForFolders.size() + arrayForPdfs.size() + i] = arrayForCalculators.get(i);
        }
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = resultArray[i].replaceFirst("~", " ");
        }
        return resultArray;
    }
}

