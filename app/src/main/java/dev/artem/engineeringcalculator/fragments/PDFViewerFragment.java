package dev.artem.engineeringcalculator.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.github.barteksc.pdfviewer.PDFView;

import dev.artem.engineeringcalculator.R;

public class PDFViewerFragment extends Fragment {

    View rootView;
    String path;

    public PDFViewerFragment(String path) {
        this.path = path;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_pdf_viewer, container, false);
        PDFView pdfView = rootView.findViewById(R.id.pdfView);

        pdfView.fromAsset(path)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false)
                .password(null)
                .scrollHandle(null)
                .load();
        return rootView;
    }
}