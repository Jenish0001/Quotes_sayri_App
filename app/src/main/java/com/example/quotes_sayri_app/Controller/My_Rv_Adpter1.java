package com.example.quotes_sayri_app.Controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotes_sayri_app.Model.Model_class;
import com.example.quotes_sayri_app.R;
import com.example.quotes_sayri_app.Home_Screen.Sayri;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class My_Rv_Adpter1 extends RecyclerView.Adapter<My_Rv_Adpter1.ViewData> {

    Activity activity;
    List<Model_class> l2 = new ArrayList<>();
    public int i = 0;
    public int j = 0;
    private TextToSpeech textToSpeech;

    String s;
    String text;

    public My_Rv_Adpter1(Sayri sayri, List<Model_class> l2) {
        activity = sayri;
        this.l2 = l2;

    }


    @NonNull
    @Override
    public My_Rv_Adpter1.ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item2, parent, false);

        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, @SuppressLint("RecyclerView") int position) {

        holder.txt_item2.setText(l2.get(position).getS());
        String txt = l2.get(position).getS();


        holder.Screen_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (i < 12) {
                    holder.Screen_View.setImageResource(l2.get(i).getI());
                    i++;
                    if (i >= 12) {
                        i = 0;
                    }
                }
            }
        });


        holder.like_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(activity, "lik", Toast.LENGTH_SHORT).show();
                if (i < 12) {
                    holder.like_btn.setImageResource(R.drawable.ic_baseline_favorite_24_1);
                    Toast.makeText(activity, "  Like  ", Toast.LENGTH_SHORT).show();
                    i++;
                    if (i >= 12) {
                        i = 0;
                    }
                }


            }
        });


        holder.copy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(activity, "   copy   ", Toast.LENGTH_SHORT).show();
                Copy("copy", txt);

            }
        });


        holder.song_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textToSpeech.speak(l2.get(position).getS(), TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(activity, "  Speak  ", Toast.LENGTH_SHORT).show();
            }

        });


        holder.share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
//                shareIntent.putExtra(Intent.EXTRA_TEXT, "http://codepath.com");
                activity.startActivity(shareIntent);
                Toast.makeText(activity, "  Share  ", Toast.LENGTH_SHORT).show();
            }
        });


        holder.download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                holder.fram_img.setDrawingCacheEnabled(true);
                Bitmap bitamp = holder.fram_img.getDrawingCache();
                try {
                    saveBitmap(activity,bitamp, Bitmap.CompressFormat.PNG,"image/*","newimg.png");
                }catch(Exception e) {

                }

                Toast.makeText(activity, "  Download  ", Toast.LENGTH_SHORT).show();
            }
        });


        textToSpeech = new
                TextToSpeech(activity.getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

                // if No error is found then only it will run
                if (i != TextToSpeech.ERROR) {
                    // To Choose language of speech
                    textToSpeech.setLanguage(Locale.UK);
                }
            }
        });


    }

    void Copy(String s, String text) {
        ClipboardManager clipboard = (ClipboardManager) activity.getSystemService(activity.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(s, text);
        clipboard.setPrimaryClip(clip);
    }


    @Override
    public int getItemCount() {
        return l2.size();
    }

    public class ViewData extends RecyclerView.ViewHolder {
        private final CardView card_sayri;
        private final TextView txt_item2;
        private final ImageView Screen_View;
        private final ImageView like_btn;
        private final LinearLayout copy_btn;
        private final TextView song_btn;
        private final ImageView share_btn;
        private final LinearLayout download;
        private final FrameLayout fram_img;

        public ViewData(@NonNull View itemView) {
            super(itemView);
            card_sayri = itemView.findViewById(R.id.card_sayri);
            txt_item2 = itemView.findViewById(R.id.txt_item2);
            Screen_View = itemView.findViewById(R.id.Screen_View);
            like_btn = itemView.findViewById(R.id.like_btn);
            copy_btn = itemView.findViewById(R.id.copy_btn);
            song_btn = itemView.findViewById(R.id.song_btn);
            share_btn = itemView.findViewById(R.id.share_btn);
            download = itemView.findViewById(R.id.download);
            fram_img = itemView.findViewById(R.id.fram_img);
        }
    }


    @NonNull
    public Uri saveBitmap(@NonNull final Context context, @NonNull final Bitmap bitmap, @NonNull final Bitmap.CompressFormat format, @NonNull final String mimeType, @NonNull final String displayName) throws IOException {

        final String relativeLocation = Environment.DIRECTORY_DCIM + File.separator + "PhotoMaker";
        final ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DISPLAY_NAME, displayName);
        values.put(MediaStore.MediaColumns.MIME_TYPE, mimeType);
        values.put(MediaStore.MediaColumns.RELATIVE_PATH, relativeLocation);

        final ContentResolver resolver = context.getContentResolver();
        Uri uri = null;

        try {
            final Uri contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            uri = resolver.insert(contentUri, values);

            if (uri == null)
                throw new IOException("Failed to create new MediaStore record.");

            try (final OutputStream stream = resolver.openOutputStream(uri)) {
                if (stream == null)
                    throw new IOException("Failed to open output stream.");

                if (!bitmap.compress(format, 95, stream))
                    throw new IOException("Failed to save bitmap.");
            }

            Toast.makeText(context, "" + uri, Toast.LENGTH_SHORT).show();

            return uri;
        } catch (IOException e) {

            if (uri != null) {
                // Don't leave an orphan entry in the MediaStore
                resolver.delete(uri, null, null);
            }

            throw e;
        }
    }
}
